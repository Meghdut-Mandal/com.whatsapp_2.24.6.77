package X;

import java.util.Arrays;

/* renamed from: X.9UL  reason: invalid class name */
public final class AnonymousClass9UL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9UL r5 = (AnonymousClass9UL) obj;
            if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00 && Arrays.equals(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass9UL(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}