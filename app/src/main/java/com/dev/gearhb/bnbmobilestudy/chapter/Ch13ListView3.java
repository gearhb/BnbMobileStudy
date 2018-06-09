package com.dev.gearhb.bnbmobilestudy.chapter;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.gearhb.bnbmobilestudy.R;

public class Ch13ListView3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch13_list_view3);

        ArrayAdapter<CharSequence> Adapter;
        Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_multiple_choice);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setDivider(new ColorDrawable(Color.BLUE));
        list.setDividerHeight(5);
    }
}
