package ext;


import dao.IDAO;

public class DaoImplV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("Vers web service");
        double t =33;
        return t;
    }
}
