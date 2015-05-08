package diegomelo.com.br.busfloripa.model;

import com.orm.SugarRecord;

/**
 * Created by Diego on 06/03/2015.
 */
public class Terminal extends SugarRecord<Terminal> {
    private String nome;
    private String tipo;
    private Location location;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", location=" + location +
                '}';
    }
}
