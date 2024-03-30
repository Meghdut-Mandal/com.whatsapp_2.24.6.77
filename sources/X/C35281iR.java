package X;

/* renamed from: X.1iR  reason: invalid class name and case insensitive filesystem */
public class C35281iR implements Runnable {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C35281iR(C21020yX r1, byte[] bArr, int i, int i2, int i3, int i4) {
        this.A05 = i4;
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = i3;
    }

    public final void run() {
        if (this.A05 != 0) {
            C21020yX r4 = (C21020yX) this.A03;
            int i = this.A00;
            int i2 = this.A01;
            byte[] bArr = (byte[]) this.A04;
            int i3 = this.A02;
            if (i != 2) {
                if (!r4.A0B) {
                    C21020yX.A0A(r4, r4.A0Q);
                    r4.A0L.A00(3);
                    r4.A0B = true;
                }
                if (r4.A02.A01) {
                    if (!r4.A0W) {
                        r4.A0K.A06((String) null, AnonymousClass1M3.A00());
                        r4.A0W = true;
                    }
                    r4.A05.A04(bArr, i2, i3);
                    r4.A05.A03((Integer) null);
                    C21020yX.A05(r4);
                }
            } else if (C21020yX.A0C(r4)) {
                if (!r4.A0W) {
                    r4.A0K.A06((String) null, AnonymousClass1M3.A00());
                    r4.A0W = true;
                }
                r4.A06.A04(bArr, i2, i3);
                r4.A06.A03((Integer) null);
                C21020yX.A06(r4);
            }
        } else {
            C21020yX r5 = (C21020yX) this.A03;
            int i4 = this.A00;
            int i5 = this.A01;
            byte[] bArr2 = (byte[]) this.A04;
            int i6 = this.A02;
            if (i4 == 1) {
                if (C21020yX.A0D(r5)) {
                    r5.A07.A04(bArr2, i5, i6);
                    r5.A07.A03((Integer) null);
                    C21020yX.A07(r5);
                }
            } else if (C21020yX.A0B(r5)) {
                r5.A08.A04(bArr2, i5, i6);
                r5.A08.A03((Integer) null);
                C21020yX.A08(r5, i5, false);
                r5.A01.A03();
            }
        }
    }
}
