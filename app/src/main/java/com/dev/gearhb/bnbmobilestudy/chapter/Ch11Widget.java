package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch11Widget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11_widget);

        Button btnGood=(Button)findViewById(R.id.good);
        btnGood.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView textPoll=(TextView)findViewById(R.id.question);
                textPoll.setText("Good!!^^");
            }
        });

        Button btnBad=(Button)findViewById(R.id.bad);
        btnBad.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView textPoll=(TextView)findViewById(R.id.question);
                textPoll.setText("Bad~~ㅠㅠ");
            }
        });

    }
}
