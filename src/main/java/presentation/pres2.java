package presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("cofig.txt"));
        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDAO d = (IDAO) cDao.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDAO.class).newInstance(d);

        System.out.println("RES =====> " + metier.calcul());
    }
}
