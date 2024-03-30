package X;

import java.util.Arrays;

/* renamed from: X.123  reason: invalid class name */
public class AnonymousClass123 {
    public final int A00;
    public final byte[] A01;

    public AnonymousClass123(byte[] bArr) {
        this.A00 = AnonymousClass124.A00(bArr);
        this.A01 = bArr;
    }

    public int hashCode() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass123) {
            return Arrays.equals(this.A01, ((AnonymousClass123) obj).A01);
        }
        return false;
    }
}
