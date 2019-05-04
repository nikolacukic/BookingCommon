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
public class Klijent extends Korisnik implements GeneralEntity {

    private int brojOdsedanja;
    private double stanjeNaRacunu;

    public Klijent() {
    }
    
    public Klijent(int brojOdsedanja, double stanjeNaRacunu, String korisnickoIme, String lozinka, String imePrezime, String jmbg, String ePosta) {
        super(korisnickoIme, lozinka, imePrezime, jmbg, ePosta);
        this.brojOdsedanja = brojOdsedanja;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public int getBrojOdsedanja() {
        return brojOdsedanja;
    }

    public void setBrojOdsedanja(int brojOdsedanja) {
        this.brojOdsedanja = brojOdsedanja;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    
    
    
    @Override
    public String getTableName() {
        return "klijent";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
