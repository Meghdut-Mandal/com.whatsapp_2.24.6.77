package com.whatsapp.twofactor;

import X.AnonymousClass155;
import X.AnonymousClass3LW;
import X.AnonymousClass4XQ;
import X.C18800tq;
import X.C18830tt;
import X.C194349Pi;
import X.C36321k7;
import X.C36331k8;
import X.C36411kG;
import X.C39001qm;
import X.C89374Wh;
import android.app.Dialog;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class AddEmailActivity extends AnonymousClass155 {
    public int A00;
    public WaTextView A01;
    public WaTextView A02;
    public C194349Pi A03;
    public WDSButton A04;
    public WDSButton A05;
    public String A06;
    public boolean A07;

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(new AnonymousClass4XQ(this, 11), R.string.f12nameremoved);
        A002.A0f(new AnonymousClass4XQ(this, 12), R.string.f12nameremoved);
        return A002.create();
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36411kG.A0f(r1);
        }
    }

    public AddEmailActivity(int i) {
        this.A07 = false;
        C89374Wh.A00(this, 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        if (r0.length() == 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ec, code lost:
        if (r1 == 0) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131624089(0x7f0e0099, float:1.8875348E38)
            r6.setContentView((int) r0)
            r0 = 2131894286(0x7f12200e, float:1.9423372E38)
            r6.setTitle(r0)
            X.C36321k7.A0P(r6)
            android.view.View r1 = r6.A00
            r0 = 2131427571(0x7f0b00f3, float:1.8476762E38)
            com.whatsapp.WaTextView r0 = X.C36341k9.A0Q(r1, r0)
            r6.A02 = r0
            android.view.View r1 = r6.A00
            r0 = 2131427569(0x7f0b00f1, float:1.8476758E38)
            com.whatsapp.WaTextView r0 = X.C36341k9.A0Q(r1, r0)
            r6.A01 = r0
            android.view.View r1 = r6.A00
            r0 = 2131427568(0x7f0b00f0, float:1.8476756E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r6.A04 = r0
            android.view.View r1 = r6.A00
            r0 = 2131434122(0x7f0b1a8a, float:1.849005E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r6.A05 = r0
            android.content.Intent r2 = r6.getIntent()
            r1 = 0
            java.lang.String r0 = "entrypoint"
            int r0 = r2.getIntExtra(r0, r1)
            r6.A00 = r0
            java.lang.String r4 = X.C36391kE.A0u(r6)
            r6.A06 = r4
            X.9Pi r3 = r6.A03
            if (r3 == 0) goto L_0x012d
            int r2 = r6.A00
            r1 = 5
            r0 = 8
            X.C36401kF.A1G(r3, r4, r2, r1, r0)
            java.lang.String r2 = "title"
            X.0v0 r0 = r6.A09
            java.lang.String r0 = r0.A0i()
            if (r0 == 0) goto L_0x007a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x007a
            com.whatsapp.WaTextView r1 = r6.A02
            if (r1 != 0) goto L_0x0087
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x007a:
            com.whatsapp.WaTextView r1 = r6.A02
            if (r1 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0083:
            r0 = 2131889030(0x7f120b86, float:1.9412712E38)
            goto L_0x008a
        L_0x0087:
            r0 = 2131889062(0x7f120ba6, float:1.9412777E38)
        L_0x008a:
            r1.setText(r0)
            X.0v0 r0 = r6.A09
            java.lang.String r0 = r0.A0i()
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x009e
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x009f
        L_0x009e:
            r1 = 1
        L_0x009f:
            java.lang.String r0 = "description"
            if (r1 == 0) goto L_0x00b3
            com.whatsapp.WaTextView r1 = r6.A01
            if (r1 != 0) goto L_0x00ac
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ac:
            r0 = 2131889028(0x7f120b84, float:1.9412708E38)
            r1.setText(r0)
            goto L_0x00de
        L_0x00b3:
            com.whatsapp.WaTextView r3 = r6.A01
            if (r3 != 0) goto L_0x00bc
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00bc:
            r2 = 2131889061(0x7f120ba5, float:1.9412775E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = X.C36391kE.A04(r6)
            java.lang.String r0 = X.AnonymousClass14B.A03(r6, r0)
            r1[r5] = r0
            X.0v0 r0 = r6.A09
            java.lang.String r0 = r0.A0i()
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r1, r4, r2)
            android.text.Spanned r0 = X.C05480Pw.A00(r0)
            r3.setText(r0)
        L_0x00de:
            X.0v0 r0 = r6.A09
            java.lang.String r0 = r0.A0i()
            r3 = 0
            if (r0 == 0) goto L_0x00ee
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00ef
        L_0x00ee:
            r0 = 1
        L_0x00ef:
            java.lang.String r2 = "addEmailButton"
            if (r0 == 0) goto L_0x00fc
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A04
            if (r1 != 0) goto L_0x010a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x00fc:
            r3 = 2
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A04
            if (r1 != 0) goto L_0x0106
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0106:
            r0 = 2131889060(0x7f120ba4, float:1.9412773E38)
            goto L_0x010d
        L_0x010a:
            r0 = 2131889025(0x7f120b81, float:1.9412702E38)
        L_0x010d:
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A04
            if (r1 != 0) goto L_0x0119
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0119:
            r0 = 28
            X.C67143Yr.A00(r1, r6, r3, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r6.A05
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "skipEmailButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0129:
            X.AnonymousClass3Y9.A00(r0, r6, r4)
            return
        L_0x012d:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.AddEmailActivity.onCreate(android.os.Bundle):void");
    }

    public AddEmailActivity() {
        this(0);
    }
}
