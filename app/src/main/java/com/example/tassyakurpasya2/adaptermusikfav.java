package com.example.tassyakurpasya2;
//4/06/2021,membuat adapter musik vide , 10118009, Tassyakur Pasya, IF01

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adaptermusikfav extends RecyclerView.Adapter<adaptermusikfav.ViewHolder>{
    private Context context;
    private String[] judulmusik;

    //flist
    public adaptermusikfav(Context context, int[] gmr, String[] text) {
        this.context = context;
        this.judulmusik = judulmusik;
    }

    @Override
    public adaptermusikfav.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemfavmusil, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptermusikfav.ViewHolder holder, int position) {
        holder.textview.setText(judulmusik[position]);

    }

    @Override
    public int getItemCount() {
        return judulmusik.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textview;

        ViewHolder(View view) {
            super(view);

            textview = view.findViewById(R.id.judulmusikfav);





        }

    }
}
