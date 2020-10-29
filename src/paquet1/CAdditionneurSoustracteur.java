/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

/**
 *
 * @author Damien
 */
public class CAdditionneurSoustracteur extends CAdditionneur {

    public int calculerSoustraction() {
        return n1 - n2;
    }

//    Exemple de redéfinition
//    @Override
//    public int calculerSomme(){
//        return -1;
//    }
//    public CAdditionneurSoustracteur() {
//        System.out.println("Constructeur de CAdditionneurSoustracteur.");
//    }
    public CAdditionneurSoustracteur(int n1, int n2) {
        super(n1, n2);
    }

    public static void main(String[] args) {
//        CAdditionneurSoustracteur test = new CAdditionneurSoustracteur();
//        test.setN1(6);
//        test.setN2(12);
        CAdditionneurSoustracteur test = new CAdditionneurSoustracteur(24, 18);
        System.out.println(test.calculerSomme());
        System.out.println(test.calculerSoustraction());

        String date = "" + java.time.LocalDate.now();
        String annee = date.substring(0, 4);
        String mois = date.substring(5, 7);
        String jour = date.substring(8);
        System.out.println(jour + "/" + mois + "/" + annee);

    }
}
