package com.pranavjayaraj.healofy;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyDialog extends SwipeDialog implements View.OnTouchListener {
    private RecyclerView recyclerView;
    private DialogAdapter adapter;
    // this method create view for your Dialog
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflate layout with recycler view


        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        View v = inflater.inflate(R.layout.fragment_dialog, container, false);
        List<Data> list = new ArrayList<>();
        list = getData();

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_id);
        adapter = new DialogAdapter(list, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //get your recycler view and populate it.
        return v;
    }

    private List<Data> getData() {
        List<Data> list = new ArrayList<>();
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));
        list.add(new Data("Pranav",
                "Date",
                "Comment"));


        return list;
    }

    public void onResume() {

        super.onResume();
        Window window = getDialog().getWindow();
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        window.setGravity(Gravity.CENTER);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}