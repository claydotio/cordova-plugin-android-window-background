package com.openfam.windowbackground;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(getApplicationContext().getPackageName() + ".MainActivity");
        startActivity(intent);
        finish();
    }
}
