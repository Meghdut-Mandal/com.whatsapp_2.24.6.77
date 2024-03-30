package com.whatsapp.migration.android.integration.service;

import X.AnonymousClass3TX;
import X.AnonymousClass5FX;
import X.AnonymousClass5K8;
import X.AnonymousClass6Sk;
import X.AnonymousClass6X5;
import X.C1497272n;
import X.C1502074j;
import X.C160867li;
import X.C164907sZ;
import X.C19700wN;
import X.C19770wU;
import X.C21060yb;
import X.C36421kH;
import X.C81283wl;
import X.C90514aH;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class GoogleMigrateService extends AnonymousClass5K8 {
    public C19700wN A00;
    public C21060yb A01;
    public AnonymousClass6X5 A02;
    public AnonymousClass5FX A03;
    public AnonymousClass6Sk A04;
    public AnonymousClass3TX A05;
    public C19770wU A06;
    public boolean A07 = false;
    public final C160867li A08 = new C164907sZ(this, 0);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public GoogleMigrateService() {
        super("GoogleMigrateService", true);
    }

    public void onDestroy() {
        Log.i("GoogleMigrateService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
        this.A03.unregisterObserver(this.A08);
    }

    public void onCreate() {
        A02();
        super.onCreate();
        this.A03.registerObserver(this.A08);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Object r5;
        int i3;
        String str;
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            str = "GoogleMigrateService/onStartCommand()/intent is null";
        } else if (!"com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT".equals(intent.getAction()) || !this.A02.A0H()) {
            if ("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT".equals(intent.getAction())) {
                Log.i("GoogleMigrateService/onStartCommand()/action_cancel_import");
                AnonymousClass6Sk r1 = this.A04;
                AnonymousClass5K8.A00(C36421kH.A0B(r1.A00), AnonymousClass6Sk.A00(r1, false), this, R.string.f12nameremoved, i2);
                i3 = 14;
            } else if (C90514aH.A1W(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT")) {
                Log.i("GoogleMigrateService/onStartCommand()/action_start_import");
                AnonymousClass6Sk r12 = this.A04;
                AnonymousClass5K8.A00(C36421kH.A0B(r12.A00), AnonymousClass6Sk.A00(r12, false), this, R.string.f12nameremoved, i2);
                i3 = 15;
            } else {
                if ("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY".equals(intent.getAction())) {
                    Log.i("GoogleMigrateService/onStartCommand()/prepare_before_retry");
                    int intExtra = intent.getIntExtra("migration_error_code", 1);
                    AnonymousClass6Sk r13 = this.A04;
                    AnonymousClass5K8.A00(C36421kH.A0B(r13.A00), AnonymousClass6Sk.A00(r13, false), this, R.string.f12nameremoved, i2);
                    r5 = new C81283wl((Object) this, intExtra, 47);
                    this.A06.Boy(new C1502074j(this, r5, 16));
                    return 1;
                }
                return 1;
            }
            r5 = new C1497272n(this, i3);
            this.A06.Boy(new C1502074j(this, r5, 16));
            return 1;
        } else {
            str = "GoogleMigrateService/onStartCommand()/import in progress";
        }
        Log.i(str);
        return 1;
    }
}
