package X;

import java.net.InetAddress;
import java.util.Locale;

/* renamed from: X.6DF  reason: invalid class name */
public final class AnonymousClass6DF {
    public final int A00;
    public final Long A01;
    public final Short A02;
    public final InetAddress A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass6DF)) {
            return false;
        }
        AnonymousClass6DF r4 = (AnonymousClass6DF) obj;
        Long l = this.A01;
        Long l2 = r4.A01;
        if (l != l2 && (l == null || !l.equals(l2))) {
            return false;
        }
        InetAddress inetAddress = this.A03;
        InetAddress inetAddress2 = r4.A03;
        if (inetAddress != inetAddress2 && (inetAddress == null || !inetAddress.equals(inetAddress2))) {
            return false;
        }
        Short sh = this.A02;
        Short sh2 = r4.A02;
        return sh == sh2 || (sh != null && sh.equals(sh2));
    }

    public int hashCode() {
        int i = 0;
        int A0J = (((AnonymousClass000.A0J(this.A01) + 41) * 41) + AnonymousClass000.A0J(this.A03)) * 41;
        Short sh = this.A02;
        if (sh != null) {
            i = sh.hashCode();
        }
        return A0J + i;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = this.A03;
        A1Q[1] = this.A02;
        A1Q[2] = this.A01;
        return String.format(locale, "%s:%d EXPIRE: %tc", A1Q);
    }

    public AnonymousClass6DF(Long l, Short sh, InetAddress inetAddress, int i, boolean z, boolean z2) {
        this.A01 = l;
        this.A03 = inetAddress;
        this.A02 = sh;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }
}
