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
public class CFormation {

    private String nomFormation;
    private String niveau;
    private CDate dateDebut;
    private String duree;

    public static CFormation creerFormationConsole() {
        CFormation formation = new CFormation();
        Scanner sc = new Scanner(System.in);
        //nom de la formation ?
        System.out.println("Quel est le nom de la formation ?");
        formation.nomFormation = sc.nextLine();
        //le niveau ?
        System.out.println("Quel est le niveau de cette formation ?");
        formation.niveau = sc.nextLine();
        //Créer la date en demandant
        System.out.println("Quelle est la date de début ?");
        formation.setDateDebut(CDate.creerDateConsole());
        //la durée ?
        System.out.println("Quelle est la durée de cette formation ?");
        formation.duree = sc.nextLine();
        return formation;
    }

    @Override
    public String toString() {
        return "Nom de la formation : " + this.nomFormation
                + "\nNiveau : " + this.niveau
                + "\nDurée : " + this.duree
                + "\nDate de début : " + this.dateDebut;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public CDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(CDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public static void main(String[] args) {
        CFormation test = CFormation.creerFormationConsole();
        System.out.println(test);

    }
}
