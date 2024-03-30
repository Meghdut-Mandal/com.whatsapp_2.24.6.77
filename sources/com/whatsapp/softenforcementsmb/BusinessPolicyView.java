package com.whatsapp.softenforcementsmb;

import X.AnonymousClass24Z;
import X.AnonymousClass2S0;
import X.AnonymousClass3H0;
import X.C18800tq;
import X.C18830tt;
import X.C31871cW;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C89364Wg;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public final class BusinessPolicyView extends WaInAppBrowsingActivity {
    public C31871cW A00;
    public long A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass24Z.A01(A0B, r1, this);
            this.A00 = (C31871cW) A0B.A7T.get();
        }
    }

    public void onBackPressed() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A01);
        try {
            String stringExtra = getIntent().getStringExtra("notificationJSONObject");
            if (stringExtra != null) {
                AnonymousClass3H0 r5 = new AnonymousClass3H0(C36441kJ.A1C(stringExtra));
                C31871cW r4 = this.A00;
                if (r4 != null) {
                    Integer A0n = C36371kC.A0n();
                    Long valueOf = Long.valueOf(seconds);
                    AnonymousClass2S0 r2 = new AnonymousClass2S0();
                    r2.A06 = r5.A05;
                    r2.A08 = r5.A07;
                    r2.A05 = r5.A04;
                    r2.A04 = C36441kJ.A0y(r5.A00);
                    r2.A07 = r5.A06;
                    r2.A00 = C36361kB.A0i();
                    r2.A01 = A0n;
                    r2.A02 = A0n;
                    r2.A03 = valueOf;
                    if (!r4.A00.A0E(1730)) {
                        r4.A01.Bly(r2);
                    }
                } else {
                    throw C36331k8.A0d("smbSoftEnforcementLoggingUtil");
                }
            }
        } catch (JSONException e) {
            Log.e("Error deserializing JSON String: notificationJSONObject", e);
        }
        super.onBackPressed();
    }

    public BusinessPolicyView(int i) {
        this.A02 = false;
        C89364Wg.A00(this, 45);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = System.currentTimeMillis();
    }

    public BusinessPolicyView() {
        this(0);
    }
}
