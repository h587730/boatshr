package com.example.demo.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Tur {

    @Id
    private String turID;
    private String startTid;
    private String sluttTid;
    private int pris;
    @ElementCollection
    private List<Integer> turlogg;


    public String getStartTid() {
        return startTid;
    }

    public void setStartTid(String startTid) {
        this.startTid = startTid;
    }

    public String getSluttTid() {
        return sluttTid;
    }

    public void setSluttTid(String sluttTid) {
        this.sluttTid = sluttTid;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public List<Integer> getTurlogg() {
        return turlogg;
    }

    public void setTurlogg(List<Integer> turlogg) {
        this.turlogg = turlogg;
    }

    public void setTurID(String turID) {
        this.turID = turID;
    }

    public String getTurID() {
        return turID;
    }
}
