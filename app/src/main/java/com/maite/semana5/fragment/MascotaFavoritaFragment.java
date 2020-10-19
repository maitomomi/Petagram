package com.maite.semana5.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maite.semana5.pojo.Contacto;
import com.maite.semana5.adaptadores.ContactoAdapter;
import com.maite.semana5.R;
import com.maite.semana5.presentador.IRecyclerViewPresentador;
import com.maite.semana5.presentador.MascotaPresentador;

import java.util.ArrayList;


public class MascotaFavoritaFragment extends Fragment implements ReciclerviewFragmentview {
    private RecyclerView ListaMascotas;
    ArrayList<Contacto> contactos;
    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mascota_favorita,container,false);
        ListaMascotas = v.findViewById(R.id.ListaMascotas);
        presenter = new MascotaPresentador(this,getContext());
             return v;

    }

    @Override
    public void generarLinearLayout() {
        GridLayoutManager glm = new GridLayoutManager(getActivity() ,2 );
        ListaMascotas.setLayoutManager(glm);
    }


    @Override
    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos) {
        ContactoAdapter adaptador  = new ContactoAdapter(contactos,getActivity());
        return adaptador;
    }
    @Override
    public void InicializarAdaptadorRV(ContactoAdapter adaptador) {
        ListaMascotas.setAdapter(adaptador);
    }




}