package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Baatparkering {

    @Id
    private int bpID;
    private String navn;
    private String GPSlokasjon;
    private int telefonnummer;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getGPSlokasjon() {
        return GPSlokasjon;
    }

    public void setGPSlokasjon(String GPSlokasjon) {
        this.GPSlokasjon = GPSlokasjon;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public int getBåtplasser() {
        return båtplasser;
    }

    public void setBåtplasser(int båtplasser) {
        this.båtplasser = båtplasser;
    }

    private int båtplasser;



    public void setBaatID(int bpID) {
        this.bpID = bpID;
    }


    public int getBpID() {
        return bpID;
    }
}
