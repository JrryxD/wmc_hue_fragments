package com.example.fragments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public static final int DEFAULT = 0;
    public static final int SHOW_TIC_TAC_TOE = 1;
    public static final int SHOW_CLICK_BATTLE = 2;

    private MutableLiveData<Integer> _state = new MutableLiveData<>(SHOW_TIC_TAC_TOE);
    // state can only be observed but not changed
    public LiveData<Integer> state = _state;

    // use specific methods to change the game, prevent misuse of the state variable
    public void showClickBattle() {
        _state.postValue(SHOW_CLICK_BATTLE);
    }
    public void showTicTacToe() {
        _state.postValue(SHOW_TIC_TAC_TOE);
    }
}
