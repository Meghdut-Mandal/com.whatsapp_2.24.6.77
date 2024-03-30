package com.whatsapp.service;

import X.AnonymousClass1U6;
import X.AnonymousClass1V6;
import X.C148826zU;
import X.C18700tb;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36441kJ;
import android.content.Intent;
import android.os.IBinder;

public class BackgroundMediaControlService extends AnonymousClass1U6 implements C18700tb {
    public AnonymousClass1V6 A00;
    public boolean A01;
    public final Object A02;
    public volatile C31091bG A03;

    public IBinder onBind(Intent intent) {
        return null;
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
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (AnonymousClass1V6) ((C31141bL) ((C31131bK) generatedComponent())).A05.A4v.get();
        }
        super.onCreate();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        C148826zU A002 = this.A00.A00();
        if (str != null) {
            if (str.equals("com.whatsapp.service.BackgroundMediaControlService.STOP")) {
                this.A00.A04();
            } else if (str.equals("com.whatsapp.service.BackgroundMediaControlService.START") && A002 != null) {
                A002.A0C(C148826zU.A12, true, false);
            }
        }
        stopSelf();
        return 2;
    }

    public BackgroundMediaControlService(int i) {
        this.A02 = C36441kJ.A11();
        this.A01 = false;
    }

    public BackgroundMediaControlService() {
        this(0);
    }
}
