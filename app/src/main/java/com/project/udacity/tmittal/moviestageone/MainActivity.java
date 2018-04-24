package com.project.udacity.tmittal.moviestageone;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_movies_list);

        int[] logos = new int[18];
        
        logos[0] = R.drawable.ic_action_name;
        logos[1] = R.drawable.ic_action_name_2;

        logos[2] = R.drawable.ic_action_name;
        logos[3] = R.drawable.ic_action_name_2;

        logos[4] = R.drawable.ic_action_name;
        logos[5] = R.drawable.ic_action_name_2;

        logos[6] = R.drawable.ic_action_name;
        logos[7] = R.drawable.ic_action_name_2;

        logos[8] = R.drawable.ic_action_name;
        logos[9] = R.drawable.ic_action_name_2;

        logos[10] = R.drawable.ic_action_name;
        logos[11] = R.drawable.ic_action_name_2;

        logos[12] = R.drawable.ic_action_name;
        logos[13] = R.drawable.ic_action_name_2;

        logos[14] = R.drawable.ic_action_name;
        logos[15] = R.drawable.ic_action_name_2;

        logos[16] = R.drawable.ic_action_name;


        MyAdapter adapter = new MyAdapter(logos);

       // Picasso.with(context).load(R.mipmap.ic_launcher).into(imageView);

        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rvMain.setLayoutManager(gridLayoutManager);
        rvMain.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

}
