package de.ohmstr.secretdata.controller;

import de.ohmstr.secretdata.domain.CurrencyData;
import de.ohmstr.secretdata.domain.ExchangeData;
import de.ohmstr.secretdata.repository.CurrencyDataRepository;
import de.ohmstr.secretdata.repository.ExchangeDataRepository;
import de.ohmstr.secretdata.service.CMCService;
import de.ohmstr.secretdata.service.CurrencyService;
import de.ohmstr.secretdata.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path="/secretdata/")
public class SecretDataController {

    @Autowired
    private CurrencyService cs;
    private ExchangeService es;
    private CMCService cmcs;

    @PostMapping (path="/updcurrency/")
    public @ResponseBody String updCurrency(@RequestParam String currencyname, @RequestParam String currencyticker){

        CurrencyData cd=new CurrencyData();
        cd.setCurrencyname(currencyname);
        cd.setCurrencyticker(currencyticker);
        return cs.addCurrency(cd);
    }

    @GetMapping (path="/getcurrency/")
    public @ResponseBody  List<CurrencyData> getAllCurrencies(){

        return cs.getCurrency();
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
        return es.addExchange(ed);
    }

    @GetMapping (path="/getexchange/")
    public @ResponseBody List<ExchangeData>  updExchange(){

        return es.getExchange();

    }

    @GetMapping (path="/getcmcdata/")
    public @ResponseBody String getCMCData(){
        String cmcdata="";
        try {
             cmcdata=cmcs.makeAPICall();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cmcdata;

    }



}
