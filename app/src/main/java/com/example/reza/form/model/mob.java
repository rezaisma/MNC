package com.example.reza.form.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class mob {

//    @Expose
//    @SerializedName("hasilSpinerRegion")
//    private String hasilSpinerRegion;
//    @Expose
//    @SerializedName("title") private String title;
//    @Expose
//    @SerializedName("note") private String note;

    @SerializedName("kecamatan")
    private String kecamatan;




    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

//    /*
//    INSTANCE FIELDS
//     */
//    private int id;
//    private String name;
//    private String propellant;
//    private String destination;
//
//    /*
//    GETTERS AND SETTERS
//     */
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPropellant() {
//        return propellant;
//    }
//
//    public void setPropellant(String propellant) {
//        this.propellant = propellant;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    /*
//    TOSTRING
//     */
//    @Override
//    public String toString() {
//        return name;
//    }
}
