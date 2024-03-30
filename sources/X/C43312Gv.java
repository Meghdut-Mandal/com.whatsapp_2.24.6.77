package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.2Gv  reason: invalid class name and case insensitive filesystem */
public final class C43312Gv extends AnonymousClass28d {
    public View A00;
    public final AnonymousClass1K3 A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new AnonymousClass48A(this));
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass48B(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass48E(this));

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityCreated(activity, bundle);
        C135506co r1 = new C135506co(activity, this, 19);
        A0E(r1);
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener(r1);
        }
    }

    public void A0C() {
        if (this.A0L) {
            super.A0C();
            return;
        }
        View findViewById = A07().findViewById(R.id.whatsapp_toolbar_home);
        if (findViewById != null) {
            C33521fV.A02(findViewById);
            findViewById.setOnClickListener(this.A0T);
            this.A01 = findViewById;
        }
    }

    public void A0G(AnonymousClass141 r4) {
        super.A0G(r4);
        Configuration configuration = this.A00;
        if (configuration != null) {
            if (AnonymousClass000.A1S(configuration.orientation, 2)) {
                A08().post(new AVW(this, 43));
            }
            C34831hi r1 = AnonymousClass28d.A00(this).A09;
            r1.A0D(r1.A04());
            if (!this.A0L) {
                A09().setOnClickListener(this.A0T);
                return;
            }
            return;
        }
        throw C36331k8.A0d("currentConfig");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C43312Gv(X.AnonymousClass01L r43, X.C32621dv r44, X.AnonymousClass17Y r45, X.C19730wQ r46, X.AnonymousClass1LI r47, X.AnonymousClass3CG r48, X.C26421Kc r49, X.AnonymousClass1K3 r50, X.C24361Cd r51, X.AnonymousClass1Pp r52, X.AnonymousClass16I r53, X.AnonymousClass171 r54, X.C27761Ps r55, X.C18820ts r56, X.AnonymousClass1A5 r57, X.AnonymousClass141 r58, X.AnonymousClass1H2 r59, X.C20810yC r60, X.C233117z r61, X.AnonymousClass11F r62, X.AnonymousClass1EM r63, X.AnonymousClass13J r64, X.C19770wU r65) {
        /*
            r42 = this;
            r19 = r46
            r4 = r62
            r1 = r65
            r6 = r60
            r7 = r59
            r40 = r45
            r2 = r19
            r0 = r40
            X.C36321k7.A1B(r6, r0, r2, r1, r7)
            r11 = r54
            r15 = r52
            r2 = r64
            r3 = r63
            r41 = r44
            r0 = r41
            X.C36321k7.A1C(r15, r0, r3, r2, r11)
            r0 = 11
            r9 = r56
            X.AnonymousClass00C.A0D(r9, r0)
            r10 = r55
            r12 = r53
            r16 = r51
            r13 = r50
            r17 = r49
            r5 = r17
            r0 = r16
            X.C36321k7.A1D(r12, r13, r0, r5, r10)
            r5 = r61
            r8 = r57
            X.C36361kB.A1M(r8, r5)
            r14 = 19
            r18 = r47
            r0 = r18
            X.AnonymousClass00C.A0D(r0, r14)
            r29 = 0
            r0 = r42
            r21 = r48
            r31 = r58
            r14 = r43
            r27 = r10
            r28 = r9
            r30 = r8
            r32 = r7
            r33 = r6
            r34 = r5
            r35 = r4
            r36 = r3
            r37 = r2
            r38 = r1
            r39 = r29
            r20 = r18
            r22 = r17
            r23 = r16
            r24 = r15
            r25 = r12
            r26 = r11
            r15 = r0
            r16 = r14
            r17 = r41
            r18 = r40
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0.A01 = r13
            X.48C r5 = new X.48C
            r5.<init>(r14)
            java.lang.Class<com.whatsapp.bonsai.BonsaiConversationTitleViewModel> r1 = com.whatsapp.bonsai.BonsaiConversationTitleViewModel.class
            X.08f r3 = X.C36441kJ.A1A(r1)
            X.48D r2 = new X.48D
            r2.<init>(r14)
            X.4El r1 = new X.4El
            r1.<init>(r14)
            X.0iI r1 = X.C36441kJ.A0a(r2, r5, r1, r3)
            r0.A03 = r1
            X.48A r1 = new X.48A
            r1.<init>(r0)
            X.00U r1 = X.C36431kI.A1I(r1)
            r0.A02 = r1
            X.48E r1 = new X.48E
            r1.<init>(r0)
            X.00U r1 = X.C36431kI.A1I(r1)
            r0.A05 = r1
            X.48B r1 = new X.48B
            r1.<init>(r0)
            X.00U r1 = X.C36431kI.A1I(r1)
            r0.A04 = r1
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r2 = X.AnonymousClass28d.A00(r0)
            boolean r1 = r4 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x00de
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r2.A01 = r4
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel.A02(r2)
            X.1DP r3 = r2.A06
            java.lang.Iterable r1 = X.C36421kH.A0X(r3)
            X.2Wx r2 = r2.A04
            boolean r1 = X.C007103b.A0j(r1, r2)
            if (r1 != 0) goto L_0x00de
            r3.registerObserver(r2)
        L_0x00de:
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r0)
            X.00s r3 = r1.A03
            r1 = 0
            X.2qm r2 = X.C53102qm.A02(r0, r1)
            r1 = 23
            X.C55492ui.A01(r14, r3, r2, r1)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r0)
            X.1hi r3 = r1.A09
            r1 = 1
            X.2qm r2 = X.C53102qm.A02(r0, r1)
            r1 = 22
            X.C55492ui.A01(r14, r3, r2, r1)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r0)
            X.1hi r3 = r1.A08
            r1 = 2
            X.2qm r2 = X.C53102qm.A02(r0, r1)
            r1 = 25
            X.C55492ui.A01(r14, r3, r2, r1)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r0)
            X.1hi r3 = r1.A0A
            r1 = 3
            X.2qm r2 = X.C53102qm.A02(r0, r1)
            r1 = 24
            X.C55492ui.A01(r14, r3, r2, r1)
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r1 = X.AnonymousClass28d.A00(r0)
            X.1hi r2 = r1.A07
            r1 = 4
            X.2qm r1 = X.C53102qm.A02(r0, r1)
            r0 = 21
            X.C55492ui.A01(r14, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43312Gv.<init>(X.01L, X.1dv, X.17Y, X.0wQ, X.1LI, X.3CG, X.1Kc, X.1K3, X.1Cd, X.1Pp, X.16I, X.171, X.1Ps, X.0ts, X.1A5, X.141, X.1H2, X.0yC, X.17z, X.11F, X.1EM, X.13J, X.0wU):void");
    }
}
