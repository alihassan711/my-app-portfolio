package com.example.project0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	Button button_spotify, button_score, button_library, button_build, button_xyz, button_capstone;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button_spotify = (Button) findViewById(R.id.button_spotify);
        button_score = (Button) findViewById(R.id.button_score);
        button_library = (Button) findViewById(R.id.button_library);
        button_build = (Button) findViewById(R.id.button_build);
        button_xyz = (Button) findViewById(R.id.button_xyz);
        button_capstone = (Button) findViewById(R.id.button_capstone);
        
        button_spotify.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
        
        button_score.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
        
        button_library.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
        
        button_build.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
        
        button_xyz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
        
        button_capstone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "The Button will launch " + ((Button) arg0).getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
