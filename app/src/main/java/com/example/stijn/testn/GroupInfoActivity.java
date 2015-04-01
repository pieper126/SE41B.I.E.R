package com.example.stijn.testn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class GroupInfoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_group_info, menu);
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

    public void onBackClicked1(View v) {
        //Intent i = new Intent(this, Groepen.class);
        //startActivity(i);
        this.finish();
    }

    public void onSearchClicked1(View v) {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }

    public void onPreferencesClicked1(View v) {
        Intent i = new Intent(this, Voorkeuren.class);
        startActivity(i);
    }

    public void onFriendsClicked1(View v) {
        Intent i = new Intent(this, Vrienden.class);
        startActivity(i);
    }

    public void onSearchResults234Clicked1(View v) {
        Intent i = new Intent(this, ResultsActivity.class);
        startActivity(i);
    }

    public void onContactsClicked1(View v) {
        //Intent i = new Intent(this, contactscherm.class);
        //startActivity(i);
    }
}
