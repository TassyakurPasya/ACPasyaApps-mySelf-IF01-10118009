package com.example.tassyakurpasya2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class adaptergallery extends RecyclerView.Adapter<adaptergallery.ViewHolder>{
    private Context context;
    private int[] gambar;


    public adaptergallery(Context context, int[] gmr, String[] text) {
        this.context = context;
        this.gambar = gambar;
    }

    @Override
    public adaptergallery.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemgallery, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptergallery.ViewHolder holder, int position) {
        holder.imageView.setImageResource(gambar[position]);

    }

    @Override
    public int getItemCount() {
        return gambar.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(View view) {
            super(view);

            imageView = view.findViewById(R.id.gambargallery);





        }

    }
}
