package com.example.project;

import static com.example.project.AnimalAdapter.*;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>{
    private List<Animal> animals;
    public AnimalAdapter(List<Animal> animals) {this.animals = animals;}

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
