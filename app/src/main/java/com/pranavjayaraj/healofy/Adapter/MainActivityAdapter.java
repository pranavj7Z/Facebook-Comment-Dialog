package com.pranavjayaraj.healofy.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pranavjayaraj.healofy.Data;
import com.pranavjayaraj.healofy.MyDialog;
import com.pranavjayaraj.healofy.R;

import java.util.Collections;
import java.util.List;

public class MainActivityAdapter
        extends RecyclerView.Adapter<ViewHolder> {

    List<Data> list = Collections.emptyList();

    Context context;

    FragmentManager fragmentManager;
    View view;

    public MainActivityAdapter(List<Data> list,
                               Context context, FragmentManager fragmentManager, View view)
    {
        this.list = list;
        this.context = context;
        this.fragmentManager  = fragmentManager;
        this.view = view;
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
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MyDialog dialog = new MyDialog();
                dialog.show(fragmentManager, null);
            }
        });

        viewHolder.Date
                .setText(list.get(position).date);
        viewHolder.Message
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

}