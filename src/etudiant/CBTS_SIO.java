/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

import etudiant.HCEtudiant;
import java.util.ArrayList;

/**
 *
 * @author Damien
 */
public class CBTS_SIO {

    ArrayList<HCEtudiant> groupeSIO;

    public CBTS_SIO(ArrayList<HCEtudiant> groupeSIOparam) {
        this.groupeSIO = groupeSIOparam;
    }

    public CBTS_SIO() {
        this.groupeSIO = new ArrayList();
    }

    /**
     * Ajoute un étudiant si aucun des étudiants du groupe n'a le même nINSEE
     * que celui de létudiant passé en paramètre.
     *
     * @param etudiantParam
     */
    public void ajouterEtudiant(HCEtudiant etudiantParam) {
        boolean ajout = true;
        for (HCEtudiant etu : this.groupeSIO) {
            if (etu.getnINSEE().equals(etudiantParam.getnINSEE())) {
                ajout = false;
            }
        }
        if (ajout) {
            this.groupeSIO.add(etudiantParam);
        } else {
            System.out.println("n°INSEE : " + etudiantParam.getnINSEE()
                    + "\nCet étudiant est déjà dans le groupe, ou "
                    + "son numéro d'INSEE est déjà utilisé.");
        }
    }

    /**
     * Affiche la collection des étudiants dans la console. Attention, utilise la 
     * méthode toString() de CPersonne.
     */
    public void afficherLesEtudiants() {
        System.out.println(this.groupeSIO);
    }

    /**
     * Supprime les étudiants qui ont le même nINSEE que celui passé en paramètre.
     * @param nINSEEparam 
     */
    public void supprimerUnEtudiant(String nINSEEparam) {
        for (HCEtudiant etu : this.groupeSIO) {
            if (etu.getnINSEE().equals(nINSEEparam)) {
                this.groupeSIO.remove(etu);
            }
        }
    }

    /**
     * Supprime tous les étudiants du groupe.
     */
    public void viderLeGroupe() {
        this.groupeSIO.clear();
    }

    public static void main(String[] args) {
        HCEtudiant etudiantTest = new HCEtudiant();
        //Essai d'enregistrement d'INSEE
        etudiantTest.setnINSEE("123456789012345");
        //Essai de la lecture du nINSEE
        System.out.println(etudiantTest.getnINSEE());

        //Création d'un jeu de test d'étudiants
        HCEtudiant etu1 = new HCEtudiant();
        etu1.setnINSEE("111111111111111");
        HCEtudiant etu2 = new HCEtudiant();
        etu2.setnINSEE("222222222222222");
        HCEtudiant etu3 = new HCEtudiant();
        etu3.setnINSEE("333333333333333");
        //
        ////Création du doublon pour tester le blocage d'ajout
        HCEtudiant etuDoublon = new HCEtudiant();
        etuDoublon.setnINSEE("123456789012345");

        //Test du groupe
        CBTS_SIO sio1 = new CBTS_SIO();
        sio1.ajouterEtudiant(etudiantTest);
        sio1.ajouterEtudiant(etu1);
        sio1.ajouterEtudiant(etu2);
        sio1.ajouterEtudiant(etu3);
        //Test de l'ajout d'un doublon
        sio1.ajouterEtudiant(etuDoublon);
        //Test de l'affichage
        sio1.afficherLesEtudiants();
        //Test de suppression
        sio1.supprimerUnEtudiant("222222222222222");
        sio1.afficherLesEtudiants();
        //Test de vidage du groupe
        sio1.viderLeGroupe();
        sio1.afficherLesEtudiants();
    }

}
