package com.example.user.navigationdrawerdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNavDrawer(View view){
        Intent i = new Intent(MainActivity.this, navigation_drawer.class);
        startActivity(i);
    }
}
