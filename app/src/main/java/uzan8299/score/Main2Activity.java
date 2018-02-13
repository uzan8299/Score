package uzan8299.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;

public class Main2Activity extends AppCompatActivity {

    int scoreP1,scoreP2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView exNamaP1 = (TextView) findViewById(R.id.P1);
        TextView exNamaP2 = (TextView) findViewById(R.id.P2);


        Bundle bundle = getIntent().getExtras();
        exNamaP1.setText(bundle.getString("NamaP1"));
        exNamaP2.setText(bundle.getString("NamaP2"));
    }

    public void displayP1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreP1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayP2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreP2);
        scoreView.setText(String.valueOf(score));
    }

    public void tambahP1(View a) {
        scoreP1 = scoreP1 + 1;
        displayP1(scoreP1);
    }

    public void tambahP2(View a) {
        scoreP2 = scoreP2 + 1;
        displayP2(scoreP2);
    }

    public void kurangP1(View a) {
       if (scoreP1>0)
       {
           scoreP1 = scoreP1 - 1;
            displayP1(scoreP1);
       }
        else {
           scoreP1 = 0;
           displayP1(scoreP1);
       }
    }

    public void kurangP2(View a) {
        if (scoreP2>0)
        {
            scoreP2 = scoreP2 - 1;
            displayP1(scoreP2);
        }
        else {
            scoreP2 = 0;
            displayP2(scoreP2);
        }
    }

    public void resetP1(View a) {
        scoreP1 = 0;
        displayP1(scoreP1);
    }

    public void resetP2(View a) {
        scoreP2 = 0;
        displayP2(scoreP2);
    }

}
