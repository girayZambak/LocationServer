package tr.daoLayer.number.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tr.daoLayer.number.dao.NumberDao;
import tr.daoLayer.number.dro.NumberDRO;
import tr.entity.Number;
import tr.util.classes.BaseDaoImpl;

import java.util.List;

@Repository
@Transactional
public class NumberDaoImpl extends BaseDaoImpl<Number, Long> implements NumberDao {
    @Override
    public NumberDRO getNumber(String areaCode, String number){

        String qry = "select new tr.daoLayer.number.dro.NumberDRO(n.id,n.areaCode,n.number) from Number n where n.areaCode = '"+areaCode+"' and n.number = '"+number+"'";

        List<NumberDRO> numberDROList = getCurrentSession().createQuery(qry).list();

        if(numberDROList.size() == 0){
            return null;
        }else{
            return numberDROList.get(0);
        }
    }

}
