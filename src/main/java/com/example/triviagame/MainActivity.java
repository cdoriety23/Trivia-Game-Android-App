package com.example.triviagame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    TextView score, question;

    private Questions q = new Questions();
    private String aAnswer;
    private int rScore = 0;
    private int len = q.quest.length;

    Random r;
    private  void updateQuestion(int num)
    {
        question.setText(q.getQuest(num));
        b1.setText(q.getChoice1(num));
        b2.setText(q.getChoice2(num));
        b3.setText(q.getChoice3(num));
        b4.setText(q.getChoice4(num));

        aAnswer = q.getAnswer(num);
    }

    private  void gameOver()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage(("Game OVer!Your score is " + rScore));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);


        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score" + rScore);
        updateQuestion(r.nextInt(len));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b1.getText() == aAnswer)
                {
                    rScore++;
                    score.setText("Score" + rScore);
                    updateQuestion(r.nextInt(len));
                }
                else
                {
                    gameOver();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText() == aAnswer) {
                    rScore++;
                    score.setText("Score" + rScore);
                    updateQuestion(r.nextInt(len));
                } else {
                    gameOver();
                }

            }


        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText() == aAnswer)
                {
                    rScore++;
                    score.setText("Score" + rScore);
                    updateQuestion(r.nextInt(len));
                }
                else
                {
                    gameOver();
                }

            }


        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText() == aAnswer) {
                    rScore++;
                    score.setText("Score" + rScore);
                    updateQuestion(r.nextInt(len));
                } else {
                    gameOver();
                }

            }

        });


    }
}
