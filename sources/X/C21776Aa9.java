package X;

import java.security.SecureRandom;

/* renamed from: X.Aa9  reason: case insensitive filesystem */
public class C21776Aa9 implements C23060B2g {
    public int B0e(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length) {
            bArr[i] = b;
            i++;
        }
        return b;
    }

    public void BKN(SecureRandom secureRandom) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BlA(byte[] r8) {
        /*
            r7 = this;
            int r6 = r8.length
            r0 = 1
            int r0 = r6 - r0
            byte r0 = r8[r0]
            r5 = r0 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r5
            r3 = 1
            if (r5 > r6) goto L_0x0010
            r3 = 0
            r0 = 1
            if (r5 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = r3 | r0
            r2 = 0
        L_0x0013:
            if (r2 >= r6) goto L_0x0026
            int r0 = r6 - r2
            boolean r1 = X.C90504aG.A1U(r0, r5)
            byte r0 = r8[r2]
            boolean r0 = X.C36381kD.A1U(r0, r4)
            r1 = r1 & r0
            r3 = r3 | r1
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0026:
            if (r3 != 0) goto L_0x0029
            return r5
        L_0x0029:
            java.lang.String r1 = "pad block corrupted"
            X.At0 r0 = new X.At0
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21776Aa9.BlA(byte[]):int");
    }
}
