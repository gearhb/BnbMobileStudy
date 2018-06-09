package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.gearhb.bnbmobilestudy.R;

import java.util.ArrayList;

public class Ch13ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch13_list_view);

        ArrayList<String> arGeneral = new ArrayList<String>();
        arGeneral.add("APPLE");
        arGeneral.add("BANANA");
        arGeneral.add("ORANGE");
        arGeneral.add("MANGO");
        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, arGeneral);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
    }
}
