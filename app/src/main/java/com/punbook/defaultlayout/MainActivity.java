package com.punbook.defaultlayout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    public static final String LOGTAG = "Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ArrayList<String> a = new ArrayList<String>();
        String abc = a.get(0);
*/
        Log.d(LOGTAG, "STARTED THE MAIN ACTIVITY");

        Toast toast = Toast.makeText(this, "On Created Started", Toast.LENGTH_SHORT);
        toast.show();

        Button button1 = (Button)findViewById(R.id.button9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DoubleDetailActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
      public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.d(LOGTAG, "STARTED THE ON CREATE ACTIVITY");
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Toast.makeText(this, "You selected " + item.getTitle(), Toast.LENGTH_SHORT).show();

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
    public void gotoActivity(View v) {
        Intent intent = new Intent(this, DoubleDetailActivity.class);
        startActivity(intent);

    }
}
