package com.wireless.g5.bts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton sukumvitBtn = (ImageButton) findViewById(R.id.sukhumvitBtn);
        sukumvitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStationList("sukhumvit");
            }
        });

        ImageButton silomBtn = (ImageButton) findViewById(R.id.silomBtn);
        silomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStationList("silom");
            }
        });
    }

    private void viewStationList(String line) {
        Intent intent = new Intent(this, ItemListActivity.class);
        intent.putExtra("BTS_line", line);

//        Bundle bundle = new Bundle();
//        bundle.putString("BTS_Line", line);
//         set Fragmentclass Arguments
//        ItemDetailFragment fragobj = new ItemDetailFragment();
//        fragobj.setArguments(bundle);

        startActivity(intent);
    }
}
