/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kmne6
 */

@Entity
@Table(name="tblCodes")
public class PurchaseCodes {
    
    @Id
    @Column(name="TransCd")
    private String transcd;
    
    @Column(name="TransType")
    private String transtype;
    
    @Column(name="TransDesc")
    private String transdesc;
    
    public PurchaseCodes() {
        this.transcd = "";
        this.transtype = "";
        this.transdesc = "";
    }

    public String getTranscd() {
        return transcd;
    }

    public void setTranscd(String transcd) {
        this.transcd = transcd;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getTransdesc() {
        return transdesc;
    }

    public void setTransdesc(String transdesc) {
        this.transdesc = transdesc;
    }
    
}
