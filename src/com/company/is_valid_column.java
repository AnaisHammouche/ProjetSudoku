package com.company;

public class is_valid_column {
    //j'appelle la fonction is_valid_column(
    static boolean is_valid_column(int[][] tab, int column) {

        for (int num = 1; num < 10; num++) {
            int counter = 0;
            for (int line = 0; line < 9; line++) {
                if (num == tab[line][column]) {
                    counter = counter + 1;
                }
                if (counter == 2) {
                    return false;
                }
            }
        }
        return true;
    }


    static boolean is_valid_all_column(int[][] tab) {
        for (int column = 0; column < 9; column++) {
            if (is_valid_column(tab, column) == false) {
                return false;
            }
        }
        return true;
    }
}



