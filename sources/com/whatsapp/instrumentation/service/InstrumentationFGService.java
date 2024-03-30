package com.whatsapp.instrumentation.service;

import X.AnonymousClass000;
import X.AnonymousClass190;
import X.AnonymousClass5K8;
import X.C07700Yy;
import X.C19550w8;
import X.C36321k7;
import X.C36361kB;
import X.C36421kH;
import X.C65743Th;
import X.C80253v6;
import X.C90494aF;
import android.app.Notification;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.whatsapp.R;

public class InstrumentationFGService extends AnonymousClass5K8 {
    public boolean A00 = false;
    public Handler A01 = new Handler();
    public Runnable A02 = new C80253v6(this, 36);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    public InstrumentationFGService() {
        super("instrumentationfgservice", true);
    }

    public void onCreate() {
        A02();
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("instrumentationfgservice/onStartCommand:");
        A0u.append(intent);
        C36321k7.A1T(" startId:", A0u, i2);
        C07700Yy A0F = C36421kH.A0F(this);
        A0F.A0G(getString(R.string.f12nameremoved));
        A0F.A0F(getString(R.string.f12nameremoved));
        A0F.A0E(getString(R.string.f12nameremoved));
        A0F.A0D = C65743Th.A00(this, 1, AnonymousClass190.A03(this), 0);
        A0F.A09 = C90494aF.A0p();
        C36361kB.A1A(A0F);
        Notification A05 = A0F.A05();
        if (C19550w8.A0A()) {
            i3 = 1;
        } else {
            i3 = null;
        }
        A04(A05, i3, i2, 25);
        Handler handler = this.A01;
        Runnable runnable = this.A02;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
        return 2;
    }
}
