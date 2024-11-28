package org.example;

public class Main {
    public static void main(String[] args) {
    }
    public static int yamsGame(int nombre, int nombre2, int nombre3, int nombre4, int nombre5){
        int[] valeurs = {nombre, nombre2, nombre3, nombre4, nombre5};
        int compteursValeursMax = lancer(valeurs);
        if(compteursValeursMax == 5){
            System.out.println(50);
            return 50;
        }
        return 0;
    }
    public static int lancer(int[] valeurs){
        int compteursValeursMax = 0;
        for (int valeur : valeurs) {
            int compteurValeurs = 0;
            for (int valeurComparee : valeurs) {
                if (valeur == valeurComparee) {
                    compteurValeurs++;
                }
            }
            if (compteurValeurs > compteursValeursMax) {
                compteursValeursMax = compteurValeurs;
            }
        }
        return compteursValeursMax;
    }
}