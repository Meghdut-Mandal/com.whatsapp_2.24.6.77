package X;

import java.util.Arrays;

/* renamed from: X.66K  reason: invalid class name */
public final class AnonymousClass66K {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass66K r5 = (AnonymousClass66K) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !C1901797e.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.A01) + 31) * 31) + C36341k9.A09(this.A00);
    }

    public AnonymousClass66K(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }
}
