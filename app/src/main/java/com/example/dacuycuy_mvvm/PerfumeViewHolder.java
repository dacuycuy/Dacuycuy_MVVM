package com.example.dacuycuy_mvvm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PerfumeViewHolder extends RecyclerView.ViewHolder {

    ImageView imgPerfume;
    TextView txtName, txtPrice;

    public PerfumeViewHolder(@NonNull View itemView) {
        super(itemView);

        imgPerfume = itemView.findViewById(R.id.imgPerfume);
        txtName = itemView.findViewById(R.id.txtName);
        txtPrice = itemView.findViewById(R.id.txtPrice);
    }
}
