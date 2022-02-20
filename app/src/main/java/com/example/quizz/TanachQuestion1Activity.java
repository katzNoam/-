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
    int i;

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
        i=(int)(Math.random()*9)+1;
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

            case 4:
                question.setText(Question.question4);
                answer1.setText(Question.answer4_1.getAnswer());
                answer2.setText(Question.answer4_2.getAnswer());
                answer3.setText(Question.answer4_3.getAnswer());
                answer4.setText(Question.answer4_4.getAnswer());
                break;

            case 5:
                question.setText(Question.question5);
                answer1.setText(Question.answer5_1.getAnswer());
                answer2.setText(Question.answer5_2.getAnswer());
                answer3.setText(Question.answer5_3.getAnswer());
                answer4.setText(Question.answer5_4.getAnswer());
                break;

            case 6:
                question.setText(Question.question6);
                answer1.setText(Question.answer6_1.getAnswer());
                answer2.setText(Question.answer6_2.getAnswer());
                answer3.setText(Question.answer6_3.getAnswer());
                answer4.setText(Question.answer6_4.getAnswer());
                break;

            case 7:
                question.setText(Question.question7);
                answer1.setText(Question.answer7_1.getAnswer());
                answer2.setText(Question.answer7_2.getAnswer());
                answer3.setText(Question.answer7_3.getAnswer());
                answer4.setText(Question.answer7_4.getAnswer());
                break;

            case 8:
                question.setText(Question.question8);
                answer1.setText(Question.answer8_1.getAnswer());
                answer2.setText(Question.answer8_2.getAnswer());
                answer3.setText(Question.answer8_3.getAnswer());
                answer4.setText(Question.answer8_4.getAnswer());
                break;

            case 9:
                question.setText(Question.question9);
                answer1.setText(Question.answer9_1.getAnswer());
                answer2.setText(Question.answer9_2.getAnswer());
                answer3.setText(Question.answer9_3.getAnswer());
                answer4.setText(Question.answer9_4.getAnswer());
                break;
        }
    }

    @Override
    public void onClick(View v)
    {
        switch(i)
        {
            case 1:

            case 6:
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

            case 7:

            case 9:
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

            case 8:
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

            case 4:

            case 5:
                if(answer1==v||answer2==v||answer4==v)
                {
                    Toast.makeText(this, "תשובה לא נכונה", Toast.LENGTH_LONG).show();
                }
                else if(answer3==v)
                {
                    Toast.makeText(this, "תשובה נכונה - כל הכבוד!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(this, TanachQuestion1Activity.class);
                    startActivity(intent);
                }
                break;

        }

    }
}
