package com.example.usuario.partidos;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.usuario.partidos.adapter.EquipoAdapter;
import com.example.usuario.partidos.adapter.PageAdapter;
import com.example.usuario.partidos.fragment.MainActivityFragment;
import com.example.usuario.partidos.fragment.SegundoFragment;
import com.example.usuario.partidos.pojo.Equipo;

import java.util.ArrayList;
import java.util.List;

import static com.example.usuario.partidos.R.id.pager;
import static com.example.usuario.partidos.R.id.tabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;




    ViewPager pager = null;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    PageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }



        // Instantiate a ViewPager
        this.pager = (ViewPager) this.findViewById(R.id.pager);

        // Create an adapter with the fragments we show on the ViewPager
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());

        adapter.addFragment(MainActivityFragment.newInstance(0));
        adapter.addFragment(SegundoFragment.newInstance(1));


        this.pager.setAdapter(adapter);

        tabLayout.setupWithViewPager(pager);





















    }



    @Override
    public void onBackPressed() {

        // Return to previous page when we press back button
        if (this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);

    }




}

