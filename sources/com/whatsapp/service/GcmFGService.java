package com.whatsapp.service;

import X.AnonymousClass000;
import X.AnonymousClass135;
import X.AnonymousClass190;
import X.AnonymousClass5K8;
import X.C07700Yy;
import X.C18770tn;
import X.C19970wo;
import X.C21010yW;
import X.C36321k7;
import X.C36361kB;
import X.C36421kH;
import X.C65743Th;
import X.C90504aG;
import android.app.Notification;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class GcmFGService extends AnonymousClass5K8 {
    public C19970wo A00;
    public C21010yW A01;
    public boolean A02 = false;
    public volatile long A03;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public GcmFGService() {
        super("gcmfgservice", false);
    }

    public void onCreate() {
        Log.i("gcmfgservice/onCreate");
        A02();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("gcmfgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public boolean A03() {
        boolean A032 = super.A03();
        if (A032) {
            AnonymousClass135 r4 = new AnonymousClass135();
            r4.A02 = "GcmFGService";
            r4.A00 = C90504aG.A0h(SystemClock.uptimeMillis(), this.A03);
            this.A01.Bly(r4);
            this.A03 = 0;
        }
        return A032;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("gcmfgservice/onStartCommand:");
        A0u.append(intent);
        C36321k7.A1T(" startId:", A0u, i2);
        Resources resources = getResources();
        if (resources instanceof C18770tn) {
            resources = ((C18770tn) resources).A00;
        }
        C07700Yy A0F = C36421kH.A0F(this);
        A0F.A0G(resources.getString(R.string.f12nameremoved));
        A0F.A0F(resources.getString(R.string.f12nameremoved));
        A0F.A0E(resources.getString(R.string.f12nameremoved));
        A0F.A0D = C65743Th.A00(this, 1, AnonymousClass190.A03(this), 0);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = -2;
        if (i3 >= 26) {
            i4 = -1;
        }
        A0F.A09 = i4;
        if (i3 != 24) {
            C36361kB.A1A(A0F);
        }
        Notification A05 = A0F.A05();
        int i5 = 11;
        if (i3 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A05);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.notifybar)));
            A05 = recoverBuilder.build();
            i5 = 240677012;
        }
        A04(A05, (Integer) null, i2, i5);
        if (this.A03 == 0) {
            this.A03 = SystemClock.uptimeMillis();
        }
        return 1;
    }
}
