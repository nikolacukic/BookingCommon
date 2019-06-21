/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class VlasnikSmestaja extends Korisnik {

    private String brojLicneKarte;
    private String kontaktTelefon;
    private List<Smestaj> smestaji;

    public VlasnikSmestaja() {
    }

    public VlasnikSmestaja(String brojLicneKarte, String kontaktTelefon, String korisnickoIme, String lozinka, String imePrezime, String jmbg, String ePosta) {
        super(korisnickoIme, lozinka, imePrezime, jmbg, ePosta);
        this.brojLicneKarte = brojLicneKarte;
        this.kontaktTelefon = kontaktTelefon;
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

    public List<Smestaj> getSmestaji() {
        return smestaji;
    }

    public void setSmestaji(List<Smestaj> smestaji) {
        this.smestaji = smestaji;
    }

    @Override
    public String getTableName() {
        return "vlasnik_smestaja";
    }

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        List<GeneralEntity> list = new LinkedList<>();
        while (resultSet.next()) {
            String username = resultSet.getString("korisnicko_ime");
            String password = resultSet.getString("lozinka");
            String ime = resultSet.getString("ime_prezime");
            String maticni = resultSet.getString("jmbg");
            String email = resultSet.getString("e_posta");
            String brLk = resultSet.getString("broj_lk");
            String telefon = resultSet.getString("kontakt_telefon");

            VlasnikSmestaja v = new VlasnikSmestaja(brLk, telefon, username, password, ime, maticni, email);
            list.add(v);
        }
        return list;
    }

    @Override
    public GeneralEntity getOne(ResultSet resultSet) throws Exception {
        while (resultSet.next()) {
            String username = resultSet.getString("korisnicko_ime");
            String password = resultSet.getString("lozinka");
            String ime = resultSet.getString("ime_prezime");
            String maticni = resultSet.getString("jmbg");
            String email = resultSet.getString("e_posta");
            String brLk = resultSet.getString("broj_lk");
            String telefon = resultSet.getString("kontakt_telefon");
            return new VlasnikSmestaja(brLk, telefon, username, password, ime, maticni, email);
        }
        throw new Exception("Vlasnik smestaja sa unetim korisnickim imenom i lozinkom ne postoji! Proverite podatke!");
    }

    @Override
    public String getColumns() {
        return "(korisnicko_ime, lozinka, ime_prezime, jmbg, e_posta, broj_lk, kontakt_telefon)";
    }

    @Override
    public String getValues() {
        return "(?, ?, ?, ?, ?, ?, ?)";
    }

}
