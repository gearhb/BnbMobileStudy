package com.dev.gearhb.bnbmobilestudy.chapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.dev.gearhb.bnbmobilestudy.MainActivity;
import com.dev.gearhb.bnbmobilestudy.R;

import static android.widget.ArrayAdapter.createFromResource;

public class Ch13Spinner extends AppCompatActivity {

    ArrayAdapter<CharSequence> adspin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch13_spinner);

        Spinner spin = (Spinner)findViewById(R.id.myspinner);
        String promptText = getString(R.string.ptext);
        spin.setPrompt(promptText);
        adspin = createFromResource
                (this, R.array.colors, android.R.layout.simple_spinner_item);
        adspin.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adspin);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected
                    (AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Ch13Spinner.this,adspin.getItem(position), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent){}
        });
    }
}
