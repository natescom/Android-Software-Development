package com.nathan.recyclerview.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nathan.recyclerview.R;
import com.nathan.recyclerview.model.Filme;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Filme> filmes;

    public Adapter(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemlista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent,false);
        return new MyViewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titulo.setText(filmes.get(position).getTitulo());
        holder.genero.setText(filmes.get(position).getGenero());
        holder.ano.setText(filmes.get(position).getAno());

    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView titulo;
        TextView genero;
        TextView ano;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txt_titulo);
            genero = itemView.findViewById(R.id.txt_genero);
            ano = itemView.findViewById(R.id.txt_ano);

        }
    }
}
