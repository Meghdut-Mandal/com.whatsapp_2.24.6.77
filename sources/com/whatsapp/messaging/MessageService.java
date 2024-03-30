package com.whatsapp.messaging;

import X.AnonymousClass1JV;
import X.AnonymousClass1U6;
import X.C18700tb;
import X.C21360z5;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessageService extends AnonymousClass1U6 implements C18700tb {
    public C21360z5 A00;
    public boolean A01;
    public final Object A02;
    public volatile C31091bG A03;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        try {
            context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 26) {
                e.getMessage();
                return;
            }
            throw e;
        }
    }

    public static void A01(Context context, AnonymousClass1JV r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("messageservice/startOnForeground failed:");
                sb.append(e.getMessage());
                Log.e(sb.toString());
                r3.A00();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C31091bG(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public void onCreate() {
        Log.i("messageservice/onCreate");
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (C21360z5) ((C31141bL) ((C31131bK) generatedComponent())).A05.A7P.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
    }

    public MessageService(int i) {
        this.A02 = new Object();
        this.A01 = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!C21360z5.A00() && intent != null) {
            intent.getAction();
        }
        return 1;
    }

    public MessageService() {
        this(0);
    }
}
