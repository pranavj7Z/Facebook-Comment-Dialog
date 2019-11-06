package com.pranavjayaraj.healofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        Adapter adapter;
        RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            List<Data> list = new ArrayList<>();
            list = getData();

            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            adapter = new Adapter(list, getApplication(),getSupportFragmentManager());
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        }

        @Override
        public void onBackPressed() {
            super.onBackPressed();
        }

    private List<Data> getData()
    {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));
        list.add(new Data("Pranav",
                "Date",
                "Post"));

        return list;
    }
    }
