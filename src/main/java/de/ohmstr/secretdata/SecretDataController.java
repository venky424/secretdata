package de.ohmstr.secretdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/secretdata/")
public class SecretDataController {

    @Autowired
    private SecretDataRepository sdr;

    @RequestMapping (path="/currency/")
    public @ResponseBody String retrievCurrency(@RequestParam String currencyname, @RequestParam String currencyticker){

        SecretData sd=new SecretData();
        sd.setCurrencyname(currencyname);
        sd.setCurrencyticker(currencyticker);
        sdr.save(sd);
        return "saved";
    }

    @RequestMapping (path="/allcurrency/")
    public @ResponseBody Iterable<SecretData> getAllCurrencies(){
        return sdr.findAll();
    }


}
