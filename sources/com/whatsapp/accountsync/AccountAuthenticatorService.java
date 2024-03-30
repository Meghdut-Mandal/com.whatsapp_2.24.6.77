package com.whatsapp.accountsync;

import X.AnonymousClass1U6;
import X.C18700tb;
import X.C31091bG;
import X.C36441kJ;
import X.C90534aJ;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends AnonymousClass1U6 implements C18700tb {
    public static C90534aJ A03;
    public boolean A00;
    public final Object A01;
    public volatile C31091bG A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C31091bG(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        super.onCreate();
    }

    public AccountAuthenticatorService(int i) {
        this.A01 = C36441kJ.A11();
        this.A00 = false;
    }

    public IBinder onBind(Intent intent) {
        if (!"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            return null;
        }
        C90534aJ r0 = A03;
        if (r0 == null) {
            r0 = new C90534aJ(this);
            A03 = r0;
        }
        return r0.getIBinder();
    }

    public AccountAuthenticatorService() {
        this(0);
    }
}
