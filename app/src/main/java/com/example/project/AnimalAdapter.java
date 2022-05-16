package com.example.project;

import static com.example.project.AnimalAdapter.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>{
    private List<Animal> animals;
    public AnimalAdapter(List<Animal> animals) {this.animals = animals;}

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.animal_id.setText(animal.getID());
        holder.animal_login.setText(animal.getLogin());

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        private TextView animal_id;
        private TextView animal_login;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            animal_id=itemView.findViewById(R.id.animal_id);
            animal_login=itemView.findViewById(R.id.animal_login);
        }
    }
}
