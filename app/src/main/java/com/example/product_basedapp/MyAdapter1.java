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

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.ViewHolder> {


    Integer image[]={R.drawable.headphone_product,R.drawable.phone_product,R.drawable.camera_product,R.drawable.electronics_product5,R.drawable.watch_product,R.drawable.electronics_product6};
    String cost[]={"Rs.2000","Rs.50000","Rs.7000","Rs.2500","Rs.4000","Rs.45000"};
    String name[]={"HeadPhone","Phone","Camera","Mixer Grinder","Watch","Laptop"};

    View v;
    @NonNull
    @Override
    public MyAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_adapter1, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter1.ViewHolder holder, int position) {
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