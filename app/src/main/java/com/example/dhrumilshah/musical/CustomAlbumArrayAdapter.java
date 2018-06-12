package com.example.dhrumilshah.musical;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAlbumArrayAdapter extends ArrayAdapter<CustomAlbumArrayList>{
    CustomAlbumArrayAdapter(@NonNull Context context, @NonNull List<CustomAlbumArrayList> objects) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one ImageView and two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_albums_list_item, parent, false);
        }
        CustomAlbumArrayList currentWord = getItem(position);
        if(currentWord != null) {
            ImageView mImageView = listItemView.findViewById((R.id.album_image));
            mImageView.setImageResource(currentWord.getImageId());

            TextView mTextView =  listItemView.findViewById(R.id.album_name);
            mTextView.setText(currentWord.getAlbumName());

            mTextView = listItemView.findViewById(R.id.album_no_of_songs);
            mTextView.setText(String.valueOf(currentWord.getNoOfSongs() + " songs"));


            return listItemView;
        }
        return listItemView;
    }

}