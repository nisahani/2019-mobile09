package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {

    //instansi Recyclerview
    RecyclerView rvSuperHero;

    //instansi list superhero
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);

//        //membuat objek hero baru - awal
//        SuperHero hero = new SuperHero("Petruk");
//            //menambahkan hero ke listSuperHero
//            listSuperHero.add(hero);
//
//            //membuat objek hero baru - kedua
//            hero = new SuperHero("Gareng");
//            listSuperHero.add(hero);

        //Instansiasi Adapter
//        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
//
//        //set adapter dan layoutManager
//        rvSuperHero.setAdapter(superHeroAdapter);
//        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
        for (int i=0;i<=17;i++){
            listSuperHero.add(new SuperHero("-","Petruk"));
        }
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(getApplication(),listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL, false);
        rvSuperHero.setLayoutManager(layoutManager);
    }
}
