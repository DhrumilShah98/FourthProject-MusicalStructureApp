package com.example.dhrumilshah.musical;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

        public static ArrayList<CustomSongArrayList> mMusicData;
        public static ArrayList<CustomAlbumArrayList> mAlbumData;
        public static final String KEY_POSITION = "position";
        public static final String KEY_ALBUMNAME = "albumName";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mMusicData will hold CustomSongArrayList in each cell.
        // Each CustomSongArrayList contains Song Image, Song Name, Artist Name, Album Name as data
        mMusicData = new ArrayList<>();
        mMusicData.add(new CustomSongArrayList(R.drawable.minutes_to_midnight,getString(R.string.song_leave_out_all_the_rest),getString(R.string.artist_linkin_park),getString(R.string.album_minute_to_midnight)));
        mMusicData.add(new CustomSongArrayList(R.drawable.singles,getString(R.string.song_she_will_be_loved),getString(R.string.artist_maroon5),getString(R.string.album_singles)));
        mMusicData.add(new CustomSongArrayList(R.drawable.bajirao_mastani,getString(R.string.song_aayat),getString(R.string.artist_arijit),getString(R.string.album_bajirao_mastani)));
        mMusicData.add(new CustomSongArrayList(R.drawable.swades,getString(R.string.song_yeh_jo_des),getString(R.string.artist_a_r_rahman),getString(R.string.album_swades)));
        mMusicData.add(new CustomSongArrayList(R.drawable.faded_japan_ep,getString(R.string.song_faded),getString(R.string.artist_alan_walker),getString(R.string.album_faded_japan)));
        mMusicData.add(new CustomSongArrayList(R.drawable.singles,getString(R.string.song_animals),getString(R.string.artist_maroon5),getString(R.string.album_singles)));
        mMusicData.add(new CustomSongArrayList(R.drawable.ram_leela,getString(R.string.song_laal_ishq),getString(R.string.artist_arijit),getString(R.string.album_ram_leela)));
        mMusicData.add(new CustomSongArrayList(R.drawable.despacito,getString(R.string.song_despacito),getString(R.string.artist_luis),getString(R.string.album_hitmix)));
        mMusicData.add(new CustomSongArrayList(R.drawable.collage,getString(R.string.song_closer),getString(R.string.artist_chainsmokers),getString(R.string.album_collage)));
        mMusicData.add(new CustomSongArrayList(R.drawable.faded_japan_ep,getString(R.string.song_alone_alan),getString(R.string.artist_alan_walker),getString(R.string.album_faded_japan)));
        mMusicData.add(new CustomSongArrayList(R.drawable.minutes_to_midnight,getString(R.string.song_shadow_of_the_day),getString(R.string.artist_linkin_park),getString(R.string.album_minute_to_midnight)));
        mMusicData.add(new CustomSongArrayList(R.drawable.american_idiot,getString(R.string.song_boulevard_of_broken_dreams),getString(R.string.artist_green_day),getString(R.string.album_american_idiot)));
        mMusicData.add(new CustomSongArrayList(R.drawable.minutes_to_midnight,getString(R.string.song_what_i_have_done),getString(R.string.artist_linkin_park),getString(R.string.album_minute_to_midnight)));
        mMusicData.add(new CustomSongArrayList(R.drawable.my_name_is_khan,getString(R.string.song_noor_e_khuda),getString(R.string.artist_as_sm_sg),getString(R.string.album_my_name_is_khan)));
        mMusicData.add(new CustomSongArrayList(R.drawable.alone_marshmello,getString(R.string.song_alone_marshmello),getString(R.string.song_alone_marshmello),getString(R.string.album_hitmix)));
        mMusicData.add(new CustomSongArrayList(R.drawable.american_idiot,getString(R.string.song_wake_me_up),getString(R.string.artist_green_day),getString(R.string.album_american_idiot)));
        mMusicData.add(new CustomSongArrayList(R.drawable.minutes_to_midnight,getString(R.string.song_valentine_day),getString(R.string.artist_linkin_park),getString(R.string.album_minute_to_midnight)));
        mMusicData.add(new CustomSongArrayList(R.drawable.collage,getString(R.string.song_dont_let_me_down),getString(R.string.artist_chainsmokers),getString(R.string.album_collage)));
        mMusicData.add(new CustomSongArrayList(R.drawable.singles,getString(R.string.song_one_more_night),getString(R.string.artist_maroon5),getString(R.string.album_singles)));
        mMusicData.add(new CustomSongArrayList(R.drawable.my_name_is_khan,getString(R.string.song_sajdaa),getString(R.string.artist_rfak_sm_rs),getString(R.string.album_my_name_is_khan)));
        mMusicData.add(new CustomSongArrayList(R.drawable.this_is_acting,getString(R.string.song_cheap_thrills),getString(R.string.artist_sia),getString(R.string.album_this_is_acting)));
        mMusicData.add(new CustomSongArrayList(R.drawable.singles,getString(R.string.song_payphone),getString(R.string.artist_maroon5),getString(R.string.album_singles)));

        // mAlbumData will hold CustomAlbumArrayList in each cell.
        // Each CustomAlbumArrayList contains Album Image, Album Name, Number of songs in album as data
        mAlbumData = new ArrayList<>();
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.minutes_to_midnight,getString(R.string.album_minute_to_midnight),4));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.singles,getString(R.string.album_singles),4));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.bajirao_mastani,getString(R.string.album_bajirao_mastani),1));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.swades,getString(R.string.album_swades),1));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.faded_japan_ep,getString(R.string.album_faded_japan),2));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.ram_leela,getString(R.string.album_ram_leela),1));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.hitmix_2017,getString(R.string.album_hitmix),2));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.collage,getString(R.string.album_collage),2));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.american_idiot,getString(R.string.album_american_idiot),2));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.my_name_is_khan,getString(R.string.album_my_name_is_khan),2));
        mAlbumData.add(new CustomAlbumArrayList(R.drawable.this_is_acting,getString(R.string.album_this_is_acting),1));

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
