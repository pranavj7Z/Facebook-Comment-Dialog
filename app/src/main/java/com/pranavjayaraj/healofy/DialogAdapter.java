package com.pranavjayaraj.healofy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DialogAdapter
        extends RecyclerView.Adapter<ViewHolder> {

    List<Data> list
            = Collections.emptyList();

    Context context;


    public DialogAdapter(List<Data> list,
                         Context context)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType)
    {

        Context context
                = parent.getContext();
        LayoutInflater inflater
                = LayoutInflater.from(context);

        // Inflate the layout

        View photoView
                = inflater
                .inflate(R.layout.item,
                        parent, false);

        ViewHolder viewHolder
                = new ViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void
    onBindViewHolder(final ViewHolder viewHolder,
                     final int position)
    {

        viewHolder.examName
                .setText(list.get(position).name);
        viewHolder.examDate
                .setText(list.get(position).date);
        viewHolder.examMessage
                .setText(list.get(position).message);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(
            RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Sample data for RecyclerView
    private List<Data> getData()
    {
        List<Data> list = new ArrayList<>();
        list.add(new Data("First Exam",
                "May 23, 2015",
                "Best Of Luck"));
        list.add(new Data("Second Exam",
                "June 09, 2015",
                "b of l"));
        list.add(new Data("My Test Exam",
                "April 27, 2017",
                "This is testing exam .."));

        return list;
    }
}