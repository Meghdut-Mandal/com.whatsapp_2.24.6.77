package X;

/* renamed from: X.0Mp  reason: invalid class name and case insensitive filesystem */
public final class C04940Mp extends C04960Mr {
    public final void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        C07320Xe.A02(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            char[] cArr = this.A00.A07;
            appendable.append(cArr[b >>> 18]);
            appendable.append(cArr[(b >>> 12) & 63]);
            appendable.append(cArr[(b >>> 6) & 63]);
            appendable.append(cArr[b & 63]);
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            A03(appendable, bArr, i3, i2 - i3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C04940Mp(java.lang.String r3, java.lang.String r4, java.lang.Character r5) {
        /*
            r2 = this;
            char[] r1 = r4.toCharArray()
            X.0XB r0 = new X.0XB
            r0.<init>(r3, r1)
            r2.<init>(r0, r5)
            char[] r0 = r0.A07
            int r1 = r0.length
            r0 = 64
            if (r1 != r0) goto L_0x0014
            return
        L_0x0014:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04940Mp.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }
}
