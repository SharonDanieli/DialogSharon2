package com.example.user.dialogsharon;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    Button b1, b2, b3, b4, b5;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        ll = findViewById(R.id.ll);
    }

    public void openDialog1(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Please do what is written below");
        adb.setMessage("Click on the second button");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void openDialog2(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Please do what is written below");
        adb.setMessage("Click on the third button");
        adb.setIcon(R.drawable.click);
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void openDialog3(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Click on the fourth button");
        adb.setMessage("Click OK to close");
        adb.setIcon(R.drawable.click);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void openDialog4(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Click to change the background color");
        adb.setMessage("Click Close when you like the color");
        adb.setIcon(R.drawable.click);
        adb.setPositiveButton("Change the background color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(getRandomColor());//מחליף את צבע הרקע לצבע אקראי
                adb.show();
            }
        });
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void openDialog5(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Click to change the background color");
        adb.setMessage("Click Back to white if you didn't like any of the colors and then click Close. If you did like some color, click Close when it appears.");
        adb.setIcon(R.drawable.click);
        adb.setPositiveButton("Change the background color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(getRandomColor());//מחליף את צבע הרקע לצבע אקראי
                adb.show();
            }
        });
        adb.setNeutralButton("Back to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
                adb.show();
            }
        });
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(new Intent(MainActivity.this, Credits.class));
        return super.onOptionsItemSelected(item);
    }
}