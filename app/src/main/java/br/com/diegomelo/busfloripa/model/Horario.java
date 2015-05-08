package br.com.diegomelo.busfloripa.model;
import com.orm.SugarRecord;

/**
 * Created by Diego on 06/03/2015.
 */
public class Horario extends SugarRecord<Horario> {
    private String tipoDia; //define se é dia de semana, sabado ou feriado
    private Boolean horarioPrevisto; //define se o horario estipulado é padrão ou somente uma previsão
    private Boolean meiaViagem;
    private Boolean veiculoAdaptado;
    private String horaSaida;
    private String previsaoChegada;
    private Boolean saidaTerminal; //define se o onibus parte do terminalou do bairro
    private String localSaida;
    private String observacao;

    public String getTipoDia() {
        return tipoDia;
    }

    public void setTipoDia(String tipoDia) {
        this.tipoDia = tipoDia;
    }

    public Boolean getHorarioPrevisto() {
        return horarioPrevisto;
    }

    public void setHorarioPrevisto(Boolean horarioPrevisto) {
        this.horarioPrevisto = horarioPrevisto;
    }

    public Boolean getMeiaViagem() {
        return meiaViagem;
    }

    public void setMeiaViagem(Boolean meiaViagem) {
        this.meiaViagem = meiaViagem;
    }

    public Boolean getVeiculoAdaptado() {
        return veiculoAdaptado;
    }

    public void setVeiculoAdaptado(Boolean veiculoAdaptado) {
        this.veiculoAdaptado = veiculoAdaptado;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getPrevisaoChegada() {
        return previsaoChegada;
    }

    public void setPrevisaoChegada(String previsaoChegada) {
        this.previsaoChegada = previsaoChegada;
    }

    public Boolean getSaidaTerminal() {
        return saidaTerminal;
    }

    public void setSaidaTerminal(Boolean saidaTerminal) {
        this.saidaTerminal = saidaTerminal;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
