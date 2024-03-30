package com.whatsapp.contact.sync;

import X.AnonymousClass005;
import X.AnonymousClass1U6;
import X.C18700tb;
import X.C18840tu;
import X.C31091bG;
import X.C31131bK;
import X.C31141bL;
import X.C36441kJ;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends AnonymousClass1U6 implements C18700tb {
    public AnonymousClass005 A00;
    public boolean A01;
    public final Object A02;
    public volatile C31091bG A03;

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

    public IBinder onBind(Intent intent) {
        return ((AbstractThreadedSyncAdapter) this.A00.get()).getSyncAdapterBinder();
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C18840tu.A00(((C31141bL) ((C31131bK) generatedComponent())).A05.A00.A6D);
        }
        super.onCreate();
    }

    public ContactsSyncAdapterService(int i) {
        this.A02 = C36441kJ.A11();
        this.A01 = false;
    }

    public ContactsSyncAdapterService() {
        this(0);
    }
}
