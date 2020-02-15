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

public class News {

    private String mSection;
    private String mWebTitle;
    private String mTimeInMilliseconds;
    private String mUrl;

    public News(String section, String webTitle, String timeInMilliseconds, String url) {
        mSection = section;
        mWebTitle = webTitle;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
