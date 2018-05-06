package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.MainActivity;
import com.dev.gearhb.bnbmobilestudy.R;

public class Ch8Toast extends AppCompatActivity {

    Toast mToast = null;
    int count;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch8_toast);

        findViewById(R.id.shortmsg).setOnClickListener(mClickListener);
        findViewById(R.id.longmsg).setOnClickListener(mClickListener);
        findViewById(R.id.count).setOnClickListener(mClickListener);
        findViewById(R.id.customview).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v)  {
            switch(v.getId())  {

                case R.id.shortmsg:
                    Toast.makeText(Ch8Toast.this, "Short Time Message", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.longmsg:
                    Toast.makeText(Ch8Toast.this, "Long Time Message", Toast.LENGTH_LONG).show();
                    break;

                case R.id.count:
                    str = "Count = " + count++;
                    if(mToast != null)
                    {
                        mToast.cancel();
                    }
                    mToast = Toast.makeText(Ch8Toast.this, str, Toast.LENGTH_SHORT);
                    mToast.show();
                    break;

                case R.id.customview:
                    LinearLayout linear = (LinearLayout)View.inflate(Ch8Toast.this, R.layout.toast_view, null);
                    Toast   t2 = new Toast(Ch8Toast.this);
                    t2.setView(linear);
                    t2.show();
                    break;

            } //of switch
        } //of onClick
    }; //of OnClickListener
}
