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
 * {@link Fragment} that displays a list of Dining places.
 */
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.le_monastere,
                getString(R.string.le_monastere),
                getString(R.string.le_monastere_description),
                "geo:0,0?q=9.9278486,-84.1602409(" + getString(R.string.le_monastere) + ")",
                "tel:+50622288515",
                "http://www.monastere-restaurant.com"));
        places.add(new Place(R.drawable.le_chandelier,
                getString(R.string.le_chandelier),
                getString(R.string.le_chandelier_description),
                "geo:0,0?q=9.9288949,-84.0562516(" + getString(R.string.le_chandelier) + ")",
                "tel:+50622253980",
                "http://www.lechandeliercr.com"));
        places.add(new Place(R.drawable.machu_picchu,
                getString(R.string.machu_picchu),
                getString(R.string.machu_picchu_description),
                "geo:0,0?q=9.9364516,-84.0934832(" + getString(R.string.machu_picchu) + ")",
                "tel:+50622227384",
                "http://www.restaurantemachupicchu.com"));
        places.add(new Place(R.drawable.fogo_brasil,
                getString(R.string.fogo_brasil),
                getString(R.string.fogo_brasil_description),
                "geo:0,0?q=9.9382191,-84.0972844(" + getString(R.string.fogo_brasil) + ")",
                "tel:+50622481111",
                "http://www.fogobrasilcr.com"));
        places.add(new Place(R.drawable.la_divina_comida,
                getString(R.string.la_divina_comida),
                getString(R.string.la_divina_comida_description),
                "geo:0,0?q=9.937848,-84.1427629(" + getString(R.string.la_divina_comida) + ")",
                "tel:+50622088899",
                "http://www.ladivinacomidacr.com"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the listView and populate it with data from the adapter.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
