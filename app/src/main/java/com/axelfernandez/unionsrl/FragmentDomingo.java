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
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDomingo extends Fragment {


    public FragmentDomingo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_semana, container, false);
        RecyclerView rv;
        rv = (RecyclerView) v.findViewById(R.id.recicler);
        String recorrido= getActivity().getIntent().getExtras().getString("recorrido");
        String partida= getActivity().getIntent().getExtras().getString("partida");
        String[] array = new String[0];
        Resources res = getResources();

        if (recorrido.equals("Centenario")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.centenario_domingo_alvear);

        }
        if (recorrido.equals("Centenario")&& partida.equals("Bowen")) {
            Log.e("cenenario","bowen");
            array = res.getStringArray(R.array.centenario_domingo_bowen);

        }
        if (recorrido.equals("Ruta 188")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.r188_domingo_alvear);

        }
        if (recorrido.equals("Ruta 188")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.r188_domingo_bowen);

        }
        if (recorrido.equals("Carmensa")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.carmensa_dom_alvear);

        }
        if (recorrido.equals("Carmensa")&& partida.equals("Carmensa")) {
            array = res.getStringArray(R.array.carmensa_dom_caramensa);

        }
        if (recorrido.equals("Punta Del Agua")&& partida.equals("Punta Del Agua")) {
           // array = res.getStringArray(R.array.centenario_domingo_alvear);

        }
        if (recorrido.equals("Escandinava")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.escandinava_dom_bowen);

        }
        if (recorrido.equals("Escandinava")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.escandinava_dom_alvear);

        }

        if (recorrido.equals("Marzolina")&& partida.equals("Bowen")) {
            array = res.getStringArray(R.array.marzolina_dom_bowen);

        }
        if (recorrido.equals("Marzolina")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.marzolina_dom_alvear);

        }
        if (recorrido.equals("Real del Padre")&& partida.equals("Alvear")) {
            array = res.getStringArray(R.array.realdelpadre_dom_alvear);

        }
        if (recorrido.equals("Real del Padre")&& partida.equals("Real del Padre")) {
            array = res.getStringArray(R.array.realdelpadre_dom_rdelpadre);

        }
        if (recorrido.equals("Cementerio")&& partida.equals("Bowen")) {
//no hay horarios los domingos

        }
        if (recorrido.equals("Cementerio")&& partida.equals("Cementerio")) {
//no hay horarios los domingos
        }
        rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        RVAdapter rvadapter;

        rvadapter = new RVAdapter(RV.getall(array), getContext());

        rv.setAdapter(rvadapter);

        return v; 
    }

}
