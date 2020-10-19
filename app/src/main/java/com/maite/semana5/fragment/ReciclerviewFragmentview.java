package com.maite.semana5.fragment;

import com.maite.semana5.adaptadores.ContactoAdapter;
import com.maite.semana5.pojo.Contacto;

import java.util.ArrayList;

public interface ReciclerviewFragmentview {
    public void generarLinearLayout();

    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos);

    public void InicializarAdaptadorRV(ContactoAdapter adaptador);
}