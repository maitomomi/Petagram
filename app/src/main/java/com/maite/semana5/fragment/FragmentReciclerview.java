package com.maite.semana5.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maite.semana5.pojo.Contacto;
import com.maite.semana5.adaptadores.ContactoAdapter;
import com.maite.semana5.R;
import com.maite.semana5.presentador.IRecyclerViewPresentador;
import com.maite.semana5.presentador.RecyclerViewPresentador;

import java.util.ArrayList;


public class FragmentReciclerview extends Fragment implements ReciclerviewFragmentview {
    private RecyclerView ListaMascotas;
    ArrayList<Contacto> contactos;
    private IRecyclerViewPresentador presenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_reciclerview,container,false);

        ListaMascotas = v.findViewById(R.id.ListaMascotas);
        presenter= new RecyclerViewPresentador(this,getContext());
        return v;

    }


    public void generarLinearLayout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);
        //   GridLayoutManager glm = new GridLayoutManager(this ,2 );
    }

    public ContactoAdapter crearadaptador(ArrayList<Contacto> contactos) {
        ContactoAdapter adaptador  = new ContactoAdapter(contactos,getActivity());
        return adaptador;
    }

    public void InicializarAdaptadorRV(ContactoAdapter adaptador) {
        ListaMascotas.setAdapter(adaptador);
    }
}


