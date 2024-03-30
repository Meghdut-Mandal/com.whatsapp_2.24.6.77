package com.whatsapp.migration.transfer.service;

import X.AnonymousClass1U6;
import X.AnonymousClass5N4;
import X.AnonymousClass6TN;
import X.C105535Fa;
import X.C115985jl;
import X.C115995jm;
import X.C130446Lc;
import X.C1497272n;
import X.C1502074j;
import X.C18700tb;
import X.C18800tq;
import X.C19630wG;
import X.C19770wU;
import X.C21060yb;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C34091gR;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C61533Ci;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class WifiGroupScannerP2pTransferService extends AnonymousClass1U6 implements C18700tb {
    public C115985jl A00;
    public C115995jm A01;
    public C21060yb A02;
    public C19630wG A03;
    public C61533Ci A04;
    public C105535Fa A05;
    public C130446Lc A06;
    public AnonymousClass6TN A07;
    public AnonymousClass5N4 A08;
    public C19770wU A09;
    public boolean A0A;
    public final Object A0B;
    public volatile C31091bG A0C;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if (action.equals("com.whatsapp.migration.START")) {
            C34091gR.A00(this.A03.A00, this.A02);
            startForeground(56, this.A04.A00());
            this.A09.Bp1(new C1502074j(this, intent, 20));
        } else if (action.equals("com.whatsapp.migration.STOP")) {
            C1497272n.A00(this.A09, this, 33);
        }
        return 1;
    }

    public final Object generatedComponent() {
        if (this.A0C == null) {
            synchronized (this.A0B) {
                if (this.A0C == null) {
                    this.A0C = new C31091bG(this);
                }
            }
        }
        return this.A0C.generatedComponent();
    }

    public void onCreate() {
        if (!this.A0A) {
            this.A0A = true;
            C31141bL r2 = (C31141bL) ((C31131bK) generatedComponent());
            C18800tq r1 = r2.A05;
            this.A09 = C36341k9.A0Z(r1);
            this.A03 = C36351kA.A0W(r1);
            this.A02 = C36351kA.A0U(r1);
            this.A05 = (C105535Fa) r1.A00.A36.get();
            this.A00 = (C115985jl) r2.A01.get();
            this.A01 = (C115995jm) r2.A02.get();
            this.A04 = C31141bL.A00(r2);
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/WifiGroupScannerP2pTransferService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
    }

    public WifiGroupScannerP2pTransferService(int i) {
        this.A0B = C36441kJ.A11();
        this.A0A = false;
    }

    public WifiGroupScannerP2pTransferService() {
        this(0);
    }
}
