package com.ks.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches a button
     */
    public void showMessage(View view) {
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        String toastText = "This will launch my " + buttonText + " app";
        Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
    }
}
