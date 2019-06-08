package com.example.clinicapp.Inicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.clinicapp.MainActivity;
import com.example.clinicapp.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void especialistas (View view){
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void citas (View view){
        Intent intent=new Intent(getApplicationContext(),Citas.class);
        startActivity(intent);
    }
}
