package com.example.usuario.partidos;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.usuario.partidos.adapter.FragmentAdapter;
import com.example.usuario.partidos.fragment.MainActivityFragment;
import com.example.usuario.partidos.fragment.GrupoAFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    ArrayList<Category> category = new ArrayList<Category>();



    ViewPager pager = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }





        setUpViewPager();

















    }



    @Override
    public void onBackPressed() {

        // Return to previous page when we press back button
        if (this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);

    }


    private void setUpViewPager(){

        // Instantiate a ViewPager
        this.pager = (ViewPager) this.findViewById(R.id.pager);

        // Create an adapter with the fragments we show on the ViewPager
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());

        adapter.addFragment(MainActivityFragment.newInstance(0));
        adapter.addFragment(GrupoAFragment.newInstance(1));


        this.pager.setAdapter(adapter);

        tabLayout.setupWithViewPager(pager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_futbol);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_letra_a);
        tabLayout.getTabAt(0).setText("Tabla");
        tabLayout.getTabAt(1).setText("Grupo A");




    }

}

