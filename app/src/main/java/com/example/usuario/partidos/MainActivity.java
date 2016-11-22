package com.example.usuario.partidos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText etAgregarResultado;
    private Button bAgregarResultado;
    /*
Declarar instancias globales
*/
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 


        // Inicializar Animes
        List items = new ArrayList();

        items.add(new Equipo(R.drawable.bandera_brasil, "Brasil", 2));
        items.add(new Equipo(R.drawable.bandera_uruguay, "Uruguay", 4));
        items.add(new Equipo(R.drawable.bandera_argentina, "Argentina", 3));
        items.add(new Equipo(R.drawable.bandera_colombia, "Colombia", 1));


// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

// Usar un administrador para LinearLayout
        lManager = new GridLayoutManager(this, 2);
        recycler.setLayoutManager(lManager);

// Crear un nuevo adaptador
        adapter = new EquipoAdapter(items);
        recycler.setAdapter(adapter);
    }


    @Override
    public void onClick(View view) {

    }
}

