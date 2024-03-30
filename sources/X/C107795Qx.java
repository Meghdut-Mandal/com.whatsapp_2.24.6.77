package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.5Qx  reason: invalid class name and case insensitive filesystem */
public abstract class C107795Qx extends FilterInputStream {
    public boolean A00 = false;
    public int A01 = 0;
    public Mac A02;
    public final int A03 = 10;
    public final C1256460s A04;
    public final C121555tK A05;
    public final List A06;
    public final C121545tJ A07 = new C121545tJ();
    public final byte[] A08;

    public C107795Qx(C121555tK r3, InputStream inputStream) {
        super(inputStream);
        this.A05 = r3;
        this.A06 = AnonymousClass001.A0I();
        this.A02 = AnonymousClass6R1.A02(r3.A01, r3.A02);
        this.A08 = new byte[DefaultCrypto.BUFFER_SIZE];
        this.A04 = new C1256460s(this);
    }

    private byte[] A00(byte[] bArr, int i) {
        byte[] bArr2 = new byte[16];
        if (i < 16) {
            C121545tJ r5 = this.A07;
            int i2 = 16 - i;
            C18740tg.A0C(C90504aG.A1U(i2, r5.A00));
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (r5.A01 - i2) + i3;
                if (i4 < 0) {
                    i4 += 16;
                }
                bArr3[i3] = r5.A02[i4];
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i);
            return bArr2;
        }
        System.arraycopy(bArr, i - 16, bArr2, 0, 16);
        return bArr2;
    }

    public long skip(long j) {
        byte[] bArr = this.A08;
        return (long) read(bArr, 0, (int) Math.min((long) bArr.length, j));
    }

    public void close() {
        super.close();
        if (this.A01 > 0) {
            byte[] doFinal = this.A02.doFinal();
            int i = this.A03;
            byte[] bArr = new byte[i];
            System.arraycopy(doFinal, 0, bArr, 0, i);
            this.A06.add(bArr);
        }
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == (r1 - 1)) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            int r10 = super.read(r13, r14, r15)
            if (r10 <= 0) goto L_0x0133
            r0 = r12
            boolean r9 = r12 instanceof X.AnonymousClass54M
            if (r9 == 0) goto L_0x0130
            X.54M r0 = (X.AnonymousClass54M) r0
            int r2 = r0.A00
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 != r1) goto L_0x0130
        L_0x0019:
            r8 = 0
            if (r0 == 0) goto L_0x004e
            int r0 = r12.A01
            int r0 = r0 + r10
            r12.A01 = r0
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r8, r10)
        L_0x0026:
            int r0 = r10 + -16
            int r5 = java.lang.Math.max(r8, r0)
        L_0x002c:
            if (r5 >= r10) goto L_0x0133
            X.5tJ r4 = r12.A07
            byte r3 = r13[r5]
            int r2 = r4.A01
            r1 = 16
            if (r2 < r1) goto L_0x003b
            r4.A01 = r8
            r2 = 0
        L_0x003b:
            byte[] r0 = r4.A02
            r0[r2] = r3
            int r0 = r2 + 1
            r4.A01 = r0
            int r0 = r4.A00
            if (r0 >= r1) goto L_0x004b
            int r0 = r0 + 1
            r4.A00 = r0
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x004e:
            r2 = r12
            if (r9 == 0) goto L_0x009a
            r0 = r2
            X.54M r0 = (X.AnonymousClass54M) r0
            java.util.List r1 = r0.A01
            int r0 = r0.A00
            int r7 = X.C36351kA.A06(r1, r0)
        L_0x005c:
            int r3 = r12.A01
            int r0 = r3 + r10
            if (r0 > r7) goto L_0x00a0
            r12.A01 = r0
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r8, r10)
            int r0 = r12.A01
            if (r0 != r7) goto L_0x0026
            r12.A01 = r8
            javax.crypto.Mac r0 = r12.A02
            byte[] r3 = r0.doFinal()
            int r0 = r12.A03
            byte[] r1 = new byte[r0]
            java.lang.System.arraycopy(r3, r8, r1, r8, r0)
            java.util.List r0 = r12.A06
            r0.add(r1)
            byte[] r1 = r12.A00(r13, r10)
            X.5tK r0 = r12.A05
            byte[] r0 = r0.A02
            javax.crypto.Mac r0 = X.AnonymousClass6R1.A02(r1, r0)
            r12.A02 = r0
            if (r9 == 0) goto L_0x0026
            X.54M r2 = (X.AnonymousClass54M) r2
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            goto L_0x0026
        L_0x009a:
            r0 = r2
            X.54L r0 = (X.AnonymousClass54L) r0
            int r7 = r0.A00
            goto L_0x005c
        L_0x00a0:
            if (r0 <= r7) goto L_0x0026
            javax.crypto.Mac r1 = r12.A02
            int r0 = r7 - r3
            r1.update(r13, r8, r0)
            javax.crypto.Mac r0 = r12.A02
            byte[] r1 = r0.doFinal()
            int r6 = r12.A03
            byte[] r0 = new byte[r6]
            java.lang.System.arraycopy(r1, r8, r0, r8, r6)
            java.util.List r5 = r12.A06
            r5.add(r0)
            int r0 = r12.A01
            int r0 = r7 - r0
            byte[] r1 = r12.A00(r13, r0)
            X.5tK r0 = r12.A05
            byte[] r4 = r0.A02
            javax.crypto.Mac r0 = X.AnonymousClass6R1.A02(r1, r4)
            r12.A02 = r0
            int r0 = r12.A01
            int r3 = r0 + r10
            int r3 = r3 - r7
            int r7 = r7 - r0
            r12.A01 = r8
        L_0x00d5:
            r2 = r12
            if (r9 == 0) goto L_0x00e1
            r1 = r2
            X.54M r1 = (X.AnonymousClass54M) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x00e1:
            if (r3 <= 0) goto L_0x0026
            if (r9 == 0) goto L_0x012b
            X.54M r2 = (X.AnonymousClass54M) r2
            java.util.List r1 = r2.A01
            int r0 = r2.A00
            int r2 = X.C36351kA.A06(r1, r0)
        L_0x00ef:
            r0 = r12
            if (r9 == 0) goto L_0x0109
            X.54M r0 = (X.AnonymousClass54M) r0
            int r11 = r0.A00
            java.util.List r0 = r0.A01
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            if (r11 != r1) goto L_0x0109
        L_0x0100:
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r7, r3)
            r12.A01 = r3
            goto L_0x0026
        L_0x0109:
            if (r3 < r2) goto L_0x0100
            javax.crypto.Mac r0 = r12.A02
            r0.update(r13, r7, r2)
            javax.crypto.Mac r0 = r12.A02
            byte[] r1 = r0.doFinal()
            byte[] r0 = new byte[r6]
            java.lang.System.arraycopy(r1, r8, r0, r8, r6)
            r5.add(r0)
            int r7 = r7 + r2
            byte[] r0 = r12.A00(r13, r7)
            javax.crypto.Mac r0 = X.AnonymousClass6R1.A02(r0, r4)
            r12.A02 = r0
            int r3 = r3 - r2
            goto L_0x00d5
        L_0x012b:
            X.54L r2 = (X.AnonymousClass54L) r2
            int r2 = r2.A00
            goto L_0x00ef
        L_0x0130:
            r0 = 0
            goto L_0x0019
        L_0x0133:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107795Qx.read(byte[], int, int):int");
    }

    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
