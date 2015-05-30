package com.punbook.defaultlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MenuItem;

/**
 * Created by admin on 5/19/2015.
 */
public class DoubleDetailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        Log.d("Detailed_Activity", "STARTED THE ACTIVITY");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d("Detailed_Activity", "STARTED THE ACTIVITY 2");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


}
