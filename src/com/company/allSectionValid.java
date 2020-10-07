package com.company;

public class allSectionValid {

    /**
     * La fonction permet de vérifier une section de 3par3 si un chiffre n'est pas en double dans une seule section
     * @param board La grille de sudoku un tableau à 2 dimenssions
     * @param raw L'index de la colonne de départ pour la vérification
     * @param col L'index de la valeur de départ pour la vérification
     * @return False si un chiffre est en double et True si rien n'est en double
     */
    public static boolean isValidSection(int[][] board, int raw, int col) {

        for (int nb = 1; nb <= 9; nb++) {
            int recurrence = 0;
            for (int x = raw; x < raw+3; x++) {
                for (int y = col; y < col+3; y++) {
                    System.out.print(board[x][y]);
                    System.out.println();
                    System.out.println("NUM ----   " + nb);
                    if (nb == board[x][y]) {
                        recurrence++;
                    }
                    if (recurrence > 1) {
                        return false;
                    }
                }
                System.out.println();
            }
        }
        return true;
    }

    /**
     * La fonction permet de ce déplacer les bornes de la section à vérifier
     * On appel la fonction isValidSection plusieurs fois dans une boucle jusqu'a faire les 9 sections de la grille
     * @param board Grille de sudoku, tableau à 2 dimenssion
     * @return False si la fonction isValidSection trouve un doublon et True si aucun doublon n'est trouver
     */
    public static boolean travelAllSection(int[][] board){
        for (int i = 0; i < 9; i += 3){
            for (int y = 0;  y < 9; y += 3){
                if (!isValidSection(board,i, y)) {
                    return false;
                }
            }
        }
        return true;
    }

}
