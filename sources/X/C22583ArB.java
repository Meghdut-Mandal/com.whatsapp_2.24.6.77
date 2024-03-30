package X;

import java.io.OutputStream;

/* renamed from: X.ArB  reason: case insensitive filesystem */
public class C22583ArB extends C22649AsF {
    public void A0D(C200179gm r5, boolean z) {
        int i = 64;
        if (this.A01) {
            i = 96;
        }
        int i2 = this.A00;
        byte[] bArr = this.A02;
        r5.A02(i, i2, z);
        OutputStream outputStream = r5.A00;
        outputStream.write(128);
        outputStream.write(bArr, 0, bArr.length);
        outputStream.write(0);
        outputStream.write(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22583ArB(X.C202169lB r5, int r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r3 = X.C90524aI.A0Q()
            r2 = 0
        L_0x0005:
            int r0 = r5.A00
            if (r2 == r0) goto L_0x002c
            X.11z r1 = r5.A05(r2)     // Catch:{ IOException -> 0x001b }
            X.120 r1 = (X.AnonymousClass120) r1     // Catch:{ IOException -> 0x001b }
            java.lang.String r0 = "BER"
            byte[] r0 = r1.A09(r0)     // Catch:{ IOException -> 0x001b }
            r3.write(r0)     // Catch:{ IOException -> 0x001b }
            int r2 = r2 + 1
            goto L_0x0005
        L_0x001b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "malformed object: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r0, r1)
            X.92R r0 = new X.92R
            r0.<init>(r1, r2)
            throw r0
        L_0x002c:
            byte[] r1 = r3.toByteArray()
            r0 = 1
            r4.<init>(r1, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22583ArB.<init>(X.9lB, int):void");
    }
}
