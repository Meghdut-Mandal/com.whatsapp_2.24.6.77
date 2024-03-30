package com.whatsapp.product.newsletterenforcements.newsletterguidelines;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3TE;
import X.AnonymousClass4DN;
import X.AnonymousClass4DO;
import X.AnonymousClass4DP;
import X.C20810yC;
import X.C32681e1;
import X.C33751fs;
import X.C36431kI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class NewsletterGuidelinesFragment extends Hilt_NewsletterGuidelinesFragment {
    public C33751fs A00;
    public C20810yC A01;
    public C32681e1 A02;
    public final AnonymousClass00T A03 = AnonymousClass3TE.A03(this, "show-what-this-means-section", false);
    public final AnonymousClass00T A04 = AnonymousClass3TE.A03(this, "show-what-you-can-do-section", false);
    public final AnonymousClass00T A05 = AnonymousClass3TE.A03(this, "show-what-you-need-to-know-section", false);
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4DN(this));
    public final AnonymousClass00T A07 = C36431kI.A1I(new AnonymousClass4DO(this));
    public final AnonymousClass00T A08 = C36431kI.A1I(new AnonymousClass4DP(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0172, code lost:
        if ((r2 instanceof X.C180758mL) != false) goto L_0x0174;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            r0 = 2131431970(0x7f0b1222, float:1.8485684E38)
            android.view.View r1 = X.C36361kB.A0F(r13, r0)
            X.00T r5 = r11.A03
            boolean r0 = X.C36331k8.A1b(r5)
            r3 = 0
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            r0 = 2131431972(0x7f0b1224, float:1.8485688E38)
            android.view.View r1 = X.C36361kB.A0F(r13, r0)
            X.00T r4 = r11.A04
            boolean r0 = X.C36331k8.A1b(r4)
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            r0 = 2131431974(0x7f0b1226, float:1.8485692E38)
            android.view.View r2 = X.C36361kB.A0F(r13, r0)
            X.00T r1 = r11.A05
            boolean r0 = X.C36331k8.A1b(r1)
            if (r0 != 0) goto L_0x003e
            r3 = 8
        L_0x003e:
            r2.setVisibility(r3)
            boolean r0 = X.C36331k8.A1b(r5)
            if (r0 == 0) goto L_0x005e
            r0 = 2131431971(0x7f0b1223, float:1.8485686E38)
            android.widget.TextView r3 = X.C36391kE.A0P(r13, r0)
            X.00T r0 = r11.A08
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.C180748mK
            if (r0 == 0) goto L_0x0179
            r0 = 2131891425(0x7f1214e1, float:1.941757E38)
        L_0x005b:
            r3.setText(r0)
        L_0x005e:
            boolean r0 = X.C36331k8.A1b(r4)
            if (r0 == 0) goto L_0x0086
            r0 = 2131431973(0x7f0b1225, float:1.848569E38)
            android.widget.TextView r3 = X.C36391kE.A0P(r13, r0)
            X.00T r0 = r11.A08
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof X.C180748mK
            if (r0 == 0) goto L_0x012f
            X.00T r0 = r11.A07
            boolean r2 = X.C36331k8.A1b(r0)
            r0 = 2131891363(0x7f1214a3, float:1.9417444E38)
            if (r2 == 0) goto L_0x0083
            r0 = 2131891429(0x7f1214e5, float:1.9417578E38)
        L_0x0083:
            r3.setText(r0)
        L_0x0086:
            boolean r0 = X.C36331k8.A1b(r1)
            if (r0 == 0) goto L_0x012e
            r0 = 2131432031(0x7f0b125f, float:1.8485808E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r13, r0)
            X.1e1 r5 = r11.A02
            if (r5 == 0) goto L_0x01a9
            X.01I r4 = r11.A0h()
            r1 = 2131891422(0x7f1214de, float:1.9417564E38)
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r2 = 0
            java.lang.String r6 = "bottom-sheet-span"
            java.lang.String r3 = X.C36401kF.A0q(r11, r6, r0, r2, r1)
            r1 = 36
            X.72o r0 = new X.72o
            r0.<init>(r11, r1)
            android.text.SpannableStringBuilder r0 = r5.A02(r4, r0, r3, r6)
            r8.setText(r0)
            X.0yC r0 = r11.A01
            if (r0 == 0) goto L_0x01a4
            X.C36331k8.A10(r8, r0)
            r0 = 2131431946(0x7f0b120a, float:1.8485636E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r13, r0)
            X.1e1 r5 = r11.A02
            if (r5 == 0) goto L_0x019f
            X.01I r4 = r11.A0h()
            r1 = 2131891420(0x7f1214dc, float:1.941756E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = X.C36401kF.A0q(r11, r6, r0, r2, r1)
            r1 = 39
            X.72o r0 = new X.72o
            r0.<init>(r11, r1)
            android.text.SpannableStringBuilder r0 = r5.A02(r4, r0, r3, r6)
            r8.setText(r0)
            X.0yC r0 = r11.A01
            if (r0 == 0) goto L_0x019a
            X.C36331k8.A10(r8, r0)
            X.0yC r1 = r11.A01
            if (r1 == 0) goto L_0x0195
            r0 = 7592(0x1da8, float:1.0639E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x012e
            r0 = 2131431959(0x7f0b1217, float:1.8485662E38)
            X.1RJ r0 = X.C36341k9.A0X(r13, r0)
            android.view.View r1 = X.C36391kE.A0L(r0, r2)
            r0 = 2131431960(0x7f0b1218, float:1.8485664E38)
            android.widget.TextView r5 = X.C36391kE.A0P(r1, r0)
            X.1e1 r4 = r11.A02
            if (r4 == 0) goto L_0x0190
            X.01I r3 = r11.A0h()
            r1 = 2131891421(0x7f1214dd, float:1.9417562E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r2 = X.C36401kF.A0q(r11, r6, r0, r2, r1)
            r1 = 37
            X.72o r0 = new X.72o
            r0.<init>(r11, r1)
            android.text.SpannableStringBuilder r0 = r4.A02(r3, r0, r2, r6)
            r5.setText(r0)
            X.0yC r0 = r11.A01
            if (r0 == 0) goto L_0x018b
            X.C36331k8.A10(r5, r0)
        L_0x012e:
            return
        L_0x012f:
            boolean r0 = r2 instanceof X.C180768mM
            if (r0 == 0) goto L_0x0170
            X.00T r0 = r11.A06
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 != 0) goto L_0x0174
            X.1e1 r5 = r11.A02
            if (r5 == 0) goto L_0x01b3
            X.01I r6 = r11.A0h()
            r4 = 2131889935(0x7f120f0f, float:1.9414548E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = 0
            java.lang.String r9 = "bottom-sheet-span"
            java.lang.String r8 = X.C36401kF.A0q(r11, r9, r2, r0, r4)
            X.01I r0 = r11.A0h()
            int r10 = X.C36341k9.A05(r0)
            r0 = 38
            X.72o r7 = new X.72o
            r7.<init>(r11, r0)
            android.text.SpannableStringBuilder r0 = r5.A03(r6, r7, r8, r9, r10)
            r3.setText(r0)
            X.0yC r0 = r11.A01
            if (r0 == 0) goto L_0x01ae
            X.C36331k8.A10(r3, r0)
            goto L_0x0086
        L_0x0170:
            boolean r0 = r2 instanceof X.C180758mL
            if (r0 == 0) goto L_0x0086
        L_0x0174:
            r0 = 2131891430(0x7f1214e6, float:1.941758E38)
            goto L_0x0083
        L_0x0179:
            boolean r0 = r2 instanceof X.C180768mM
            if (r0 == 0) goto L_0x0182
            r0 = 2131889938(0x7f120f12, float:1.9414554E38)
            goto L_0x005b
        L_0x0182:
            boolean r0 = r2 instanceof X.C180758mL
            if (r0 == 0) goto L_0x01b8
            r0 = 2131891426(0x7f1214e2, float:1.9417572E38)
            goto L_0x005b
        L_0x018b:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0190:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x0195:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x019a:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x019f:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x01a4:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x01a9:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x01ae:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x01b3:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x01b8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesFragment.A1S(android.os.Bundle, android.view.View):void");
    }
}
