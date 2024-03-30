package X;

import java.util.Arrays;

/* renamed from: X.66J  reason: invalid class name */
public class AnonymousClass66J {
    public final byte A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass66J)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass66J) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public AnonymousClass66J(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }
}
