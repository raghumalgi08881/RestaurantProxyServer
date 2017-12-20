package com.restaurantproxyserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WebServerStarterService extends Service {
    private HttpWebServer server;
    public WebServerStarterService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        server= new HttpWebServer(8080);
        server.start();
        return START_STICKY;
    }



}
