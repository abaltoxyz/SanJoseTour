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
 * {@link Fragment} that displays a list of Shopping places.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.multiplaza_curridabat,
                getString(R.string.multiplaza_curridabat),
                getString(R.string.multiplaza_curridabat_description),
                "geo:0,0?q=9.9179965,-84.0468474(" + getString(R.string.multiplaza_curridabat) + ")",
                "tel:+50622345757",
                "http://www.multiplaza.com/m/multiplaza-curridabat"));
        places.add(new Place(R.drawable.multiplaza_escazu,
                getString(R.string.multiplaza_escazu),
                getString(R.string.multiplaza_escazu_description),
                "geo:0,0?q=9.9440658,-84.1504387(" + getString(R.string.multiplaza_escazu) + ")",
                "tel:+50622016025",
                "http://www.multiplaza.com/m/multiplaza-escazu"));
        places.add(new Place(R.drawable.mall_san_pedro,
                getString(R.string.mall_san_pedro),
                getString(R.string.mall_san_pedro_description),
                "geo:0,0?q=9.9342461,-84.0565521(" + getString(R.string.mall_san_pedro) + ")",
                "tel:+50622837516",
                "http://www.tumallsanpedro.com"));
        places.add(new Place(R.drawable.multicentro_desamparados,
                getString(R.string.multicentro_desamparados),
                getString(R.string.multicentro_desamparados_description),
                "geo:0,0?q=9.8989954,-84.0681102(" + getString(R.string.multicentro_desamparados) + ")",
                "tel:+50622590818",
                "https://www.facebook.com/MallMulticentro/"));
        places.add(new Place(R.drawable.lincoln_plaza,
                getString(R.string.lincoln_plaza),
                getString(R.string.lincoln_plaza_description),
                "geo:0,0?q=9.9623228,-84.0560083(" + getString(R.string.lincoln_plaza) + ")",
                "tel:+50625199043",
                "http://www.lincolnplaza.cr"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // Find the listView and populate it with data from the adapter.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
