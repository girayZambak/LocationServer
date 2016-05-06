package tr.daoLayer.emergencyPerson.dao;

import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.entity.EmergencyPerson;
import tr.util.classes.BaseDao;

import java.util.List;

public interface EmergencyPersonDao extends BaseDao<EmergencyPerson, Long> {
    public List<EmergencyPersonDRO> getMyEmergencyPersons(Long fkUserId);
    public List<EmergencyPersonDRO> getFollowingEmergencyPersons(Long fkNumberId);
}
