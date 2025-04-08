package pres;

import metier.MetierImpl;
import dao.IDaoImpl;

public class PresentationV1 {
    public static void main(String[] args){

        IDaoImpl d = new IDaoImpl();
        MetierImpl metier = new MetierImpl(d);

        System.out.println("RES="+metier.calcul());
    }
}
