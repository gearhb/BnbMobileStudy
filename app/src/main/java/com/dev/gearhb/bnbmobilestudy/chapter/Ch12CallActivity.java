package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch12CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch12_call);
    }

    public void mOnClick(View v) {
        Intent intent = new Intent(this, Ch12SubActivity.class);
        startActivity(intent);
    }

}
