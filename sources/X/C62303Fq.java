package X;

import java.util.Arrays;

/* renamed from: X.3Fq  reason: invalid class name and case insensitive filesystem */
public class C62303Fq {
    public final int A00;
    public final AnonymousClass3B2 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C62303Fq r5 = (C62303Fq) obj;
            if (this.A00 != r5.A00 || !C1897595l.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C62303Fq(AnonymousClass3B2 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        AnonymousClass000.A1K(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
