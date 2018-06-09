package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch14AlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch14_alert_dialog);
    }

    public void mOnClick(View v) {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        bld.setTitle("MESSAGE");
        bld.setMessage("AlertDialog Test is success !!");
        bld.setIcon(R.mipmap.ic_launcher);
        bld.show();            }
}
