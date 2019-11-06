package com.pranavjayaraj.healofy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.pranavjayaraj.healofy.Adapter.MainActivityAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        MainActivityAdapter mainActivityAdapter;
        RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            List<Data> list = new ArrayList<>();
            list = getData();

            View dialog = LayoutInflater.from(this).inflate(R.layout.fragment_dialog, null);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
            mainActivityAdapter = new MainActivityAdapter(list, getApplication(),getSupportFragmentManager(),dialog);
            recyclerView.setAdapter(mainActivityAdapter);
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
