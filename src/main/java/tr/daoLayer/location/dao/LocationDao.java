package tr.daoLayer.location.dao;

import tr.daoLayer.location.dro.LocationDRO;
import tr.entity.Location;
import tr.util.classes.BaseDao;

public interface LocationDao extends BaseDao<Location, Long> {

    public LocationDRO getLocationByEmergencyId(Long fkEmergencyId);

}
