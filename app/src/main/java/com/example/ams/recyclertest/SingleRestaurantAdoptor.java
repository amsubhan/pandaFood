package com.example.ams.recyclertest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AMS on 8/15/2017.
 */

public class SingleRestaurantAdoptor extends RecyclerView.Adapter<SingleRestaurantViewHolder>{

    private Context context;
    public SingleRestaurantAdoptor (Context myContext){
        context = myContext;
    }
    DataModel dataModel = new DataModel();

    @Override
    public SingleRestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.deals, parent, false);

        return new SingleRestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SingleRestaurantViewHolder holder, int position) {
        holder.price.setText(dataModel.getPrices(position));
        holder.deal.setText(dataModel.getDeals(position));
        holder.tagline.setText(dataModel.getTagLines(position));
        holder.dealThumb.setImageResource(dataModel.getDealsImages(position));
    }

    @Override
    public int getItemCount() {
        return dataModel.getDealsArrayLen();
    }
}
