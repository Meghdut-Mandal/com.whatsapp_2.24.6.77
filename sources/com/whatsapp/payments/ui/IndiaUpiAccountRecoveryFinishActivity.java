package com.whatsapp.payments.ui;

import X.B7Y;
import X.C165567td;
import X.C165577te;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import android.view.MenuItem;

public class IndiaUpiAccountRecoveryFinishActivity extends C179128jE {
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

    public void onBackPressed() {
        this.A0S.BOm(C36361kB.A0i(), C36371kC.A0n(), "notify_verification_complete", this.A0e);
        super.onBackPressed();
    }

    public IndiaUpiAccountRecoveryFinishActivity(int i) {
        this.A00 = false;
        B7Y.A00(this, 49);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004d, code lost:
        if (r2 == 12) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131625186(0x7f0e04e2, float:1.8877573E38)
            r5.setContentView((int) r0)
            r0 = 2131427433(0x7f0b0069, float:1.8476482E38)
            android.widget.ImageView r1 = X.C36411kG.A0Q(r5, r0)
            r0 = 2131232556(0x7f08072c, float:1.8081225E38)
            r1.setImageResource(r0)
            r0 = 2131427435(0x7f0b006b, float:1.8476486E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r5, r0)
            r0 = 2131895279(0x7f1223ef, float:1.9425387E38)
            r1.setText(r0)
            r0 = 2131427434(0x7f0b006a, float:1.8476484E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r5, r0)
            r0 = 2131895278(0x7f1223ee, float:1.9425384E38)
            r1.setText(r0)
            X.07B r1 = X.C173858Tk.A0F(r5)
            if (r1 == 0) goto L_0x003c
            r0 = 2131896908(0x7f122a4c, float:1.942869E38)
            X.C165607th.A16(r5, r1, r0)
        L_0x003c:
            r0 = 2131427432(0x7f0b0068, float:1.847648E38)
            android.widget.TextView r3 = X.C36391kE.A0Q(r5, r0)
            int r2 = r5.A02
            r0 = 5
            if (r2 == r0) goto L_0x004f
            r1 = 12
            r0 = 2131888924(0x7f120b1c, float:1.9412497E38)
            if (r2 != r1) goto L_0x0052
        L_0x004f:
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
        L_0x0052:
            r3.setText(r0)
            r0 = 41
            X.C36391kE.A1I(r3, r5, r0)
            X.AF7 r4 = r5.A0S
            java.lang.Integer r3 = X.C36381kD.A0m()
            r2 = 0
            java.lang.String r1 = r5.A0e
            java.lang.String r0 = "notify_verification_complete"
            r4.BOm(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiAccountRecoveryFinishActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0S.BOm(C36361kB.A0i(), C36371kC.A0n(), "notify_verification_complete", this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiAccountRecoveryFinishActivity() {
        this(0);
    }
}
