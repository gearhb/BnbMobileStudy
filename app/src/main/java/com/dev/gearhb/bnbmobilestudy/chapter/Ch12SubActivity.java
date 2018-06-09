package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch12SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch12_sub);
    }

    public void mOnClick(View v) {
        finish();
    }

}
