package com.example.loginapplication.ui.homepage;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapplication.R;

import java.util.ArrayList;
import java.util.Arrays;


public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList userImg = new ArrayList<>(Arrays.asList(R.mipmap.ic_launcher, R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher));
    ArrayList userName = new ArrayList<>(Arrays.asList("Sarah Joe", "William Doe", "Harry Potter", "Peter Holland ", "Hannah Jackson",
            "David Miller", "Neymar Jr.", "Usain Bolt"));

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter = new Adapter(HomeActivity.this, userImg, userName);

        recyclerView.setAdapter(adapter);

    }
}