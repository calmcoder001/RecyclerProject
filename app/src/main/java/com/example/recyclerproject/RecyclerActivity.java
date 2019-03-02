package com.example.recyclerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recycleView=(RecyclerView)findViewById(R.id.recycler_view);

        MtvAdapter mtvAdapter =new MtvAdapter(this,DataGenerator.getData(this));


recycleView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        recycleView.setAdapter(mtvAdapter);
    }
}
