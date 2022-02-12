package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public  class TanachQuestion2Activity extends AppCompatActivity implements View.OnClickListener
{
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanach_question2);
        question=findViewById(R.id.question2);
        answer1=findViewById(R.id.answer2_1);
        answer2=findViewById(R.id.answer2_2);
        answer3=findViewById(R.id.answer2_3);
        answer4=findViewById(R.id.answer2_4);
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(answer1==v||answer2==v||answer4==v)
        {
            Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
        }
        else if(answer3==v)
        {
            Toast.makeText(this, "תשובה נכונה - כל הכבוד!", Toast.LENGTH_LONG).show();
            //Intent intent = new Intent(this, TanachQuestion2Activity.class);
            //startActivity(intent);
        }
    }
}
