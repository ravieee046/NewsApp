package com.phoebus_ravi.www.newsapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;

/**
 * Created by gravi on 11/1/2017.
 */

public final class AppUtils {
    public static final String NEWS_STORY_KEY = "news_story_key";

    public static int setColorBasedOnSection(String sectionName, Context context){
        int color;
        if(sectionName.equalsIgnoreCase("BOOKS")){
            color = R.color.colorBooks;
        } else if (sectionName.equalsIgnoreCase("SPORT")){
            color = R.color.colorSport;
        } else if (sectionName.equalsIgnoreCase("TECHNOLOGY")) {
            color = R.color.colorSport;
        } else if (sectionName.equalsIgnoreCase("CROSSWORDS")) {
            color = R.color.colorCrosswords;
        } else if (sectionName.equalsIgnoreCase("TELEVISION & RADIO")) {
            color = R.color.colorTelevision;
        } else if (sectionName.equalsIgnoreCase("STAGE")) {
            color = R.color.colorStage;
        } else{
            color = R.color.colorRed;
        }
        return ContextCompat.getColor(context, color);

    }
}
