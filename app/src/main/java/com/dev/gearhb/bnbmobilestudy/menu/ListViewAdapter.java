package com.dev.gearhb.bnbmobilestudy.menu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dev.gearhb.bnbmobilestudy.R;

import java.util.ArrayList;

/**
 * Created by hb_c on 2018. 5. 6..
 */

public class ListViewAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<ListViewItem> data;
    private int layout;

    public ListViewAdapter(Context context, int layout, ArrayList<ListViewItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int position) {
        return data.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.item_name);
        name.setText(data.get(position).getName());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(context, data.get(position).getItem());
                context.startActivity(myIntent);
            }
        });

        return convertView;
    }
}
