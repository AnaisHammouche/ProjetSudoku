package com.company;

public class findSolution {

    static int counter = 0;

    static boolean findTheSolution(int[][] board) {
        for (int ligne = 0; ligne < 9; ligne++) {
            for (int colonne = 0; colonne < 9; colonne++) {
                if (board[ligne][colonne] != 0) {
                    continue;
                } else {
                    for (int nb = 1; nb < 10; nb++) {
                        board[ligne][colonne] = nb;
                        counter++;
                        if (isGridValid.isWholeGridValid(board) && findTheSolution(board)) {
                            return true;
                        }
                        board[ligne][colonne] = 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
