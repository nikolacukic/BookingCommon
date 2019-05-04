/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;
import transfer.util.StatusOdgovora;

/**
 *
 * @author Nikola PC
 */
public class Odgovor implements Serializable {
    
    private StatusOdgovora  status;
    private Object podaci;
    private Object error;

    public Odgovor() {
    }

    public Odgovor(StatusOdgovora status, Object podaci, Object error) {
        this.status = status;
        this.podaci = podaci;
        this.error = error;
    }

    public StatusOdgovora getStatus() {
        return status;
    }

    public void setStatus(StatusOdgovora status) {
        this.status = status;
    }

    public Object getPodaci() {
        return podaci;
    }

    public void setPodaci(Object podaci) {
        this.podaci = podaci;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
    
    
    
}
