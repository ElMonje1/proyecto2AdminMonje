package com.example.proyecto2adminmonje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {//Inicia clase
    public Button btnVenta, btnContacto, btnProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {//Inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Integracion de xml-java
        btnVenta = findViewById(R.id.btnVenta);
        btnContacto = findViewById(R.id.btnContacto);
        btnProductos = findViewById(R.id.btnProductos);

        //Evento para abrir la nueva ventana
        btnVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirVenta = new Intent(getApplicationContext(), Venta.class);
                startActivity(abrirVenta);
            }
        });
        btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirContacto = new Intent(getApplicationContext(), Contacto.class);
                startActivity(abrirContacto);
            }
        });
        btnProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirProducto = new Intent(getApplicationContext(), Producto.class);
                startActivity(abrirProducto);
            }
        });

    }//Termina el metodo onCreate
}//Termina clase