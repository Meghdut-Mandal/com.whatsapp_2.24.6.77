package com.whatsapp.registration.parole;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C89364Wg;

public final class CustomRegistrationBlockActivity extends AnonymousClass155 {
    public C32681e1 A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0p(r1);
        }
    }

    public CustomRegistrationBlockActivity(int i) {
        this.A07 = false;
        C89364Wg.A00(this, 9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0081, code lost:
        if (r2.length() == 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131624029(0x7f0e005d, float:1.8875226E38)
            android.content.Intent r1 = X.C36431kI.A0F(r6, r0)
            java.lang.String r0 = "title_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A06 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "body_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A01 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_primary_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            r6.A03 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_secondary_text"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A05 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_primary_link"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            r6.A02 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "button_secondary_link"
            java.lang.String r0 = r1.getStringExtra(r0)
            r6.A04 = r0
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "show_custom_fields"
            boolean r0 = X.C36421kH.A1T(r1, r0)
            if (r0 == 0) goto L_0x00f4
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            android.view.View r5 = X.C36361kB.A0D(r6, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131428100(0x7f0b0304, float:1.8477835E38)
            android.view.View r4 = X.C36361kB.A0D(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r2 = r6.A06
            if (r2 == 0) goto L_0x0083
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0084
        L_0x0083:
            r0 = 1
        L_0x0084:
            r3 = 8
            if (r0 == 0) goto L_0x00ce
            r5.setVisibility(r3)
        L_0x008b:
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00ca
            X.1e1 r2 = r6.A00
            if (r2 == 0) goto L_0x00d7
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x00d2
            android.text.SpannableString r0 = r2.A00(r1, r0)
            X.C36431kI.A1M(r4, r0)
            X.0yC r0 = r6.A0D
            X.C36331k8.A0z(r4, r6, r0)
        L_0x00ad:
            r0 = 2131432894(0x7f0b15be, float:1.8487558E38)
            android.view.View r1 = X.C36361kB.A0D(r6, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131433699(0x7f0b18e3, float:1.8489191E38)
            android.view.View r2 = X.C36361kB.A0D(r6, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "buttonPrimaryText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ca:
            r4.setVisibility(r3)
            goto L_0x00ad
        L_0x00ce:
            r5.setText(r2)
            goto L_0x008b
        L_0x00d2:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x00d7:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x00dc:
            r1.setText(r0)
            r0 = 20
            X.C67133Yq.A00(r1, r6, r0)
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L_0x00f5
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x00f5
            r2.setText(r1)
            r0 = 19
            X.C67133Yq.A00(r2, r6, r0)
        L_0x00f4:
            return
        L_0x00f5:
            r2.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.parole.CustomRegistrationBlockActivity.onCreate(android.os.Bundle):void");
    }

    public CustomRegistrationBlockActivity() {
        this(0);
    }
}
