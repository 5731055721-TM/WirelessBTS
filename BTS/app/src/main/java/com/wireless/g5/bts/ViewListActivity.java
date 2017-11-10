package com.wireless.g5.bts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Admins on 008 08/11/2560.
 */

public class ViewListActivity extends AppCompatActivity {

    String line;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);

        Bundle extras = getIntent().getExtras();
        line = extras.getString("BTS_line");

        text = (TextView) findViewById(R.id.BTSLine);
        text.setText(line);
    }
}
