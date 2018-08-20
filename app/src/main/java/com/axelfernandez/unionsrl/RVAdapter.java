package com.axelfernandez.unionsrl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVVH> {
    private List<RV> rvlist;
    private Context context;

    public RVAdapter(List<RV> rvlist, Context context) {
        this.rvlist = rvlist;
        this.context = context;
    }

    @NonNull
    @Override
    public RVVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RVVH(LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVVH holder, int position) {
        holder.partida.setText(rvlist.get(position).getHorario().substring(0,13));
        holder.descripcion.setText(rvlist.get(position).getObservacion());
    }

    @Override
    public int getItemCount() {
        return rvlist.size();
    }


    static class RVVH extends RecyclerView.ViewHolder {

        View container;
        TextView partida;
        TextView descripcion;

        public RVVH(View itemView) {
            super(itemView);

            //Instanciamos las vistas
            container = itemView.findViewById(R.id.forecast_container);
            partida = (TextView) itemView.findViewById(R.id.rv_partida);
            descripcion = (TextView) itemView.findViewById(R.id.rv_descripcion);
        }
    }
}
