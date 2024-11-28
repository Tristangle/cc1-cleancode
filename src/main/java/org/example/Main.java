package org.example;

public class Main {
    public static void main(String[] args) {
    }
    public static int yamsGame(int[] valeurs){
        if(valeurs.length != 5){
            throw new IllegalArgumentException("Il faut 5 éléments");
        }
        int compteurValeursMax = lancer(valeurs);
        return analayse(valeurs, compteurValeursMax);
    }
    public static int lancer(int[] valeurs){
        int compteurValeursMax = 0;
        for (int valeur : valeurs) {
            int compteurValeurs = 0;
            for (int valeurComparee : valeurs) {
                if (valeur == valeurComparee) {
                    compteurValeurs++;
                }
            }
            if (compteurValeurs > compteurValeursMax) {
                compteurValeursMax = compteurValeurs;
            }
        }
        return compteurValeursMax;
    }
    public static int analayse(int[] valeurs, int compteurValeursMax){
        int resultat = 0;
        for(int valeur : valeurs){
            resultat += valeur;
        }
        if(compteurValeursMax == 5){
            resultat = 50;
            return resultat;
        }
        else if(compteurValeursMax == 4){
            resultat = 40;
            return resultat;
        }
        else if(compteurValeursMax == 3){
            resultat = 28;
            return resultat;
        }

        System.out.println(resultat);
        return resultat;
    }
}