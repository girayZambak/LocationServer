package tr.daoLayer.location.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.location.dao.LocationDao;
import tr.daoLayer.location.dro.LocationDRO;
import tr.entity.Location;
import tr.util.classes.BaseDaoImpl;
import tr.util.enums.EmergencyStatusEnum;

import java.util.List;

@Repository
@Transactional
public class LocationDaoImpl extends BaseDaoImpl<Location, Long> implements LocationDao {

    @Override
    public LocationDRO getLocationByEmergencyId(Long fkEmergencyId){

        String qry =  " select new tr.daoLayer.location.dro.LocationDRO(l.id, l.latitude, l.longitude, l.fkEmergencyId, l.fkLocationSendType, e.fkEmergencyStatusId, lst.definition) "
                + " from Location l "
                + " inner join l.emergency e"
                + " inner join l.locationSendType lst"
                + " where l.deleted = false and l.fkEmergencyId = "+fkEmergencyId
                + " order by l.id desc";

        List<LocationDRO> locationDROList = getCurrentSession().createQuery(qry).setMaxResults(1).list();

        if(locationDROList.size() != 0){
            return locationDROList.get(0);
        }
        return null;
    }
}
