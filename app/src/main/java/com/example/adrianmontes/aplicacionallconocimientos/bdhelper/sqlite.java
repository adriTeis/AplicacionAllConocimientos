package com.example.adrianmontes.aplicacionallconocimientos.bdhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adrian.montes on 19/10/2017.
 */

//cuando creamos este metodo importamos los errores y nos crea de forma predeterminada los metodos abstractos
public class sqlite extends SQLiteOpenHelper {

//creamos la base de datos con las tablas.
    public String usuario="CREATE TABLE usuarios(idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,nombre TEXT,email TEXT,contrasena TEXT)";
    public sqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //ejecuto la base de datos
        db.execSQL(usuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
