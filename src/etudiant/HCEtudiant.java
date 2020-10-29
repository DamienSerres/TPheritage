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
public class HCEtudiant extends CPersonne {

    private CFormation formation;

    public CFormation getFormation() {
        return formation;
    }

    public void setFormation(CFormation formation) {
        this.formation = formation;
    }
    
    public static void main(String[] args) {
        HCEtudiant etudiant = new HCEtudiant();
    }
}
