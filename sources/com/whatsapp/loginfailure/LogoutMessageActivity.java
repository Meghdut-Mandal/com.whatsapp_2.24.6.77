package com.whatsapp.loginfailure;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C29501Ww;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36401kF;
import X.C89344We;

public final class LogoutMessageActivity extends AnonymousClass155 {
    public C32691e2 A00;
    public C29501Ww A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36371kC.A0R(A0B);
            this.A01 = C36401kF.A0d(A0B);
        }
    }

    public LogoutMessageActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.AnonymousClass00C.A0J(r6.A00.A06(), r1) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131625424(0x7f0e05d0, float:1.8878056E38)
            r6.setContentView((int) r0)
            android.view.View r1 = r6.A00
            r0 = 2131434637(0x7f0b1c8d, float:1.8491094E38)
            android.view.View r3 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r3 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r3
            android.content.SharedPreferences r1 = X.C36331k8.A06(r6)
            java.lang.String r0 = "logout_message_locale"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            if (r1 == 0) goto L_0x002d
            X.0ts r0 = r6.A00
            java.lang.String r0 = r0.A06()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r6)
            java.lang.String r0 = "main_button_text"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            if (r2 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00bd
            boolean r0 = X.AnonymousClass6RR.A00(r1)
            if (r0 != 0) goto L_0x00bd
        L_0x0042:
            r3.setPrimaryButtonText(r1)
            android.content.SharedPreferences r0 = X.C36331k8.A06(r6)
            java.lang.String r5 = "logout_message_header"
            r1 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00b4
            r0 = 2131895531(0x7f1224eb, float:1.9425898E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0059:
            r3.setHeadlineText(r0)
            android.content.SharedPreferences r0 = X.C36331k8.A06(r6)
            r4 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00a9
            android.content.SharedPreferences r1 = X.C36331k8.A06(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            if (r0 != 0) goto L_0x00a9
            r0 = 2131893171(0x7f121bb3, float:1.942111E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x007a:
            r3.setDescriptionText(r0)
            r1 = 1
            X.2i7 r0 = new X.2i7
            r0.<init>(r6, r6, r1, r2)
            r3.setPrimaryButtonClickListener(r0)
            android.content.SharedPreferences r1 = X.C36331k8.A06(r6)
            java.lang.String r0 = "secondary_button_text"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            if (r2 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x00a7
            boolean r0 = X.AnonymousClass6RR.A00(r1)
            if (r0 != 0) goto L_0x00a7
        L_0x009a:
            r3.setSecondaryButtonText(r1)
            r1 = 2
            X.2i7 r0 = new X.2i7
            r0.<init>(r6, r6, r1, r2)
            r3.setSecondaryButtonClickListener(r0)
            return
        L_0x00a7:
            r1 = 0
            goto L_0x009a
        L_0x00a9:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            goto L_0x007a
        L_0x00b4:
            android.content.SharedPreferences r0 = X.C36331k8.A06(r6)
            java.lang.String r0 = r0.getString(r5, r1)
            goto L_0x0059
        L_0x00bd:
            android.content.Context r1 = r6.getBaseContext()
            r0 = 2131890855(0x7f1212a7, float:1.9416414E38)
            java.lang.String r1 = X.C36361kB.A0m(r1, r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.loginfailure.LogoutMessageActivity.onCreate(android.os.Bundle):void");
    }

    public LogoutMessageActivity() {
        this(0);
    }
}
