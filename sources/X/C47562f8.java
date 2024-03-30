package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.2f8  reason: invalid class name and case insensitive filesystem */
public class C47562f8 extends C47582fA {
    public AnonymousClass2j9 A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass191 A03 = new C71863hS(this);
    public final AnonymousClass16J A04;
    public final C20810yC A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47562f8(X.C24791Du r34, X.C24801Dv r35, X.AnonymousClass17Y r36, X.AnonymousClass1XY r37, X.AnonymousClass1X4 r38, X.AnonymousClass16D r39, X.AnonymousClass171 r40, X.AnonymousClass1RY r41, X.C21060yb r42, X.C19970wo r43, X.C18820ts r44, X.C20310xM r45, X.AnonymousClass16J r46, X.C32731e6 r47, X.AnonymousClass1QO r48, X.AnonymousClass16E r49, X.AnonymousClass1DW r50, X.C20810yC r51, X.AnonymousClass2XH r52, X.AnonymousClass1Y4 r53, X.AnonymousClass1SU r54, X.AnonymousClass3T1 r55, X.AnonymousClass1AW r56, X.AnonymousClass1EO r57, X.AnonymousClass1CR r58, X.C29731Xt r59, X.C65553Sn r60, X.AnonymousClass3BQ r61, X.AnonymousClass3JQ r62, X.AnonymousClass1A1 r63, X.AnonymousClass1X7 r64, X.C19770wU r65, X.C65813To r66, boolean r67) {
        /*
            r33 = this;
            r27 = r61
            r26 = r60
            r25 = r59
            r24 = r58
            r23 = r57
            r22 = r56
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r28 = r62
            r2 = r33
            r29 = r63
            r3 = r34
            r30 = r64
            r4 = r35
            r31 = r65
            r5 = r36
            r32 = r66
            r6 = r37
            r8 = r41
            r7 = r38
            r13 = r47
            r14 = r48
            r15 = r49
            r16 = r50
            r1 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r17 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.3hS r0 = new X.3hS
            r0.<init>(r2)
            r2.A03 = r0
            r2.A05 = r1
            r0 = r39
            r2.A01 = r0
            r0 = r40
            r2.A02 = r0
            r0 = r46
            r2.A04 = r0
            r0 = r67
            r2.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47562f8.<init>(X.1Du, X.1Dv, X.17Y, X.1XY, X.1X4, X.16D, X.171, X.1RY, X.0yb, X.0wo, X.0ts, X.0xM, X.16J, X.1e6, X.1QO, X.16E, X.1DW, X.0yC, X.2XH, X.1Y4, X.1SU, X.3T1, X.1AW, X.1EO, X.1CR, X.1Xt, X.3Sn, X.3BQ, X.3JQ, X.1A1, X.1X7, X.0wU, X.3To, boolean):void");
    }

    private void A00(View view) {
        AnonymousClass11F A0J = this.A05.A0J();
        if (A0J != null) {
            String A0L = this.A02.A0L(this.A01.A0D(A0J));
            View view2 = this.A00;
            C18740tg.A04(view2);
            C33521fV.A06(view, C36321k7.A0A(view2.getContext(), A0L, R.string.f12nameremoved));
        }
    }

    public static void A01(C47562f8 r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("playbackPage/reply page=");
        A0u.append(r4);
        A0u.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = r4.A0H.A01;
        C36321k7.A1N(statusPlaybackBaseFragment, A0u);
        View view = r4.A00;
        C18740tg.A04(view);
        C225314u r0 = (C225314u) C36361kB.A05(view);
        if (r0 == null || !r0.BLh()) {
            r4.A0G();
            r4.A02.A08.setVisibility(8);
            r4.A02.A0G.A03(8);
            View view2 = r4.A00;
            C18740tg.A04(view2);
            Context context = view2.getContext();
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(context.getPackageName(), "com.whatsapp.status.playback.StatusReplyActivity");
            AnonymousClass3UJ.A00(A0D, r4.A05.A1J);
            A0D.putExtra("isStatusReply", true);
            AnonymousClass01I A0h = statusPlaybackBaseFragment.A0h();
            if (A0h == null || A0h.isFinishing()) {
                View view3 = r4.A00;
                C18740tg.A04(view3);
                C36371kC.A16(A0D, view3);
                return;
            }
            if (r4.A05.A0E(1455)) {
                A0h.getWindow().setSoftInputMode(48);
            }
            A0h.startActivityForResult(A0D, 10);
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("playbackPage/reply reply-already-ended page=");
        A0u2.append(r4);
        C36321k7.A1K(statusPlaybackBaseFragment, "; host=", A0u2);
    }

    public void A06() {
        super.A06();
        this.A04.unregisterObserver(this.A03);
    }

    public void A0F() {
        super.A0F();
        AnonymousClass2j9 r1 = this.A00;
        if (r1 != null) {
            r1.A0D(true);
            this.A00 = null;
        }
        AnonymousClass3T1 r12 = this.A05;
        C79773uG r4 = new C79773uG(r12, A0E());
        AnonymousClass1A1 r3 = this.A0J;
        C65813To r2 = this.A0O;
        AnonymousClass11F A0J = r12.A0J();
        C18740tg.A06(A0J);
        AnonymousClass2j9 r13 = new AnonymousClass2j9(A0J, r3, r4, r2);
        this.A00 = r13;
        C36331k8.A1F(r13, this.A0N);
    }

    public void A0H() {
        super.A0H();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior.A0J != 4) {
            bottomSheetBehavior.A0W(4);
        } else {
            this.A02.A0B.setVisibility(8);
            this.A02.A0B.setAlpha(0.0f);
        }
        boolean z = this.A00;
        AnonymousClass3BK r0 = this.A02;
        if (z) {
            r0.A0G.A03(0);
        } else {
            r0.A08.setVisibility(0);
        }
    }

    public void A0K(int i) {
        super.A0K(i);
        if (i == 3) {
            A01(this);
        }
    }

    public void A0N(View view) {
        View view2;
        int i;
        super.A0N(view);
        AnonymousClass3BK A0E = A0E();
        ViewGroup viewGroup = A0E.A0D;
        AnonymousClass3T1 r3 = this.A05;
        boolean z = false;
        viewGroup.setVisibility(C36381kD.A00(r3.A0J() instanceof C177638e7 ? 1 : 0));
        boolean z2 = this.A00;
        AnonymousClass1RJ r0 = A0E.A0G;
        if (z2) {
            r0.A03(0);
            A0E.A0E.setVisibility(8);
            A00(A0E.A0G.A01());
            view2 = A0E.A0G.A01().findViewById(R.id.reply_bar_tappable);
            i = 32;
        } else {
            r0.A03(8);
            A0E.A0E.setVisibility(0);
            C33511fU.A03(A0E.A08);
            A0E.A08.setText(R.string.f12nameremoved);
            A00(A0E.A08);
            view2 = A0E.A08;
            i = 33;
        }
        C48902iF.A00(view2, this, A0E, i);
        if (this.A06 && r3.A1I == 3 && this.A05.A0E(7184)) {
            z = true;
        }
        A0Q(z);
        A0J();
        this.A04.registerObserver(this.A03);
    }
}
