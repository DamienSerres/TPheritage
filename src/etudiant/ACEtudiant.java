/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant;

/**
 *
 * @author Damien
 */
public class ACEtudiant {

    private CPersonne identite;
    private CFormation formation;

    public CPersonne getIdentite() {
        return identite;
    }

    public void setIdentite(CPersonne identite) {
        this.identite = identite;
    }

    public CFormation getFormation() {
        return formation;
    }

    public void setFormation(CFormation formation) {
        this.formation = formation;
    }
    public static void main(String[] args) {
        ACEtudiant etudiant = new ACEtudiant();
    }

}
