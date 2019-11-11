package com.example.pointcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0,scoreB=0,x=0,y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView teamA=(TextView)findViewById(R.id.tv1);
        TextView teamB=(TextView)findViewById(R.id.tv2);
        String name1=getIntent().getStringExtra("name1");
        String name2=getIntent().getStringExtra("name2");
        teamA.setText(name1);
        teamB.setText(name2);
    }

   public void plusonea(View view)
    {   x=1;
        scoreA=scoreA+1;
        displayA(scoreA);


    }
    public void plus2a(View view)
    {
        x=2;
        scoreA=scoreA+2;
        displayA(scoreA);

    }
    public void plus3a(View view)
    {
        x=3;
        scoreA=scoreA+3;
        displayA(scoreA);
        
    }
 private void displayA(int score) {
       TextView showA=(TextView)findViewById(R.id.scorea);
       showA.setText(""+score);

    }
    public void plus1b(View view)
    {
        y=1;
        scoreB=scoreB+1;
        displayB(scoreB);

    }
    public void plus2b(View view)
    {
        y=2;
        scoreB=scoreB+2;
        displayB(scoreB);

    }
    public void plus3b(View view)
    {
        y=3;
        scoreB=scoreB+3;
        displayB(scoreB);

    }
    public void reset(View view)
    {
        scoreA=0;
        displayA(scoreA);
        scoreB=0;
        displayB(scoreB);
    }
    private void displayB(int score) {
        TextView showB = (TextView) findViewById(R.id.scoreb);
        showB.setText("" + score);
    }
    public void changeA(View view)
    {
        scoreA=scoreA-x;
      TextView showA=(TextView)findViewById(R.id.scorea);
      if(scoreA<0)
      {
          showA.setText("" + 0);
          scoreA=0;
      }
    else
      {
          showA.setText("" + scoreA);
      }
    }
    public void changeB(View view)
    {
        scoreB=scoreB-y;
        TextView showB=(TextView)findViewById(R.id.scoreb);
        if(scoreB<0)
        {
            showB.setText("" +0);
            scoreB=0;
        }
        else{
            showB.setText("" +scoreB);
        }
    }

    }
