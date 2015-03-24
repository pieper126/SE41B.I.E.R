package com.example.stijn.testn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SearchActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
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

    public void onSearchClickedFromSearch(View v) {
        Intent i = new Intent(this, ResultsActivity.class);
        startActivity(i);
    }

    public void onBackClickedFromSearch(View view) {
        Intent i = new Intent(this, TERING.class);
        startActivity(i);
    }

    public void onSocialClickedFromSearch(View v) {
        Intent i = new Intent(this, Social.class);
        startActivity(i);
    }

    public void onContactsClickedFromSearch(View v) {
        Intent i = new Intent(this, contactscherm.class);
        startActivity(i);
    }

    public void onGroupsClickedFromSearch(View v) {
        Intent i = new Intent(this, Groepen.class);
        startActivity(i);
    }

    public void onSearchExtrasClickedFromSearch(View v) {
        Intent i = new Intent(this, SearchExtras.class);
        startActivity(i);
    }
}
