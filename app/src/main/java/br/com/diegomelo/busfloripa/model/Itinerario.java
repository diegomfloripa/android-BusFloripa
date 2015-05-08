package br.com.diegomelo.busfloripa.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Diego on 06/03/2015.
 */
public class Itinerario extends SugarRecord<Itinerario> {
    private List<String> ruas;
    private String observacao;

    public List<String> getRuas() {
        return ruas;
    }

    public void setRuas(List<String> ruas) {
        this.ruas = ruas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Itinerario{" +
                "ruas=" + ruas +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
