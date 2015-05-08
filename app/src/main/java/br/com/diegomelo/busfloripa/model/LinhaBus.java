package br.com.diegomelo.busfloripa.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Diego on 06/03/2015.
 */
public class LinhaBus extends SugarRecord<LinhaBus> {
    private String nome;
    private Integer numero;
    private Tarifa tarifa;
    private List<Terminal> terminais;
    private List<Horario> horarios;
    private Itinerario itinerario;
    private String tempoPercurso;
    private String ultimaAtualzacao;
    private String observacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public List<Terminal> getTerminais() {
        return terminais;
    }

    public void setTerminais(List<Terminal> terminais) {
        this.terminais = terminais;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public String getTempoPercurso() {
        return tempoPercurso;
    }

    public void setTempoPercurso(String tempoPercurso) {
        this.tempoPercurso = tempoPercurso;
    }

    public String getUltimaAtualzacao() {
        return ultimaAtualzacao;
    }

    public void setUltimaAtualzacao(String ultimaAtualzacao) {
        this.ultimaAtualzacao = ultimaAtualzacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "LinhaBus{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", tarifa=" + tarifa +
                ", terminais=" + terminais +
                ", horarios=" + horarios +
                ", itinerario=" + itinerario +
                ", tempoPercurso='" + tempoPercurso + '\'' +
                ", ultimaAtualzacao='" + ultimaAtualzacao + '\'' +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
