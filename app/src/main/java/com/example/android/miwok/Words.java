/**
 * Created by Gina on 4/18/17.
 *
 * Create a new Words object and its constructor
 *
 *  @param miwokTranslation is the word in the Miwok language
 *  @param defaultTranslation is the word in a language that the user
 *                            is already familiar with
 *  @param TWTranslation is the word in the Taiwan language
 */

package com.example.android.miwok;


public class Words {
    private String defaultTranslation;
    private String miwokTranslation;
    private String TWTranslation;

    public Words(String miwokW, String defaultW, String TaiwanW){
        miwokTranslation = miwokW;
        defaultTranslation = defaultW;
        TWTranslation = TaiwanW;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getTWTranslation(){
        return TWTranslation;
    }
}
