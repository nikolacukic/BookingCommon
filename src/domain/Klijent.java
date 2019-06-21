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
public class Klijent extends Korisnik{

    private double stanjeNaRacunu;
    private List<Rezervacija> rezervacije = new LinkedList<Rezervacija>();
    private List<Ocena> ocene = new LinkedList<Ocena>();

    public Klijent() {
    }

    public Klijent(double stanjeNaRacunu, String korisnickoIme, String lozinka, String imePrezime, String jmbg, String ePosta) {
        super(korisnickoIme, lozinka, imePrezime, jmbg, ePosta);
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    public void setRezervacije(List<Rezervacija> rezervacije) {
        this.rezervacije = rezervacije;
    }

    public List<Ocena> getOcene() {
        return ocene;
    }

    public void setOcene(List<Ocena> ocene) {
        this.ocene = ocene;
    }

    
    
    @Override
    public String getTableName() {
        return "klijent";
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
            double stanje = resultSet.getDouble("stanje_na_racunu");

            Klijent k = new Klijent(stanje, username, password, ime, maticni, email);
            list.add(k);
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
            double stanje = resultSet.getDouble("stanje_na_racunu");
            return new Klijent(stanje, username, password, ime, maticni, email);
        }
        throw new Exception("Klijent sa unetim korisnickim imenom i lozinkom ne postoji. Proverite podatke!");
    }

    @Override
    public String getColumns() {
        return "(korisnicko_ime, lozinka, ime_prezime, jmbg, e_posta, stanje_na_racunu)";
    }

    @Override
    public String getValues() {
        return "(?, ?, ?, ?, ?, ?)";
    }

}
