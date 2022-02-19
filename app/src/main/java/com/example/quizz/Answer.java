package com.example.quizz;

public class Answer
{
    private String answer;
    private boolean right;

    public Answer(String answer, boolean right)
    {
        this.answer=answer;
        this.right=right;
    }

    public String getAnswer()
    {
        return this.answer;
    }

    public boolean isRight()
    {
        return this.right;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public void setRight(boolean right)
    {
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "answer = "+this.answer+", right = "+this.right;
    }
}
