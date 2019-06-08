package com.example.clinicapp.Inicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.clinicapp.R;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

public class Citas extends AppCompatActivity {
    ArrayList<String> myArrayList = new  ArrayList<>();
    ListView myListerView;
    Firebase myFarebase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        Firebase.setAndroidContext(this);
        myFarebase = new Firebase("https://clinicapp2-ebf4d.firebaseio.com/");

        final ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myArrayList);

        myListerView = (ListView) findViewById(R.id.ListView);
        myListerView.setAdapter(myArrayAdapter);

        myFarebase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String myChilValues = dataSnapshot.getValue(String.class);
                     myArrayList.add(myChilValues);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
// String myChilValues = dataSnapshot.getValue(String.class);
//                myArrayList.add(myChilValues);