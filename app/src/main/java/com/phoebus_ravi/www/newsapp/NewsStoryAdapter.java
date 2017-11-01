package com.phoebus_ravi.www.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsStoryAdapter extends ArrayAdapter<NewsStory> {
    public NewsStoryAdapter(
        @NonNull
            Context context,
        @NonNull
            List<NewsStory> newsStories) {
        super(context, 0, newsStories);
    }

    @NonNull
    @Override
    public View getView(int position,
        @Nullable
            View convertView,
        @NonNull
            ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                .inflate(R.layout.news_story_list_item, parent, false);
        }
        NewsStory newsStory = getItem(position);

        TextView sectionNameTextView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionNameTextView.setText(newsStory.getSection());
        sectionNameTextView
            .setTextColor(AppUtils.setColorBasedOnSection(newsStory.getSection(), getContext()));

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(newsStory.getTitle());

        TextView datePublishedTextView = (TextView) listItemView.findViewById(R.id.date_published);
        datePublishedTextView.setText(newsStory.getPublishedDate());

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type);
        typeTextView.setText(newsStory.getType());

        return listItemView;
    }
}
