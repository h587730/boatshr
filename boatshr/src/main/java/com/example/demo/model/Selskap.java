package com.example.demo.model;




import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Selskap {

    @Id
    private int selskapID;
    private String navn;
    private int telefonnummer;
    private String fAdresse;


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getfAdresse() {
        return fAdresse;
    }

    public void setfAdresse(String fAdresse) {
        this.fAdresse = fAdresse;
    }

    public void setId(int id) {
        this.selskapID = id;
    }


    public int getId() {
        return selskapID;
    }
}
