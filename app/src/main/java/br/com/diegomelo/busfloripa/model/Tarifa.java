package br.com.diegomelo.busfloripa.model;

import com.orm.SugarRecord;

import java.math.BigDecimal;

/**
 * Created by Diego on 06/03/2015.
 */
public class Tarifa extends SugarRecord<Tarifa> {
    private String tipo;
    private BigDecimal cartao;
    private BigDecimal dinheiro;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getCartao() {
        return cartao;
    }

    public void setCartao(BigDecimal cartao) {
        this.cartao = cartao;
    }

    public BigDecimal getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(BigDecimal dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Tarifa{" +
                "tipo='" + tipo + '\'' +
                ", cartao=" + cartao +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
