package com.example.fragments;

import java.util.Arrays;

public class TicTacToeLogic {

    String[] field = new String[9];
    int counter = 0;

    String winner = "none";

    public TicTacToeLogic()
    {
        // # = leer, x = p1, o = p2;
        Arrays.fill(field, "#");
    }

    public void higherCounterBy1()
    {
        counter++;
    }

    public int getCounter()
    {
        return counter;
    }

    public void setField(int place)
    {
        if (getCounter()%2 == 1) field[place] = "o";
        else field[place] = "x";
    }

    public boolean isgameOver()
    {
            if (field[0].equals("o") && field[1].equals("o") && field[2].equals("o")) {
                winner("o");
                return true;
            }
            if (field[0].equals("x") && field[1].equals("x") && field[2].equals("x")) {
                winner("x");
                return true;
            }
        if (field[3].equals("o") && field[4].equals("o") && field[5].equals("o")) {
            winner("o");
            return true;
        }
        if (field[3].equals("x") && field[4].equals("x") && field[5].equals("x")) {
            winner("x");
            return true;
        }
        if (field[6].equals("o") && field[7].equals("o") && field[8].equals("o")) {
            winner("o");
            return true;
        }
        if (field[6].equals("x") && field[7].equals("x") && field[8].equals("x")) {
            winner("x");
            return true;
        }

        for (int i = 0; i < 3; i++) {
            if (field[i].equals("o") && field[i+3].equals("o") && field[i+6].equals("o")) {
                winner("o");
                return true;
            }
            if (field[i].equals("x") && field[i+3].equals("x") && field[i+6].equals("x")) {
                winner("x");
                return true;
            }
        }
        if (field[0].equals("o") && field[4].equals("o") && field[8].equals("o")) {
            winner("o");
            return true;
        }
        if (field[0].equals("x") && field[4].equals("x") && field[8].equals("x")) {
            winner("x");
            return true;
        }
        if (field[2].equals("o") && field[4].equals("o") && field[6].equals("o")) {
            winner("o");
            return true;
        }
        if (field[2].equals("x") && field[4].equals("x") && field[6].equals("x")) {
            winner("x");
            return true;
        }
        return false;
    }

    public void setcounter()
    {
        counter = 0;
    }

    public void fillField()
    {
        Arrays.fill(field, "#");
    }

    public void winner(String s)
    {
        if (s.equals("o")) winner = "player 1";
        else winner = "player 2";
    }
}
