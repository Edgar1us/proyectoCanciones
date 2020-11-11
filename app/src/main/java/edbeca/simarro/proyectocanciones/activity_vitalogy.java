package edbeca.simarro.proyectocanciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class activity_vitalogy extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaDiscos;
    MiArrayAdapter<Cancion> adaptador_vitalogy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitalogy);

        listaDiscos = (ListView)findViewById(R.id.listaDiscos);
        String[] canciones_vitalogy = {"º","Better man", "Corduroy", "Last Exit", "Satan´s Bed", "Whipping", "Bugs", "Tremor Christ", "Aye Davanita", "Nothingman", "Pry, to"};

        adaptador_vitalogy = new MiArrayAdapter<Cancion>(this, DatosCanciones.CANCIONES_VITALOGY);

        listaDiscos.setAdapter(adaptador_vitalogy);

        listaDiscos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Cancion cancionActual = (Cancion) adaptador_vitalogy.getItem(i);
        String msg = "Elegiste la canción: \n " + cancionActual.getNombre() + "-" + cancionActual.getCompositores() + "-" + cancionActual.getDuracion();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}