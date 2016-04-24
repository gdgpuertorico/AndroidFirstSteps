package com.jsosa.ninjaacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView namesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //build upon
        namesRecyclerView = (RecyclerView) findViewById(R.id.names_recycler_view);
        namesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        namesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        namesRecyclerView.setHasFixedSize(true);
        namesRecyclerView.setAdapter(new NamesAdapter(this));
    }
}
