package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        IMetierImpl metier = new IMetierImpl(d);
        // metier.setDao(d); // Injection des dep
        System.out.println("RES => " + metier.calcul());
    }
}
