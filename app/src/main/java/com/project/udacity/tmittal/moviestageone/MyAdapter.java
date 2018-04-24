package com.project.udacity.tmittal.moviestageone;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by tmittal on 05/04/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    int[] mMoviesPoster;

    public MyAdapter( int[] logos)
    {
        mMoviesPoster = logos;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View v = inflater.inflate(R.layout.movies_layout,parent,false);

        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        if(mMoviesPoster[position] !=0)
        Picasso.get().load(mMoviesPoster[position]).into(holder.logo);

        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
        // holder.logo.setImageBitmap(mMoviesPoster[position]);
       // holder.name.setText(mMovieName[position]);
    }

    @Override
    public int getItemCount() {
        return mMoviesPoster.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView logo;
       // public TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.iv_movies_tyle);
           // Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(logo);

            //  name = (TextView)itemView.findViewById(R.id.tv_movies_name);
        }
    }

}
