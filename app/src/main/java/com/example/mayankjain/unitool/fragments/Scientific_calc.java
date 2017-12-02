package com.example.mayankjain.unitool.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mayankjain.unitool.R;

/**
 * Created by mayank jain on 03-Dec-17.
 */

public class Scientific_calc extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.scientific_calc_layout,null);
        return v;
    }
}
