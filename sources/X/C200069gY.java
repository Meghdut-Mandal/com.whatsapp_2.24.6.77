package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9gY  reason: invalid class name and case insensitive filesystem */
public final class C200069gY {
    public int A00;
    public int A01;
    public C200069gY A02;
    public C200069gY A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public C200069gY(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = true;
        this.A04 = false;
    }

    public final C200069gY A02() {
        this.A05 = true;
        return new C200069gY(this.A06, this.A01, this.A00);
    }

    public final void A04(C200069gY r7, int i) {
        if (r7.A04) {
            int i2 = r7.A00;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!r7.A05) {
                    int i4 = r7.A01;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = r7.A06;
                        AnonymousClass00C.A0C(bArr, 0);
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = r7.A00 - r7.A01;
                        r7.A00 = i2;
                        r7.A01 = 0;
                    } else {
                        throw C165617ti.A0U();
                    }
                } else {
                    throw C165617ti.A0U();
                }
            }
            byte[] bArr2 = this.A06;
            int i5 = this.A01;
            byte[] bArr3 = r7.A06;
            AnonymousClass00C.A0C(bArr2, 0);
            System.arraycopy(bArr2, i5, bArr3, i2, i);
            r7.A00 += i;
            this.A01 += i;
            return;
        }
        throw AnonymousClass001.A09("only owner can write");
    }

    public final C200069gY A01() {
        C200069gY r3 = this.A02;
        C200069gY r0 = r3;
        if (r3 == this) {
            r3 = null;
        }
        C200069gY r1 = this.A03;
        if (r1 == null) {
            throw C165567td.A0T();
        }
        r1.A02 = r0;
        C200069gY r02 = this.A02;
        if (r02 == null) {
            throw C165567td.A0T();
        }
        r02.A03 = r1;
        this.A02 = null;
        this.A03 = null;
        return r3;
    }

    public final void A03(C200069gY r2) {
        r2.A03 = this;
        r2.A02 = this.A02;
        C200069gY r0 = this.A02;
        if (r0 == null) {
            throw C165567td.A0T();
        }
        r0.A03 = r2;
        this.A02 = r2;
    }

    public static void A00(AU1 au1, C200069gY r2) {
        au1.A01 = r2.A01();
        C201909kh.A01(r2);
    }

    public C200069gY() {
        this.A06 = new byte[DefaultCrypto.BUFFER_SIZE];
        this.A04 = true;
        this.A05 = false;
    }
}
