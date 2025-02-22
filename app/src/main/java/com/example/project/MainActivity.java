package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private Button about;
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;
    private ArrayList<Animal> animals=new ArrayList<>();

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=d21erisu";
    // "https://mobprog.webug.se/json-api?login=brom"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adapter = new AnimalAdapter(animals);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        about=findViewById(R.id.aboutbutton);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Animal>>() {}.getType();
        animals = gson.fromJson(json, type);

        adapter.setAnimals(animals);
        adapter.notifyDataSetChanged();

    }


}
