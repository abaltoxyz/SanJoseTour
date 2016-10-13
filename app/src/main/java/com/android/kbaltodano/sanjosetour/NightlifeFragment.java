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


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of Nightlife places.
 */
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.hoxton_pub,
                getString(R.string.hoxton_pub),
                getString(R.string.hoxton_pub_description),
                "geo:0,0?q=9.9325303,-84.0595883(" + getString(R.string.hoxton_pub) + ")",
                "tel:+50661059296",
                "https://www.facebook.com/hoxtonstag/"));
        places.add(new Place(R.drawable.antik,
                getString(R.string.antik),
                getString(R.string.antik_description),
                "geo:0,0?q=9.929307,-84.06972(" + getString(R.string.antik) + ")",
                "tel:+50640333324",
                "http://www.antik.cr"));
        places.add(new Place(R.drawable.jazz_cafe_club,
                getString(R.string.jazz_cafe_club),
                getString(R.string.jazz_cafe_club_description),
                "geo:0,0?q=9.9321641,-84.0494097(" + getString(R.string.jazz_cafe_club) + ")",
                "tel:+50622538933",
                "http://www.jazzcafecostarica.com"));
        places.add(new Place(R.drawable.stereo_sushi,
                getString(R.string.stereo_sushi),
                getString(R.string.stereo_sushi_description),
                "geo:0,0?q=9.9319953,-84.0696734(" + getString(R.string.stereo_sushi) + ")",
                "tel:+50687078225",
                "http://www.ss.cr"));
        places.add(new Place(R.drawable.vertigo,
                getString(R.string.vertigo),
                getString(R.string.vertigo_description),
                "geo:0,0?q=9.9359293,-84.0965432(" + getString(R.string.vertigo) + ")",
                "tel:+50622578424",
                "http://www.vertigocr.com"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the listView and populate it with data from the adapter.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
