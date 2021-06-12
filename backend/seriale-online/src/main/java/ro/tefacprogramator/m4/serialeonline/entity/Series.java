package ro.tefacprogramator.m4.serialeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Series")
public class Series {

    @Id
    @Column(name = "IDSeries")
    private int id;

    @Column(name = "NameSeries")
    private String name;

    @Column(name = "NumberOfSeasons")
    private int numberOfSeasons;

    @Column(name = "IDCategory")
    private int idCategory;

    @Column(name = "IDPlatform")
    private int idPlatform;

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

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdPlatform() {
        return idPlatform;
    }

    public void setIdPlatform(int idPlatform) {
        this.idPlatform = idPlatform;
    }


    

}
