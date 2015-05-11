package br.com.diegomelo.busfloripa.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.diegomelo.busfloripa.model.Horario;
import br.com.diegomelo.busfloripa.R;

/**
 * Created by Diego on 07/05/2015.
 */
public class HorariosAdapter extends BaseAdapter {
    private Context context;
    private List<Horario> horarios;
    private LayoutInflater inflater;

    public HorariosAdapter(Context context, List<Horario> horarios) {
        this.context= context;
        this.horarios = horarios;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return horarios != null ? horarios.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return horarios != null ? horarios.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return horarios != null ? horarios.get(position).getId() : 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vHolder;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.modelo_horario, null);
            vHolder = new ViewHolder();
            vHolder.tvHoraSaida = (TextView) convertView.findViewById(R.id.tvHoraSaida);
            convertView.setTag(vHolder);
        } else {
            vHolder = (ViewHolder) convertView.getTag();
        }

        vHolder.tvHoraSaida.setText(horarios.get(position).getHoraSaida());
        return convertView;
    }

    static class ViewHolder {
        TextView tvHoraSaida;
    }

}
