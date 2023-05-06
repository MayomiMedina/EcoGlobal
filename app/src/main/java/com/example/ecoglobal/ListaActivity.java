package com.example.ecoglobal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {

    ListView lvProductos;
    String[][] productos= {{"Electrobomba sumergible", "TRITUS INOX alta resistencia que permite triturar completamente cuerpos sólidos y fibras ", "3", "s/900.00" },
            {"Kit PH", "Verifica el estado del cloro y el pH y mide 3 parametros importantes, cloro, bromine y el PH.", "5", "s/50" },
            {"Greensand Plus", "Medio catalizador para eliminar fierro (hierro) y manganeso del agua.", "4", "s/2500.00" },
            {"Carcasa para filtro", "Compatible con cartuchos de repuesto de filtración de tamaño estándar: 4.5 x 10.0 in","2", "s/300"}};
    int [] imagenes={R.drawable.bomba_sumergible,R.drawable.kit,R.drawable.arena_verde,R.drawable.carcasa};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        //Asociamos el objeto con el controler Listview
        lvProductos=(ListView) findViewById(R.id.lvProductos);
        //Asociamos el objeto al controlador ListView
        lvProductos.setAdapter(new Adaptador(this,productos,imagenes));

    }
}