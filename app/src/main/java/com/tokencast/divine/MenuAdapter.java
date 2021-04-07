package com.tokencast.divine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Integer> arrImage;
    private ArrayList<String> arrTitle;

    public ArtAdapter(Context ctx, ArrayList<Integer> images, ArrayList<String> titles) {
        inflater = LayoutInflater.from(ctx);
        context = ctx;
        arrImage = images;
        arrTitle = titles;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.art_layout, parent, false);
        ArtAdapter.MyViewHolder holder = new ArtAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.artImage.setImageResource(arrImage.get(position));
        holder.artTitle.setText(arrTitle.get(position));
    }

    @Override
    public int getItemCount() {
        return arrImage.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView artImage;
        TextView artTitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            artImage = itemView.findViewById(R.id.iv_artimage);
            artTitle = itemView.findViewById(R.id.tv_arttitle);
        }
    }
}
