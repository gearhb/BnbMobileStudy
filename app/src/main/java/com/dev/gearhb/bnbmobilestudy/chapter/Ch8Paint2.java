package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch8Paint2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestView tv = new TestView(this);
        setContentView(tv);
    }

    protected class TestView extends View {
        public TestView(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas){
            canvas.drawRGB(212, 244, 250);
            Paint Pnt = new Paint();

            // 캡 모양 테스트
            Pnt.setColor(Color.RED);
            Pnt.setStrokeWidth(10);
            canvas.drawLine(30, 30, 180, 30, Pnt);

            Pnt.setStrokeCap(Paint.Cap.SQUARE);
            canvas.drawLine(30, 70, 180, 70, Pnt);

            // 만나는 지점의 모양 테스트
            Pnt.setColor(Color.CYAN);
            Pnt.setStrokeWidth(15);
            Pnt.setStyle(Paint.Style.STROKE);
            Pnt.setStrokeJoin(Paint.Join.MITER);
            canvas.drawRect(30, 110, 100, 200, Pnt);

            Pnt.setStrokeJoin(Paint.Join.BEVEL);
            canvas.drawRect(300, 110, 140, 200, Pnt);
            Pnt.setStrokeJoin(Paint.Join.ROUND);
            canvas.drawRect(600, 110, 210, 145, Pnt);

            // 원 스타일 테스트
            Pnt.setColor(Color.GREEN);
            Pnt.setStrokeWidth(10);
            Pnt.setAntiAlias(true);

            // 채우기
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(40, 200, 30, Pnt);

            // 외곽선 그리기
            Pnt.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(120, 200, 30, Pnt);

            // 외곽선 및 채우기
            Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(200, 200, 30, Pnt);

            // 노란색으로 채우고 초록색으로 외곽선 그리기
            Pnt.setColor(Color.YELLOW);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(40, 280, 30, Pnt);
            Pnt.setColor(Color.GREEN);
            Pnt.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(40, 280, 30, Pnt);

            // 초록색으로 채우고 노란색으로 외곽선 그리기
            Pnt.setColor(Color.GREEN);
            Pnt.setStyle(Paint.Style.FILL);
            canvas.drawCircle(120, 280, 30, Pnt);

            Pnt.setColor(Color.YELLOW);
            Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(200, 200, 30, Pnt);
        }

    }
}
