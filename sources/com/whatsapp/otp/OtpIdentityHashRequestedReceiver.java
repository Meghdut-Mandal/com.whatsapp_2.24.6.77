package com.whatsapp.otp;

import X.AnonymousClass1OD;
import X.AnonymousClass39L;
import X.C18830tt;
import X.C19770wU;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C56042vd;
import X.C80503vV;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONArray;

public final class OtpIdentityHashRequestedReceiver extends BroadcastReceiver {
    public AnonymousClass1OD A00;
    public C20810yC A01;
    public AnonymousClass39L A02;
    public C19770wU A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String creatorPackage;
        String stringExtra;
        Context context2 = context;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C18830tt.APW(C56042vd.A00(context), this);
                    this.A05 = true;
                }
            }
        }
        C36321k7.A0w(context, intent);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
        if (pendingIntent != null && (creatorPackage = pendingIntent.getCreatorPackage()) != null && (stringExtra = intent.getStringExtra("request_id")) != null && intent.getStringExtra("id_hash") == null) {
            C20810yC r1 = this.A01;
            if (r1 != null) {
                JSONArray jSONArray = r1.A0A(5790).getJSONArray("packages");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (creatorPackage.equals(jSONArray.getString(i))) {
                        C19770wU r0 = this.A03;
                        if (r0 != null) {
                            r0.Boy(new C80503vV(this, context2, creatorPackage, stringExtra, 4));
                            return;
                        }
                        throw C36331k8.A0d("waWorker");
                    }
                }
                return;
            }
            throw C36331k8.A0d("abprops");
        }
    }

    public OtpIdentityHashRequestedReceiver(int i) {
        this.A05 = false;
        this.A04 = C36441kJ.A11();
    }

    public OtpIdentityHashRequestedReceiver() {
        this(0);
    }
}
