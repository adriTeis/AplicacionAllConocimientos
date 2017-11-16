package com.example.adrianmontes.aplicacionallconocimientos;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adrianmontes.aplicacionallconocimientos.bdhelper.sqlite;

import java.sql.SQLOutput;

public class Ingresar extends AppCompatActivity {
    EditText usuario;
    EditText email;
    EditText Contraseña;
    EditText RepContraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        //ahora asocio las cajas de texto
        usuario = (EditText) findViewById(R.id.Usuario);
        email   = (EditText) findViewById(R.id.Email);
        Contraseña = (EditText) findViewById(R.id.Contraseña);
        RepContraseña = (EditText) findViewById(R.id.RepetirContraseña);



    }

    private boolean comprobarCampos() {
        //hago la comprobacion si hay espacios vacios
        if (usuario.getText().toString().isEmpty() || email.getText().toString().isEmpty() || Contraseña.getText().toString().isEmpty() || RepContraseña.getText().toString().isEmpty() || !Contraseña.getText().toString().equals(RepContraseña.getText().toString())) {
            return false;

        }
        else {
            return true;
        }

    }

    public void BotonRegistrar(View view){


        if (comprobarCampos()) {
        //ahora paso los valores recogidos del campo edittext a un String
            String USUARIORecogido= usuario.getText().toString();
            String EMAILRecogido = email.getText().toString();
            String CONTRASEÑARecogida = Contraseña.getText().toString();
            //el 1 es la version de la base de datos
            //usuarios es tabla de la base de datos que le pasamos
            sqlite baseDeDatos = new sqlite(this, "usuarios", null, 1);
            if (baseDeDatos != null) {

                    //le pasamos los datos a la base de datos para no tener que escribir nosotros las sentencias
                    // ya tiene un metodo que lo hace de manera predeterminada.
                    SQLiteDatabase data = baseDeDatos.getWritableDatabase();
                    //En el objeto "con" metemos los valores, clave=valor y lo guardo en el objeto con
                    ContentValues con = new ContentValues();
                    con.put("nombre", USUARIORecogido);
                    con.put("email", EMAILRecogido);
                    con.put("contrasena", CONTRASEÑARecogida);
                    //ahora con la clase data.insert le indico que lo meta en la tabla usuarios, que la creamos antes en el sqlite
                    //null le indicamos que da igual que aya columnas vacias, y el con es el objeto que le pasamos los valores.
                    long insertado = data.insert("usuarios", null, con);

                    if (insertado > 0) {

                        Toast.makeText(this, "Insertado con exito" + String.valueOf(insertado), Toast.LENGTH_SHORT).show();
                        usuario.setText("");
                        email.setText("");
                        Contraseña.setText("");


                    }


        } else {
            //le indico si hay campos vacios que salte ese mensage de error
            Toast.makeText(this, "Hay campos vacios,", Toast.LENGTH_SHORT).show();
        }
        //Esta es la parte del codigo cuando accedo a esta actividad desde la otra para poder volver a ella
        Intent intent=new Intent();
        intent.putExtra("nombre","CualQuiernombre");
        setResult(RESULT_OK,intent);
        finish();
    }



    }





    }







