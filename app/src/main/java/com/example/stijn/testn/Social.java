package com.example.stijn.testn;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Social extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_social, menu);
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


    public void goToSearch(View v) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void goToHome(View view){
        Intent intent = new Intent(this, TERING.class);
        startActivity(intent);
    }

    public void goToContact(View view){
        Intent intent = new Intent(this, contactscherm.class);
        startActivity(intent);
    }

    public void goToVrienden(View v) {
        Intent intent = new Intent(this, Vrienden.class);
        startActivity(intent);
    }

    public void goToSocialMedia(View view){
        Intent intent = new Intent(this, SocialMedia.class);
        startActivity(intent);
    }

    public void goTOGroepen(View view){
        Intent intent = new Intent(this, Groepen.class);
        startActivity(intent);
    }
}
