package tr.daoLayer.confirm.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.confirm.dao.ConfirmDao;
import tr.entity.Confirm;
import tr.util.classes.BaseDaoImpl;

import java.math.BigInteger;

@Repository
@Transactional
public class ConfirmDaoImpl extends BaseDaoImpl<Confirm, Long> implements ConfirmDao {

    @Override
    public Boolean checkConfirm(Long fkTUserId, Long fkConfirmTypeId, String code){
        String qry =  "select count(*) from confirm c where c.deleted = false and c.active = true "
                    + " and c.fk_t_user_id = "+fkTUserId
                    + " and c.fk_confirm_type_id = "+fkConfirmTypeId
                    + " and c.code = '"+code+"'";

        boolean result = getCurrentSession().createSQLQuery(qry).uniqueResult().equals(BigInteger.ZERO);

        return result;
    }

    @Override
    public void setConfirmPassive(Long fkTUserId, Long fkConfirmTypeId, String code){
        String qry =  "update confirm set active = false where deleted = false and active = true "
                + " and fk_t_user_id = "+fkTUserId
                + " and fk_confirm_type_id = "+fkConfirmTypeId
                + " and code = '"+code+"'";

        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }
}
