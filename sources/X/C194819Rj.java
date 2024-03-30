package X;

import java.util.Arrays;

/* renamed from: X.9Rj  reason: invalid class name and case insensitive filesystem */
public final class C194819Rj {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass9XD A02 = new AnonymousClass9XD();
    public final C202309lW A03 = new C202309lW(new byte[65025], 0);

    public boolean A00(C201519jm r10) {
        AnonymousClass9XD r6;
        int i;
        int i2;
        if (this.A01) {
            this.A01 = false;
            this.A03.A0G(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                AnonymousClass9XD r7 = this.A02;
                if (!r7.A01(r10, true)) {
                    return false;
                }
                int i4 = r7.A01;
                if ((r7.A03 & 1) == 1 && this.A03.A00 == 0) {
                    int i5 = 0;
                    i3 = 0;
                    do {
                        int i6 = i3;
                        if (i3 >= r7.A02) {
                            break;
                        }
                        i3++;
                        i2 = r7.A05[i6];
                        i5 += i2;
                    } while (i2 == 255);
                    i4 += i5;
                } else {
                    i3 = 0;
                }
                r10.A02(i4);
                this.A00 = i3;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8 + i3;
                r6 = this.A02;
                if (i9 >= r6.A02) {
                    break;
                }
                int i10 = i8;
                i8++;
                i = r6.A05[i10 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                C202309lW r72 = this.A03;
                byte[] bArr = r72.A02;
                int length = bArr.length;
                int i12 = r72.A00 + i7;
                if (length < i12) {
                    bArr = Arrays.copyOf(bArr, i12);
                    r72.A02 = bArr;
                }
                r10.A05(bArr, r72.A00, i7, false);
                r72.A0H(r72.A00 + i7);
                this.A01 = C36381kD.A1U(r6.A05[i11 - 1], 255);
            }
            if (i11 == r6.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }
}
