package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6WO  reason: invalid class name */
public abstract class AnonymousClass6WO {
    public final void A05(AnonymousClass6Q4 r6, C006302t r7) {
        long A0J = C90484aE.A0J(0, 0);
        if (!(A03() == AnonymousClass5RW.Ltr || A02() == 0)) {
            A0J = C90484aE.A0J((A02() - r6.A01) - C90494aF.A08(A0J), C90474aD.A03(A0J));
        }
        r6.A0E(r7, 0.0f, C109295Xa.A01(A0J, r6.A02));
    }

    public static final void A00(AnonymousClass6Q4 r3, float f, long j) {
        r3.A0E((C006302t) null, f, C109295Xa.A01(j, r3.A02));
    }

    public int A02() {
        if (this instanceof C94714if) {
            return ((AndroidComposeView) ((C94714if) this).A00).A0W.A0P.A0G.A01;
        }
        return ((C94704ie) this).A00.A0C();
    }

    public AnonymousClass5RW A03() {
        if (this instanceof C94714if) {
            return ((C94714if) this).A00.getLayoutDirection();
        }
        return ((C94704ie) this).A00.getLayoutDirection();
    }

    public static final void A01(AnonymousClass6Q4 r4, int i, int i2) {
        r4.A0E((C006302t) null, 0.0f, C109295Xa.A01(C90484aE.A0J(i, i2), r4.A02));
    }

    public final void A04(AnonymousClass6Q4 r6, int i, int i2) {
        long A0J = C90484aE.A0J(i, i2);
        if (!(A03() == AnonymousClass5RW.Ltr || A02() == 0)) {
            A0J = C90484aE.A0J((A02() - r6.A01) - C90494aF.A08(A0J), C90474aD.A03(A0J));
        }
        r6.A0E((C006302t) null, 0.0f, C109295Xa.A01(A0J, r6.A02));
    }
}
