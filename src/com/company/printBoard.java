package com.company;

public class printBoard {
    static void printBoard (int[][] board){
        for (int i = 0; i < board.length; i++){
            for (int y = 0;  y < board.length; y++){
                System.out.print(board[i][y] + " ");
            }
            System.out.println();
        }
    }
}
