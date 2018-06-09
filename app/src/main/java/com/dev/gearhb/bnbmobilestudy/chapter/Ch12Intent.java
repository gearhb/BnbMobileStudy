package com.dev.gearhb.bnbmobilestudy.chapter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch12Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch12_intent);

        Button callBtn = (Button) findViewById(R.id.callBtn);
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText telText = (EditText) findViewById(R.id.telText);
                //Intent intent = new Intent(Intent.ACTION_CALL);
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + telText.getText()));
                startActivity(intent);
            } });
    }
}

