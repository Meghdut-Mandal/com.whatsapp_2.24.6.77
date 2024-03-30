package X;

import java.util.Arrays;

/* renamed from: X.6AR  reason: invalid class name */
public final class AnonymousClass6AR {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6AR r7 = (AnonymousClass6AR) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6AR(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        C36421kH.A1P(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("{ path = ");
        C90474aD.A1L(A0u, this.A01);
        A0u.append("size");
        A0u.append(" = ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" } \n", A0u);
    }
}
