package com.example.dacuycuy_mvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PerfumeAdapter adapter;
    PerfumeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        viewModel = new ViewModelProvider(this).get(PerfumeViewModel.class);

        viewModel.getPerfumes().observe(this, perfumeItems -> {
            adapter = new PerfumeAdapter(perfumeItems);
            recyclerView.setAdapter(adapter);
        });
    }
}
