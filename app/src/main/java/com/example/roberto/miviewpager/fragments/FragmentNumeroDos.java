package com.example.roberto.miviewpager.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roberto.miviewpager.R;

/**
 * Created by Roberto Avalos on 08/10/2015.
 */
public class FragmentNumeroDos extends Fragment {

    public static FragmentNumeroDos newInstance(){
        FragmentNumeroDos fragment = new FragmentNumeroDos();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_dos, container, false);
        return rootView;
    }

}
