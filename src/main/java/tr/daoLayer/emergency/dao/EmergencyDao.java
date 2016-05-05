package tr.daoLayer.emergency.dao;

import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.entity.Emergency;
import tr.util.classes.BaseDao;

public interface EmergencyDao extends BaseDao<Emergency, Long> {
    public EmergencyDRO getActiveEmergency(Long fkNumberId);
    public void disableAllActiveEmergencies(Long fkNumberId);
    public void disableEmergency(Long emergencyId);
    public Boolean checkActiveEmergency(Long fkNumberId);
    public Boolean checkActiveEmergencyById(Long emergencyId);
}
