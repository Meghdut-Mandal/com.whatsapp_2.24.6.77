package X;

import androidx.compose.ui.draw.DrawBehindElement;

/* renamed from: X.5Vt  reason: invalid class name and case insensitive filesystem */
public abstract class C108985Vt {
    public static final void A00(C161337ma r7, C161267mT r8, C006302t r9, int i) {
        int i2;
        r7.Bun(-932836462);
        if ((i & 14) == 0) {
            i2 = C90464aC.A0A(r7, r8) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= C90494aF.A07(r7.B2h(r9) ? 1 : 0);
        }
        if ((i2 & 91) != 18 || !r7.BHg()) {
            C161267mT Bva = r8.Bva(new DrawBehindElement(r9));
            r7.Bum(-72882467);
            C137686gY r6 = C137686gY.A00;
            r7.Bum(544976794);
            C136916fF r3 = (C136916fF) r7;
            int i3 = r3.A02;
            C161267mT A00 = AnonymousClass5WK.A00(r7, Bva);
            C161557n6 A04 = C136916fF.A04(r3);
            AnonymousClass00S r1 = AnonymousClass6JB.A00;
            r7.Bum(1405779621);
            r7.Bup();
            if (r3.A0L) {
                r7.B4n(new C151867Ih(r1));
            } else {
                r7.BxD();
            }
            AnonymousClass5WF.A00(r7, r6, A04);
            AnonymousClass5WF.A01(r7, A00, AnonymousClass6JB.A05);
            C009003v r12 = AnonymousClass6JB.A01;
            if (r3.A0L || !C90464aC.A1W(r7, i3)) {
                C90464aC.A0v(r7, r12, i3);
            }
            C136916fF.A0M(r3, true);
            C136916fF.A0M(r3, false);
            C136916fF.A0M(r3, false);
            C136916fF.A0M(r3, false);
        } else {
            r7.BuE();
        }
        C136976fO B6Z = r7.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7YN(r8, r9, i);
        }
    }
}
