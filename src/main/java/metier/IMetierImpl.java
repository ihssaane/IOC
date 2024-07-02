package metier;
import dao.IDAO;
public class IMetierImpl implements IMetier {
    private IDAO dao =null ; // couplage faible

    public IMetierImpl(IDAO dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = 234 *t;
        return res;
    }
    /*
    Pour injecter dans la variable dao
    un objet d'une classe qui implémente IDao
     */
    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
