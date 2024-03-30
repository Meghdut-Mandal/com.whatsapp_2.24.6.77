package X;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.AUh  reason: case insensitive filesystem */
public class C21665AUh implements Comparable {
    public final byte[] A00;

    public byte[] A00() {
        return C200539hZ.A00(new byte[]{5}, this.A00);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C21665AUh)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C21665AUh) obj).A00);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return new BigInteger(this.A00).compareTo(new BigInteger(((C21665AUh) obj).A00));
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C21665AUh(byte[] bArr) {
        this.A00 = bArr;
    }
}
