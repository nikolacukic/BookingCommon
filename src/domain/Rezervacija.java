/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Rezervacija implements GeneralEntity {

    private Smestaj smestaj;
    private Klijent klijent;
    private Date datumOd;
    private Date datumDo;
    private double ukupanIznos;

    public Rezervacija() {
    }

    public Rezervacija(String smestajId, String klijentId, Date datumOd, Date datumDo, double ukupanIznos) {
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.ukupanIznos = ukupanIznos;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public Smestaj getSmestaj() {
        return smestaj;
    }

    public void setSmestaj(Smestaj smestaj) {
        this.smestaj = smestaj;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }
    
    @Override
    public String getTableName() {
        return "rezervacija";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        return null;
    }

    @Override
    public GeneralEntity getOne(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
