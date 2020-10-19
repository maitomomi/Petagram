package com.maite.semana5.presentador;

import android.content.Context;

import com.maite.semana5.database.Constructorcontactos;
import com.maite.semana5.fragment.ReciclerviewFragmentview;
import com.maite.semana5.pojo.Contacto;

import java.util.ArrayList;

public class MascotaPresentador implements IRecyclerViewPresentador {
    private ReciclerviewFragmentview reciclerviewFragmentview;
    private Context context;
    private Constructorcontactos constructorcontactos;
    private ArrayList<Contacto> contactos;

    public MascotaPresentador(ReciclerviewFragmentview reciclerviewFragmentview, Context context) {
        this.reciclerviewFragmentview = reciclerviewFragmentview;
        this.context = context;
        obtenercontactosbasedatos();
    }

    @Override
    public void obtenercontactosbasedatos() {
        constructorcontactos = new Constructorcontactos(context);
        contactos=constructorcontactos.obtenerfavoritos();
        mostrarcontactosRv();
    }

    @Override
    public void mostrarcontactosRv() {
        reciclerviewFragmentview.InicializarAdaptadorRV(reciclerviewFragmentview.crearadaptador(contactos));
        reciclerviewFragmentview.generarLinearLayout();
    }
}
