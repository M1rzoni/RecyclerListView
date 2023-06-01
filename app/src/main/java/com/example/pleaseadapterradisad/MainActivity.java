package com.example.pleaseadapterradisad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyListView[] myListView;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myListView = new MyListView[]{
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),
                new MyListView("Nesto",R.drawable.brazil),

        };

        myAdapter = new MyAdapter(myListView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}