/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class CDate {

    private int jour;
    private int mois;
    private int annee;

    public CDate() {
        this.jour = -1;
        this.mois = -1;
        this.annee = -1;
    }

    public CDate(int jour, int mois, int annee) {
        //Date du jour au format "2020-10-07"
        String date = "" + java.time.LocalDate.now();
        //On enlève les tirets pour avoir "20201007"
        String dateToday = date.substring(0, 4)
                + date.substring(5, 7)
                + date.substring(8);
        //On convertit en int pour la comparaison
        int dateTodayInt = Integer.parseInt(dateToday);
        //Prétraitement du jour pour avoir le 0 éventuel
        String day = "" + jour;
        if (jour < 10) {
            day = "0" + jour;
        }
        //Prétraitement du mois pour avoir le 0 éventuel
        String month = "" + mois;
        if (mois < 10) {
            month = "0" + mois;
        }
        //On crée la date en int à partir des paramètres
        int dateInt = Integer.parseInt("" + annee + month + day);

        if (dateInt > dateTodayInt) {
            this.jour = -1;
            this.mois = -1;
            this.annee = -1;
        } else {
            this.jour = jour;
            this.annee = annee;
            this.mois = mois;
        }
    }

    @Override
    public String toString() {
        //Prétraitement du jour pour avoir le 0 éventuel
        String day = "" + this.jour;
        if (this.jour < 10 && this.jour > 0) {
            day = "0" + this.jour;
        }
        //Prétraitement du mois pour avoir le 0 éventuel
        String month = "" + this.mois;
        if (this.mois < 10 && this.mois > 0) {
            month = "0" + this.mois;
        }
        return day + "/" + month + "/" + this.annee;
    }

    public static CDate creerDateConsole() {
        Scanner sc = new Scanner(System.in);
        int jour, mois, annee;
        System.out.println("Créons une date ensemble\nQuel jour entre 1 et 31 :");
        jour = sc.nextInt();
        System.out.println("Quel mois entre 1 et 12 :");
        mois = sc.nextInt();
        System.out.println("Quelle annee (exemple '2020') :");
        annee = sc.nextInt();
        return new CDate(jour, mois, annee);
    }

    /**
     * Affiche la date au format jj/mm/aaaa
     */
    public void afficher() {
//        //Prétraitement du jour pour avoir le 0 éventuel
//        String day = "" + jour;
//        if (jour < 10 && jour > 0) {
//            day = "0" + jour;
//        }
//        //Prétraitement du mois pour avoir le 0 éventuel
//        String month = "" + mois;
//        if (mois < 10 && mois > 0) {
//            month = "0" + mois;
//        }
//        System.out.println(day + "/" + month + "/" + this.annee);

//Après avoir redéfini toString() on peut l'utiliser ici pour simplifier
        System.out.println(this);
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public static void main(String[] args) {
//        CDate testDate = new CDate();
//        testDate.afficher();
//
//        CDate testDate = new CDate(7, 10, 2020);
//        testDate.afficher();
//bug affichage pas de 0 pour le jour et le mois < 10  --> corrigé
//
//        CDate testDate = new CDate(7, 8, 2020);
//        testDate.afficher();
//Même bug du 0 mais dans le test de date du constructeur --> corrigé
//Bug de l'affichage à -1  0-1/0-1/-1    --> corrigé
//
//Test de la méthode statique permettant de créer une date en interagissant 
//via la Console avec l'utilisateur
        CDate.creerDateConsole().afficher();
    }
}
