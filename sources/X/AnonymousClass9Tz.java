package X;

import java.util.Arrays;

/* renamed from: X.9Tz  reason: invalid class name */
public class AnonymousClass9Tz {
    public int A00;
    public byte[] A01;

    public int hashCode() {
        return this.A00 ^ AnonymousClass124.A00(this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass9Tz) {
            AnonymousClass9Tz r4 = (AnonymousClass9Tz) obj;
            if (r4.A00 == this.A00) {
                return Arrays.equals(this.A01, r4.A01);
            }
        }
        return false;
    }

    public AnonymousClass9Tz(byte[] bArr, int i) {
        this.A01 = AnonymousClass124.A02(bArr);
        this.A00 = i;
    }
}
