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
public class Ocena implements GeneralEntity {

    private Klijent klijent;
    private Smestaj smestaj;
    private int ocena;
    private String opis;

    public Ocena() {
    }

    public Ocena(int ocena, String opis) {
        this.ocena = ocena;
        this.opis = opis;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Smestaj getSmestaj() {
        return smestaj;
    }

    public void setSmestaj(Smestaj smestaj) {
        this.smestaj = smestaj;
    }
    
    
    
    @Override
    public String getTableName() {
        return "ocena";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeneralEntity getOne(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumns() {
        return "(smestaj_id, klijent_id, konacna_ocena, opis)";
    }

    @Override
    public String getValues() {
        return "(?, ?, ?, ?)";
    }

    @Override
    public String getIdName() {
        return "slozen";
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Ocena ima slozen kljuc");
    }
    
}
