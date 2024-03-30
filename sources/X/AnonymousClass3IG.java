package X;

import java.util.Arrays;

/* renamed from: X.3IG  reason: invalid class name */
public class AnonymousClass3IG {
    public final byte A00;
    public final byte[] A01;

    public byte[] A00() {
        return C203239na.A05(new byte[]{this.A00}, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass3IG)) {
            return false;
        }
        return Arrays.equals(this.A01, ((AnonymousClass3IG) obj).A01);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public AnonymousClass3IG(byte[] bArr, byte b) {
        this.A01 = bArr;
        this.A00 = b;
    }
}
