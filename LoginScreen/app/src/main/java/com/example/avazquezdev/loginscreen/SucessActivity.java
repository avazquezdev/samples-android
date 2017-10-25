package com.example.avazquezdev.loginscreen;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SucessActivity extends AppCompatActivity {
    Context context;
    private static final String USER = "USER";
    private static final String PASS = "PASS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.access);
        context = this;
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(message);
        Button bt = (Button) findViewById(R.id.deleteAlias);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeyStoreJB keyStoreJB = new KeyStoreJB(context);
                keyStoreJB.deleteKey(USER);
                keyStoreJB.deleteKey(PASS);

            }
        });
    }
}
