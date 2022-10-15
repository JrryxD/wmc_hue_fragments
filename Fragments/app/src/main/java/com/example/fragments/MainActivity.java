package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    Button b1game, b2game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.b1game.setOnClickListener(this);

        MainViewModel model = new ViewModelProvider(this).get(MainViewModel.class);
        model.state.observe(this, state ->  {
            FragmentTransaction fragTransaction = getSupportFragmentManager().beginTransaction();
            if(state == MainViewModel.SHOW_TIC_TAC_TOE) {
                fragTransaction.replace(R.id.llMain, TicTacToeFragment.newInstance() , "TicTacToe");
            } else if(state == MainViewModel.SHOW_CLICK_BATTLE) {
                fragTransaction.replace(R.id.llMain, SecGameFragment.newInstance() , "ClickBattle");
            }
            fragTransaction.commit();
        });
    }

    @Override
    public void onClick(View view) {

    }
}