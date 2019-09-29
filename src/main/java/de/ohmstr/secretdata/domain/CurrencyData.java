package de.ohmstr.secretdata.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyData {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String currencyname;
    private String currencyticker;


    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    public String getCurrencyticker() {
        return currencyticker;
    }

    public void setCurrencyticker(String currencyticker) {
        this.currencyticker = currencyticker;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}
