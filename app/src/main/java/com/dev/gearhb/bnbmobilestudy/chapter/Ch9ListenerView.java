package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch9ListenerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView vw = new MyView(this);
        vw.setOnTouchListener(vw);
        setContentView(vw);
    }

    class MyView extends View implements View.OnTouchListener {
        public MyView(Context context) {
            super(context);
        }
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(Ch9ListenerView.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}
