package com.example.stijn.testn;

import android.content.Intent;
import android.database.CursorJoiner;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class KroegInfo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kroeg_info);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kroeg_info, menu);
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

    public void OnPushGroupKroegInfo(View v)
    {
        Intent intent = new Intent(KroegInfo.this, Groepen.class);
        startActivity(intent);
    }

    public void OnClickMenuKroegInfo(View v)
    {
        Intent intent = new Intent(this, MenuKaart.class);
        startActivity(intent);
    }

    public void OnClickReviewsKroegInfo(View v)
    {
        Intent intent = new Intent(this, Reviews.class);
        startActivity(intent);
    }

    public void OnClickSocialKroegInfo(View view){
        Intent intent = new Intent(this, Social.class);
        startActivity(intent);
    }

    public void OnClickContactKroegInfo(View view){
        Intent intent = new Intent(this, contactscherm.class);
        startActivity(intent);
    }

    public void OnClickBackKroegInfo(View view){
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }
}
