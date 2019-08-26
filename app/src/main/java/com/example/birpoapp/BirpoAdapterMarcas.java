package com.example.birpoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BirpoAdapterMarcas extends RecyclerView.Adapter<BirpoAdapterMarcas.MyViewHolder> {

    private Context context;
    private List<Produtos> produtos;

    public BirpoAdapterMarcas(Context context, List<Produtos> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.marcas_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgMarca.setImageResource(produtos.get(position).getImgProd());
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMarca;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMarca = (ImageView) itemView.findViewById(R.id.imgMarcas);
        }
    }
}
