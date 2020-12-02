
import com.api.backend.common.ICrudService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



public class ICrudServiceImpl<T> implements ICrudService<T>  {

    private final Class<T> type;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie_persistence_unit");
    private EntityManager em = emf.createEntityManager();

    public ICrudServiceImpl(Class<T> type) {
        this.type = type;
        em.getTransaction().begin();
    }
    
    @Override
    public T FindById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> GetAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(type);
        Root<T> rootEntry = cq.from(type);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void Add(T entity) {
        em.persist(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(T entity) {
       em.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(T entity) {
      em.merge(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void finalize()
    {
        em.close();
    }
    
}
