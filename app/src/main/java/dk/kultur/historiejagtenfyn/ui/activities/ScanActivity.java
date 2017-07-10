package dk.kultur.historiejagtenfyn.ui.activities;

import android.content.Intent;
import android.os.Bundle;

import dk.kultur.historiejagtenfyn.R;
import dk.kultur.historiejagtenfyn.ui.Views.TabbView;

/**
 * Created by RokasTS on 2014.06.30.
 */
public class ScanActivity extends  AbsActivity implements TabbView.OnTabClickedListener {
    public static final int MY_ACTIVITY_ID = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        TabbView tabbView = (TabbView) findViewById(R.id.tabbar);
        tabbView.setActiveTabId(MY_ACTIVITY_ID);
        tabbView.setOnTabClickListener(this);
    }

    @Override
    public void onTabClicked(int id, boolean animate) {
        if (id != MY_ACTIVITY_ID) {
            Intent i = null;
            switch (id) {
                case RoutesActivity.MY_ACTIVITY_ID:
                    i = new Intent(ScanActivity.this, RoutesActivity.class);
                    break;
                case MapActivity.MY_ACTIVITY_ID:
                    i = new Intent(ScanActivity.this, MapActivity.class);
                    break;
                case ARViewActivity.MY_ACTIVITY_ID:
                    i = new Intent(ScanActivity.this, ARViewActivity.class);
                    break;
            }
            if(i != null) {
                startActivity(i);
                finish();
            }
        }
    }
}
