package com.library.library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent origine = getIntent();
        String message = origine.getStringExtra("message");

        ((TextView)findViewById(R.id.toshow)).setText(message);
    }

    public void activityChangeToReservation(View v){
        Intent intent = new Intent(this, ReservationActivity.class);
        startActivity(intent);
    }

}
