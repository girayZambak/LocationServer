package tr.daoLayer.tUser.dao;

import tr.daoLayer.tUser.dro.TUserDRO;
import tr.entity.TUser;
import tr.util.classes.BaseDao;

public interface TUserDao extends BaseDao<TUser, Long> {
    public void setTUserPassive(Long fkNumberId);
    public void setTUserConfirmed(Long id);
    public TUserDRO getTUserDRO(Long id);
    public void setTUserLoggedIn(Long id, String password);
    public void setTUserLoggedOut(Long id);
}
