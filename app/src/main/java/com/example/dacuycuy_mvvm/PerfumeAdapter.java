package com.example.dacuycuy_mvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PerfumeAdapter extends RecyclerView.Adapter<PerfumeViewHolder> {

    List<PerfumeItem> perfumeList;

    public PerfumeAdapter(List<PerfumeItem> perfumeList) {
        this.perfumeList = perfumeList;
    }

    @NonNull
    @Override
    public PerfumeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items, parent, false);
        return new PerfumeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerfumeViewHolder holder, int position) {
        PerfumeItem item = perfumeList.get(position);

        holder.imgPerfume.setImageResource(item.getImage());
        holder.txtName.setText(item.getName());
        holder.txtPrice.setText(item.getPrice());
    }

    @Override
    public int getItemCount() {
        return perfumeList.size();
    }
}
