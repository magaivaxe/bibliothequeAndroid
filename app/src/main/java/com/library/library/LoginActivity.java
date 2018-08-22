package com.library.library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void activityChangeToSearch(View v){
        //
        String message = ((EditText)findViewById(R.id.message)).getText().toString();

        Intent intention = new Intent(this,SearchActivity.class);
        intention.putExtra("message",message);
        startActivity(intention);
    }

}
