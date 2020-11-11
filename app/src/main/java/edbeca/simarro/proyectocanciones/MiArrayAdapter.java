package edbeca.simarro.proyectocanciones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiArrayAdapter<T> extends ArrayAdapter<T> {

    public MiArrayAdapter(@NonNull Context context, List<T> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = convertView;

        if (null == convertView) {
            listItemView = inflater.inflate(
                    R.layout.cancion,
                    parent,
                    false);
        }

        TextView titulo = (TextView)listItemView.findViewById(R.id.txtNombre);
       /* TextView subtitulo = (TextView)listItemView.findViewById(R.id.txtCompositores);
        TextView subtitulo2 = (TextView)listItemView.findViewById(R.id.txtDuracion);*/

        Cancion item = (Cancion) getItem(position);
        titulo.setText(item.getNombre());
        //subtitulo.setText(item.getCompositores());
        //subtitulo2.setText(item.getDuracion());
        //subtitulo2.setText(item.getDuracion());

        return listItemView;

    }

}
