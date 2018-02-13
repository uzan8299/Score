package uzan8299.score;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText namaP1 = (EditText) findViewById(R.id.editN1);
        final EditText namaP2 = (EditText) findViewById(R.id.editN2);
        Button btNext = (Button) findViewById(R.id.buttonNext);

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("NamaP1", namaP1.getText().toString());
                bundle.putString("NamaP2", namaP2.getText().toString());
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
