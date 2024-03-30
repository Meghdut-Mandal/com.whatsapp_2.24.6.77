package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.6Ie  reason: invalid class name and case insensitive filesystem */
public abstract class C129716Ie {
    public static final C157697dx A00 = new C137646gU(AnonymousClass6J7.A05, false);
    public static final C157697dx A01 = C137676gX.A00;

    public static final C157697dx A00(C161337ma r3, Alignment alignment, boolean z) {
        C157697dx r1;
        r3.Bum(56522820);
        if (!AnonymousClass00C.A0J(alignment, AnonymousClass6J7.A05) || z) {
            Boolean valueOf = Boolean.valueOf(z);
            r3.Bum(511388516);
            boolean B2f = r3.B2f(valueOf) | r3.B2f(alignment);
            Object BnZ = r3.BnZ();
            if (B2f || BnZ == C129736Ig.A00) {
                BnZ = new C137646gU(alignment, z);
                r3.Bwv(BnZ);
            }
            C136916fF.A0N(r3);
            r1 = (C157697dx) BnZ;
        } else {
            r1 = A00;
        }
        C136916fF.A0N(r3);
        return r1;
    }
}
