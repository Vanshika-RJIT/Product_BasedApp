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

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.ViewHolder> {


    Integer image[]={R.drawable.specs_product,R.drawable.boys_product1,R.drawable.boys_product2,R.drawable.boys_product4,R.drawable.boys_product6,R.drawable.shoes};
    String cost[]={"Rs.1000","Rs.2000","Rs.1000","Rs.2500","Rs.4000","Rs.1500"};
    String name[]={"Specs","Gel","FaceWash","Specs","Beard Balm","Shoes"};

    View v;
    @NonNull
    @Override
    public MyAdapter3.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_adapter3, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter3.ViewHolder holder, int position) {
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