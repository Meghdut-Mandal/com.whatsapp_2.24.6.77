package X;

/* renamed from: X.9gB  reason: invalid class name and case insensitive filesystem */
public class C199889gB {
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public long A00;
    public C199289f4 A01;
    public byte[] A02;
    public final AnonymousClass9Q6 A03;

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C199289f4 r2 = this.A01;
        if (r2 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r2.A01(this.A03.A00, bArr2, bArr.length, j);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }

    public void A00(byte[] bArr) {
        byte[][] A08 = C203239na.A08(bArr, this.A02);
        this.A02 = A08[0];
        this.A01 = new C199289f4(A08[1]);
        this.A00 = 0;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C199289f4 r5 = this.A01;
        if (r5 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r5.A02(this.A03.A00, bArr, j);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    public C199889gB(byte[] bArr, byte[] bArr2) {
        AnonymousClass9Q6 r1 = new AnonymousClass9Q6(bArr);
        this.A03 = r1;
        this.A02 = r1.A00;
        r1.A00(bArr2);
    }
}
