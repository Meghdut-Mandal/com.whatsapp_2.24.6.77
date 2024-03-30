package com.whatsapp.instrumentation.api;

import X.AnonymousClass1VH;
import X.C122555v2;
import X.C125035zD;
import X.C18700tb;
import X.C18800tq;
import X.C18830tt;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36441kJ;
import X.C91544cD;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class InstrumentationService extends Service implements C18700tb {
    public C125035zD A00;
    public C122555v2 A01;
    public AnonymousClass1VH A02;
    public boolean A03;
    public final Object A04;
    public final C91544cD A05;
    public volatile C31091bG A06;

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A04) {
                if (this.A06 == null) {
                    this.A06 = new C31091bG(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq r2 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            C18830tt r1 = r2.A00;
            this.A01 = (C122555v2) r1.ABt.get();
            this.A00 = (C125035zD) r1.ABk.get();
            this.A02 = (AnonymousClass1VH) r2.A4E.get();
        }
        super.onCreate();
    }

    public InstrumentationService(int i) {
        this.A04 = C36441kJ.A11();
        this.A03 = false;
    }

    public IBinder onBind(Intent intent) {
        return this.A05;
    }

    public InstrumentationService() {
        this(0);
        this.A05 = new C91544cD(this);
    }
}
