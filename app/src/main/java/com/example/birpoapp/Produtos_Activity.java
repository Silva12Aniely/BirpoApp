package com.example.birpoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Produtos_Activity extends AppCompatActivity {
    Toolbar toolbar;
    List<Produtos> lstProd, lstMarc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtos_layout);

        toolbar = (Toolbar) findViewById(R.id.toolbarprodutos);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        lstProd = new ArrayList<>();
        lstProd.add(new Produtos(R.drawable.pnescafe, "Nescafé", "Marca de café", 10));
        lstProd.add(new Produtos(R.drawable.banana, "Banana", "Fruta", 5));

        lstMarc = new ArrayList<>();
        lstMarc.add(new Produtos(R.drawable.apple, " ", "Marca", 2));
        lstMarc.add(new Produtos(R.drawable.hp, " ", "Marca", 4));
        lstMarc.add(new Produtos(R.drawable.sony, " ", "Marca", 3));

//        recycler1
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.idrecyclerView);
        BirpoAdapterRecyclerView AdapterRecyclerView = new BirpoAdapterRecyclerView(getApplicationContext(), lstProd);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerView.setAdapter(AdapterRecyclerView);
//        recycler2
        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.idrecyclerViewtwo);
        BirpoAdapterRecyclerView recyclerView2 = new BirpoAdapterRecyclerView(getApplicationContext(), lstProd);
        recyclerView1.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerView1.setAdapter(recyclerView2);
//        recycler3
        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.idrecyclerViewthree);
        BirpoAdapterMarcas recyclerView4 = new BirpoAdapterMarcas(getApplicationContext(), lstMarc);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView3.setAdapter(recyclerView4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_birpo, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mcart:
                Toast.makeText(getApplicationContext(), "Carrinho", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
