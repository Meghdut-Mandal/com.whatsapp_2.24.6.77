package X;

import java.util.Arrays;

/* renamed from: X.668  reason: invalid class name */
public final class AnonymousClass668 {
    public final long A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass668) {
            AnonymousClass668 r7 = (AnonymousClass668) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass668(String str, long j) {
        AnonymousClass006.A01(str);
        this.A01 = str;
        this.A00 = j;
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        C36421kH.A1P(A0M, this.A00);
        return Arrays.hashCode(A0M);
    }
}
