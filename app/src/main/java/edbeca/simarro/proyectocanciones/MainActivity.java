package edbeca.simarro.proyectocanciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaDiscos;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaDiscos = (ListView)findViewById(R.id.listaDiscos);
        String[] data = {"Ten", "Vitalogy", "Vs", "Yield"};

        adaptador = new ArrayAdapter<String>(this,R.layout.elemento_lista, data);

        listaDiscos.setAdapter(adaptador);

        listaDiscos.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        if (position == 0){
            // Abre una nueva Activity:
            Intent myIntent = new Intent(view.getContext(), activity_ten.class);
            startActivity(myIntent);
        }else if(position == 1){
            // Abre una nueva Activity:
            Intent myIntent = new Intent(view.getContext(), activity_vitalogy.class);
            startActivity(myIntent);
        }else if(position == 2){
            // Abre una nueva Activity:
            Intent myIntent = new Intent(view.getContext(), activity_vs.class);
            startActivity(myIntent);
        }else if (position == 3){
            Intent intent = new Intent(view.getContext(), Activity_yield.class);
            startActivity(intent);
        }

    }
}