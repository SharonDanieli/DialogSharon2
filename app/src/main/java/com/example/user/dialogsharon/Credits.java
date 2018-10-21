package com.example.user.dialogsharon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv = findViewById(R.id.tv);
        tv.setText("The application was created by Sharon Danieli");
    }

    public void backToMainActivity(View view) {
        finish();
    }
}
