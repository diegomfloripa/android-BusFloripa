package br.com.diegomelo.busfloripa.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;

import diegomelo.com.br.busfloripa.R;

public class HorariosActivity extends ActionBarActivity {
    private GridView gvHorarios;
    private TextView tvNomeLinha;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);

        init();
        
        gvHorarios.setAdapter(adapter);
    }

    private void init() {
        gvHorarios = (GridView) findViewById(R.id.gvHorarios);
        tvNomeLinha = (TextView) findViewById(R.id.tvNomeLinha);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_horarios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
