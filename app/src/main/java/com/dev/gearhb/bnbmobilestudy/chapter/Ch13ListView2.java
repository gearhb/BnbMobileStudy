package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch13ListView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch13_list_view2);

        ArrayAdapter<CharSequence> Adapter;
        Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_1);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
    }
}
