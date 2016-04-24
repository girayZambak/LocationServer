package tr.daoLayer.confirm.dao;

import tr.entity.Confirm;
import tr.entity.TUser;
import tr.util.classes.BaseDao;

public interface ConfirmDao extends BaseDao<Confirm, Long> {

    public Boolean checkConfirm(Long fkTUserId, Long fkConfirmTypeId, String code);
    public void setConfirmPassive(Long fkTUserId, Long fkConfirmTypeId, String code);
}
