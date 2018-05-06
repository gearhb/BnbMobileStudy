package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch9CallbackMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View vw = new MyView(this);
        setContentView(vw);
    }

    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(Ch9CallbackMethod.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }


}
