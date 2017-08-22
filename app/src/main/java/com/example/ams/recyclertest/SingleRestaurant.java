package com.example.ams.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SingleRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_restaurant);

        RecyclerView dealsList = (RecyclerView) findViewById(R.id.restaurant_deals);
        SingleRestaurantAdoptor object = new SingleRestaurantAdoptor(SingleRestaurant.this);

        dealsList.setLayoutManager(new LinearLayoutManager(SingleRestaurant.this));
        dealsList.setAdapter(object);
    }
}
