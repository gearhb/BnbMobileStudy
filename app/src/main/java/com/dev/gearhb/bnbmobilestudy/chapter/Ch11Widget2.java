package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch11Widget2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11_widget2);
        Button btnGood=(Button)findViewById(R.id.good);
        btnGood.setOnClickListener(this);

        Button btnBad=(Button)findViewById(R.id.bad);
        btnBad.setOnClickListener(this);
    }

    public void onClick(View v) {
        TextView textPoll=(TextView)findViewById(R.id.question);

        switch (v.getId()) {
            case R.id.good:
                textPoll.setText("Good!!^^");
                break;
            case R.id.bad:
                textPoll.setText("Bad~~ㅠㅠ");
                break;
        }
    }
}
