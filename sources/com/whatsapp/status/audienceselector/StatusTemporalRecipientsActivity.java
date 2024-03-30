package com.whatsapp.status.audienceselector;

import X.AnonymousClass3XT;
import X.AnonymousClass8TT;
import X.C165567td;
import X.C173788Ta;
import X.C18800tq;
import X.C18830tt;
import X.C23140B7a;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C64883Pu;

public final class StatusTemporalRecipientsActivity extends StatusRecipientsActivity {
    public AnonymousClass3XT A00;
    public C64883Pu A01;
    public boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3XT A0y(com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity r6) {
        /*
            X.3XT r0 = r6.A00
            if (r0 != 0) goto L_0x0037
            android.os.Bundle r1 = X.C36371kC.A0H(r6)
            if (r1 == 0) goto L_0x0014
            X.3Pu r0 = r6.A01
            if (r0 == 0) goto L_0x003f
            X.3XT r0 = r0.A01(r1)
            if (r0 != 0) goto L_0x0035
        L_0x0014:
            X.16E r0 = r6.A03
            if (r0 == 0) goto L_0x0038
            int r3 = r0.A05()
            java.util.List r0 = r6.A3j()
            r4 = 0
            java.util.ArrayList r1 = X.C90504aG.A0u(r0)
            X.3XT r0 = A0y(r6)
            java.util.List r0 = r0.A02
            java.util.ArrayList r2 = X.C90504aG.A0u(r0)
            r5 = 0
            X.3XT r0 = new X.3XT
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0035:
            r6.A00 = r0
        L_0x0037:
            return r0
        L_0x0038:
            java.lang.String r0 = "statusStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x003f:
            java.lang.String r0 = "statusAudienceRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity.A0y(com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity):X.3XT");
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173788Ta.A0x(this, r2);
            AnonymousClass8TT.A0u(A0L, r2, this);
            this.A01 = (C64883Pu) r1.ACT.get();
        }
    }

    public StatusTemporalRecipientsActivity(int i) {
        this.A02 = false;
        C23140B7a.A00(this, 16);
    }

    public StatusTemporalRecipientsActivity() {
        this(0);
    }
}
