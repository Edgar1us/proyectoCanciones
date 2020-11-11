package edbeca.simarro.proyectocanciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_yield extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaDiscos;
    MiArrayAdapter<Cancion> adaptador_yield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yield);

        listaDiscos = (ListView)findViewById(R.id.listaDiscos);
        String[] canciones_yield = {"º","Do the evolution", "Brain of J.", "No way", "Faithfull", "Given to fly", "Pilate", "The color red", "Wishlist", "MFC", "Low Light", "Push me, pull me", "In hiding"};

        adaptador_yield = new MiArrayAdapter<Cancion>(this, DatosCanciones.CANCIONES_YIELD);

        listaDiscos.setAdapter(adaptador_yield);

        listaDiscos.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Cancion cancionActual = (Cancion) adaptador_yield.getItem(i);
        String msg = "Elegiste la canción: \n " + cancionActual.getNombre() + "-" + cancionActual.getCompositores() + "-" + cancionActual.getDuracion();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}