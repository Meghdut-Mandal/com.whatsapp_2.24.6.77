package X;

/* renamed from: X.Ap8  reason: case insensitive filesystem */
public final class C22579Ap8 extends C21671AUq {
    public final transient int[] A00;
    public final transient byte[][] A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C21671AUq)) {
                return false;
            }
            C21671AUq aUq = (C21671AUq) obj;
            if (aUq.A01() != A01() || !A03(aUq, A01())) {
                return false;
            }
        }
        return true;
    }

    public C22579Ap8(int[] iArr, byte[][] bArr) {
        super(C21671AUq.A02.data);
        this.A01 = bArr;
        this.A00 = iArr;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.A00 = i4;
        return i4;
    }

    private final Object writeReplace() {
        return new C21671AUq(A05());
    }

    public byte[] A05() {
        byte[] bArr = new byte[A01()];
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.A00;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr3 = bArr2[i];
            int i6 = i5 - i2;
            AnonymousClass00C.A0C(bArr3, 0);
            System.arraycopy(bArr3, i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return new C21671AUq(A05()).toString();
    }
}
