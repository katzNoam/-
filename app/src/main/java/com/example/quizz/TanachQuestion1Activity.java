package com.example.quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TanachQuestion1Activity extends AppCompatActivity implements View.OnClickListener {
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    int i=(int)Math.random()*3+1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanach_question1);
        question=findViewById(R.id.question1_1);
        answer1=findViewById(R.id.answer1_1_1);
        answer2=findViewById(R.id.answer1_1_2);
        answer3=findViewById(R.id.answer1_1_3);
        answer4=findViewById(R.id.answer1_1_4);
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);
        switch(i)
        {
            case 1:
                question.setText(Question.question1);
                answer1.setText(Question.answer1_1.getAnswer());
                answer2.setText(Question.answer1_2.getAnswer());
                answer3.setText(Question.answer1_3.getAnswer());
                answer4.setText(Question.answer1_4.getAnswer());
                break;

            case 2:
                question.setText(Question.question2);
                answer1.setText(Question.answer2_1.getAnswer());
                answer2.setText(Question.answer2_2.getAnswer());
                answer3.setText(Question.answer2_3.getAnswer());
                answer4.setText(Question.answer2_4.getAnswer());
                break;

            case 3:
                question.setText(Question.question3);
                answer1.setText(Question.answer3_1.getAnswer());
                answer2.setText(Question.answer3_2.getAnswer());
                answer3.setText(Question.answer3_3.getAnswer());
                answer4.setText(Question.answer3_4.getAnswer());
                break;
        }
    }

    @Override
    public void onClick(View v)
    {
        switch(i)
        {
            case 1:
                if(answer2==v||answer3==v||answer4==v)
                {
                    Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                }
                else if(answer1==v)
                {
                    Toast.makeText(this, "תשובה נכונה - כל הכבוד!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, TanachQuestion1Activity.class);
                    startActivity(intent);
                }
                break;

            case 2:
                if(answer1==v||answer3==v||answer4==v)
                {
                    Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                }
                else if(answer2==v)
                {
                    Toast.makeText(this, "תשובה נכונה - כל הכבוד!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, TanachQuestion1Activity.class);
                    startActivity(intent);
                }
                break;

            case 3:
                if(answer1==v||answer2==v||answer3==v)
                {
                    Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                }
                else if(answer4==v)
                {
                    Toast.makeText(this, "תשובה נכונה - כל הכבוד!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, TanachQuestion1Activity.class);
                    startActivity(intent);
                }
                break;
        }

    }
}
