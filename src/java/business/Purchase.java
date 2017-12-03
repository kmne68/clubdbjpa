/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kmne6
 */
@Entity
@Table(name="tblpurchases")
public class Purchase {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long pid;
    
    @Column(name="MemID")
    private String memid;
    
    @Column(name="PurchaseDt")
    @Temporal(TemporalType.DATE)
    private Date purchdt;
    
    @Column(name="TransType")
    private String transtype;
    
    @Column(name="TransCd")
    private String tcd;
    
    @Column(name="Amount")
    private double amt;
    
    public Purchase() {
        this.memid = "";
        this.purchdt = null;
        this.transtype = "";
        this.tcd = "";
        this.amt = 0;
        this.pid = 0;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public Date getPurchdt() {
        return purchdt;
    }

    public void setPurchdt(Date purchdt) {
        this.purchdt = purchdt;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getTcd() {
        return tcd;
    }

    public void setTcd(String tcd) {
        this.tcd = tcd;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }
    
    public String getPurchDtS() {
        return new SimpleDateFormat("MM-dd-YYYY").format(this.purchdt);
    }
}
