package com.example.dhrumilshah.musical;

class CustomSongArrayList {
    private int mImageId;
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

     CustomSongArrayList(int mImageId, String mSongName, String mArtistName, String mAlbumName) {
        this.mImageId = mImageId;
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
        this.mAlbumName = mAlbumName;
    }

     int getImageId() { return mImageId; }

     String getSongName() { return mSongName; }

     String getArtistName() { return mArtistName; }

     String getAlbumName() { return mAlbumName; }

}

class CustomAlbumArrayList{
    private int mImageId;
    private String mAlbumName;
    private int mNoOfSongs;

     CustomAlbumArrayList(int mImageId, String mAlbumName, int mNoOfSongs) {
        this.mImageId = mImageId;
        this.mAlbumName = mAlbumName;
        this.mNoOfSongs = mNoOfSongs;
    }

     int getImageId() { return mImageId; }

     String getAlbumName() { return mAlbumName; }

     int getNoOfSongs() { return mNoOfSongs; }
}
