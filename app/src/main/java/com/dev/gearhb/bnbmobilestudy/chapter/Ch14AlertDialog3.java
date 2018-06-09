package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch14AlertDialog3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch14_alert_dialog3);
    }

    public void mOnClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("NOTICE")
                .setMessage("You should read the message.")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNegativeButton("CLOSE", null)
                .show();
    }
}
