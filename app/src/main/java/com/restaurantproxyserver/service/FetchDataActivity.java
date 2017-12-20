package com.restaurantproxyserver.service;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FetchDataActivity extends AppCompatActivity {
    private static final String PACKAGE_NAME = "com.suitepad.sampletask.resturantdatabase";
    private static final String CLASS_NAME = "com.suitepad.sampletask.resturantdatabase.DataStoreActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            final Intent intent = new Intent();
            intent.setClassName(PACKAGE_NAME, CLASS_NAME);
            startActivity(intent);
            finish();
        }
        catch (ActivityNotFoundException stacktrace){
            finish();
        }

    }
}
