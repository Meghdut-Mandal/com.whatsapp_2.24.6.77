package com.whatsapp.appwidget;

import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass18U;
import X.C136126do;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19700wN;
import X.C19970wo;
import X.C20600xp;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService implements C18700tb {
    public C19700wN A00;
    public AnonymousClass18U A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C19970wo A04;
    public C18820ts A05;
    public C20600xp A06;
    public boolean A07;
    public final Object A08;
    public volatile C31091bG A09;

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new C31091bG(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public void onCreate() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A04 = C36351kA.A0V(r1);
            this.A00 = C36391kE.A0V(r1);
            this.A01 = (AnonymousClass18U) r1.A0I.get();
            this.A02 = C36341k9.A0R(r1);
            this.A03 = C36341k9.A0S(r1);
            this.A05 = C36341k9.A0T(r1);
            this.A06 = (C20600xp) r1.A5q.get();
        }
        super.onCreate();
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C136126do(getApplicationContext(), this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, this.A06);
    }

    public WidgetService(int i) {
        this.A08 = C36441kJ.A11();
        this.A07 = false;
    }

    public WidgetService() {
        this(0);
    }
}
