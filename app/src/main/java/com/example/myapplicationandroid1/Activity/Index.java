package com.example.myapplicationandroid1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationandroid1.R;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_index);

        // --- INICIO DE LAS EDICIONES ---

        // 1. Enlazamos el botón del archivo XML con una variable de tipo Button en Java.
        // Usamos el ID que proporcionaste: R.id.btn_siguiente
        Button botonSiguiente = findViewById(R.id.btn_siguiente);

        // 2. Le asignamos un "escuchador de clics". Esto detecta cuando el usuario toca el botón.
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. Creamos un Intent. Un Intent es la "intención" de ir de una pantalla a otra.
                // Reemplaza "SiguienteActividad.class" con el nombre de tu próxima clase Java.
                // Por ejemplo, si quieres ir a la pantalla de inicio de sesión, sería "InicioSesion.class".
                Intent intent = new Intent(Index.this, inicio_sesion.class);

                // 4. Con este método, le decimos a Android que inicie la nueva actividad (la pantalla).
                startActivity(intent);
            }
        });

        // --- FIN DE LAS EDICIONES ---

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}