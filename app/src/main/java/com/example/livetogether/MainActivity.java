package com.example.livetogether;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.melnykov.fab.FloatingActionButton;

/*
public class MainActivity2 extends AppCompatActivity {

}
*/
public class MainActivity extends TabActivity  {

     FloatingActionButton fab;

    private TextView tt;
    int t = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecMain = tabHost.newTabSpec("MAIN").setIndicator("home");
        tabSpecMain.setContent(R.id.tabMain);
        tabHost.addTab(tabSpecMain);

        TabSpec tabSpecHome = tabHost.newTabSpec("HOME").setIndicator("rent");
        tabSpecHome.setContent(R.id.tabHome);
        tabHost.addTab(tabSpecHome);

        TabSpec tabSpecInet = tabHost.newTabSpec("INTE").setIndicator("internet");
        tabSpecInet.setContent(R.id.tabInet);
        tabHost.addTab(tabSpecInet);

        TabSpec tabSpecElec = tabHost.newTabSpec("ELEC").setIndicator("elec");
        tabSpecElec.setContent(R.id.tabElec);
        tabHost.addTab(tabSpecElec);

        TabSpec tabSpecWater = tabHost.newTabSpec("WATE").setIndicator("water");
        tabSpecWater.setContent(R.id.tabWater);
        tabHost.addTab(tabSpecWater);

        TabSpec tabSpecUtil = tabHost.newTabSpec("UTIL").setIndicator("utility");
        tabSpecUtil.setContent(R.id.tabUtil);
        tabHost.addTab(tabSpecUtil);

        tabHost.setCurrentTab(0);
        tt = (TextView)findViewById(R.id.all);

        /*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tt.setText(t+1);
            }

        });
        */
    }
}
