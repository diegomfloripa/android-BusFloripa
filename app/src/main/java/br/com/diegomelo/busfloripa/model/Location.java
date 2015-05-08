package br.com.diegomelo.busfloripa.model;

import com.orm.SugarRecord;

/**
 * Created by Diego on 06/03/2015.
 */
public class Location extends SugarRecord<Terminal> {
    private Double latitude;
    private Double longitude;
    private String endereco;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
