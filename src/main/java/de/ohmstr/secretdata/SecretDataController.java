package de.ohmstr.secretdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/secretdata/")
public class SecretDataController {

    @Autowired
    private CurrencyDataRepository cr;
    private ExchangeDataRepository er;

    @PostMapping (path="/updcurrency/")
    public @ResponseBody String updCurrency(@RequestParam String currencyname, @RequestParam String currencyticker){

        CurrencyData cd=new CurrencyData();
        cd.setCurrencyname(currencyname);
        cd.setCurrencyticker(currencyticker);
        cr.save(cd);
        return "saved";
    }

    @GetMapping (path="/getcurrency/")
    public @ResponseBody Iterable<CurrencyData> getAllCurrencies(){
        return cr.findAll();
    }

    @GetMapping (path="/getmessage/")
    public @ResponseBody String getMessage(){
        return "Welcome to my Secret World";
    }

    @PostMapping (path="/updexchange/")
    public @ResponseBody String retrievCurrency(@RequestParam String Exchangename, @RequestParam String Exchangeurl){

        ExchangeData ed=new ExchangeData();
        ed.setExchanegName(Exchangename);
        ed.setExchangeURL(Exchangeurl);
        er.save(ed);
        return "saved";
    }

    @GetMapping (path="/getexchange/")
    public @ResponseBody Iterable<ExchangeData>  updExchange(@RequestParam String Exchangename, @RequestParam String Exchangeurl){

        return er.findAll();

    }



}
