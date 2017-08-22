package com.example.ams.recyclertest;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AMS on 8/12/2017.
 */

class RestaurantsLisViewHolder extends RecyclerView.ViewHolder{

    ImageView restaurantThumbnail;
    TextView  restaurantName, restaurantTagLine, restaurantReviewCount;

    public RestaurantsLisViewHolder(View viewI) {
        super(viewI);

        restaurantThumbnail = (ImageView) viewI.findViewById(R.id.restaurant_icon);
        restaurantName = (TextView) viewI.findViewById(R.id.restaurant_name);
        restaurantTagLine = (TextView) viewI.findViewById(R.id.tagline);
        restaurantReviewCount  = (TextView) viewI.findViewById(R.id.review_count);
    }
}
