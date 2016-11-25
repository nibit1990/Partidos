package com.example.usuario.partidos;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usuario.partidos.adapter.EquipoAdapter;
import com.example.usuario.partidos.adapter.PageAdapter;
import com.example.usuario.partidos.fragment.MainActivityFragment;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;
import java.util.List;

import static com.example.usuario.partidos.R.id.pager;

public class MainActivity extends AppCompatActivity {

    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    // Inicializar array con equipos y sus datos
    List items = new ArrayList();

    ViewPager pager = null;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    PageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarDatos();


// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new EquipoAdapter(items);
        recycler.setAdapter(adapter);









        // Instantiate a ViewPager
        this.pager = (ViewPager) this.findViewById(R.id.pager);

        // Create an adapter with the fragments we show on the ViewPager
        PageAdapter adapter = new PageAdapter(
                getSupportFragmentManager());
        adapter.addFragment(MainActivityFragment.newInstance(getResources()
                .getColor(R.color.colorPrimary), 0));
        adapter.addFragment(MainActivityFragment.newInstance(getResources()
                .getColor(R.color.colorPrimary), 1));
        adapter.addFragment(MainActivityFragment.newInstance(getResources()
                .getColor(R.color.colorPrimary), 2));
        adapter.addFragment(MainActivityFragment.newInstance(getResources()
                .getColor(R.color.colorPrimary), 3));
        adapter.addFragment(MainActivityFragment.newInstance(getResources()
                .getColor(R.color.colorPrimary), 4));
        this.pager.setAdapter(adapter);

    }


    @Override
    public void onBackPressed() {

        // Return to previous page when we press back button
        if (this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);

    }





    private void inicializarDatos() {


        items.add(new Equipo(R.drawable.bandera_brasil, "Brasil", 2));
        items.add(new Equipo(R.drawable.bandera_uruguay, "Uruguay", 4));
        items.add(new Equipo(R.drawable.bandera_argentina, "Argentina", 3));
    }





}

