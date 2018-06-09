package com.dev.gearhb.bnbmobilestudy.chapter;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dev.gearhb.bnbmobilestudy.MainActivity;
import com.dev.gearhb.bnbmobilestudy.R;

import java.util.Calendar;

public class Ch15AlertDialog extends AppCompatActivity {
    final static int SampleDialog = 0;
    final static int QuestionDialog = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch15_alert_dialog);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener() {
                                   @SuppressWarnings("deprecation")
                                   public void onClick(View v) {
                                       showDialog(SampleDialog);     }
                               }
        );
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @SuppressWarnings("deprecation")
            public void onClick(View v) {
                showDialog(QuestionDialog);
            }
        } );
    }
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case SampleDialog:
                return new AlertDialog.Builder(Ch15AlertDialog.this)
                        .setTitle("MESSAGE")
                        .setMessage("SampleDialog Test is success!!")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("CLOSE", null)
                        .create();
            case QuestionDialog:
                return new AlertDialog.Builder(Ch15AlertDialog.this)
                        .setTitle("QUESTION")
                        .setMessage("Do you like the programming?")
                        .setPositiveButton("YES!", null)
                        .setNegativeButton("NO!!", null)
                        .create();
        }
        return null;
    }
    protected void onPrepareDialog(int id, Dialog dialog) {
        switch (id) {
            case SampleDialog:
                break;

            case QuestionDialog:
                Calendar calendar = Calendar.getInstance();
                String stime = String.format("Time %d:%d:%d",
                        calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE),
                        calendar.get(Calendar.SECOND));
                dialog.setTitle(stime);
                break;
        }
    }
}
