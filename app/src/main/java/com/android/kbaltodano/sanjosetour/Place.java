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

package com.android.kbaltodano.sanjosetour;

/**
 * {@link Place} represents a place that the user wants to explore.
 * It contains resource IDs for an image file, Name, Description,
 * Geographical Location, Phone Number and Website address.
 */

public class Place {
    private int mImageResourceId;
    private String mName;
    private String mDescription;
    private String mGeoLocation; // Example: geo:0,0?q=34.99,-106.61(Treasure)
    private String mPhoneNumber; // Example: tel:<phone-number>
    private String mWebsite; // Example: http:<URL>

    /**
     * Create a new Place object.
     *
     * @param mImageResourceId is the drawable resource ID for the image associated with the place
     * @param mName            is the string resource Id for the name of the place
     * @param mDescription     is the string resource Id for the description of the place
     * @param mGeoLocation     is the string resource Id for the geographical location (coordinates) of the place
     * @param mPhoneNumber     is the string resource Id for the phone number of the place
     * @param mWebsite         is the string resource Id for the website address of the place
     */
    public Place(int mImageResourceId, String mName, String mDescription, String mGeoLocation, String mPhoneNumber, String mWebsite) {
        this.mImageResourceId = mImageResourceId;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mGeoLocation = mGeoLocation;
        this.mPhoneNumber = mPhoneNumber;
        this.mWebsite = mWebsite;
    }

    /**
     * Geter methods.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getGeoLocation() {
        return mGeoLocation;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getWebsite() {
        return mWebsite;
    }
}
