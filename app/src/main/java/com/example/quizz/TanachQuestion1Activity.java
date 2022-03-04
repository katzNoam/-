package com.example.quizz;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TanachQuestion1Activity extends AppCompatActivity implements View.OnClickListener
{
    Dialog end_dialog;
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    int i;
    int j;
    int count=0;

    TextView message;
    Button end;

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
        i=(int)(Math.random()*13)+1;
        replaceQuestion(i);

    }

    public void createEndDialog()
    {
        end_dialog=new Dialog(this);
        end_dialog.setContentView(R.layout.dialog_end);
        message=end_dialog.findViewById(R.id.message);
        end=end_dialog.findViewById(R.id.end);
        end.setOnClickListener(this);
        message.setText("יש לך "+count+" תשובות נכונות, אולי תצליח יותר בפעם הבאה!");
        end_dialog.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return  true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.nenu_return)
        {
            finish();
        }
        return true;
    }

    public void replaceQuestion(int i)
    {
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

            case 10:
                question.setText(Question.question10);
                answer1.setText(Question.answer10_1.getAnswer());
                answer2.setText(Question.answer10_2.getAnswer());
                answer3.setText(Question.answer10_3.getAnswer());
                answer4.setText(Question.answer10_4.getAnswer());
                break;

            case 11:
                question.setText(Question.question11);
                answer1.setText(Question.answer11_1.getAnswer());
                answer2.setText(Question.answer11_2.getAnswer());
                answer3.setText(Question.answer11_3.getAnswer());
                answer4.setText(Question.answer11_4.getAnswer());
                break;

            case 12:
                question.setText(Question.question12);
                answer1.setText(Question.answer12_1.getAnswer());
                answer2.setText(Question.answer12_2.getAnswer());
                answer3.setText(Question.answer12_3.getAnswer());
                answer4.setText(Question.answer12_4.getAnswer());
                break;

            case 13:
                question.setText(Question.question13);
                answer1.setText(Question.answer13_1.getAnswer());
                answer2.setText(Question.answer13_2.getAnswer());
                answer3.setText(Question.answer13_3.getAnswer());
                answer4.setText(Question.answer13_4.getAnswer());
                break;

            case 14:
                question.setText(Question.question14);
                answer1.setText(Question.answer14_1.getAnswer());
                answer2.setText(Question.answer14_2.getAnswer());
                answer3.setText(Question.answer14_3.getAnswer());
                answer4.setText(Question.answer14_4.getAnswer());
                break;

            case 15:
                question.setText(Question.question15);
                answer1.setText(Question.answer15_1.getAnswer());
                answer2.setText(Question.answer15_2.getAnswer());
                answer3.setText(Question.answer15_3.getAnswer());
                answer4.setText(Question.answer15_4.getAnswer());
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

            case 10:

            case 14:
                if(answer2==v||answer3==v||answer4==v)
                {
                    createEndDialog();
                }
                else if(answer1==v)
                {
                    count++;
                    j=i;
                    while(j==i)
                        i=(int)(Math.random()*15)+1;
                    replaceQuestion(i);
                }
                break;

            case 2:

            case 7:

            case 9:

            case 13:
                if(answer1==v||answer3==v||answer4==v)
                {
                    createEndDialog();
                }
                else if(answer2==v)
                {
                    count++;
                    j=i;
                    while(j==i)
                        i=(int)(Math.random()*15)+1;
                    replaceQuestion(i);
                }
                break;

            case 3:

            case 8:

            case 12:
                if(answer1==v||answer2==v||answer3==v)
                {
                    createEndDialog();
                }
                else if(answer4==v)
                {
                    count++;
                    j=i;
                    while(j==i)
                        i=(int)(Math.random()*15)+1;
                    replaceQuestion(i);
                }
                break;

            case 4:

            case 5:

            case 11:

            case 15:
                if(answer1==v||answer2==v||answer4==v)
                {
                    createEndDialog();
                }
                else if(answer3==v)
                {
                    count++;
                    j=i;
                    while(j==i)
                        i=(int)(Math.random()*15)+1;
                    replaceQuestion(i);
                }
                break;

        }
        if(end==v)
        {
            finish();
        }

    }
}
