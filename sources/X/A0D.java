package X;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Objects;

public final class A0D implements B2C {
    public long A00;
    public ByteArrayOutputStream A01;
    public long A02;
    public C202189lD A03;
    public final long A04;
    public final boolean A05;
    public final B5Y A06;

    public void write(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream A0Q;
        int i3 = 0;
        while (i3 < i2) {
            long j = this.A00;
            long j2 = this.A04;
            if (j == j2) {
                A00(this);
                if (this.A05) {
                    A0Q = new C187078xC((int) j2);
                } else {
                    A0Q = C90524aI.A0Q();
                }
                this.A01 = A0Q;
                j = 0;
                this.A00 = 0;
            }
            int min = (int) Math.min((long) (i2 - i3), j2 - j);
            this.A01.write(bArr, i + i3, min);
            i3 += min;
            this.A00 += (long) min;
        }
    }

    public static void A00(A0D a0d) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = a0d.A01;
        if (byteArrayOutputStream != null) {
            C202189lD r0 = a0d.A03;
            String str = r0.A06;
            long j = r0.A01 + a0d.A02;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = a0d.A00;
            if (a0d.A05) {
                byteArray = ((C187078xC) byteArrayOutputStream).A00();
            } else {
                byteArray = byteArrayOutputStream.toByteArray();
            }
            if (j2 > 0) {
                a0d.A06.B39(C202829mj.A01((File) null, str, j, currentTimeMillis, j2), byteArray);
                a0d.A02 += j2;
            }
            a0d.A01.close();
            a0d.A01 = null;
        }
    }

    public void Bkt(C202189lD r5) {
        ByteArrayOutputStream A0Q;
        this.A03 = r5;
        if (this.A05) {
            A0Q = new C187078xC((int) this.A04);
        } else {
            A0Q = C90524aI.A0Q();
        }
        this.A01 = A0Q;
        this.A00 = 0;
    }

    public A0D(B5Y b5y, long j, boolean z) {
        Objects.requireNonNull(b5y);
        this.A06 = b5y;
        this.A04 = j;
        if (j != Long.MAX_VALUE) {
            this.A05 = z;
        }
    }

    public void close() {
        A00(this);
    }
}
