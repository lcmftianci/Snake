package com.example.administrator.snake;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPrimaryColor(View v) {
        Intent intent = new Intent(MainActivity.this, PrimaryColor.class);
        startActivity(intent);
    }
}
