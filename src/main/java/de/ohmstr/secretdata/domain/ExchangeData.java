package de.ohmstr.secretdata.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String exchanegName;
    private String exchangeURL;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getExchanegName() {
        return exchanegName;
    }

    public void setExchanegName(String exchanegName) {
        this.exchanegName = exchanegName;
    }

    public String getExchangeURL() {
        return exchangeURL;
    }

    public void setExchangeURL(String exchangeURL) {
        this.exchangeURL = exchangeURL;
    }
}
