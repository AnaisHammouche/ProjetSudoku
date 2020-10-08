package com.company;

public class lineIsValid {


    /**
     * Vérifier les contraintes sur une ligne
     * @param tab un tableau d'entiers à deux dimensions
     * @param row une ligne précise
     * @return une valeur booléenne
     */
    public static boolean fIsLineValid(int[][] tab, int row) {
        boolean lineIsValid = true;

        for (int num = 1; num <= 9; num++) {
            // ATTENTION à où on instancie la variable counter,
            // si on l'instancie avant la boucle, le counter ne reviendra pas à zéro dans les autres tours de boucle,
            // s'il ne revient pas à zéro, on obtiendra false pour chaque nouveau num qu'on veut tester, ce qui signifie
            // que pour tous les autres on aura false.

            // On boucle D'ABORD dans les num et après dans les colones et pas l'inverse, car "pour chaque numero,
            // on va boucler dans les colones et pas pour chaque colone, on boucle dans les nums.

            int counter = 0;
            for (int col = 0; col < 9; col++) {
                if (num == tab[row][col]) {
                    counter++;
                    if (counter == 2) {
                        lineIsValid = false;
                        break;
                    }
                }
            }
        }
        return lineIsValid;
    }

    /**
     * Vérifie que toutes les lignes sont valides
     * @param tab un tableau d'entiers à deux dimensions
     * @return une valeur booléenne
     */
    public static boolean areAllLinesValid (int[][] tab) {
        boolean areAllLinesValid = true;

        for (int line = 0; line < 9; line++) {
            areAllLinesValid = fIsLineValid(tab,line);
            if (areAllLinesValid == false) {
                System.out.println(areAllLinesValid);
                return false;
            }
        }
        return true;

    }
}

