package com.whatsapp.registration.notifications;

import X.AnonymousClass12U;
import X.C18830tt;
import X.C19630wG;
import X.C19970wo;
import X.C25271Fq;
import X.C36321k7;
import X.C36441kJ;
import X.C56042vd;
import X.C65983Uf;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class RegRetryVerificationReceiver extends BroadcastReceiver {
    public C19970wo A00;
    public C19630wG A01;
    public C25271Fq A02;
    public AnonymousClass12U A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C18830tt.APt(C56042vd.A00(context), this);
                    this.A05 = true;
                }
            }
        }
        Log.i("reg-retry-verification-receiver/timeout");
        if (this.A03.A03() || this.A03.A00() == 10) {
            Log.i("app-init/async/registrationretry/verified");
            return;
        }
        String string = this.A01.A00.getString(R.string.f12nameremoved);
        C65983Uf.A0L(context, this.A02, C36321k7.A0A(this.A01.A00, string, R.string.f12nameremoved), string, this.A01.A00.getString(R.string.f12nameremoved));
    }

    public RegRetryVerificationReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public RegRetryVerificationReceiver() {
        this(0);
    }
}
