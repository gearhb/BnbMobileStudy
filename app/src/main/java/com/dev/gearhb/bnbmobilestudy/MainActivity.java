package com.dev.gearhb.bnbmobilestudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dev.gearhb.bnbmobilestudy.menu.ListViewAdapter;
import com.dev.gearhb.bnbmobilestudy.menu.ListViewItem;
import com.dev.gearhb.bnbmobilestudy.menu.MenuEnum;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView m_mainList;
    private ArrayList<ListViewItem> m_arData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_mainList = (ListView) findViewById(R.id.main_list);
        m_arData = new ArrayList<>();

        for (MenuEnum e : MenuEnum.values()) {
            ListViewItem item = new ListViewItem(e.getMenuName(), e.getMenuClass());
            m_arData.add(item);
        }

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.listview_item, m_arData);
        m_mainList.setAdapter(adapter);

    }
}



