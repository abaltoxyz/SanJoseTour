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

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is reused, otherwise inflate it
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the current Place at this position in the list
        final Place currentPlace = getItem(position);
        // Set the picture for this Place
        ImageView pictureView = (ImageView) listItemView.findViewById(R.id.item_picture);
        pictureView.setImageResource(currentPlace.getImageResourceId());
        // Set the Name for this Place
        TextView nameView = (TextView) listItemView.findViewById(R.id.item_name);
        nameView.setText(currentPlace.getName());
        // Set the Description for this Place
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.item_description);
        descriptionView.setText(currentPlace.getDescription());

        // OnClickListener for Directions intent using the Place's mGeoLocation variable.
        View directionsView = listItemView.findViewById(R.id.directions_button);
        directionsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentPlace.getGeoLocation()));
                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntent);
                }

            }
        });

        // OnClickListener for Call intent using the Place's mPhoneNumber variable.
        View callView = listItemView.findViewById(R.id.call_button);
        callView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(currentPlace.getPhoneNumber()));
                if (callIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(callIntent);
                }
            }
        });

        // OnClickListener for Website intent using the Place's mWebsite variable.
        View websiteView = listItemView.findViewById(R.id.website_button);
        websiteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentPlace.getWebsite()));
                if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(intent);
                }
            }
        });

        return listItemView;
    }

}
