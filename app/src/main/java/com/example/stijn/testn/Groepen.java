package com.example.stijn.testn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Groepen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groepen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_groepen, menu);
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

    public void goToSearchGroepen(View view)
    {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void goToSocialGroepen(View view)
    {
        //Intent intent = new Intent(this, Social.class);
        //startActivity(intent);
        finish();
    }

    public void goToContactGroepen(View view)
    {
        Intent intent = new Intent(this, contactscherm.class);
        startActivity(intent);
    }

    public void goToGroup1(View view)
    {
        Intent i = new Intent(this, GroupInfoActivity.class);
        startActivity(i);
    }

    public void goToAddGroup(View view)
    {
        Intent intent = new Intent(this, AddGroup.class);
        startActivity(intent);
    }
}
