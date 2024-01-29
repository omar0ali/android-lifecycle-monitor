package com.example.activitylifecycle;

import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Calendar;

public class LifeCycle {
    public static ArrayList<String> status = new ArrayList<>(); //Recording everything
    ArrayAdapter<String> arr;
    public LifeCycle(Activity active, ListView lsView, Button btnView) {
        arr = new ArrayAdapter<>(
                active,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                status
        );
        lsView.setAdapter(arr);

        btnView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }

    public void addToList(String msg) {
        if(status==null)
            return;
        status.add(
                String.format("%s\t\t%s",
                        msg,
                        Calendar.getInstance().getTime()
                ));
        arr.notifyDataSetChanged();
    }
    public void clear() {
        status.clear();
        arr.notifyDataSetChanged();
    }
}
