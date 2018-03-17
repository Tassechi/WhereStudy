package pruebafinal.com.pruebafinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    List<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        listaPersonajes=new ArrayList<PersonajeVo>();
        recyclerPersonajes= (RecyclerView) findViewById(R.id.recyclerid);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes(this, new ArrayList<PersonajeVo>());
        recyclerPersonajes.setAdapter(adapter);

        listaPersonajes.add(new PersonajeVo("IGA",R.drawable.iga));
        adapter.setPersonajes(listaPersonajes);

    }

    private void llenarPersonajes() {
    }
}