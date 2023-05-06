package com.example.ecoglobal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView ivTienda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ivTienda=(ImageView) findViewById(R.id.ivTienda);
        ivTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visor= new Intent(getApplicationContext(),ListaActivity.class);
                startActivity(visor);
            }
        });
    }
}