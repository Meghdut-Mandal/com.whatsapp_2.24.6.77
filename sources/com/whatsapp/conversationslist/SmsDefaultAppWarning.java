package com.whatsapp.conversationslist;

import X.AnonymousClass155;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.B7Y;
import X.B83;
import X.B87;
import X.C165567td;
import X.C165607th;
import X.C18800tq;
import X.C18830tt;
import X.C32601dt;
import X.C36321k7;
import X.C36331k8;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.whatsapp.R;

public class SmsDefaultAppWarning extends AnonymousClass155 {
    public C32601dt A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (C32601dt) r1.A46.get();
        }
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        if (i == 0) {
            r3 = AnonymousClass3LW.A00(this);
            r3.A0c(R.string.f12nameremoved);
            r3.A0g(new B83(this, 6), R.string.f12nameremoved);
            B83.A00(r3, this, 7, R.string.f12nameremoved);
            B83.A01(r3, this, 8, R.string.f12nameremoved);
            i2 = 4;
        } else if (i != 1) {
            return super.onCreateDialog(i);
        } else {
            r3 = AnonymousClass3LW.A00(this);
            r3.A0c(R.string.f12nameremoved);
            r3.A0g(new B83(this, 9), R.string.f12nameremoved);
            B83.A01(r3, this, 10, R.string.f12nameremoved);
            i2 = 5;
        }
        B87.A00(r3, this, i2);
        return r3.create();
    }

    public SmsDefaultAppWarning(int i) {
        this.A01 = false;
        B7Y.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(C165607th.A0H(this));
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"com.whatsapp".equals(activityInfo.packageName)) {
            AnonymousClass3SJ.A01(this, 1);
        } else {
            AnonymousClass3SJ.A01(this, 0);
        }
    }

    public SmsDefaultAppWarning() {
        this(0);
    }
}
