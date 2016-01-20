package com.example.jhulio.moviefreak;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private GridView moviesGridView;
    private GridViewAdapter moviesGridAdapter;
    private ArrayList<MoviesGridItem> moviesGridData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesGridView = (GridView) findViewById(R.id.gridview_movies);

        //Initialize the Grid view (with empty data)

        moviesGridData = new ArrayList<>();
        moviesGridAdapter = new GridViewAdapter(this, R.layout.grid_item_movies, moviesGridData);
        moviesGridView.setAdapter(moviesGridAdapter);

    }
}
