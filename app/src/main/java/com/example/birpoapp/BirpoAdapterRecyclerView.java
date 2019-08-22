package com.example.birpoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BirpoAdapterRecyclerView extends RecyclerView.Adapter<BirpoAdapterRecyclerView.MyViewHolder> {

    private Context context;
    private List<Produtos> produtos;

    public BirpoAdapterRecyclerView(Context context, List<Produtos> produtos) {
        this.context = context;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.produtos_cardview, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nomeProduto.setText(produtos.get(position).getNome());
        holder.imgProduto.setImageResource(produtos.get(position).getImgProd());
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProduto;
        TextView nomeProduto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProduto = (ImageView) itemView.findViewById(R.id.imgProd);
            nomeProduto = (TextView) itemView.findViewById(R.id.nomeProduto);
        }
    }
}
