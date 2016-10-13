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
 * {@link Fragment} that displays a list of Cultural places.
 */
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.national_theater,
                getString(R.string.national_theater),
                getString(R.string.national_theater_description),
                "geo:0,0?q=9.9331286,-84.0769424(" + getString(R.string.national_theater) + ")",
                "tel:+50620101100",
                "https://www.teatronacional.go.cr/"));
        places.add(new Place(R.drawable.melico_salazar_theater,
                getString(R.string.melico_salazar_theater),
                getString(R.string.melico_salazar_description),
                "geo:0,0?q=9.933317,-84.079239(" + getString(R.string.melico_salazar_theater) + ")",
                "tel:+50622335172",
                "http://www.teatromelico.go.cr"));
        places.add(new Place(R.drawable.pre_columbian_gold_musem,
                getString(R.string.pre_columbian_gold_museum),
                getString(R.string.pre_columbian_gold_museum_description),
                "geo:0,0?q=9.9335258,-84.0766526(" + getString(R.string.pre_columbian_gold_museum) + ")",
                "tel:+50622230528",
                "https://www.museosdelbancocentral.org"));
        places.add(new Place(R.drawable.center_science_culture,
                getString(R.string.center_science_culture),
                getString(R.string.center_science_culture_description),
                "geo:0,0?q=9.9411339,-84.0802424(" + getString(R.string.center_science_culture) + ")",
                "tel:+50622571433",
                "http://www.museocr.org"));
        places.add(new Place(R.drawable.jade_museum,
                getString(R.string.jade_museum),
                getString(R.string.jade_museum_description),
                "geo:0,0?q=9.9332939,-84.072825(" + getString(R.string.jade_museum) + ")",
                "tel:+50625216610",
                "http://www.museodeljadeins.com"));
        places.add(new Place(R.drawable.art_museum,
                getString(R.string.art_museum),
                getString(R.string.art_museum_description),
                "geo:0,0?q=9.9353388,-84.0988109(" + getString(R.string.art_museum) + ")",
                "tel:+50622561281",
                "http://www.musarco.go.cr"));
        places.add(new Place(R.drawable.national_museum,
                getString(R.string.national_museum),
                getString(R.string.national_museum_description),
                "geo:0,0?q=9.9326016,-84.0710149(" + getString(R.string.national_museum) + ")",
                "tel:+50622214429",
                "http://www.museocostarica.go.cr"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the listView and populate it with data from the adapter.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
