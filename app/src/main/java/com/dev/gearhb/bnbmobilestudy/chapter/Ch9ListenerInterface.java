package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch9ListenerInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new View(this);
        // 3.리스너 등록
        vw.setOnTouchListener(TouchListener);
        setContentView(vw);

    }

    // 1.리스너 구현 클래스 선언
    class TouchListenerClass implements View.OnTouchListener {
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(Ch9ListenerInterface.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }

    // 2.리스너 객체 생성
    TouchListenerClass TouchListener = new TouchListenerClass();

}
