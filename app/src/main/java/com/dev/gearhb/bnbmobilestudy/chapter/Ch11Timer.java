package com.dev.gearhb.bnbmobilestudy.chapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch11Timer extends AppCompatActivity {

    int value=0;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11_timer);

        mText=(TextView)findViewById(R.id.text);
        mHandler.sendEmptyMessage(0);
    }


    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            value++;
            mText.setText("Timer Value = " + value);
            mHandler.sendEmptyMessageDelayed(0,1000);
        }
    };
}
