package de.ohmstr.secretdata.service;

import de.ohmstr.secretdata.domain.CurrencyData;
import de.ohmstr.secretdata.repository.CurrencyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CurrencyService {

    @Autowired
    CurrencyDataRepository cdr;

    public String addCurrency(CurrencyData cd){
        String resp=null;
        try {
            cdr.save(cd);
            resp=cd.getCurrencyname()+ "has been saved";
        }catch(Exception e){
            resp=e.getMessage();
        }
        return resp;
    }

    public List<CurrencyData> getCurrency(){
        return (List<CurrencyData>)cdr.findAll();
    }
}
