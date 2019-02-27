package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ContactPOJO> mArrayList = new ArrayList<>();

    private RecyclerView mRecyclerView2;
    private CustomContactAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView2 = findViewById(R.id.recyclerView);

        mAdapter = new CustomContactAdapter(mArrayList);
        /* .... Start of edited line.... */
        mRecyclerView2.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        /* ...... End of edited line........ */
        mRecyclerView2.setItemAnimator( new DefaultItemAnimator());
        mRecyclerView2.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerView2.setAdapter(mAdapter);



        prepareData();
    }

    private void prepareData() {
        ContactPOJO contact = null;
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);

        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);
        contact = new ContactPOJO("Dhruvam","9467884671","22/12/1995");
        mArrayList.add(contact);

        mAdapter.notifyDataSetChanged();
    }



}