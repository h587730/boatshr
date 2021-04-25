package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kunde {


    @Id
    private int kundeID;
    private String navn;
    private String adresse;
    private int telefonnummer;
    private String epost;
    private String kredittkortopplysninger;



    public int getKundeID() {
        return kundeID;
    }

    public void setKundeID(int kundeID) {
        this.kundeID = kundeID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getKredittkortopplysninger() {
        return kredittkortopplysninger;
    }

    public void setKredittkortopplysninger(String kredittkortopplysninger) {
        this.kredittkortopplysninger = kredittkortopplysninger;
    }
}
