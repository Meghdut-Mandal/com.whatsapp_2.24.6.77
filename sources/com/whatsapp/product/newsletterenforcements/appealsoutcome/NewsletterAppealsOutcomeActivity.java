package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass1M4;
import X.AnonymousClass3HC;
import X.AnonymousClass4D3;
import X.AnonymousClass4D4;
import X.AnonymousClass4D5;
import X.AnonymousClass4D6;
import X.AnonymousClass4D7;
import X.AnonymousClass4D8;
import X.AnonymousClass4D9;
import X.AnonymousClass4OV;
import X.C000800j;
import X.C001400p;
import X.C1497372o;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C27731Pn;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C39621t1;
import X.C61333Bl;
import X.C85404Gy;
import X.C85414Gz;
import X.C89354Wf;
import com.whatsapp.WaTextView;

public final class NewsletterAppealsOutcomeActivity extends AnonymousClass155 {
    public C61333Bl A00;
    public AnonymousClass16D A01;
    public C27731Pn A02;
    public C33751fs A03;
    public AnonymousClass3HC A04;
    public AnonymousClass4OV A05;
    public AnonymousClass1M4 A06;
    public C32681e1 A07;
    public boolean A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;

    private final void A01(WaTextView waTextView, String str) {
        C32681e1 r1 = this.A07;
        if (r1 != null) {
            waTextView.setText(r1.A03(this, new C1497372o(this, 33), str, "clickable-span", C36341k9.A05(waTextView.getContext())));
            C36331k8.A10(waTextView, waTextView.getAbProps());
            return;
        }
        throw C36331k8.A0b();
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A07 = C36351kA.A0p(r1);
            this.A06 = C36361kB.A0f(r2);
            this.A02 = C36351kA.A0T(r2);
            this.A01 = C36341k9.A0R(r2);
            this.A03 = C36361kB.A0X(r1);
            this.A05 = (AnonymousClass4OV) A0L.A1q.get();
            this.A00 = (C61333Bl) A0L.A16.get();
            this.A04 = C36401kF.A0X(r1);
        }
    }

    public NewsletterAppealsOutcomeActivity(int i) {
        this.A08 = false;
        C89354Wf.A00(this, 17);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r0 = 2131887710(0x7f12065e, float:1.9410035E38)
            r10.setTitle(r0)
            r10.A2u()
            X.C36321k7.A0P(r10)
            r0 = 2131624047(0x7f0e006f, float:1.8875263E38)
            r10.setContentView((int) r0)
            X.00T r2 = r10.A0B
            java.lang.Object r4 = r2.getValue()
            X.3X9 r4 = (X.AnonymousClass3X9) r4
            boolean r0 = r4 instanceof X.AnonymousClass2Z1
            if (r0 == 0) goto L_0x0131
            X.2Z1 r4 = (X.AnonymousClass2Z1) r4
            X.1M4 r3 = r10.A06
            if (r3 == 0) goto L_0x024b
            X.0ts r1 = r10.A00
            java.lang.String r0 = r4.A01
            java.lang.String r5 = r3.A03(r1, r0)
            if (r5 != 0) goto L_0x0032
            r5 = r0
        L_0x0032:
            X.AnonymousClass00C.A0B(r5)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r4.A00
            int r1 = r0.ordinal()
            java.lang.String r7 = "clickable-span"
            r3 = 2
            r6 = 0
            r4 = 1
            if (r1 == r4) goto L_0x022b
            r0 = 3
            if (r1 == r0) goto L_0x011f
            if (r1 != r3) goto L_0x0063
            X.00T r0 = r10.A0E
            android.widget.TextView r3 = X.C36351kA.A0G(r0)
            r1 = 2131891332(0x7f121484, float:1.9417381E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r5
            X.C36341k9.A0s(r10, r3, r0, r1)
        L_0x0057:
            X.00T r0 = r10.A0A
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891331(0x7f121483, float:1.941738E38)
            r1.setText(r0)
        L_0x0063:
            android.view.View r1 = r10.A00
            r0 = 2131431939(0x7f0b1203, float:1.8485621E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r0)
            X.AnonymousClass00C.A0B(r5)
            java.lang.Object r0 = r2.getValue()
            X.3X9 r0 = (X.AnonymousClass3X9) r0
            java.lang.String r0 = r0.A01()
            X.C65723Tf.A03(r5, r0)
            java.lang.Object r0 = r2.getValue()
            X.3X9 r0 = (X.AnonymousClass3X9) r0
            java.lang.String r0 = r0.A01()
            if (r0 == 0) goto L_0x00a2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r3 = r3.toMillis(r0)
            X.0ts r0 = r10.A00
            java.lang.String r1 = X.C20040wv.A05(r0, r3)
            r0 = 2131891339(0x7f12148b, float:1.9417395E38)
            java.lang.String r0 = X.C36321k7.A0A(r10, r1, r0)
            r5.setText(r0)
        L_0x00a2:
            X.00T r0 = r10.A09
            java.lang.Object r4 = X.C36381kD.A0p(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r0 = r2.getValue()
            X.3X9 r0 = (X.AnonymousClass3X9) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r0.A00()
            int r3 = r0.ordinal()
            r0 = 1
            if (r3 == r0) goto L_0x011b
            r0 = 4
            if (r3 == r0) goto L_0x011b
            r0 = 3
            r1 = 2131234019(0x7f080ce3, float:1.8084192E38)
            if (r3 == r0) goto L_0x00cb
            r0 = 2
            r1 = 2131234252(0x7f080dcc, float:1.8084664E38)
            if (r3 == r0) goto L_0x00cb
            r1 = 0
        L_0x00cb:
            r4.setImageResource(r1)
            java.lang.Object r0 = r2.getValue()
            X.3X9 r0 = (X.AnonymousClass3X9) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r0.A00()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 != r0) goto L_0x00f1
            X.09Y r2 = X.C36341k9.A0O(r10)
            r1 = 2131431968(0x7f0b1220, float:1.848568E38)
            X.00T r0 = r10.A0C
            java.lang.Object r0 = r0.getValue()
            X.02E r0 = (X.AnonymousClass02E) r0
            r2.A0A(r0, r1)
            r2.A01()
        L_0x00f1:
            X.00T r3 = r10.A0F
            java.lang.Object r0 = r3.getValue()
            X.1t1 r0 = (X.C39621t1) r0
            X.00s r2 = r0.A00
            X.4L4 r1 = new X.4L4
            r1.<init>(r10)
            r0 = 38
            X.C65993Ug.A00(r10, r2, r1, r0)
            java.lang.Object r4 = r3.getValue()
            X.1t1 r4 = (X.C39621t1) r4
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A05
            r1 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1 r0 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1
            r0.<init>(r4, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x011b:
            r1 = 2131234070(0x7f080d16, float:1.8084295E38)
            goto L_0x00cb
        L_0x011f:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891327(0x7f12147f, float:1.941737E38)
            com.whatsapp.WaTextView r6 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891337(0x7f121489, float:1.9417391E38)
            goto L_0x023b
        L_0x0131:
            boolean r0 = r4 instanceof X.AnonymousClass2Z2
            if (r0 == 0) goto L_0x01df
            X.2Z2 r4 = (X.AnonymousClass2Z2) r4
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r4.A00
            int r1 = r0.ordinal()
            java.lang.String r6 = "clickable-span"
            r3 = 0
            r7 = 1
            if (r1 == r7) goto L_0x01c5
            r0 = 4
            if (r1 == r0) goto L_0x01af
            r0 = 3
            if (r1 == r0) goto L_0x019e
            r0 = 2
            if (r1 != r0) goto L_0x0164
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891333(0x7f121485, float:1.9417383E38)
            r1.setText(r0)
            X.00T r0 = r10.A0A
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891335(0x7f121487, float:1.9417387E38)
        L_0x0161:
            r1.setText(r0)
        L_0x0164:
            X.00T r6 = r10.A0F
            java.lang.Object r0 = r6.getValue()
            X.1t1 r0 = (X.C39621t1) r0
            X.00s r5 = r0.A01
            X.4L3 r1 = new X.4L3
            r1.<init>(r10)
            r0 = 39
            X.C65993Ug.A00(r10, r5, r1, r0)
            java.lang.Object r6 = r6.getValue()
            X.1t1 r6 = (X.C39621t1) r6
            X.00T r0 = r10.A0D
            X.1Uw r5 = X.C36431kI.A0i(r0)
            java.lang.String r0 = r4.A03
            long r8 = java.lang.Long.parseLong(r0)
            X.AnonymousClass00C.A0D(r5, r3)
            X.040 r1 = X.C109325Xd.A00(r6)
            X.02l r0 = r6.A05
            r7 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 r4 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1
            r4.<init>(r5, r6, r7, r8)
            X.C36381kD.A1R(r0, r4, r1)
            goto L_0x0063
        L_0x019e:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891328(0x7f121480, float:1.9417373E38)
            com.whatsapp.WaTextView r5 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891336(0x7f121488, float:1.941739E38)
            goto L_0x01d5
        L_0x01af:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891328(0x7f121480, float:1.9417373E38)
            r1.setText(r0)
            X.00T r0 = r10.A0A
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891330(0x7f121482, float:1.9417377E38)
            goto L_0x0161
        L_0x01c5:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891328(0x7f121480, float:1.9417373E38)
            com.whatsapp.WaTextView r5 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891340(0x7f12148c, float:1.9417397E38)
        L_0x01d5:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = X.C36351kA.A0x(r10, r6, r0, r3, r1)
            r10.A01(r5, r0)
            goto L_0x0164
        L_0x01df:
            boolean r0 = r4 instanceof X.AnonymousClass2Z0
            if (r0 == 0) goto L_0x0063
            X.2Z0 r4 = (X.AnonymousClass2Z0) r4
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r4.A00
            int r1 = r0.ordinal()
            java.lang.String r5 = "clickable-span"
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L_0x0216
            r0 = 3
            if (r1 == r0) goto L_0x0205
            r0 = 2
            if (r1 != r0) goto L_0x0063
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891334(0x7f121486, float:1.9417385E38)
            r1.setText(r0)
            goto L_0x0057
        L_0x0205:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891329(0x7f121481, float:1.9417375E38)
            com.whatsapp.WaTextView r6 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891338(0x7f12148a, float:1.9417393E38)
            goto L_0x0226
        L_0x0216:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891329(0x7f121481, float:1.9417375E38)
            com.whatsapp.WaTextView r6 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891342(0x7f12148e, float:1.9417401E38)
        L_0x0226:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
            goto L_0x023f
        L_0x022b:
            X.00T r0 = r10.A0E
            android.widget.TextView r1 = X.C36351kA.A0G(r0)
            r0 = 2131891327(0x7f12147f, float:1.941737E38)
            com.whatsapp.WaTextView r6 = X.C36371kC.A0S(r1, r10, r0)
            r1 = 2131891341(0x7f12148d, float:1.94174E38)
        L_0x023b:
            java.lang.Object[] r0 = X.C36431kI.A1a(r5, r7, r3)
        L_0x023f:
            java.lang.String r0 = r10.getString(r1, r0)
            X.AnonymousClass00C.A08(r0)
            r10.A01(r6, r0)
            goto L_0x0063
        L_0x024b:
            java.lang.String r0 = "countryUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity.onCreate(android.os.Bundle):void");
    }

    public NewsletterAppealsOutcomeActivity() {
        this(0);
        this.A0D = C001400p.A00(C000800j.PUBLICATION, new C85404Gy(this));
        this.A0B = C36431kI.A1I(new AnonymousClass4D5(this));
        this.A0F = C36441kJ.A0a(new AnonymousClass4D7(this), new AnonymousClass4D9(this), new C85414Gz(this), C36441kJ.A1A(C39621t1.class));
        this.A09 = C36431kI.A1I(new AnonymousClass4D3(this));
        this.A0E = C36431kI.A1I(new AnonymousClass4D8(this));
        this.A0A = C36431kI.A1I(new AnonymousClass4D4(this));
        this.A0C = C36431kI.A1I(new AnonymousClass4D6(this));
    }
}
