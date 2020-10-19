package com.maite.semana5.database;

import android.content.ContentValues;
import android.content.Context;

import com.maite.semana5.R;
import com.maite.semana5.pojo.Contacto;

import java.util.ArrayList;

public class Constructorcontactos {

    private static final int LIKE = 1;
    private Context context;
    public Constructorcontactos(Context context) {
        this.context = context;
    }
    public ArrayList<Contacto> obtenerdatos (){
     BaseDatos db = new BaseDatos(context);
     insertarcontactos(db);
     return db.obtenertodocontactos();
    }

    public void insertarcontactos(BaseDatos db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Patas");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.gato);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Tomy");;
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.gato);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Seis");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.ternero);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Sasha");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.perrito);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE, "Tupac");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.perrito);
        db.insertarcontacto(contentValues);

        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Manchita");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.ternero);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Pancho");;
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.perrito);
        db.insertarcontacto(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_NOMBRE , "Catalina");
        contentValues.put(ContanteBaseDatos.TABLE_MASCOTAS_FOTO , R.drawable.ternero);
        db.insertarcontacto(contentValues);



    }

    public ArrayList<Contacto> obtenerfavoritos (){
        ArrayList<Contacto> mascotas = new ArrayList<>();
        BaseDatos db = new BaseDatos(context);
        db.obtenertodocontactos();
        return db.obtenertodofavoritos();

    }
    public void darlike (Contacto contacto){
         BaseDatos db = new BaseDatos(context);
         ContentValues contentValues = new ContentValues();
         contentValues.put(ContanteBaseDatos.TABLE_LIKES_MASCOTAS_ID_CONTACTO, contacto.getId());
         contentValues.put(ContanteBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
         db.insertarcontactolike(contentValues);
    }
    public int obtenerlikescontacto(Contacto contacto){
        BaseDatos db = new BaseDatos(context);
        return  db.obtenerlikescontacto(contacto);
    }
}
