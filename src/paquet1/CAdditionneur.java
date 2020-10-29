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
public class CAdditionneur {

    protected int n1;
    protected int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

//    public CAdditionneur() {
//        System.out.println("Je suis le constructeur de la classe CAdditionneur.");
//    }
    public CAdditionneur(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int calculerSomme() {
        return n1 + n2;
    }

    public static void main(String[] args) {
//        CAdditionneur add = new CAdditionneur();
//        add.setN1(2);
//        add.setN2(40);
        CAdditionneur add = new CAdditionneur(18, 24);
        System.out.println("Somme = " + add.calculerSomme());
    }
}
