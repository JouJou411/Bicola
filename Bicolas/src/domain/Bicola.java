/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Joabp
 */
public class Bicola {

    private int a1;
    private int a2;
    private Character[] bc = null;

    public Bicola(int tam) {
        bc = new Character[tam];
        a1 = -1;
        a2 = tam;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public boolean llena(int a, int lim, int fact) {
        return !(a + fact == lim);
    }

    public int inserta(int a, int lim, int fact, char cadena) {
        if (llena(a, lim, fact)) {
            a += fact;
            bc[a] = cadena;
        }
        return a;
    }

    public Object[] elimina(int a, int lim, int fact) {
        Object x[] = new Object[2];
        if (a != lim) {
            x[0] = bc[lim + fact];
            for (int i = lim + fact; i != a; i += fact) {
                bc[i] = bc[i + fact];
            }
            a = a - fact;
        }
        x[1] = a;
        return x;
    }

    public void separaConsoVoc(String cadena) {
        for (char c : cadena.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    setA2(inserta(getA2(), getA1(), -1, c));
                    break;
                default:
                    setA1(inserta(getA1(), getA2(), 1, c));
                    break;

            }
        }
    }
    public void mostrar(){
        for(char c : bc){
            System.out.println("c = " + c);
        }
    }
}
