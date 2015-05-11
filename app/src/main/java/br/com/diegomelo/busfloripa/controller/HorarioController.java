package br.com.diegomelo.busfloripa.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.diegomelo.busfloripa.model.Horario;

/**
 * Created by Diego on 11/05/2015.
 */
public class HorarioController {
    public static final int SEMANA = 0;
    public static final int SABADO = 1;
    public static final int DOMINGO = 2;

    public List<Horario> getHorarios(int tipo) {
        List<Horario> horarios = new ArrayList<>();

        if(tipo == SEMANA) {
            obterHorarios(horarios, 40);
        } else if(tipo == SABADO) {
            obterHorarios(horarios, 25);
        } else {
            obterHorarios(horarios, 10);
        }
        return horarios;
    }

    private void obterHorarios(List<Horario> horarios, int num) {
        for (int i = 0; i < num; i++) {
            Horario horario = new Horario();
            horario.setHoraSaida(String.valueOf(i));
            horarios.add(horario);
        }
    }
}
