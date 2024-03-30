package com.whatsapp.calling.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1PV;
import X.AnonymousClass1PW;
import X.AnonymousClass2ZH;
import X.AnonymousClass5K8;
import X.C132636Up;
import X.C19550w8;
import X.C21390zA;
import X.C36321k7;
import X.C90474aD;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;

public final class VoiceFGService extends AnonymousClass5K8 {
    public static volatile Notification A04;
    public C21390zA A00;
    public AnonymousClass1PW A01;
    public AnonymousClass2ZH A02;
    public boolean A03 = false;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public VoiceFGService() {
        super("voicefgservice", true);
    }

    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        A02();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        Iterator A0p = C90474aD.A0p(this.A02);
        while (A0p.hasNext()) {
            ((AnonymousClass1PV) A0p.next()).Bhv();
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass1PW r2;
        C132636Up r1;
        boolean A042;
        boolean z;
        C36321k7.A1K(intent, "voicefgservice/onStartCommand:", AnonymousClass000.A0u());
        if (intent != null) {
            String action = intent.getAction();
            if ("hangup_call".equals(action) || "reject_call".equals(action)) {
                r2 = this.A01;
                r1 = new C132636Up(action, intent.getExtras());
            } else if ("recreate_notification".equals(action)) {
                r2 = this.A01;
                r1 = new C132636Up("refresh_notification");
            } else if (!"com.whatsapp.service.VoiceFgService.START".equals(action) || A04 == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("voicefgservice/onStartCommand service started with unknown action:");
                C36321k7.A1Z(A0u, intent.getAction());
                return 2;
            } else {
                boolean z2 = false;
                if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false)) {
                    Iterator A0p = C90474aD.A0p(this.A02);
                    while (A0p.hasNext()) {
                        ((AnonymousClass1PV) A0p.next()).Bhv();
                    }
                    stopForeground(true);
                }
                if (C19550w8.A0A()) {
                    int i3 = 4;
                    if (this.A00.A00) {
                        i3 = 132;
                        if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED", false)) {
                            i3 = 196;
                        }
                        z = intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION", false);
                        if (z) {
                            i3 |= 32;
                        }
                    } else {
                        z = false;
                    }
                    Locale locale = Locale.US;
                    Object[] A0L = AnonymousClass001.A0L();
                    Integer valueOf = Integer.valueOf(i3);
                    A0L[0] = valueOf;
                    String.format(locale, "voicefgservice/onStartCommand: Starting fg service. Type: %d", A0L);
                    A042 = A04(A04, valueOf, i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
                    z2 = z;
                } else {
                    A042 = A04(A04, (Integer) null, i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
                }
                if (A042) {
                    Iterator A0p2 = C90474aD.A0p(this.A02);
                    while (A0p2.hasNext()) {
                        ((AnonymousClass1PV) A0p2.next()).BhJ(z2);
                    }
                }
            }
            r2.A00(r1);
        }
        return 2;
    }
}
