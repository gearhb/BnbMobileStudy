package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch10HandlerOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new MyView(this);
        //* 리스너 - 1순위
        vw.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(Ch10HandlerOrder.this, "No.1 Listener: Touch Event Received", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
        setContentView(vw);
    }

    protected class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        //* 뷰의 콜백 메서드 - 2순위
        public boolean onTouchEvent(MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(Ch10HandlerOrder.this, "No.2 View: Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }

    //* 액티비티의 콜백 메서드 - 3순위
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(Ch10HandlerOrder.this, "No.3 Activity: Touch Event Received", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
