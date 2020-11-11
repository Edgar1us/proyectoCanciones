package edbeca.simarro.proyectocanciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class activity_vs extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaDiscos;
    MiArrayAdapter<Cancion> adaptador_vs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);

        listaDiscos = (ListView)findViewById(R.id.listaDiscos);
        String[] canciones_vs = {"º","Go", "Animal", "Daughter", "Glorifield G", "Dissident", "W.M.A", "Blood", "Reaviewmirror", "Rats", "Elderly Woman behind the counter in a small town", "Leash", "Indifference"};

        adaptador_vs = new MiArrayAdapter<Cancion>(this, DatosCanciones.CANCIONES_VS);
        listaDiscos.setAdapter(adaptador_vs);

        listaDiscos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Cancion cancionActual = (Cancion) adaptador_vs.getItem(i);
        String msg = "Elegiste la canción: \n " + cancionActual.getNombre() + "-" + cancionActual.getCompositores() + "-" + cancionActual.getDuracion();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}