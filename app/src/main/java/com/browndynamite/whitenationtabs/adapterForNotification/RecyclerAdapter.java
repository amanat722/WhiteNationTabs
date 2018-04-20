package com.browndynamite.whitenationtabs.adapterForNotification;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.browndynamite.whitenationtabs.R;

import java.util.ArrayList;

/**
 * Created by user on 4/20/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>
{

  private ArrayList<DataProviderNotification> arrayList=new ArrayList<DataProviderNotification>();

    public RecyclerAdapter(ArrayList<DataProviderNotification> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup container, int viewType) {

        View view;
        view = LayoutInflater.from(container.getContext()).inflate(R.layout.notification_layout
        , container,false);

        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position)
    {
        DataProviderNotification dataProviderNotification=arrayList.get(position);
        holder.img.setImageResource(dataProviderNotification.getImg());
        holder.notification.setText(dataProviderNotification.getNotification());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        ImageView img;
        TextView notification;


        public RecyclerViewHolder(View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.imgNotification);
            notification=itemView.findViewById(R.id.notificationText);


        }
    }
}
