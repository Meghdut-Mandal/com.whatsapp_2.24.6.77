package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import java.util.Collection;

/* renamed from: X.2Gy  reason: invalid class name and case insensitive filesystem */
public final class C43332Gy extends AnonymousClass28d implements AnonymousClass1JB {
    public C44072La A00;
    public boolean A01;
    public boolean A02;
    public NewsletterViewModel A03;
    public boolean A04;
    public final C19970wo A05;
    public final C64633Ov A06;
    public final AnonymousClass3G3 A07;

    public void BQH(AnonymousClass11F r1) {
    }

    public void BQI() {
    }

    public void BQJ(AnonymousClass11F r2, boolean z) {
        AnonymousClass00C.A0D(r2, 0);
        if (AnonymousClass00C.A0J(this.A0e, r2)) {
            A03();
            A0B();
        }
    }

    public void BQK(AnonymousClass11F r1, Collection collection, int i) {
    }

    public void BQL(AnonymousClass11F r1) {
    }

    public void BQM(AnonymousClass11F r1) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityCreated(activity, bundle);
        if (!this.A04) {
            A0B();
            A0E(new AnonymousClass3YF(this, activity, 2));
            C33521fV.A03(A08(), R.string.f12nameremoved);
            C36331k8.A0y(this.A0G);
            NewsletterViewModel newsletterViewModel = this.A03;
            if (newsletterViewModel != null) {
                AnonymousClass08S A0U = newsletterViewModel.A0U();
                AnonymousClass01L r2 = this.A0U;
                AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
                C88554Td.A00(r2, A0U, new C85984Je(this), 22);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityDestroyed(activity);
        NewsletterViewModel newsletterViewModel = this.A03;
        if (newsletterViewModel != null) {
            AnonymousClass01L r1 = this.A0U;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            r1.A06.A05(newsletterViewModel);
        }
    }

    public static final String A02(C43332Gy r6) {
        C44072La r0 = r6.A00;
        if (r0 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        C64633Ov r02 = r6.A06;
        int A002 = C64633Ov.A00(r02, (int) r0.A07);
        String A012 = r02.A01(A002);
        AnonymousClass00C.A0D(A012, 1);
        String quantityString = r6.A0U.getResources().getQuantityString(R.plurals.f10nameremoved, A002, C36431kI.A1Z(A012, 1));
        AnonymousClass00C.A08(quantityString);
        return quantityString;
    }

    private final void A03() {
        NewsletterViewModel newsletterViewModel;
        if (this.A00 == null && (newsletterViewModel = this.A03) != null) {
            this.A00 = AnonymousClass3IZ.A00(newsletterViewModel);
            A05(this, AnonymousClass3IZ.A00(newsletterViewModel));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C43332Gy r4) {
        /*
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00a0
            X.3G3 r1 = r4.A07
            X.2La r0 = r4.A00
            java.lang.String r3 = "newsletterInfo"
            if (r0 != 0) goto L_0x0011
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0011:
            boolean r0 = r1.A00(r0)
            com.whatsapp.TextEmojiLabel r2 = r4.A0A()
            if (r0 == 0) goto L_0x0021
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0021:
            X.2La r0 = r4.A00
            if (r0 != 0) goto L_0x002a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x002a:
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x004b
            X.01L r1 = r4.A0U
            r0 = 2131891347(0x7f121493, float:1.9417411E38)
        L_0x0033:
            java.lang.String r0 = X.C36361kB.A0m(r1, r0)
        L_0x0037:
            r2.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r4.A0A()
            r0 = 0
            r1.setVisibility(r0)
            X.2La r0 = r4.A00
            if (r0 != 0) goto L_0x005a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x004b:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = A02(r4)
            goto L_0x0037
        L_0x0054:
            X.01L r1 = r4.A0U
            r0 = 2131891569(0x7f121571, float:1.9417862E38)
            goto L_0x0033
        L_0x005a:
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00a0
            r0 = 1
            r4.A02 = r0
            r4.A01 = r0
            com.whatsapp.TextEmojiLabel r1 = r4.A0A()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            com.whatsapp.TextEmojiLabel r0 = r4.A0A()
            android.view.ViewPropertyAnimator r1 = r0.animate()
            if (r1 == 0) goto L_0x00a0
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            if (r2 == 0) goto L_0x00a0
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L_0x00a0
            r0 = 2000(0x7d0, double:9.88E-321)
            android.view.ViewPropertyAnimator r1 = r2.setStartDelay(r0)
            if (r1 == 0) goto L_0x00a0
            r0 = 40
            X.3v3 r0 = X.C80223v3.A00(r4, r0)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            if (r0 == 0) goto L_0x00a0
            r0.start()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43332Gy.A04(X.2Gy):void");
    }

    public static final void A05(C43332Gy r5, C44072La r6) {
        C44072La r3 = r5.A00;
        if (r3 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        r5.A00 = r6;
        if (AnonymousClass00C.A0J(r3.A0K, r6.A0K) && r3.A0F == r6.A0F && r3.A0E == r6.A0E) {
            long j = r3.A07;
            C44072La r0 = r5.A00;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfo");
            } else if (j == r0.A07) {
                return;
            }
        }
        A04(r5);
    }

    public void A0H() {
        super.A0H();
        A03();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43332Gy(X.AnonymousClass01L r42, X.C32621dv r43, X.C57572yS r44, X.AnonymousClass17Y r45, X.C19730wQ r46, X.AnonymousClass1LI r47, X.AnonymousClass3CG r48, X.C26421Kc r49, X.C24361Cd r50, X.AnonymousClass1Pp r51, X.AnonymousClass16I r52, X.AnonymousClass171 r53, X.C27761Ps r54, X.C19970wo r55, X.C18820ts r56, X.C220412q r57, X.AnonymousClass1A5 r58, X.AnonymousClass141 r59, X.AnonymousClass1H2 r60, X.C20810yC r61, X.C233117z r62, X.C28981Uw r63, X.C64633Ov r64, X.AnonymousClass3G3 r65, X.AnonymousClass1EM r66, X.AnonymousClass13J r67, X.C19770wU r68, java.lang.String r69) {
        /*
            r41 = this;
            r1 = 1
            r40 = r42
            r0 = r40
            X.AnonymousClass00C.A0D(r0, r1)
            r0 = 3
            r7 = r63
            r11 = r59
            X.C36331k8.A1G(r7, r0, r11)
            r19 = r46
            r18 = r45
            r2 = r68
            r9 = r61
            r12 = r57
            r3 = r18
            r0 = r19
            X.C36321k7.A1C(r9, r3, r0, r2, r12)
            r0 = 11
            r10 = r60
            X.AnonymousClass00C.A0D(r10, r0)
            r26 = r53
            r24 = r51
            r17 = r43
            r16 = r56
            r3 = r67
            r6 = r16
            r5 = r24
            r4 = r17
            r0 = r26
            X.C36321k7.A1D(r5, r4, r3, r0, r6)
            r27 = r54
            r25 = r52
            r23 = r50
            r22 = r49
            r4 = r66
            r8 = r25
            r6 = r23
            r5 = r22
            r0 = r27
            X.C36321k7.A1E(r4, r8, r6, r5, r0)
            r0 = 22
            r15 = r58
            X.AnonymousClass00C.A0D(r15, r0)
            r20 = r47
            r14 = r44
            r13 = r55
            r6 = r64
            r8 = r62
            r0 = r20
            X.C36331k8.A1K(r8, r14, r0, r13, r6)
            r0 = 28
            r5 = r65
            X.AnonymousClass00C.A0D(r5, r0)
            r29 = 0
            r0 = r41
            r21 = r48
            r39 = r69
            r28 = r16
            r30 = r15
            r31 = r11
            r32 = r10
            r33 = r9
            r34 = r8
            r35 = r7
            r36 = r4
            r37 = r3
            r38 = r2
            r15 = r0
            r16 = r40
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0.A05 = r13
            r0.A06 = r6
            r0.A07 = r5
            X.141 r2 = r0.A0I
            X.11F r2 = r2.A0H
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r2, r3)
            X.3Qp r2 = X.C36371kC.A0W(r12, r2)
            if (r2 == 0) goto L_0x00bf
            X.01L r1 = r0.A0U
            X.14u r2 = X.C36401kF.A0L(r1)
            X.141 r1 = r0.A0I
            X.11F r1 = r1.A0H
            X.AnonymousClass00C.A0E(r1, r3)
            X.1Uw r1 = (X.C28981Uw) r1
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r1 = X.C54902tk.A00(r14, r2, r1)
            r0.A03 = r1
            r0.A03()
            return
        L_0x00bf:
            r0.A04 = r1
            X.01L r0 = r0.A0U
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43332Gy.<init>(X.01L, X.1dv, X.2yS, X.17Y, X.0wQ, X.1LI, X.3CG, X.1Kc, X.1Cd, X.1Pp, X.16I, X.171, X.1Ps, X.0wo, X.0ts, X.12q, X.1A5, X.141, X.1H2, X.0yC, X.17z, X.1Uw, X.3Ov, X.3G3, X.1EM, X.13J, X.0wU, java.lang.String):void");
    }
}
