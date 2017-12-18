package com.example.android.miwok;

/**
 * Created by bejaeger on 11/30/2017.
 */

public class Word {
    private String englishVersion;
    private String miwokVersion;
    private int imageResouceId=R.drawable.number_one;

    public Word(String eng, String miw){
        englishVersion=eng;
        miwokVersion=miw;
    }
    public String getEnglish(){
        return englishVersion;
    }
    public String getMiwok(){
        return miwokVersion;
    }
    public int getImageResourceId(){
        return imageResouceId;
    }
}
