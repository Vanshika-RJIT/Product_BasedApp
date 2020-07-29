package com.example.product_basedapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_02 extends Fragment {
    View v;
    RecyclerView rc;
    RecyclerView.LayoutManager LayoutManager,LayoutManager1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.activity_fragment_02,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rc=v.findViewById(R.id.recyclerview);
        LayoutManager = new GridLayoutManager(getContext(),2);
        rc.setLayoutManager(LayoutManager);

        MyAdapter2 ma=new MyAdapter2();
        rc.setAdapter(ma);



    }
}

