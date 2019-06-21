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

    public Rezervacija(Smestaj smestaj, Klijent klijent, Date datumOd, Date datumDo, double ukupanIznos) {
        this.smestaj = smestaj;
        this.klijent = klijent;
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
        List<GeneralEntity> list = new LinkedList<>();
        while (resultSet.next()) {
            String sifra_smestaja = resultSet.getString("korisnicko_ime");
            
            String klijent_id = resultSet.getString("lozinka");
            String datum_Od = resultSet.getString("ime_prezime");
            String datum_Do = resultSet.getString("jmbg");
            String ukupan_Iznos = resultSet.getString("e_posta");

            Rezervacija r = new Rezervacija(smestaj, klijent, datumOd, datumDo, ukupanIznos);
            list.add(r);
        }
        return list;
    }

    @Override
    public GeneralEntity getOne(ResultSet resultSet) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumns() {
        return "(sifra_smestaja, klijent_id, datum_od, datum_do, ukupan_iznos)";
    }

    @Override
    public String getValues() {
        return "(?, ?, ?, ?, ?)";
    }

    @Override
    public String getIdName() {
        return "slozen";
    }

    @Override
    public String getId() {
        return "slozen";
    }
    
}
