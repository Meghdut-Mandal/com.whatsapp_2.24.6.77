package X;

import java.util.Arrays;

/* renamed from: X.3GK  reason: invalid class name */
public final class AnonymousClass3GK {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3GK r5 = (AnonymousClass3GK) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02) || !C1901797e.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.A01) + 31) * 31) + Arrays.hashCode(this.A02)) * 31) + C36341k9.A09(this.A00);
    }

    public AnonymousClass3GK(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }
}
