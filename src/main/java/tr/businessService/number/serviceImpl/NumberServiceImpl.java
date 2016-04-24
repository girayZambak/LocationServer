package tr.businessService.number.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.businessService.number.requestBeans.CheckNumberServiceRequest;
import tr.businessService.number.responseBeans.CheckNumberServiceResponse;
import tr.businessService.number.service.NumberService;
import tr.daoLayer.number.dao.NumberDao;
import tr.daoLayer.number.dro.NumberDRO;
import tr.entity.Number;

@Service
@Transactional
public class NumberServiceImpl implements NumberService {
    @Autowired
    NumberDao numberDao;

    @Override
    public CheckNumberServiceResponse checkAndCreateNumber(CheckNumberServiceRequest checkNumberServiceRequest){
        CheckNumberServiceResponse.CheckNumberServiceResponseBuilder checkNumberServiceResponseBuilder = new CheckNumberServiceResponse.CheckNumberServiceResponseBuilder();
        NumberDRO numberDRO = numberDao.getNumber(checkNumberServiceRequest.getCheckNumber().getAreaCode(), checkNumberServiceRequest.getCheckNumber().getNumber());
        if(numberDRO == null){
            Number number = new Number();
            number.setAreaCode(checkNumberServiceRequest.getCheckNumber().getAreaCode());
            number.setNumber(checkNumberServiceRequest.getCheckNumber().getNumber());
            numberDao.create(number);
            return checkNumberServiceResponseBuilder.buildServiceResponse(new NumberDRO(number.getId(), number.getAreaCode(), number.getNumber()));
        }else{
            return checkNumberServiceResponseBuilder.buildServiceResponse(numberDRO);
        }
    }

}
