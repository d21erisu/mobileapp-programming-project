package com.example.project;

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

        holder.animal_id.setText(animal.getId());
        holder.animal_name.setText("Name: " + animal.getName());
        holder.animal_company.setText("Diet: " + animal.getCompany());
        holder.animal_location.setText("Location: " + animal.getLocation());
        holder.animal_category.setText("Type: " + animal.getCategory());


    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
       private TextView animal_id;
       private TextView animal_name;
       private TextView animal_company;
       private TextView animal_location;
       private TextView animal_category;


        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            animal_id=itemView.findViewById(R.id.animal_id);
            animal_name=itemView.findViewById(R.id.animal_name);
            animal_company=itemView.findViewById(R.id.animal_company);
            animal_location=itemView.findViewById(R.id.animal_location);
            animal_category=itemView.findViewById(R.id.animal_category);

        }
    }
}
