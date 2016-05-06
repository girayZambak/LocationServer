package tr.daoLayer.emergencyPerson.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.emergencyPerson.dao.EmergencyPersonDao;
import tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO;
import tr.entity.EmergencyPerson;
import tr.util.classes.BaseDaoImpl;

import java.util.List;

@Repository
@Transactional
public class EmergencyPersonDaoImpl extends BaseDaoImpl<EmergencyPerson, Long> implements EmergencyPersonDao {

    @Override
    public List<EmergencyPersonDRO> getMyEmergencyPersons(Long fkUserId){

        String qry =  " select new tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO(e.id, e.fkSenderUserId, e.fkReceiverNumberId, num.areaCode, num.number, e.name, e.surname, e.active, e.isConfirmed) "
                    + " from EmergencyPerson e "
                    + " inner join e.number num "
                    + " where e.deleted = false and e.fkSenderUserId = "+fkUserId;

        List<EmergencyPersonDRO> emergencyPersonDROList = getCurrentSession().createQuery(qry).list();

        return emergencyPersonDROList;
    }

    @Override
    public List<EmergencyPersonDRO> getFollowingEmergencyPersons(Long fkNumberId){

        String qry =  " select new tr.daoLayer.emergencyPerson.dro.EmergencyPersonDRO(e.id, e.fkSenderUserId, e.fkReceiverNumberId, num.areaCode, num.number, usr.name, usr.surname, e.active, e.isConfirmed) "
                + " from EmergencyPerson e "
                + " inner join e.sender usr "
                + " inner join usr.number num "
                + " where e.deleted = false and e.fkReceiverNumberId = "+fkNumberId;

        List<EmergencyPersonDRO> emergencyPersonDROList = getCurrentSession().createQuery(qry).list();

        return emergencyPersonDROList;
    }
}
