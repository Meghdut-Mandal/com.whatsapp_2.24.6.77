package com.whatsapp.migration.transfer.service;

import X.AnonymousClass1U6;
import X.AnonymousClass5N7;
import X.AnonymousClass64J;
import X.C105535Fa;
import X.C115975jk;
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

public class WifiGroupCreatorP2pTransferService extends AnonymousClass1U6 implements C18700tb {
    public C115975jk A00;
    public C21060yb A01;
    public C19630wG A02;
    public C61533Ci A03;
    public C105535Fa A04;
    public AnonymousClass64J A05;
    public AnonymousClass5N7 A06;
    public C19770wU A07;
    public boolean A08;
    public final Object A09;
    public volatile C31091bG A0A;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if (action.equals("com.whatsapp.migration.START")) {
            C34091gR.A00(this.A02.A00, this.A01);
            startForeground(56, this.A03.A00());
            this.A07.Bp1(new C1502074j(this, intent, 19));
        } else if (action.equals("com.whatsapp.migration.STOP")) {
            C1497272n.A00(this.A07, this, 32);
        }
        return 1;
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new C31091bG(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public void onCreate() {
        if (!this.A08) {
            this.A08 = true;
            C31141bL r2 = (C31141bL) ((C31131bK) generatedComponent());
            C18800tq r1 = r2.A05;
            this.A07 = C36341k9.A0Z(r1);
            this.A02 = C36351kA.A0W(r1);
            this.A01 = C36351kA.A0U(r1);
            this.A04 = (C105535Fa) r1.A00.A36.get();
            this.A00 = (C115975jk) r2.A00.get();
            this.A03 = C31141bL.A00(r2);
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("fpm/WifiGroupCreatorP2pTransferService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
    }

    public WifiGroupCreatorP2pTransferService(int i) {
        this.A09 = C36441kJ.A11();
        this.A08 = false;
    }

    public WifiGroupCreatorP2pTransferService() {
        this(0);
    }
}
