package br.com.diegomelo.busfloripa.activity.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.diegomelo.busfloripa.R;
import br.com.diegomelo.busfloripa.activity.adapter.HorariosAdapter;
import br.com.diegomelo.busfloripa.controller.HorarioController;
import br.com.diegomelo.busfloripa.model.Horario;


public class HorariosDomingoFragment extends Fragment {
    private GridView gvHorarios;
    private TextView tvNomeLinha;
    private HorariosAdapter adapter;
    private List<Horario> horarios;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_horarios, container, false);

        init(view);

        horarios = new HorarioController().getHorarios(HorarioController.DOMINGO);
        adapter = new HorariosAdapter(container.getContext(), horarios);
        gvHorarios.setAdapter(adapter);

        return view;
    }

    private void init(View view) {
        gvHorarios  = (GridView)  view.findViewById(R.id.gvHorarios);
        tvNomeLinha = (TextView)  view.findViewById(R.id.tvNomeLinha);
    }
}
