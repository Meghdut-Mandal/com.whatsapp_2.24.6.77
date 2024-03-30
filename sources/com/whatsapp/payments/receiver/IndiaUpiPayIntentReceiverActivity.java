package com.whatsapp.payments.receiver;

import X.AnonymousClass1EZ;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass9Q4;
import X.B7Y;
import X.B83;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C203479o6;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;

public class IndiaUpiPayIntentReceiverActivity extends C179128jE {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
        }
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        int i2;
        int i3;
        if (i == 10000) {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0d(R.string.f12nameremoved);
            r2.A0c(R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
            i3 = 16;
        } else if (i != 10001) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0d(R.string.f12nameremoved);
            r2.A0c(R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
            i3 = 17;
        }
        B83.A01(r2, this, i3, i2);
        r2.A0r(false);
        return r2.create();
    }

    public IndiaUpiPayIntentReceiverActivity(int i) {
        this.A00 = false;
        B7Y.A00(this, 31);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1020) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass9Q4 r2 = new AnonymousClass9Q4(this.A0I);
        C203479o6 A002 = C203479o6.A00(C165607th.A0H(this), "DEEP_LINK");
        if (!(C165607th.A0H(this) == null || A002 == null)) {
            AnonymousClass1EZ r1 = r2.A00;
            if (r1.A0E()) {
                Uri A0H = C165607th.A0H(this);
                String obj = A0H.toString();
                if (obj == null || !obj.startsWith("upi://mandate") || this.A0D.A0E(2211)) {
                    Context applicationContext = getApplicationContext();
                    Intent A0D = C36431kI.A0D();
                    A0D.setClassName(applicationContext.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity");
                    A0D.setData(A0H);
                    startActivityForResult(A0D, 1020);
                    return;
                }
                setResult(0);
            } else {
                boolean A0F = r1.A0F();
                int i = SearchActionVerificationClientService.NOTIFICATION_ID;
                if (A0F) {
                    i = 10001;
                }
                AnonymousClass3SJ.A01(this, i);
                return;
            }
        }
        finish();
    }

    public IndiaUpiPayIntentReceiverActivity() {
        this(0);
    }
}
