package com.restaurantproxyserver.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.restaurantproxyserver.service.WebServerStarterService;
import com.restaurantproxyserver.model.PrecachedResponse;

public class IncomingReceiver extends BroadcastReceiver {
    private static final String INTENT_ACTION = "com.resturantserver.android.intent.action";

    @Override
    public void onReceive(Context context, Intent intent) {


        if (intent.getAction().equals(INTENT_ACTION)) {
            String contents = intent.getExtras().getString("fileContent");
            PrecachedResponse.getInstance().setContents(contents);
            context.startService(new Intent(context,WebServerStarterService.class));

        }
    }
}
