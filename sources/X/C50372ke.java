package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2ke  reason: invalid class name and case insensitive filesystem */
public final class C50372ke extends C65083Qq {
    public C64963Qd A00 = new C64963Qd((AnonymousClass3I8) null, C51842oT.UNINITIALIZED, (AnonymousClass38r) null, 1, 0, 4, false, true);
    public AnonymousClass4SO A01;
    public final ViewGroup A02;
    public final AnonymousClass17Y A03;
    public final C62683Hc A04;
    public final Runnable A05 = C80233v4.A00(this, 14);
    public final View A06;
    public final Runnable A07 = C80233v4.A00(this, 15);

    public C50372ke(View view, ViewGroup viewGroup, AnonymousClass17Y r12, C62683Hc r13) {
        C36321k7.A16(r12, r13, viewGroup, 1);
        AnonymousClass00C.A0D(view, 4);
        this.A03 = r12;
        this.A04 = r13;
        this.A02 = viewGroup;
        this.A06 = view;
    }

    public static final void A00(C50372ke r11) {
        AnonymousClass17Y r1 = r11.A03;
        r1.A0G(r11.A07);
        r1.A0G(r11.A05);
        C64963Qd r0 = r11.A00;
        AnonymousClass38r r12 = r0.A05;
        AnonymousClass3I8 r3 = r0.A03;
        boolean z = r0.A07;
        boolean z2 = r0.A06;
        A02(r11, new C64963Qd(r3, C51842oT.UNINITIALIZED, (AnonymousClass38r) null, 1, 0, r0.A00, z, z2));
        if (r12 != null) {
            C65083Qq r02 = r12.A03;
            r02.A0R((AnonymousClass4SO) null);
            r12.A01 = null;
            r02.A0K();
            r12.A00 = null;
        }
    }

    public static void A01(C50372ke r9, AnonymousClass3I8 r10, C64963Qd r11, int i, boolean z) {
        AnonymousClass3I8 r1 = r10;
        int i2 = i;
        A02(r9, new C64963Qd(r1, r11.A04, r11.A05, i2, r11.A01, r11.A00, z, r11.A06));
    }

    public static final void A02(C50372ke r7, C64963Qd r8) {
        AnonymousClass4SO r1;
        C64963Qd r3 = r7.A00;
        r7.A00 = r8;
        if (!r8.equals(r3)) {
            View view = r7.A06;
            C51842oT r5 = r8.A04;
            C51842oT r4 = C51842oT.INITIALIZED;
            int i = 4;
            if (r5 != r4 || r8.A01() == 4) {
                i = 0;
            } else if (r8.A01() != 3 || r3.A01() == 3) {
                i = view.getVisibility();
            }
            view.setVisibility(i);
            AnonymousClass38r r2 = r7.A00.A05;
            if (r2 != null) {
                r2.A03.A0V(r8.A06);
                int i2 = r8.A00;
                C65083Qq r12 = r2.A03;
                r12.A0M(i2);
                if (r5 != r4 || !r7.A00.A07) {
                    r12.A0A();
                } else {
                    r12.A0J();
                }
            }
            boolean z = r8.A07;
            if ((z != r3.A07 || r8.A01() != r3.A01()) && (r1 = r7.A01) != null) {
                r1.Bcs(z, r8.A01());
            }
        }
    }

    public final void A0d() {
        C64963Qd r2 = this.A00;
        C51842oT r1 = r2.A04;
        if (r1 == C51842oT.UNINITIALIZED || r1 == C51842oT.FAILED) {
            A02(this, C64963Qd.A00(C51842oT.CREATING_PLAYER, r2));
            this.A03.A0H(this.A07);
        }
    }

    public final void A0e(C47002cZ r5, int i) {
        C47002cZ r0;
        AnonymousClass3I8 r3;
        AnonymousClass3I8 r1 = this.A00.A03;
        if (r1 != null) {
            r0 = r1.A01;
        } else {
            r0 = null;
        }
        if (!AnonymousClass00C.A0J(r5, r0) || r1 == null || i != r1.A00) {
            A0D();
            if (r5 == null) {
                r3 = null;
            } else {
                r3 = new AnonymousClass3I8(r5, i);
            }
            C64963Qd r2 = this.A00;
            A01(this, r3, r2, r2.A02, r2.A07);
        }
    }

    public final void A0f(boolean z) {
        C64963Qd r2 = this.A00;
        A01(this, r2.A03, r2, r2.A02, z);
    }
}
