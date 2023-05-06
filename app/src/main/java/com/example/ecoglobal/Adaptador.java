package com.example.ecoglobal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.ecoglobal.R;

public class Adaptador extends BaseAdapter {

    //Definimos los objetos
    private static LayoutInflater inflater=null;
    Context context;
    String[][] informacion;
    int [] imagenes;

    public  Adaptador(Context context,String[][]informacion,int [] imagenes){
        this.context=context;
        this.informacion=informacion;
        this.imagenes=imagenes;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Asociamos la vista a la actividad_elementos.xml
        final View vista= inflater.inflate(R.layout.activity_lista_elementos,null);
        //Obtenemos todos los ctroladores
        ImageView ivProducto=(ImageView) vista.findViewById(R.id.ivProducto);
        TextView tvTitulo=(TextView) vista.findViewById(R.id.tvTitulo);
        TextView tvDescripcion=(TextView) vista.findViewById(R.id.tvDescripcion);
        TextView tvCosto=(TextView) vista.findViewById(R.id.tvCosto);
        RatingBar rbPreferencia=(RatingBar) vista.findViewById(R.id.rbPreferencia);

        //Asignamos informacion a los controladores por medio del arreglo
        tvTitulo.setText(informacion[position][0]);
        tvDescripcion.setText(informacion[position][1]);
        rbPreferencia.setProgress(Integer.valueOf(informacion[position][2]));
        tvCosto.setText(informacion[position][3]);
        ivProducto.setImageResource(imagenes[position]);

        return vista;

    }
}
