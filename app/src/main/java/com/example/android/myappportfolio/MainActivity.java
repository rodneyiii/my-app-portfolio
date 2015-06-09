package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchApplication(View view) {
        Context context = getApplicationContext();
        CharSequence text = null;
        int duration = Toast.LENGTH_SHORT;

        switch(view.getId()) {
            case R.id.button_spotify_streamer:
                text = "This will launch the Spotify Streamer application.";
                break;
            case R.id.button_scores_app:
                text = "This will launch the Football Scores application.";
                break;
            case R.id.button_library_app :
                text = "This will launch the Library application.";
                break;
            case R.id.button_build_it_bigger :
                text = "This will launch the Build it Bigger application.";
                break;
            case R.id.button_xyz_reader :
                text = "This will launch the XYZ Reader application.";
                break;
            case R.id.button_capstone_app :
                text = "This will launch my capstone application.";
                break;
        }

        if(text != null) { // only make a toast if the method is invoked from one of the five buttons
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
