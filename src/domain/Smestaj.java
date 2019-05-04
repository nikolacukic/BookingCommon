/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author user
 */
public class Smestaj implements GeneralEntity {

    private String sifraSmestaja;
    private String nazivSmestaja;
    private int brojKreveta;
    private double cenaPrenocista;
    private String opis;
    private double prosecnaOcena;

    public Smestaj() {
    }

    public Smestaj(String sifraSmestaja, String nazivSmestaja, int brojKreveta, double cenaPrenocista, String opis, double prosecnaOcena) {
        this.sifraSmestaja = sifraSmestaja;
        this.nazivSmestaja = nazivSmestaja;
        this.brojKreveta = brojKreveta;
        this.cenaPrenocista = cenaPrenocista;
        this.opis = opis;
        this.prosecnaOcena = prosecnaOcena;
    }

    public String getSifraSmestaja() {
        return sifraSmestaja;
    }

    public void setSifraSmestaja(String sifraSmestaja) {
        this.sifraSmestaja = sifraSmestaja;
    }

    public String getNazivSmestaja() {
        return nazivSmestaja;
    }

    public void setNazivSmestaja(String nazivSmestaja) {
        this.nazivSmestaja = nazivSmestaja;
    }

    public int getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(int brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public double getCenaPrenocista() {
        return cenaPrenocista;
    }

    public void setCenaPrenocista(double cenaPrenocista) {
        this.cenaPrenocista = cenaPrenocista;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }
    
    
    
    @Override
    public String getTableName() {
        return "smestaj";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
