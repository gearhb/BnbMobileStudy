package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch10KeyboardInput extends AppCompatActivity {

    private MyView vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        vw = new MyView(this);
        vw.setFocusable(true); // 키 입력은 포커스를 가진 View에게만 전달되므로 생성된 View의 포커스(focusable)는 true로 해야 함
        vw.setFocusableInTouchMode(true); // View가 터치 모드인 동안에 포커스를 받을 것인지를 결정함
        setContentView(vw);

    }

    protected class MyView extends View {
        float mX, mY, mR, mL;
        int mColor;

        public MyView(Context context) {
            super(context);
            mX = 190;
            mY = 250;
            mR = 290;
            mL = 350;
            mColor = Color.RED;
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint Pnt = new Paint();
            Pnt.setColor(mColor);
            Pnt.setAntiAlias(true);
            canvas.drawRect(mX, mY, mR, mL, Pnt);
        }

        public boolean onKeyDown(int KeyCode, KeyEvent event) {
            super.onKeyDown(KeyCode, event);


            if (event.getAction() == KeyEvent.ACTION_DOWN)
            {
                switch (KeyCode) {

                    case KeyEvent.KEYCODE_DPAD_LEFT:
                        mX-=5;
                        mR-=5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_RIGHT:
                        mX+=5;
                        mR+=5;
                        invalidate();
                        return true;

                    case KeyEvent.KEYCODE_DPAD_UP:
                        mY-=5;
                        mL-=5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_DOWN:
                        mY+=5;
                        mL+=5;
                        invalidate();
                        return true;

                    case KeyEvent.KEYCODE_DPAD_CENTER:
                        if (mColor == Color.RED) {
                            mColor = Color.BLACK;
                        } else {
                            mColor = Color.RED;
                        }
                        invalidate();
                        return true;
                }
            }
            return false;
        }
    }
}
