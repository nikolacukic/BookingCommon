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
public class Smestaj implements GeneralEntity {

    private VlasnikSmestaja vlasnik;
    private long sifraSmestaja;
    private String nazivSmestaja;
    private int brojKreveta;
    private double cenaPrenocista;
    private String opis;
    private double prosecnaOcena;
    private List<Rezervacija> rezervacije = new LinkedList<Rezervacija>();
    private List<Ocena> ocene = new LinkedList<Ocena>();

    public Smestaj() {
    }

    public Smestaj(long sifraSmestaja, String nazivSmestaja, int brojKreveta, double cenaPrenocista, String opis, double prosecnaOcena) {
        this.sifraSmestaja = sifraSmestaja;
        this.nazivSmestaja = nazivSmestaja;
        this.brojKreveta = brojKreveta;
        this.cenaPrenocista = cenaPrenocista;
        this.opis = opis;
        this.prosecnaOcena = prosecnaOcena;
    }

    public long getSifraSmestaja() {
        return sifraSmestaja;
    }

    public void setSifraSmestaja(long sifraSmestaja) {
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

    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    public void setRezervacije(List<Rezervacija> rezervacije) {
        this.rezervacije = rezervacije;
    }

    public VlasnikSmestaja getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(VlasnikSmestaja vlasnik) {
        this.vlasnik = vlasnik;
    }

    public List<Ocena> getOcene() {
        return ocene;
    }

    public void setOcene(List<Ocena> ocene) {
        this.ocene = ocene;
    }
    
    @Override
    public String getTableName() {
        return "smestaj";
    }
//TODO MORA DA SE IMLPEMENTIRA I UCITAVANJE VLASNIKA SMESTAJA NEKAKO

    @Override
    public List<GeneralEntity> getList(ResultSet resultSet) throws Exception {
        List<GeneralEntity> list = new LinkedList<>();
        while (resultSet.next()) {
            long id = resultSet.getLong("sifra_smestaja");
            String naziv = resultSet.getString("naziv_smestaja");
            double cena = resultSet.getDouble("cena_prenocista");
            int kreveti = resultSet.getInt("broj_kreveta");
            double ocena = resultSet.getDouble("prosecna_ocena");
            String desc = resultSet.getString("opis");
            
            Smestaj s = new Smestaj(id, naziv, kreveti, cena, desc, ocena);
            list.add(s);
        }
        return list;
    }

    @Override
    public GeneralEntity getOne(ResultSet resultSet) throws Exception {
        while (resultSet.next()) {
            long sifra = resultSet.getLong("sifra_smestaja");
            String naziv = resultSet.getString("naziv_smestaja");
            double cena = resultSet.getDouble("cena_prenocista");
            int brojKr = resultSet.getInt("broj_kreveta");
            double prosek = resultSet.getDouble("prosecna_ocena");
            String opis = resultSet.getString("opis");
            String username = resultSet.getString("vlasnik_id");
            VlasnikSmestaja v = new VlasnikSmestaja();
            v.setKorisnickoIme(username);
            Smestaj s = new Smestaj(sifra, naziv, brojKr, cena, opis, prosek);
            s.setVlasnik(v);
            return s;
        }
        throw new Exception();
    }

    @Override
    public String getColumns() {
        return "(naziv_smestaja, cena_prenocista, broj_kreveta, prosecna_ocena, opis, vlasnik_id)";
    }

    @Override
    public String getValues() {
        return "(?, ?, ?, ?, ?, ?)";
    }

    @Override
    public String getIdName() {
        return "sifra_smestaja";
    }

    @Override
    public String getId() {
        return ""+getSifraSmestaja();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Smestaj other = (Smestaj) obj;
        if (this.sifraSmestaja != other.sifraSmestaja) {
            return false;
        }
        return true;
    }

    public void azurirajProsek() {
        int suma = 0;
        for(Ocena o: ocene){
            suma+=o.getOcena();
        }
        setProsecnaOcena((double)suma/ocene.size());
    }

    
}
