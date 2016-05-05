package tr.daoLayer.emergency.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.emergency.dao.EmergencyDao;
import tr.daoLayer.emergency.dro.EmergencyDRO;
import tr.entity.Emergency;
import tr.util.classes.BaseDaoImpl;
import tr.util.enums.EmergencyStatusEnum;

import java.math.BigInteger;
import java.util.List;

@Repository
@Transactional
public class EmergencyDaoImpl extends BaseDaoImpl<Emergency, Long> implements EmergencyDao {

    @Override
    public Boolean checkActiveEmergency(Long fkNumberId){
        String qryCheck = "select count(*) from emergency e where e.fk_emergency_status_id = "+EmergencyStatusEnum.ACTIVE.getValue() + " and e.fk_number_id = "+fkNumberId;
        return getCurrentSession().createSQLQuery(qryCheck).uniqueResult().equals(BigInteger.ZERO);
    }

    @Override
    public Boolean checkActiveEmergencyById(Long emergencyId){
        String qryCheck = "select count(*) from emergency e where e.fk_emergency_status_id = "+EmergencyStatusEnum.ACTIVE.getValue() + " and e.id = "+emergencyId;
        return getCurrentSession().createSQLQuery(qryCheck).uniqueResult().equals(BigInteger.ZERO);
    }

    @Override
    public EmergencyDRO getActiveEmergency(Long fkNumberId){

        String qry = "select new tr.daoLayer.emergency.dro.EmergencyDRO(e.id,e.fkNumberId,e.fkEmergencyTypeId,e.fkEmergencyStatusId) from Emergency e "
                    + " where e.fkEmergencyStatusId = "+ EmergencyStatusEnum.ACTIVE.getValue()
                    + " and e.fkNumberId = "+fkNumberId;

        List<EmergencyDRO> numberDROList = getCurrentSession().createQuery(qry).list();

        if(numberDROList.size() == 0){
            return null;
        }else{
            return numberDROList.get(0);
        }
    }

    @Override
    public void disableAllActiveEmergencies(Long fkNumberId){
        String qry = "update emergency set fk_emergency_status_id = "+EmergencyStatusEnum.PASIF.getValue() + " where fk_number_id = "+fkNumberId;
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }

    @Override
    public void disableEmergency(Long emergencyId){
        String qry = "update emergency set fk_emergency_status_id = "+EmergencyStatusEnum.PASIF.getValue() + " where id = "+emergencyId;
        getCurrentSession().createSQLQuery(qry).executeUpdate();
    }
}
