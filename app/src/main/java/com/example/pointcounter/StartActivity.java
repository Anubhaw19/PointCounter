package com.example.pointcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }
    public void vs(View view)
    {
        EditText edit1=(EditText)findViewById(R.id.team1);
        EditText edit2=(EditText)findViewById(R.id.team2);
        Intent intent=new Intent(StartActivity.this,MainActivity.class);
        intent.putExtra("name1",edit1.getText().toString());
        intent.putExtra("name2",edit2.getText().toString());
        startActivity(intent);
    }
}
