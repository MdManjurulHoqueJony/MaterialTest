package com.wordpress.jonyonandroidcraftsmanship.materialtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar = null;
    private DrawerLayout drwlTest = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

    }

    private void initialize() {
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        drwlTest= (DrawerLayout) findViewById(R.id.drwlTest);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationDrawerFragment navigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.frg_nav_drawer);
        navigationDrawerFragment.setUp(R.id.frg_nav_drawer,drwlTest,toolbar);
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
            Logger.toast(this, getString(R.string.msg) + item.getTitle());
            return true;
        }
        if (id == R.id.navigate) {
            startActivity(new Intent(this, Main2Activity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
