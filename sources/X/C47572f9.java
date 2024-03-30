package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collections;

/* renamed from: X.2f9  reason: invalid class name and case insensitive filesystem */
public class C47572f9 extends C47582fA {
    public boolean A00;
    public C49082iX A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final WfalManager A04;
    public final AnonymousClass3NN A05;
    public final C19980wp A06;
    public final C19420v0 A07;
    public final C18820ts A08;
    public final C25361Fz A09;
    public final AnonymousClass37S A0A;
    public final C32421dW A0B;
    public final C35011i0 A0C;
    public final C28781Ua A0D;
    public final boolean A0E;
    public final C19460v5 A0F;
    public final C19460v5 A0G;
    public final C19460v5 A0H;
    public final C24361Cd A0I;
    public final AnonymousClass16D A0J;
    public final AnonymousClass16I A0K;
    public final AnonymousClass171 A0L;
    public final C27731Pn A0M;
    public final C19970wo A0N;
    public final AnonymousClass191 A0O = C90394a5.A00(this, 33);
    public final AnonymousClass16J A0P;
    public final C233117z A0Q;
    public final AnonymousClass334 A0R = new AnonymousClass334(this);
    public final AnonymousClass33O A0S;

    public static void A00(C47572f9 r2) {
        C36331k8.A1E(r2.A01);
        C49082iX r1 = new C49082iX(r2);
        r2.A01 = r1;
        C36331k8.A1F(r1, r2.A0N);
    }

    public View A0C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Boolean bool;
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0C2 = super.A0C(layoutInflater2, viewGroup);
        C18740tg.A04(A0C2);
        AnonymousClass2f7 A0S2 = A0S();
        A0S2.A0E.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C65103Qt.A01(A0S2.A0E.getContext(), 76.0f));
        layoutParams.gravity = 1;
        A0S2.A0E.setLayoutParams(layoutParams);
        A0S2.A0E.setBackgroundResource(R.drawable.ic_center_shadow);
        layoutInflater2.inflate(R.layout.f9nameremoved, A0S2.A0E, true);
        C27731Pn r17 = this.A0M;
        C19420v0 r19 = this.A07;
        AnonymousClass33O r16 = this.A0S;
        ViewGroup viewGroup2 = A0S2.A0D;
        C19970wo r14 = this.A0N;
        AnonymousClass17Y r13 = this.A02;
        C28781Ua r11 = this.A0D;
        AnonymousClass16D r10 = this.A0J;
        AnonymousClass171 r9 = this.A0L;
        C18820ts r8 = this.A08;
        AnonymousClass16I r7 = this.A0K;
        WfalManager wfalManager = this.A04;
        C24361Cd r5 = this.A0I;
        C233117z r4 = this.A0Q;
        AnonymousClass334 r1 = this.A0R;
        if (r11.A02()) {
            bool = Boolean.valueOf(this.A0C.A07(3, Collections.singletonList(this.A05)));
        } else {
            bool = null;
        }
        AnonymousClass33O r23 = r16;
        C28781Ua r24 = r11;
        AnonymousClass17Y r112 = r13;
        WfalManager wfalManager2 = wfalManager;
        C24361Cd r132 = r5;
        AnonymousClass16D r142 = r10;
        AnonymousClass16I r15 = r7;
        ViewGroup viewGroup3 = viewGroup2;
        A0S2.A08 = new AnonymousClass3PF(viewGroup3, r112, wfalManager2, r132, r142, r15, r9, r17, r14, r19, r8, r4, r1, r23, r24, bool);
        A0S2.A06 = C36391kE.A0N(A0C2, R.id.status_playback_views_icon);
        A0S2.A07 = C36391kE.A0P(A0C2, R.id.read_receipt_counter);
        A0S2.A01 = A0C2.findViewById(R.id.delete);
        A0S2.A02 = A0C2.findViewById(R.id.forward);
        A0S2.A04 = A0C2.findViewById(R.id.more);
        A0S2.A03 = A0S2.A0D.findViewById(R.id.list_container);
        A0S2.A00 = A0C2.findViewById(R.id.ad_creation_button);
        A0S2.A05 = A0C2.findViewById(R.id.share_button);
        return A0C2;
    }

    public void A0J() {
        if (this.A00) {
            super.A0J();
        }
    }

    public AnonymousClass2f7 A0S() {
        AnonymousClass3BK r0 = this.A02;
        if (r0 == null) {
            r0 = new AnonymousClass2f7();
            this.A02 = r0;
        }
        return (AnonymousClass2f7) r0;
    }

    public void A06() {
        super.A06();
        AnonymousClass3PF r2 = A0S().A08;
        if (r2 != null) {
            ((AnonymousClass1RY) r2.A0N.getValue()).A02();
            r2.A0D.unregisterObserver(r2.A0C);
            r2.A0A.unregisterObserver(r2.A09);
            r2.A0I.unregisterObserver(r2.A0H);
            r2.A06.A0G(r2.A0M);
            r2.A02 = true;
        }
        C49082iX r1 = this.A01;
        if (r1 != null) {
            r1.A0D(true);
            this.A01 = null;
        }
        this.A0P.unregisterObserver(this.A0O);
    }

    public void A0K(int i) {
        AnonymousClass3PF r0;
        super.A0K(i);
        if (i == 3 && (r0 = A0S().A08) != null) {
            r0.A07.sendAccessibilityEvent(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0127, code lost:
        if (X.C65703Td.A04((X.C46932bu) r3) == false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(android.view.View r9) {
        /*
            r8 = this;
            super.A0N(r9)
            X.2f7 r5 = r8.A0S()
            android.view.ViewGroup r3 = r5.A0D
            int r2 = r3.getPaddingLeft()
            android.view.ViewGroup r0 = r5.A0D
            int r1 = r0.getPaddingTop()
            android.view.ViewGroup r0 = r5.A0D
            int r0 = r0.getPaddingRight()
            r6 = 0
            r3.setPadding(r2, r1, r0, r6)
            android.view.View r1 = r5.A0B
            r0 = 14
            X.C67103Yn.A00(r1, r8, r0)
            android.view.ViewGroup r1 = r5.A0E
            r0 = 12
            X.C48772i1.A00(r1, r8, r0)
            android.view.View r0 = r5.A04
            r4 = 8
            if (r0 == 0) goto L_0x008b
            X.1Ua r2 = r8.A0D
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x008b
            android.view.View r1 = r5.A04
            r0 = 16
            X.C48772i1.A00(r1, r8, r0)
            X.3PF r0 = r5.A08
            android.view.ViewStub r1 = r0.A03
            X.1i0 r3 = r8.A0C
            X.3T1 r0 = r8.A05
            boolean r0 = r3.A09(r0)
            if (r0 == 0) goto L_0x0087
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0087
            X.AnonymousClass00C.A0D(r1, r6)
            r0 = 2131626619(0x7f0e0a7b, float:1.888048E38)
            android.view.View r1 = X.C36401kF.A0E(r1, r0)
            X.AnonymousClass00C.A08(r1)
            r0 = 2131435391(0x7f0b1f7f, float:1.8492623E38)
            android.view.View r2 = X.C012005e.A02(r1, r0)
            r0 = 6
            X.1iB r1 = new X.1iB
            r1.<init>(r3, r0)
        L_0x006e:
            r2.setOnClickListener(r1)
        L_0x0071:
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x00cd
            X.0v5 r1 = r8.A0H
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00c8
            r1.A02()
            java.lang.String r0 = "logStatusEntryPointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0087:
            r1.setVisibility(r4)
            goto L_0x0071
        L_0x008b:
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x00b4
            X.0wQ r0 = r8.A03
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x00c0
            X.0wp r0 = r8.A06
            android.content.SharedPreferences r1 = X.C19980wp.A00(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x00af
            X.0yC r1 = r8.A0G
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00c0
        L_0x00af:
            android.view.View r0 = r5.A01
            r0.setVisibility(r4)
        L_0x00b4:
            android.view.View r2 = r5.A02
            if (r2 == 0) goto L_0x0071
            r0 = 18
            X.2i1 r1 = new X.2i1
            r1.<init>(r8, r0)
            goto L_0x006e
        L_0x00c0:
            android.view.View r1 = r5.A01
            r0 = 17
            X.C48772i1.A00(r1, r8, r0)
            goto L_0x00b4
        L_0x00c8:
            r0 = 19
            X.C48772i1.A00(r2, r8, r0)
        L_0x00cd:
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0115
            X.1Fz r0 = r8.A09
            X.3T1 r7 = r8.A05
            boolean r0 = r0.A03(r7)
            if (r0 == 0) goto L_0x015e
            X.3NN r3 = r8.A05
            java.lang.Integer r0 = X.C36371kC.A0o()
            X.2QN r2 = new X.2QN
            r2.<init>()
            r2.A01 = r0
            X.3Qa r1 = r7.A1J
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.AnonymousClass3NN.A00(r7)
            r2.A02 = r0
            X.11F r0 = r1.A00
            int r0 = X.C28381Sl.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.0yW r0 = r3.A00
            r0.Bly(r2)
            android.view.View r0 = r5.A05
            r0.setVisibility(r6)
        L_0x010e:
            android.view.View r1 = r5.A05
            r0 = 20
            X.C48772i1.A00(r1, r8, r0)
        L_0x0115:
            A00(r8)
            X.3T1 r3 = r8.A05
            boolean r0 = r3 instanceof X.C181798o3
            r2 = 1
            if (r0 == 0) goto L_0x0129
            r0 = r3
            X.2bu r0 = (X.C46932bu) r0
            boolean r1 = X.C65703Td.A04(r0)
            r0 = 1
            if (r1 != 0) goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            r8.A00 = r0
            boolean r0 = r3 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x015c
            r0 = r3
            X.2bU r0 = (X.AnonymousClass2bU) r0
            boolean r0 = X.C54732tQ.A00(r0)
            if (r0 == 0) goto L_0x015c
        L_0x0139:
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0155
            if (r2 != 0) goto L_0x0155
            r8.A0R()
        L_0x0142:
            boolean r0 = X.C66013Ui.A0n(r3)
            if (r0 == 0) goto L_0x014d
            android.view.ViewGroup r0 = r5.A0D
            r0.setVisibility(r4)
        L_0x014d:
            X.16J r1 = r8.A0P
            X.191 r0 = r8.A0O
            r1.registerObserver(r0)
            return
        L_0x0155:
            r8.A0Q(r6)
            r8.A0J()
            goto L_0x0142
        L_0x015c:
            r2 = 0
            goto L_0x0139
        L_0x015e:
            android.view.View r0 = r5.A05
            r0.setVisibility(r4)
            goto L_0x010e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47572f9.A0N(android.view.View):void");
    }

    public void A0O(boolean z) {
        super.A0O(z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47572f9(X.C19460v5 r34, X.C19460v5 r35, X.C19460v5 r36, X.C24791Du r37, X.C24801Dv r38, X.AnonymousClass17Y r39, X.C19730wQ r40, X.AnonymousClass1XY r41, X.AnonymousClass1X4 r42, com.whatsapp.bridge.wfal.WfalManager r43, X.C24361Cd r44, X.AnonymousClass16D r45, X.AnonymousClass16I r46, X.AnonymousClass171 r47, X.AnonymousClass1RY r48, X.C27731Pn r49, X.AnonymousClass3NN r50, X.C19980wp r51, X.C21060yb r52, X.C19970wo r53, X.C19420v0 r54, X.C18820ts r55, X.C20310xM r56, X.AnonymousClass16J r57, X.C32731e6 r58, X.AnonymousClass1QO r59, X.AnonymousClass16E r60, X.AnonymousClass1DW r61, X.C20810yC r62, X.C25361Fz r63, X.C233117z r64, X.AnonymousClass2XH r65, X.AnonymousClass1Y4 r66, X.AnonymousClass1SU r67, X.AnonymousClass1GQ r68, X.AnonymousClass3T1 r69, X.AnonymousClass1AW r70, X.AnonymousClass1EO r71, X.AnonymousClass1CR r72, X.AnonymousClass37S r73, X.C29731Xt r74, X.C65553Sn r75, X.AnonymousClass3BQ r76, X.AnonymousClass3JQ r77, X.AnonymousClass1A1 r78, X.AnonymousClass1X7 r79, X.C19770wU r80, X.C65813To r81, X.C32421dW r82, X.AnonymousClass33O r83, X.C35011i0 r84, X.C28781Ua r85) {
        /*
            r33 = this;
            r2 = r33
            r17 = r62
            r16 = r61
            r15 = r60
            r14 = r59
            r13 = r58
            r12 = r56
            r11 = r55
            r10 = r53
            r9 = r52
            r8 = r48
            r3 = r37
            r4 = r38
            r5 = r39
            r25 = r74
            r26 = r75
            r27 = r76
            r28 = r77
            r29 = r78
            r30 = r79
            r31 = r80
            r32 = r81
            r24 = r72
            r23 = r71
            r7 = r42
            r22 = r70
            r6 = r41
            r21 = r69
            r20 = r67
            r19 = r66
            r18 = r65
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = 33
            X.4a5 r0 = X.C90394a5.A00(r2, r0)
            r2.A0O = r0
            X.334 r0 = new X.334
            r0.<init>(r2)
            r2.A0R = r0
            r2.A0N = r10
            r2.A02 = r5
            r0 = r40
            r2.A03 = r0
            r0 = r85
            r2.A0D = r0
            r0 = r49
            r2.A0M = r0
            r0 = r45
            r2.A0J = r0
            r0 = r47
            r2.A0L = r0
            r2.A08 = r11
            r0 = r46
            r2.A0K = r0
            r0 = r57
            r2.A0P = r0
            r0 = r43
            r2.A04 = r0
            r0 = r44
            r2.A0I = r0
            r0 = r54
            r2.A07 = r0
            r0 = r84
            r2.A0C = r0
            r0 = r82
            r2.A0B = r0
            r0 = r64
            r2.A0Q = r0
            r0 = r83
            r2.A0S = r0
            r0 = r51
            r2.A06 = r0
            boolean r0 = X.C36391kE.A1Z(r68)
            r2.A0E = r0
            r0 = r63
            r2.A09 = r0
            r0 = r73
            r2.A0A = r0
            r0 = r34
            r2.A0H = r0
            r0 = r35
            r2.A0G = r0
            r0 = r50
            r2.A05 = r0
            X.3T1 r1 = r2.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = r36
            r2.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47572f9.<init>(X.0v5, X.0v5, X.0v5, X.1Du, X.1Dv, X.17Y, X.0wQ, X.1XY, X.1X4, com.whatsapp.bridge.wfal.WfalManager, X.1Cd, X.16D, X.16I, X.171, X.1RY, X.1Pn, X.3NN, X.0wp, X.0yb, X.0wo, X.0v0, X.0ts, X.0xM, X.16J, X.1e6, X.1QO, X.16E, X.1DW, X.0yC, X.1Fz, X.17z, X.2XH, X.1Y4, X.1SU, X.1GQ, X.3T1, X.1AW, X.1EO, X.1CR, X.37S, X.1Xt, X.3Sn, X.3BQ, X.3JQ, X.1A1, X.1X7, X.0wU, X.3To, X.1dW, X.33O, X.1i0, X.1Ua):void");
    }
}
