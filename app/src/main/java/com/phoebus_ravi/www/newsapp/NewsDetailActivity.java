package com.phoebus_ravi.www.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class NewsDetailActivity extends AppCompatActivity {
    public static final String NEWS_STORY_KEY = "news_story_key";

    TextView sectionNameTextView;
    TextView titleTextView;
    TextView datePublishedTextView;
    TextView typeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        if (getIntent() != null) {
            NewsStory newsStory = (NewsStory) getIntent().getSerializableExtra(NEWS_STORY_KEY);
            sectionNameTextView = (TextView) findViewById(R.id.section_name);
            sectionNameTextView.setText(newsStory.getSection());
            sectionNameTextView.setTextColor(
                AppUtils.setColorBasedOnSection(newsStory.getSection(), NewsDetailActivity.this));

            titleTextView = (TextView) findViewById(R.id.title);
            titleTextView.setText(newsStory.getTitle());

            datePublishedTextView = (TextView) findViewById(R.id.date_published);
            datePublishedTextView.setText(newsStory.getPublishedDate());

            typeTextView = (TextView) findViewById(R.id.type);
            typeTextView.setText(newsStory.getType());

        }
    }
}
