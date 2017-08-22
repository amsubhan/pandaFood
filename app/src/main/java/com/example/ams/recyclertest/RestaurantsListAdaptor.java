package com.example.ams.recyclertest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AMS on 8/12/2017.
 */

public class RestaurantsListAdaptor extends RecyclerView.Adapter<RestaurantsLisViewHolder>{

    private Context context;
    public RestaurantsListAdaptor (Context myContext){
        context = myContext;
    }
    DataModel dataModelObj = new DataModel();

    @Override
    public RestaurantsLisViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restauraunts_names_list_layout, parent, false);
        RestaurantsLisViewHolder restaurantsLisViewHolderObj = new RestaurantsLisViewHolder(view);
        return restaurantsLisViewHolderObj;
    }

    @Override
    public void onBindViewHolder(RestaurantsLisViewHolder holder, int position) {

        holder.restaurantName.setText(dataModelObj.getRestaurantsNames(position));
        holder.restaurantTagLine.setText(dataModelObj.getRestaurantsTaglines(position));
        holder.restaurantReviewCount.setText("("+dataModelObj.getRestaurantsReviewCount(position)+")");
        holder.restaurantThumbnail.setImageResource(dataModelObj.getRestaurantsImages(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SingleRestaurant.class);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataModelObj.getArrayLen();
    }
}
