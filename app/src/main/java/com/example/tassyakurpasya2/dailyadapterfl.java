package com.example.tassyakurpasya2;
//29/05/2021,membuat adapter activity , 10118009, Tassyakur Pasya, IF01

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class dailyadapterfl extends RecyclerView.Adapter<dailyadapterfl.ViewHolder>{
    private Context context;
    private int[] gmr;
    private String[] text;

    //flist
    public dailyadapterfl(Context context, int[] gmr, String[] text) {
        this.context = context;
        this.gmr = gmr;
        this.text = text;
    }

    @Override
    public dailyadapterfl.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dailyitem, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dailyadapterfl.ViewHolder holder, int position) {
        holder.imageview.setImageResource(gmr[position]);
        holder.textview.setText(text[position]);

    }

    @Override
    public int getItemCount() {
        return gmr.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView textview;

        ViewHolder(View view) {
            super(view);

            imageview = view.findViewById(R.id.ihsan);
            textview = view.findViewById(R.id.teskihsan);





        }

    }
}
