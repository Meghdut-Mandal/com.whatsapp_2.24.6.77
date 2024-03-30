package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.AsS  reason: case insensitive filesystem */
public class C22662AsS extends AnonymousClass121 implements B0I {
    public final char[] A00;

    public C22662AsS(char[] cArr) {
        Objects.requireNonNull(cArr, "'string' cannot be null");
        this.A00 = cArr;
    }

    public int A0A() {
        int length = this.A00.length * 2;
        return C201849kY.A01(length) + 1 + length;
    }

    public boolean A0E() {
        return false;
    }

    public String BHz() {
        return new String(this.A00);
    }

    public void A0D(C200179gm r14, boolean z) {
        char[] cArr = this.A00;
        int length = cArr.length;
        if (z) {
            r14.A00.write(30);
        }
        r14.A01(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            r14.A00.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                i3 = C165617ti.A02(c5 >> 8, bArr, i3, i4);
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            r14.A00.write(bArr, 0, i3);
        }
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22662AsS)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22662AsS) r3).A00);
    }

    public int hashCode() {
        char[] cArr = this.A00;
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public String toString() {
        return new String(this.A00);
    }
}
