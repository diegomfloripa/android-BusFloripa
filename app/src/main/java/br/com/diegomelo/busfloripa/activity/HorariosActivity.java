package br.com.diegomelo.busfloripa.activity;



import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.diegomelo.busfloripa.R;
import br.com.diegomelo.busfloripa.activity.adapter.HorariosAdapter;
import br.com.diegomelo.busfloripa.activity.adapter.ViewPagerAdapter;
import br.com.diegomelo.busfloripa.activity.widget.SlidingTabLayout;
import br.com.diegomelo.busfloripa.model.Horario;

public class HorariosActivity extends ActionBarActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPageradapter;
    private SlidingTabLayout tabs;
    private CharSequence[] titulos = {"Semana", "Sábado", "Domingo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);

        init();
    }

    private void init() {
        toolbar     = (Toolbar)   findViewById(R.id.tool_bar);
        viewPager   = (ViewPager) findViewById(R.id.view_pager);
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        setSupportActionBar(toolbar);
        viewPageradapter = new ViewPagerAdapter(getSupportFragmentManager(), titulos);
        viewPager.setAdapter(viewPageradapter);
        configureTabs();
    }

    private void configureTabs() {
        //para fixar as abas. Isso deixa as tabs com largura e espaçamento uniforme.
        tabs.setDistributeEvenly(true);
//        seta cor do indicador da tab selecionada
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer(){
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.accent);
            }
        });
        tabs.setViewPager(viewPager);
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
