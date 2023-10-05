package com.example.exe3_2024;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnCreateContextMenuListener {
    int id;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = findViewById(R.id.ll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        id  = item.getItemId();
        if(id==R.id.red){ll.setBackgroundColor(0xFFFF2020);}
        else if (id==R.id.green) {ll.setBackgroundColor(0xFF20FF20);}
        else if (id==R.id.blue) {ll.setBackgroundColor(0xFF2020FF);}
        return super.onOptionsItemSelected(item);
    }

    public void next(View view) {

    }
}