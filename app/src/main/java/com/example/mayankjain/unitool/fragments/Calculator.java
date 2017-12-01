package com.example.mayankjain.unitool.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mayankjain.unitool.R;

/**
 * Created by mayank jain on 02-Dec-17.
 */

public class Calculator extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.calc_layout,null);
        return v;
    }
}
