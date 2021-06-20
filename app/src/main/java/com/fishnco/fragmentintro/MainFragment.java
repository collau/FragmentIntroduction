package com.fishnco.fragmentintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    //empty constructor required
    public MainFragment() {}

    //Override method to inflate MainFragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Create a view object to inflate
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}
