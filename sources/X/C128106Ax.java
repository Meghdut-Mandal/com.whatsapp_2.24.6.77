package X;

import java.util.List;

/* renamed from: X.6Ax  reason: invalid class name and case insensitive filesystem */
public final class C128106Ax {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128106Ax) {
                C128106Ax r5 = (C128106Ax) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C128106Ax(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SigningInfoCompat(signatures=");
        A0u.append(this.A00);
        A0u.append(", hasMultipleSigners=");
        A0u.append(this.A01);
        A0u.append(", hasPastSigningCertificates=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
