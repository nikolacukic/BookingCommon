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
public class VlasnikSmestaja extends Korisnik implements GeneralEntity {

    private String brojLicneKarte;
    private String kontaktTelefon;
    private double ocenaUsluge;

    public VlasnikSmestaja() {
    }

    public VlasnikSmestaja(String brojLicneKarte, String kontaktTelefon, double ocenaUsluge, String korisnickoIme, String lozinka, String imePrezime, String jmbg, String ePosta) {
        super(korisnickoIme, lozinka, imePrezime, jmbg, ePosta);
        this.brojLicneKarte = brojLicneKarte;
        this.kontaktTelefon = kontaktTelefon;
        this.ocenaUsluge = ocenaUsluge;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    public void setKontaktTelefon(String kontaktTelefon) {
        this.kontaktTelefon = kontaktTelefon;
    }

    public double getOcenaUsluge() {
        return ocenaUsluge;
    }

    public void setOcenaUsluge(double ocenaUsluge) {
        this.ocenaUsluge = ocenaUsluge;
    }
    
    
    
    @Override
    public String getTableName() {
        return "vlasnik_smestaja";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
