package X;

/* renamed from: X.9XD  reason: invalid class name */
public final class AnonymousClass9XD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int[] A05 = new int[255];
    public final C202309lW A06 = new C202309lW(255);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == 0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r15.A02 >= r16) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r4 = java.lang.Math.min(r15.A00, 1);
        X.C201519jm.A01(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r4 != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r4 = X.C201519jm.A00(r8, r15.A06, 0, java.lang.Math.min(1, com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.UNZIP_BUFFER_SIZE), 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r4 == -1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r15.A02 += (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r4 == -1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C201519jm r15, long r16) {
        /*
            r14 = this;
            r8 = r15
            long r0 = r15.A02
            int r2 = r15.A01
            long r5 = (long) r2
            long r3 = r0 + r5
            r10 = 0
            r13 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r2)
            X.C200319h9.A01(r0)
            X.9lW r6 = r14.A06
            r5 = 4
            r6.A0G(r5)
        L_0x0019:
            r0 = -1
            int r7 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0028
            long r0 = r15.A02
            r2 = 4
            long r0 = r0 + r2
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x004f
        L_0x0028:
            byte[] r2 = r6.A02
            boolean r0 = r15.A04(r5, r13)     // Catch:{ EOFException -> 0x004d }
            if (r0 == 0) goto L_0x004d
            byte[] r1 = r15.A03     // Catch:{ EOFException -> 0x004d }
            int r0 = r15.A01     // Catch:{ EOFException -> 0x004d }
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r0, r2, r10, r5)     // Catch:{ EOFException -> 0x004d }
            r6.A0I(r10)
            long r3 = r6.A09()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r15.A01 = r10
            return r13
        L_0x0049:
            r15.A02(r13)
            goto L_0x0019
        L_0x004d:
            if (r7 == 0) goto L_0x0055
        L_0x004f:
            long r0 = r15.A02
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x007a
        L_0x0055:
            int r0 = r15.A00
            int r4 = java.lang.Math.min(r0, r13)
            X.C201519jm.A01(r15, r4)
            if (r4 != 0) goto L_0x006d
            byte[] r9 = r15.A06
            r0 = 4096(0x1000, float:5.74E-42)
            int r11 = java.lang.Math.min(r13, r0)
            r12 = 0
            int r4 = X.C201519jm.A00(r8, r9, r10, r11, r12, r13)
        L_0x006d:
            r0 = -1
            if (r4 == r0) goto L_0x007a
            long r0 = r15.A02
            long r2 = (long) r4
            long r0 = r0 + r2
            r15.A02 = r0
            r0 = -1
            if (r4 == r0) goto L_0x007a
            goto L_0x004d
        L_0x007a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XD.A00(X.9jm, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r14 == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C201519jm r13, boolean r14) {
        /*
            r12 = this;
            X.9lW r5 = r12.A06
            r4 = 0
            r5.A0G(r4)
            r12.A03 = r4
            r0 = 0
            r12.A04 = r0
            r12.A02 = r4
            r12.A01 = r4
            r12.A00 = r4
            r3 = 27
            r5.A0G(r3)
            byte[] r2 = r5.A02
            boolean r0 = r13.A04(r3, r14)     // Catch:{ EOFException -> 0x0028 }
            if (r0 == 0) goto L_0x002b
            byte[] r1 = r13.A03     // Catch:{ EOFException -> 0x0028 }
            int r0 = r13.A01     // Catch:{ EOFException -> 0x0028 }
            int r0 = r0 - r3
            java.lang.System.arraycopy(r1, r0, r2, r4, r3)     // Catch:{ EOFException -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r2 = move-exception
            if (r14 == 0) goto L_0x0047
        L_0x002b:
            return r4
        L_0x002c:
            long r6 = r5.A09()
            r1 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002b
            int r0 = r5.A04()
            if (r0 == 0) goto L_0x0048
            if (r14 != 0) goto L_0x002b
            java.lang.String r1 = "unsupported bit stream revision"
            r0 = 0
            X.8xn r2 = new X.8xn
            r2.<init>(r1, r0, r4)
        L_0x0047:
            throw r2
        L_0x0048:
            int r0 = r5.A04()
            r12.A03 = r0
            byte[] r6 = r5.A02
            int r0 = r5.A01
            int r1 = r0 + 1
            r5.A01 = r1
            byte r0 = r6[r0]
            long r2 = (long) r0
            r10 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r10
            int r9 = r1 + 1
            r5.A01 = r9
            byte r0 = r6[r1]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 8
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            r5.A01 = r8
            byte r0 = r6[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 16
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r9 = r8 + 1
            r5.A01 = r9
            byte r0 = r6[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 24
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            r5.A01 = r8
            byte r0 = r6[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 32
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r9 = r8 + 1
            r5.A01 = r9
            byte r0 = r6[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 40
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r8 = r9 + 1
            r5.A01 = r8
            byte r0 = r6[r9]
            long r0 = (long) r0
            long r0 = r0 & r10
            r7 = 48
            long r0 = r0 << r7
            long r2 = r2 | r0
            int r0 = r8 + 1
            r5.A01 = r0
            byte r0 = r6[r8]
            long r0 = (long) r0
            long r0 = r0 & r10
            r6 = 56
            long r0 = r0 << r6
            long r2 = r2 | r0
            r12.A04 = r2
            r5.A07()
            r5.A07()
            r5.A07()
            int r1 = r5.A04()
            r12.A02 = r1
            int r0 = r1 + 27
            r12.A01 = r0
            r5.A0G(r4)
            byte[] r0 = r5.A02
            r13.A03(r0, r4, r1)
        L_0x00cd:
            int r0 = r12.A02
            if (r4 >= r0) goto L_0x00e1
            int[] r0 = r12.A05
            int r1 = r5.A04()
            r0[r4] = r1
            int r0 = r12.A00
            int r0 = r0 + r1
            r12.A00 = r0
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00e1:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XD.A01(X.9jm, boolean):boolean");
    }
}
