/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author user
 */
public abstract class Korisnik implements GeneralEntity{
    
    protected String korisnickoIme;
    protected String lozinka;
    protected String imePrezime;
    protected String jmbg;
    protected String ePosta;

    public Korisnik() {
    }

    public Korisnik(String korisnickoIme, String lozinka, String imePrezime, String jmbg, String ePosta) {
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.ePosta = ePosta;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }
    
    
}
