package edbeca.simarro.proyectocanciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class activity_ten extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaDiscos;
    MiArrayAdapter<Cancion> adaptador_ten;
    //ArrayAdapter<String> adaptador_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);

        listaDiscos = (ListView)findViewById(R.id.listaDiscos);
        String[] canciones_ten = {"º","Once", "Garden", "Even Flow", "Alive", "Black", "Geremy", "Deep", "Oceans", "Why go", "Release", "Porch"};

        adaptador_ten = new MiArrayAdapter<Cancion>(this, DatosCanciones.CANCIONES_TEN);
        //adaptador_ten = new ArrayAdapter<String>(this,R.layout.elemento_lista, canciones_ten);


        listaDiscos.setAdapter(adaptador_ten);

        listaDiscos.setOnItemClickListener(this);
    }

   @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

       /*Toast toast1 =
               Toast.makeText(getApplicationContext(),
                       "Toast por defecto", Toast.LENGTH_SHORT);

       toast1.show();*/
        Cancion cancionActual = (Cancion) adaptador_ten.getItem(i);
        String msg = "Elegiste la canción: \n " + cancionActual.getNombre() + "-" + cancionActual.getCompositores() + "-" + cancionActual.getDuracion();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();

    }


}