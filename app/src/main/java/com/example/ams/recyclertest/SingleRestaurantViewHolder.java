package com.example.ams.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AMS on 8/15/2017.
 */

class SingleRestaurantViewHolder extends RecyclerView.ViewHolder {

    TextView deal, tagline, price;
    ImageView dealThumb;

    public SingleRestaurantViewHolder(View itemView) {
        super(itemView);

        dealThumb = (ImageView) itemView.findViewById(R.id.deal_icon);
        deal = (TextView) itemView.findViewById(R.id.deal);
        tagline = (TextView) itemView.findViewById(R.id.tagline);
        price  = (TextView) itemView.findViewById(R.id.price);

    }
}
