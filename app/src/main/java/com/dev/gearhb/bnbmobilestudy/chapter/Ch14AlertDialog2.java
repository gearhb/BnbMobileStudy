package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch14AlertDialog2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch14_alert_dialog2);
    }

    public void mOnClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("MESSAGE")
                .setMessage("AlertDialog Test is success!!")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("CLOSE", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which) { }
                }).show();
        //setNegativeButton 사용
//         .setNegativeButton("CLOSE", new DialogInterface.OnClickListener()
//        {
//            public void onClick(DialogInterface dialog, int which) { }  })
//                .show();
    }
}
