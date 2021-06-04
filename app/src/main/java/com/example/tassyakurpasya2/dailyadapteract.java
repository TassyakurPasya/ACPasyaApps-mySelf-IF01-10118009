package com.example.tassyakurpasya2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class dailyadapteract extends RecyclerView.Adapter<dailyadapteract.ViewHolder>{
    private Context context;
    private int[] gmr;
    private String[] text;

    //flist
    public dailyadapteract(Context context, int[] gmr, String[] text) {
        this.context = context;
        this.gmr = gmr;
        this.text = text;
    }

    @Override
    public dailyadapteract.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dailyactivityitem, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dailyadapteract.ViewHolder holder, int position) {
        holder.imageview.setImageResource(gmr[position]);
        holder.textview.setText(text[position]);

    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView textview;

        ViewHolder(View view) {
            super(view);

            imageview = view.findViewById(R.id.activity);
            textview = view.findViewById(R.id.tesact);





        }

    }
}
