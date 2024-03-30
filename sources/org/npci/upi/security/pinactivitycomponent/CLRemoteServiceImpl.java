package org.npci.upi.security.pinactivitycomponent;

import X.C90514aH;
import X.C91554cE;
import X.C93164g0;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CLRemoteServiceImpl extends Service {
    public C93164g0 A00 = null;
    public C91554cE A01 = null;

    public IBinder onBind(Intent intent) {
        if (this.A01 == null) {
            this.A01 = new C91554cE(getBaseContext(), this);
        }
        try {
            this.A00 = new C93164g0(getBaseContext());
            return this.A01;
        } catch (Exception unused) {
            throw C90514aH.A0s("Could not initialize service provider");
        }
    }
}
