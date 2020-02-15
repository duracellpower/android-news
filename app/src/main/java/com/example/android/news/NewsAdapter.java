/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.news;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOCATION_SEPARATOR = " of ";
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        // Find the TextView with view ID sectionName
        TextView sectionView = (TextView) listItemView.findViewById(R.id.sectionName);
        sectionView.setText(currentNews.getSection());

        TextView titleView = (TextView) listItemView.findViewById(R.id.titleName);
        titleView.setText(currentNews.getWebTitle());

        String reformatDateTime = currentNews.getTimeInMilliseconds().substring(0,10);
        String[] dateArray =reformatDateTime.split("-");
        String originalDateTime = dateArray[1] +"."+ dateArray[2] + "." + dateArray[0];
        TextView timeItem = (TextView) listItemView.findViewById(R.id.date);
        timeItem.setText(originalDateTime);






        return listItemView;
    }



    private String formatSection(String section) {
        DecimalFormat sectionFormat = new DecimalFormat("0.0");
        return sectionFormat.format(section);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
