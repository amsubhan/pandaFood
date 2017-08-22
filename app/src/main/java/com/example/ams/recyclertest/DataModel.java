package com.example.ams.recyclertest;

/**
 * Created by AMS on 8/14/2017.
 */

public class DataModel {
    private String[] restaurantsNames ={"KFC","Mr. Burger","OPTP","Burger Labs","Mcdonalds","Subways","Kaybees","Kababjees","Chachajess","Hanifia"};
    private String[] restaurantsTaglines = {"Tagline1","Tagline2","Tagline3","Tagline4","Tagline5","Tagline6","Tagline7","Tagline8","Tagline9","Tagline10",};
    private String[] restaurantsReviewCount ={"44","60","90","10","32","89","17","30","80","50",};
    private int[] restaurantsImages = {R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores};
    private int[] dealsImages = {R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores,R.drawable.oneres,R.drawable.twores};
    private String[] deals ={"Deal 1","Deal 2","Deal 3","Deal 4","Deal 5","Deal 6","Deal 7","Deal 8","Deal 9","Deal 10"};
    private  String[] tagLines ={"Descriptions"};
    private String[] prices = {"4000","300","1000","980","9000","6400","600","1000","5000","4700"};

    public int getDealsImages(int position) {
        return dealsImages[position];
    }

    public String getDeals(int position) {
        return deals[position];
    }

    public String getTagLines(int position) {
        return tagLines[0];
    }

    public String getPrices(int position) {
        return prices[position];
    }

    public String getRestaurantsNames(int position) {
        return restaurantsNames[position];
    }

    public String getRestaurantsTaglines(int position) {
        return restaurantsTaglines[position];
    }

    public String getRestaurantsReviewCount(int position) {
        return restaurantsReviewCount[position];
    }

    public int getRestaurantsImages(int position) {
        return restaurantsImages[position];
    }



    public int getArrayLen(){
        int length = restaurantsImages.length;
        return length;
    }

    public int getDealsArrayLen(){
        int length = deals.length;
        return length;
    }

}

