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
public class CPersonne {

    private String nom;
    private String prenom;
    private CDate dateNaissance;
    private String nINSEE;

    @Override
    public String toString() {
        String infos = "nom : "+this.nom 
                +"\nprenom : "+this.prenom
                +"\ndate de naissance : "+this.dateNaissance
                +"\nnumero de sécu : "+this.nINSEE;
        return infos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(CDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getnINSEE() {
        return nINSEE;
    }

    public void setnINSEE(String nINSEE) {
        this.nINSEE = nINSEE;
    }
    
    public static void main(String[] args) {
        CPersonne personne = new CPersonne();
        personne.setPrenom("Damien");
        personne.setNom("Serres");
        personne.setDateNaissance(new CDate(23,6,1986));
        personne.setnINSEE("1860622222222");
        
        System.out.println(personne);
    }

}
