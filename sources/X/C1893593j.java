package X;

/* renamed from: X.93j  reason: invalid class name and case insensitive filesystem */
public abstract class C1893593j {
    public static boolean A00(C202309lW r4, int i, boolean z) {
        int i2 = r4.A00 - r4.A01;
        if (i2 < 7) {
            if (!z) {
                throw C187398xn.A00(AnonymousClass000.A0r("too short header: ", AnonymousClass000.A0u(), i2));
            }
        } else if (r4.A04() != i) {
            if (!z) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("expected header type ");
                C90504aG.A0z(i, A0u);
                throw C187398xn.A00(A0u.toString());
            }
        } else if (r4.A04() == 118 && r4.A04() == 111 && r4.A04() == 114 && r4.A04() == 98 && r4.A04() == 105 && r4.A04() == 115) {
            return true;
        } else {
            if (!z) {
                throw C187398xn.A00("expected characters 'vorbis'");
            }
        }
        return false;
    }
}
