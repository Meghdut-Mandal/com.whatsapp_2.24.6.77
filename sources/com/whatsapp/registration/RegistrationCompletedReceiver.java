package com.whatsapp.registration;

import X.C18830tt;
import X.C19420v0;
import X.C19730wQ;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class RegistrationCompletedReceiver extends BroadcastReceiver {
    public C19730wQ A00;
    public C19420v0 A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APm(C56042vd.A00(context), this);
                    this.A03 = true;
                }
            }
        }
        boolean A1a = C36331k8.A1a(context, intent);
        Log.i("RegistrationCompletedReceiver/onReceive/smba was registered on this device");
        C19730wQ r2 = this.A00;
        if (r2 == null) {
            throw C36331k8.A0d("meManager");
        } else if (r2.A0M(UserJid.Companion.A02(intent.getStringExtra("jid")))) {
            Log.i("RegistrationCompletedReceiver/onReceive/smba registered this clients phone number");
            C19420v0 r0 = this.A01;
            if (r0 != null) {
                C36331k8.A0w(C19420v0.A00(r0), "registration_biz_registered_on_device", A1a);
                return;
            }
            throw C36331k8.A0d("waSharedPreferences");
        }
    }

    public RegistrationCompletedReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public RegistrationCompletedReceiver() {
        this(0);
    }
}
