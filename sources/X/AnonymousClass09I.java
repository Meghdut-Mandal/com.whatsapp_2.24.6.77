package X;

import android.view.View;

/* renamed from: X.09I  reason: invalid class name */
public class AnonymousClass09I {
    public static final AnonymousClass09H A01 = new AnonymousClass09O().A00.A00().A00.A06().A00.A07().A00.A08();
    public final AnonymousClass09H A00;

    public AnonymousClass0XH A05() {
        return null;
    }

    public void A09(AnonymousClass09T r1) {
    }

    public boolean A0A() {
        return false;
    }

    public void A0F(View view) {
    }

    public void A0G(AnonymousClass09H r1) {
    }

    public void A0H(AnonymousClass09T[] r1) {
    }

    public boolean A0I() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09I)) {
            return false;
        }
        AnonymousClass09I r4 = (AnonymousClass09I) obj;
        return A0I() == r4.A0I() && A0A() == r4.A0A() && C014106d.A01(A0B(), r4.A0B()) && C014106d.A01(A02(), r4.A02()) && C014106d.A01(A05(), r4.A05());
    }

    public int hashCode() {
        return C014106d.A00(Boolean.valueOf(A0I()), Boolean.valueOf(A0A()), A0B(), A02(), A05());
    }

    public AnonymousClass09T A0D(int i) {
        if ((i & 8) == 0) {
            return AnonymousClass09T.A04;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public AnonymousClass09I(AnonymousClass09H r1) {
        this.A00 = r1;
    }

    public AnonymousClass09T A01() {
        return A0B();
    }

    public AnonymousClass09T A03() {
        return A0B();
    }

    public AnonymousClass09T A04() {
        return A0B();
    }

    public AnonymousClass09T A0C(int i) {
        return AnonymousClass09T.A04;
    }

    public AnonymousClass09T A02() {
        return AnonymousClass09T.A04;
    }

    public AnonymousClass09H A06() {
        return this.A00;
    }

    public AnonymousClass09H A07() {
        return this.A00;
    }

    public AnonymousClass09H A08() {
        return this.A00;
    }

    public AnonymousClass09T A0B() {
        return AnonymousClass09T.A04;
    }

    public AnonymousClass09H A0E(int i, int i2, int i3, int i4) {
        return A01;
    }
}
