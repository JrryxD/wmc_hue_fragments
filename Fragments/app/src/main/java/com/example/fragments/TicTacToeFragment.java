package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TicTacToeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TicTacToeFragment extends Fragment {

   private MainViewModel viewModel;

    public TicTacToeFragment() {
        // Required empty public constructor
    }

   public static TicTacToeFragment newInstance() {
        TicTacToeFragment fragment = new TicTacToeFragment();
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

        View v = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        v.findViewById(R.id.bback).setOnClickListener(view -> {
            viewModel.showClickBattle();
        });

        return v;
    }
}