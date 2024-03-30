package com.whatsapp.migration.export.service;

import X.AnonymousClass5FY;
import X.AnonymousClass5KA;
import X.AnonymousClass6WX;
import X.C132156Sl;
import X.C146906wM;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19630wG;
import X.C25271Fq;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36341k9;
import X.C36391kE;
import X.C36441kJ;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessagesExporterService extends AnonymousClass5KA implements C18700tb {
    public AnonymousClass6WX A00;
    public C132156Sl A01;
    public AnonymousClass5FY A02;
    public boolean A03 = false;
    public C146906wM A04;
    public final Object A05 = C36441kJ.A11();
    public volatile C31091bG A06;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
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
            C18800tq r1 = ((C31141bL) ((C31131bK) generatedComponent())).A05;
            this.A00 = C36391kE.A0V(r1);
            this.A01 = C36341k9.A0Z(r1);
            this.A00 = (AnonymousClass6WX) r1.AGq.get();
            this.A02 = (AnonymousClass5FY) r1.ATX.get();
            this.A01 = new C132156Sl((C19630wG) r1.A91.get(), (C25271Fq) r1.A9D.get(), (C18820ts) r1.A9X.get());
        }
        super.onCreate();
        C146906wM r12 = new C146906wM(this);
        this.A04 = r12;
        this.A02.registerObserver(r12);
    }

    public void onDestroy() {
        Log.i("xpm-export-service-onDestroy()");
        super.onDestroy();
        this.A02.unregisterObserver(this.A04);
        stopForeground(false);
    }
}
