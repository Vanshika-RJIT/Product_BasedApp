package com.example.product_basedapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder> {


    Integer image[]={R.drawable.girls_product1,R.drawable.girls_product2,R.drawable.girls_product3,R.drawable.girls_product4,R.drawable.girls_product5,R.drawable.girls_product6};
    String cost[]={"Rs.1000","Rs.5000","Rs.3000","Rs.2500","Rs.4000","Rs.4500"};
    String name[]={"Top","Bag","Watch","MakeUp Kit","MakeUp Kit","MakeUp Kit"};

    View v;
    @NonNull
    @Override
    public MyAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_adapter2, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.ViewHolder holder, int position) {
        holder.i.setImageResource(image[position]);
        holder.t2.setText(cost[position]);
        holder.t1.setText(name[position]);
        holder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"BOUGHT SUCCESSFULLY!!!",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView i;
        TextView t1,t2;
        Button b;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            i=itemView.findViewById(R.id.imageView);
            t1=itemView.findViewById(R.id.textView1);
            t2=itemView.findViewById(R.id.textView2);
            b=itemView.findViewById(R.id.button);
        }
    }
}