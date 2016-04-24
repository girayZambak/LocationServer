package tr.daoLayer.tUser.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.tUser.dao.TUserDao;
import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.BaseDaoImpl;

import java.util.List;

@Repository
@Transactional
public class TUserDaoImpl extends BaseDaoImpl<TUser, Long> implements TUserDao {

    @Override
    public void setTUserPassive(Long fkNumberId){
        String qry = "update t_user set active = false where fk_number_id = "+fkNumberId;
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }

    @Override
    public void setTUserConfirmed(Long id){
        String qry = "update t_user set is_confirmed = true, is_login = true, active = true where id = "+id;
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }

    @Override
    public void setTUserLoggedIn(Long id, String password){
        String qry = "update t_user set is_login = true where id = "+id+" and password = '"+password+"'";
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }

    @Override
    public void setTUserLoggedOut(Long id){
        String qry = "update t_user set is_login = false where id = "+id;
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }

    @Override
    public TUserDRO getTUserDRO(Long id){
        String qry = "select new tr.daoLayer.tUser.dro.TUserDRO(" +
                     " tu.id, tu.fkNumberId, tu.name, tu.surname, tu.eMail, tu.regId, tu.dateOfBirth, tu.deviceId," +
                     " tu.simSerialNumber, tu.active, tu.isLogin, tu.isConfirmed, n.number, n.areaCode" +
                     ") from TUser tu inner join tu.number n where tu.id = "+id;

        List<TUserDRO> tUserDROList = getCurrentSession().createQuery(qry).list();

        if(tUserDROList.size() == 0){
            return null;
        }else{
            return tUserDROList.get(0);
        }
    }

}
