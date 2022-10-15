package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecGameFragment extends Fragment {

   private MainViewModel viewModel;

    public SecGameFragment() {
        // Required empty public constructor
    }


    public static SecGameFragment newInstance() {
        SecGameFragment fragment = new SecGameFragment();
        // Bundle args = new Bundle();
        // fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       viewModel = new ViewModelProvider(requireActivity())
               .get(MainViewModel.class);
        return inflater.inflate(R.layout.fragment_sec_game, container, false);
    }
}