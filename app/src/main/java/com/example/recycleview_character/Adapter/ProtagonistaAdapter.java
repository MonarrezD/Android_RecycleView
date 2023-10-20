package com.example.recycleview_character.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_character.Models.Protagonista;
import com.example.recycleview_character.R;

import java.util.List;

public class ProtagonistaAdapter extends RecyclerView.Adapter<ProtagonistaAdapter.ViewHolder> {
       private List<Protagonista> protagonistas;
       public  ProtagonistaAdapter(List<Protagonista> protagonistas){this.protagonistas=protagonistas;}

        @NonNull
        @Override
        public ProtagonistaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
            View v=layoutInflater.inflate(R.layout.protagonistaitem, parent,false);
            return  new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ProtagonistaAdapter.ViewHolder holder, int position) {
        Protagonista p=protagonistas.get(position);
        holder.setData(p);
        }

        @Override
        public int getItemCount() {
            return 4;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView textNombre, textGenero, textEstado;
            Protagonista protaholder;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                textNombre=itemView.findViewById(R.id.tvNombre);
                textGenero=itemView.findViewById(R.id.tvGenero);
                textEstado=itemView.findViewById(R.id.tvEstado);
            }

            public  void setData(Protagonista p){
                this.protaholder=p;
                textNombre.setText(p.getNombre());
                textEstado.setText(p.getEstado());
                textGenero.setText(p.getGenero());
            }
        }
    }
