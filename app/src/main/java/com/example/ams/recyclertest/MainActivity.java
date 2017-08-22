package com.example.ams.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView restaurantsListView = (RecyclerView) findViewById(R.id.restaurants_name_list);
        RestaurantsListAdaptor restaurantsListAdaptor = new RestaurantsListAdaptor(MainActivity.this);

        restaurantsListView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        restaurantsListView.setAdapter(restaurantsListAdaptor);
    }
}
