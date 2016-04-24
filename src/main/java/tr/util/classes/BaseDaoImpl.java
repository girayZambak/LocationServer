package tr.util.classes;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class BaseDaoImpl<E extends BaseEntity, I extends Serializable> implements BaseDao<E, I> {
    private Class<E> entityClass;
    @Autowired
    private SessionFactory sessionFactory;

    public BaseDaoImpl() {
        Type e = this.getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType)e;
        this.entityClass = (Class)pt.getActualTypeArguments()[0];
    }

    public BaseDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public List<E> findAll() throws DataAccessException {
        return this.getCurrentSession().createCriteria(this.entityClass).list();
    }

    public E find(I id) {
        return (E)this.getCurrentSession().get(this.entityClass, id);
    }

    public void create(E e) {
        e.setDeleted(Boolean.valueOf(false));
        e.setCreateDate(new Date());
        e.setUpdateDate(new Date());
        this.getCurrentSession().persist(e);
    }

    public void update(E e) {
        e.setUpdateDate(new Date());
        this.getCurrentSession().update(e);
    }

    public void delete(E e) {
        e.setDeleted(Boolean.valueOf(true));
        this.getCurrentSession().update(e);
    }

    public E delete(I id) {
        E toDelete = this.find(id);
        toDelete.setDeleted(Boolean.valueOf(true));
        this.update(toDelete);
        return toDelete;
    }

    public void deleteById(I id) {
        this.getCurrentSession().createQuery("update " + this.entityClass.getSimpleName() + " e set e.silindi=true where e.id=" + id).executeUpdate();
    }

    public void flush() {
        this.getCurrentSession().flush();
    }

    public List findByDso(BaseDSO dso) {
        String[] queryArray = dso.toQuery().split("from|FROM|order by|ORDER BY");
        String countSql = "select count (*) from " + queryArray[1];
        Query countQuery = this.sessionFactory.getCurrentSession().createQuery(countSql);
        Long count = (Long)countQuery.uniqueResult();
        dso.setRowCount(count.intValue());
        String recordSql = dso.toQuery();
        Query recordQuery = this.sessionFactory.getCurrentSession().createQuery(recordSql).setFirstResult((dso.getCurrentPage() - 1) * dso.getPageSize()).setMaxResults(dso.getPageSize());
        List result = recordQuery.list();
        return result;
    }

    public List getByDso(BaseDSO dso) {
        return this.sessionFactory.getCurrentSession().createQuery(dso.toQuery()).list();
    }
}
