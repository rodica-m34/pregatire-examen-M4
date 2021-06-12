package ro.tefacprogramator.m4.serialeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Platform
 */
@Entity
@Table(name = "Platform")
public class Platform {

    @Id
    @Column(name = "IDPlatform")
    private int id;

    @Column(name = "NamePlatform")
    private String name;

    @Column(name = "PricePerMonth")
    private double pricePerMonth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
    

    
}