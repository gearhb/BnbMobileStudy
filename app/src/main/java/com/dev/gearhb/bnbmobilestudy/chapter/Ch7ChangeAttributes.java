package com.dev.gearhb.bnbmobilestudy.chapter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch7ChangeAttributes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch7_change_attributes);

        findViewById(R.id.buttonid1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView txt = (TextView) findViewById(R.id.textid);
                txt.setTextSize(40);
            }
        });

        findViewById(R.id.buttonid2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout layout = (LinearLayout) findViewById(R.id.layoutid);
                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        findViewById(R.id.buttonid3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView img = (ImageView) findViewById(R.id.imageid2);
                img.setColorFilter(Color.BLUE);
            }
        });

    }
}
