package X;

import java.io.OutputStream;

/* renamed from: X.9gm  reason: invalid class name and case insensitive filesystem */
public class C200179gm {
    public OutputStream A00;

    public C200179gm(OutputStream outputStream) {
        this.A00 = outputStream;
    }

    public static C200179gm A00(OutputStream outputStream, String str) {
        return str.equals("DER") ? new C22647AsD(outputStream) : str.equals("DL") ? new C22646AsC(outputStream) : new C200179gm(outputStream);
    }

    public final void A01(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            OutputStream outputStream = this.A00;
            outputStream.write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                outputStream.write((byte) (i >> i4));
            }
            return;
        }
        this.A00.write((byte) i);
    }

    public final void A02(int i, int i2, boolean z) {
        if (!z) {
            return;
        }
        if (i2 < 31) {
            this.A00.write(i | i2);
            return;
        }
        OutputStream outputStream = this.A00;
        outputStream.write(31 | i);
        if (i2 < 128) {
            outputStream.write(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            C165587tf.A1T(bArr, i2 & 127, 128, i3);
        } while (i2 > 127);
        outputStream.write(bArr, i3, 5 - i3);
    }

    public void A03(AnonymousClass121 r2, boolean z) {
        AnonymousClass121 A0B;
        if (this instanceof C22646AsC) {
            A0B = r2.A0C();
        } else if (this instanceof C22647AsD) {
            A0B = r2.A0B();
        } else {
            r2.A0D(this, z);
            return;
        }
        A0B.A0D(this, z);
    }

    public final void A04(byte[] bArr, int i, boolean z) {
        if (z) {
            this.A00.write(i);
        }
        int length = bArr.length;
        A01(length);
        this.A00.write(bArr, 0, length);
    }

    public final void A05(C219411z[] r6, int i, boolean z) {
        if (z) {
            this.A00.write(i);
        }
        OutputStream outputStream = this.A00;
        outputStream.write(128);
        for (C219411z Bve : r6) {
            A03(Bve.Bve(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }
}
