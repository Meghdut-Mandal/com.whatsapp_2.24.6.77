package X;

import java.util.Arrays;

/* renamed from: X.9W7  reason: invalid class name */
public class AnonymousClass9W7 {
    public final long A00;
    public final C200039gT A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9W7)) {
            return false;
        }
        AnonymousClass9W7 r7 = (AnonymousClass9W7) obj;
        return this.A00 == r7.A00 && Arrays.equals(this.A02, r7.A02) && this.A01.equals(r7.A01);
    }

    public String toString() {
        return "SyncdKeyData";
    }

    public AnonymousClass9W7(C200039gT r1, byte[] bArr, long j) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        C90474aD.A1S(A0M, this.A00);
        return (AnonymousClass000.A0L(this.A01, A0M) * 31) + Arrays.hashCode(this.A02);
    }
}
