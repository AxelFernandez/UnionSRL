package com.axelfernandez.unionsrl;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSemana extends Fragment {


    public FragmentSemana() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_semana, container, false);
        RecyclerView rv;
        rv = (RecyclerView) v.findViewById(R.id.recicler);
        String recorrido= getActivity().getIntent().getExtras().getString("recorrido");
        String partida= getActivity().getIntent().getExtras().getString("partida");
        String[] array = new String[0];
        Resources res = getResources();

        if (recorrido.equals("Centenario")&& partida.equals("Alvear")) {
                array = res.getStringArray(R.array.centenario_lunvie_alvear);

        }
        if (recorrido.equals("Centenario")&& partida.equals("Bowen")) {
            Log.e("cenenario","bowen");
            array = res.getStringArray(R.array.centenariolunviebowen);

        }
        if (recorrido.equals("Ruta 188")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.r188_lunesviernes_alvear);

        }
        if (recorrido.equals("Ruta 188")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.r188_lunesviernes_bowen);

        }
        if (recorrido.equals("Carmensa")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.carmensa_lunvie_alvear);

        }
        if (recorrido.equals("Carmensa")&& partida.equals("Carmensa")) {
            array = res.getStringArray(R.array.carmensa_lunvie_carmensa);

        }
        if (recorrido.equals("Punta Del Agua")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.puntadelagua_lunvie_alvear);

        }

        if (recorrido.equals("Escandinava")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.escandinava_lunsab_bowen);

        }
        if (recorrido.equals("Escandinava")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.escandinava_lunsab_alvear);

        }

        if (recorrido.equals("Marzolina")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.marzolina_lunvie_bowen);

        }
        if (recorrido.equals("Marzolina")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.marzolina_lunvie_alvear);

        }
        if (recorrido.equals("Real del Padre")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.realdelpadre_lunvie_alvear);

        }
        if (recorrido.equals("Real del Padre")&& partida.equals("Real del Padre")) {
            array = res.getStringArray(R.array.realdelpadre_lunvie_rdelpadre);

        }
        if (recorrido.equals("Cementerio")&& partida.equals("Bowen")) {
            //no hay recorridos para los dias de semana

        }
        if (recorrido.equals("Cementerio")&& partida.equals("Cementerio")) {
            // No hay recorridos para semana
        }
        rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        RVAdapter rvadapter;

        rvadapter = new RVAdapter(RV.getall(array), getContext());

        rv.setAdapter(rvadapter);

            return v;
    }

}
