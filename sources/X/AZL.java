package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;

public final class AZL implements C23125B6g {
    public boolean A00;
    public final AU1 A01 = new AU1();
    public final B6N A02;

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0169 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BKH(X.C21671AUq r19) {
        /*
            r18 = this;
            r7 = 0
            r8 = r19
            X.AnonymousClass00C.A0C(r8, r7)
            r2 = 0
            r9 = r18
            boolean r0 = r9.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0017:
            X.AU1 r6 = r9.A01
            r14 = r2
            r16 = 0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0170
            X.9gY r4 = r6.A01
            if (r4 == 0) goto L_0x0149
            long r0 = r6.A00
            long r11 = r0 - r2
            r10 = 2
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b7
            r16 = r0
        L_0x002f:
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            X.9gY r4 = r4.A03
            if (r4 != 0) goto L_0x003c
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x003c:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r16 = r16 - r0
            goto L_0x002f
        L_0x0045:
            int r0 = r8.A01()
            if (r0 != r10) goto L_0x0080
            byte r11 = r8.A00(r7)
            r0 = 1
            byte r10 = r8.A00(r0)
        L_0x0054:
            long r0 = r6.A00
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0149
            byte[] r13 = r4.A06
            int r12 = r4.A01
            long r0 = (long) r12
            long r0 = r0 + r14
            long r0 = r0 - r16
            int r5 = (int) r0
            int r1 = r4.A00
        L_0x0065:
            if (r5 >= r1) goto L_0x0070
            byte r0 = r13[r5]
            if (r0 == r11) goto L_0x014c
            if (r0 == r10) goto L_0x014c
            int r5 = r5 + 1
            goto L_0x0065
        L_0x0070:
            int r1 = r1 - r12
            long r0 = (long) r1
            long r16 = r16 + r0
            X.9gY r4 = r4.A02
            if (r4 != 0) goto L_0x007d
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x007d:
            r14 = r16
            goto L_0x0054
        L_0x0080:
            X.AUq r0 = X.C196989at.A00
            byte[] r10 = r8.data
        L_0x0084:
            long r0 = r6.A00
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0149
            byte[] r13 = r4.A06
            int r12 = r4.A01
            long r0 = (long) r12
            long r0 = r0 + r14
            long r0 = r0 - r16
            int r5 = (int) r0
            int r15 = r4.A00
        L_0x0095:
            if (r5 >= r15) goto L_0x00a7
            byte r14 = r13[r5]
            int r11 = r10.length
            r1 = 0
        L_0x009b:
            if (r1 >= r11) goto L_0x00a4
            byte r0 = r10[r1]
            if (r14 == r0) goto L_0x014c
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00a4:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00a7:
            int r15 = r15 - r12
            long r0 = (long) r15
            long r16 = r16 + r0
            X.9gY r4 = r4.A02
            if (r4 != 0) goto L_0x00b4
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x00b4:
            r14 = r16
            goto L_0x0084
        L_0x00b7:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r16
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0102
            int r0 = r8.A01()
            if (r0 != r10) goto L_0x010e
            byte r11 = r8.A00(r7)
            r0 = 1
            byte r10 = r8.A00(r0)
        L_0x00d2:
            long r0 = r6.A00
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0149
            byte[] r12 = r4.A06
            int r0 = r4.A01
            long r0 = (long) r0
            long r0 = r0 + r14
            long r0 = r0 - r16
            int r5 = (int) r0
            int r1 = r4.A00
        L_0x00e3:
            if (r5 >= r1) goto L_0x00ee
            byte r0 = r12[r5]
            if (r0 == r11) goto L_0x014c
            if (r0 == r10) goto L_0x014c
            int r5 = r5 + 1
            goto L_0x00e3
        L_0x00ee:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r16 = r16 + r0
            X.9gY r4 = r4.A02
            if (r4 != 0) goto L_0x00ff
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x00ff:
            r14 = r16
            goto L_0x00d2
        L_0x0102:
            X.9gY r4 = r4.A02
            if (r4 != 0) goto L_0x010b
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x010b:
            r16 = r0
            goto L_0x00b7
        L_0x010e:
            X.AUq r0 = X.C196989at.A00
            byte[] r10 = r8.data
        L_0x0112:
            long r0 = r6.A00
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0149
            byte[] r13 = r4.A06
            int r0 = r4.A01
            long r0 = (long) r0
            long r0 = r0 + r14
            long r0 = r0 - r16
            int r5 = (int) r0
            int r14 = r4.A00
        L_0x0123:
            if (r5 >= r14) goto L_0x0135
            byte r12 = r13[r5]
            int r11 = r10.length
            r1 = 0
        L_0x0129:
            if (r1 >= r11) goto L_0x0132
            byte r0 = r10[r1]
            if (r12 == r0) goto L_0x014c
            int r1 = r1 + 1
            goto L_0x0129
        L_0x0132:
            int r5 = r5 + 1
            goto L_0x0123
        L_0x0135:
            int r1 = r4.A00
            int r0 = r4.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r16 = r16 + r0
            X.9gY r4 = r4.A02
            if (r4 != 0) goto L_0x0146
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x0146:
            r14 = r16
            goto L_0x0112
        L_0x0149:
            r0 = -1
            goto L_0x0152
        L_0x014c:
            int r0 = r4.A01
            int r5 = r5 - r0
            long r0 = (long) r5
            long r0 = r0 + r16
        L_0x0152:
            r12 = -1
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0169
            long r4 = r6.A00
            X.B6N r10 = r9.A02
            r0 = 8192(0x2000, float:1.14794E-41)
            long r0 = (long) r0
            long r10 = r10.Bmp(r6, r0)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x016a
            r0 = -1
        L_0x0169:
            return r0
        L_0x016a:
            long r2 = java.lang.Math.max(r2, r4)
            goto L_0x0017
        L_0x0170:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "fromIndex < 0: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZL.BKH(X.AUq):long");
    }

    public boolean BoJ(long j) {
        AU1 au1;
        if (j < 0) {
            throw AnonymousClass001.A08(C36381kD.A0z("byteCount < 0: ", AnonymousClass000.A0u(), j));
        } else if (!(!this.A00)) {
            throw AnonymousClass001.A09("closed");
        } else {
            do {
                au1 = this.A01;
                if (au1.A00 >= j) {
                    return true;
                }
            } while (this.A02.Bmp(au1, (long) DefaultCrypto.BUFFER_SIZE) != -1);
            return false;
        }
    }

    public int read(ByteBuffer byteBuffer) {
        AnonymousClass00C.A0C(byteBuffer, 0);
        AU1 au1 = this.A01;
        if (au1.A00 == 0 && this.A02.Bmp(au1, (long) DefaultCrypto.BUFFER_SIZE) == -1) {
            return -1;
        }
        return au1.read(byteBuffer);
    }

    public void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            AU1 au1 = this.A01;
            au1.A06(au1.A00);
        }
    }

    public boolean isOpen() {
        return !this.A00;
    }

    public AZL(B6N b6n) {
        this.A02 = b6n;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("buffer(");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    public long Bmp(AU1 au1, long j) {
        throw null;
    }
}
