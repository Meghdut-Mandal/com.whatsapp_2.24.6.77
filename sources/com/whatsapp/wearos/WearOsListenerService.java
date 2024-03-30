package com.whatsapp.wearos;

import X.AnonymousClass8BJ;
import X.C118105nL;
import X.C18700tb;
import X.C18830tt;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36441kJ;
import X.C90754ai;

public final class WearOsListenerService extends C90754ai implements C18700tb {
    public AnonymousClass8BJ A00;
    public C118105nL A01;
    public boolean A02;
    public final Object A03;
    public volatile C31091bG A04;

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C31091bG(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public void onCreate() {
        if (!this.A02) {
            this.A02 = true;
            C18830tt r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05.A00;
            this.A01 = (C118105nL) r1.ABl.get();
            this.A00 = r1.A03();
        }
        super.onCreate();
    }

    public WearOsListenerService(int i) {
        this.A03 = C36441kJ.A11();
        this.A02 = false;
    }

    public WearOsListenerService() {
        this(0);
    }
}
