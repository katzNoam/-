package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView welcome;
    Button tanach_quizz;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome=findViewById(R.id.welcome);
        tanach_quizz=findViewById(R.id.tanach_btn);
        tanach_quizz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(tanach_quizz==v)
        {
            Intent intent = new Intent(this, TanachQuestion1Activity.class);
            startActivity(intent);
        }
    }
}