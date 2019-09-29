package de.ohmstr.secretdata.service;

import de.ohmstr.secretdata.domain.CurrencyData;
import de.ohmstr.secretdata.domain.ExchangeData;
import de.ohmstr.secretdata.repository.ExchangeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExchangeService {

    @Autowired
    ExchangeDataRepository edr;

    public String addExchange(ExchangeData ed){
        String resp=null;
        try {
            edr.save(ed);
            resp=ed.getExchanegName()+ "has been saved";
        }catch(Exception e){
            resp=e.getMessage();
        }
        return resp;
    }

    public List<ExchangeData> getExchange(){
        return (List<ExchangeData>)edr.findAll();
    }
}
