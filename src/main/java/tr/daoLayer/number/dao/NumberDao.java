package tr.daoLayer.number.dao;

import tr.daoLayer.number.dro.NumberDRO;
import tr.util.classes.BaseDao;
import tr.entity.Number;

public interface NumberDao extends BaseDao<Number, Long> {
    public NumberDRO getNumber(String areaCode, String number);
}
