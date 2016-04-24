package tr.util.classes;

import org.hibernate.Session;
import org.springframework.dao.DataAccessException;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<E extends BaseEntity, I extends Serializable> {
    Session getCurrentSession();

    List<E> findAll() throws DataAccessException;

    E find(I var1);

    void create(E var1);

    void update(E var1);

    void delete(E var1);

    E delete(I var1);

    void deleteById(I var1);

    void flush();

    List findByDso(BaseDSO var1);

    List getByDso(BaseDSO var1);
}
