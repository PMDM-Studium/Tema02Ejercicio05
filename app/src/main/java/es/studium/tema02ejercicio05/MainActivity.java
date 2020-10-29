package es.studium.tema02ejercicio05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnBoton;
    EditText texto;
    String telefonoPattern = "[6|7|8|9][0-9]{8}$";
    String telefonoPattern2 = "[0-9]{3}$";
    String telefonoPattern3 = "[0-9]{4}$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBoton = findViewById(R.id.boton);
        btnBoton.setOnClickListener(this);
        texto = findViewById(R.id.txtTelefono);
        texto.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (texto.length() == 0) {
            Toast.makeText(MainActivity.this, R.string.MensajeError, Toast.LENGTH_SHORT).show();
        } else {
            if ((texto.getText().toString().trim().matches(telefonoPattern))||(texto.getText().toString().trim().matches(telefonoPattern2))||(texto.getText().toString().trim().matches(telefonoPattern3))) {
                Toast.makeText(MainActivity.this, texto.getText(), Toast.LENGTH_SHORT).show();
                texto.setText("");
            } else {
                Toast.makeText(getApplicationContext(), R.string.validacionEmail, Toast.LENGTH_SHORT).show();
            }

        }
    }
}