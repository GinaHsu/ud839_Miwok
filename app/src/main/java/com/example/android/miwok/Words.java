package com.example.android.miwok;

/**
 * Created by Gina on 4/18/17.
 */

public class Words {
    String eng;
    String miwok;

    public Words(String miwokW, String engW){
        miwok = miwokW;
        eng = engW;
    }


    public void setWords(String miwokW, String engW){
        miwok = miwokW;
        eng = engW;
    }

    public String getEngWords(String miwokW, String engW){
        return (eng);
    }

    public String getMiwokWords(String miwokW, String engW){
        return (miwok);
    }
}
