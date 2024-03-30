package X;

import java.util.Arrays;

/* renamed from: X.9zP  reason: invalid class name and case insensitive filesystem */
public class C209069zP implements B2h {
    public static final B4V A03 = C209119zU.A00;
    public AnonymousClass9Y0 A00;
    public C209379zu A01;
    public boolean A02;

    private boolean A00(C201519jm r9) {
        AnonymousClass9Y0 r0;
        AnonymousClass9XD r2 = new AnonymousClass9XD();
        if (r2.A01(r9, true) && (r2.A03 & 2) == 2) {
            int min = Math.min(r2.A00, 8);
            C202309lW r7 = new C202309lW(min);
            r9.A03(r7.A02, 0, min);
            r7.A0I(0);
            if (r7.A00 - r7.A01 >= 5 && r7.A04() == 127 && r7.A09() == 1179402563) {
                r0 = new C1688682i();
            } else {
                r7.A0I(0);
                try {
                    if (C1893593j.A00(r7, 1, true)) {
                        r0 = new C1688782j();
                    }
                } catch (C187398xn unused) {
                }
                r7.A0I(0);
                int i = r7.A00 - r7.A01;
                byte[] bArr = C1688882k.A01;
                if (i >= 8) {
                    byte[] bArr2 = new byte[8];
                    r7.A0K(bArr2, 0, 8);
                    if (Arrays.equals(bArr2, bArr)) {
                        r0 = new C1688882k();
                    }
                }
            }
            this.A00 = r0;
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bmm(X.C201519jm r24, X.C191039Bi r25) {
        /*
            r23 = this;
            r5 = r23
            X.9Y0 r0 = r5.A00
            r3 = r24
            if (r0 != 0) goto L_0x0011
            boolean r0 = r5.A00(r3)
            if (r0 == 0) goto L_0x02b8
            r0 = 0
            r3.A01 = r0
        L_0x0011:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0035
            X.9zu r1 = r5.A01
            r0 = 0
            r4 = 1
            X.B2i r2 = r1.A05(r0)
            X.9zu r0 = r5.A01
            r0.A0G = r4
            android.os.Handler r1 = r0.A0P
            java.lang.Runnable r0 = r0.A0V
            r1.post(r0)
            X.9Y0 r1 = r5.A00
            X.9zu r0 = r5.A01
            r1.A09 = r0
            r1.A06 = r2
            r1.A00(r4)
            r5.A02 = r4
        L_0x0035:
            X.9Y0 r4 = r5.A00
            int r0 = r4.A01
            if (r0 == 0) goto L_0x0222
            r10 = 1
            r5 = 2
            if (r0 == r10) goto L_0x02a9
            if (r0 != r5) goto L_0x021d
            X.B2B r0 = r4.A07
            long r7 = r0.Bmo(r3)
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0052
            r0 = r25
            r0.A00 = r7
            return r10
        L_0x0052:
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r0 = 2
            long r7 = r7 + r0
            long r1 = -r7
            boolean r0 = r4 instanceof X.C1688782j
            if (r0 == 0) goto L_0x01f9
            r8 = r4
            X.82j r8 = (X.C1688782j) r8
            r8.A02 = r1
            r7 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r8.A04 = r0
            X.9Mx r0 = r8.A03
            if (r0 == 0) goto L_0x0074
            int r7 = r0.A01
        L_0x0074:
            r8.A00 = r7
        L_0x0076:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x008d
            X.B2B r0 = r4.A07
            X.B29 r1 = r0.B4u()
            X.9zu r0 = r4.A09
            r0.A07 = r1
            android.os.Handler r1 = r0.A0P
            java.lang.Runnable r0 = r0.A0V
            r1.post(r0)
            r4.A0B = r10
        L_0x008d:
            long r1 = r4.A03
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            X.9Rj r0 = r4.A0C
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x02b3
        L_0x009b:
            r4.A03 = r5
            X.9Rj r0 = r4.A0C
            X.9lW r8 = r0.A03
            boolean r0 = r4 instanceof X.C1688782j
            if (r0 == 0) goto L_0x0141
            r9 = r4
            X.82j r9 = (X.C1688782j) r9
            byte[] r0 = r8.A02
            r2 = 0
            byte r7 = r0[r2]
            r0 = r7 & 1
            if (r0 == r10) goto L_0x01f5
            X.9MD r3 = r9.A01
            int r0 = r3.A00
            int r7 = r7 >> r10
            int r1 = 8 - r0
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 >>> r1
            r7 = r7 & r0
            X.9Bk[] r0 = r3.A04
            r0 = r0[r7]
            boolean r1 = r0.A00
            X.9Mx r0 = r3.A02
            if (r1 != 0) goto L_0x013e
            int r12 = r0.A01
        L_0x00c8:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00d1
            int r0 = r9.A00
            int r0 = r0 + r12
            int r2 = r0 / 4
        L_0x00d1:
            long r0 = (long) r2
            int r2 = r8.A00
            int r2 = r2 + 4
            r8.A0H(r2)
            byte[] r7 = r8.A02
            int r11 = r8.A00
            int r14 = r11 + -4
            r15 = 255(0xff, double:1.26E-321)
            long r2 = r0 & r15
            int r13 = (int) r2
            byte r2 = (byte) r13
            r7[r14] = r2
            int r14 = r11 + -3
            r2 = 8
            long r2 = r0 >>> r2
            long r2 = r2 & r15
            int r13 = (int) r2
            byte r2 = (byte) r13
            r7[r14] = r2
            int r14 = r11 + -2
            r2 = 16
            long r2 = r0 >>> r2
            long r2 = r2 & r15
            int r13 = (int) r2
            byte r2 = (byte) r13
            r7[r14] = r2
            int r13 = r11 + -1
            r2 = 24
            long r2 = r0 >>> r2
            long r2 = r2 & r15
            int r11 = (int) r2
            byte r2 = (byte) r11
            r7[r13] = r2
            r9.A04 = r10
            r9.A00 = r12
        L_0x010c:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0137
            long r11 = r4.A02
            long r9 = r11 + r0
            long r5 = r4.A05
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0137
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r2
            int r2 = r4.A00
            long r2 = (long) r2
            long r11 = r11 / r2
            X.B2i r3 = r4.A06
            int r2 = r8.A00
            r3.BpC(r8, r2)
            X.B2i r6 = r4.A06
            int r9 = r8.A00
            r10 = 0
            r7 = 0
            r8 = 1
            r6.BpD(r7, r8, r9, r10, r11)
            r2 = -1
            r4.A05 = r2
        L_0x0137:
            long r2 = r4.A02
            long r2 = r2 + r0
            r4.A02 = r2
            goto L_0x02b1
        L_0x013e:
            int r12 = r0.A02
            goto L_0x00c8
        L_0x0141:
            boolean r0 = r4 instanceof X.C1688882k
            if (r0 == 0) goto L_0x0181
            byte[] r1 = r8.A02
            r0 = 0
            byte r0 = r1[r0]
            r9 = r0 & 255(0xff, float:3.57E-43)
            r0 = r9 & 3
            r7 = 2
            if (r0 == 0) goto L_0x017f
            if (r0 == r10) goto L_0x0159
            if (r0 == r7) goto L_0x0159
            byte r0 = r1[r10]
            r7 = r0 & 63
        L_0x0159:
            r3 = 3
            int r9 = r9 >> r3
            r2 = r9 & 3
            r0 = 16
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r9 >= r0) goto L_0x017d
            r0 = 12
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r9 < r0) goto L_0x0177
            r0 = r2 & 1
            int r1 = r1 << r0
        L_0x016c:
            long r2 = (long) r7
            long r0 = (long) r1
            long r2 = r2 * r0
            int r0 = r4.A00
            long r0 = (long) r0
            long r0 = X.C165597tg.A0E(r0, r2)
            goto L_0x010c
        L_0x0177:
            if (r2 != r3) goto L_0x017d
            r1 = 60000(0xea60, float:8.4078E-41)
            goto L_0x016c
        L_0x017d:
            int r1 = r1 << r2
            goto L_0x016c
        L_0x017f:
            r7 = 1
            goto L_0x0159
        L_0x0181:
            byte[] r2 = r8.A02
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 != r0) goto L_0x01f5
            r1 = 2
            byte r0 = r2[r1]
            r13 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            int r13 = r13 >> r0
            switch(r13) {
                case 1: goto L_0x0197;
                case 2: goto L_0x019a;
                case 3: goto L_0x019a;
                case 4: goto L_0x019a;
                case 5: goto L_0x019a;
                case 6: goto L_0x01a4;
                case 7: goto L_0x01a4;
                case 8: goto L_0x019e;
                case 9: goto L_0x019e;
                case 10: goto L_0x019e;
                case 11: goto L_0x019e;
                case 12: goto L_0x019e;
                case 13: goto L_0x019e;
                case 14: goto L_0x019e;
                case 15: goto L_0x019e;
                default: goto L_0x0193;
            }
        L_0x0193:
            r0 = -1
        L_0x0194:
            long r0 = (long) r0
            goto L_0x010c
        L_0x0197:
            r0 = 192(0xc0, float:2.69E-43)
            goto L_0x0194
        L_0x019a:
            r0 = 576(0x240, float:8.07E-43)
            int r13 = r13 - r1
            goto L_0x01a2
        L_0x019e:
            r0 = 256(0x100, float:3.59E-43)
            int r13 = r13 + -8
        L_0x01a2:
            int r0 = r0 << r13
            goto L_0x0194
        L_0x01a4:
            r8.A0J(r0)
            byte[] r0 = r8.A02
            r17 = r0
            int r12 = r8.A01
            byte r0 = r0[r12]
            long r0 = (long) r0
            r11 = 7
            r14 = 7
        L_0x01b2:
            r9 = 6
            r7 = 1
            if (r14 < 0) goto L_0x020d
            int r15 = r10 << r14
            long r2 = (long) r15
            long r2 = r2 & r0
            int r16 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x01da
            if (r14 >= r9) goto L_0x01dd
            int r15 = r15 - r10
            long r2 = (long) r15
            long r0 = r0 & r2
            int r11 = r11 - r14
            if (r11 == 0) goto L_0x020d
        L_0x01c6:
            if (r7 >= r11) goto L_0x01e0
            int r2 = r12 + r7
            byte r10 = r17[r2]
            r3 = r10 & 192(0xc0, float:2.69E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x01fd
            long r0 = r0 << r9
            r2 = r10 & 63
            long r2 = (long) r2
            long r0 = r0 | r2
            int r7 = r7 + 1
            goto L_0x01c6
        L_0x01da:
            int r14 = r14 + -1
            goto L_0x01b2
        L_0x01dd:
            if (r14 != r11) goto L_0x020d
            r11 = 1
        L_0x01e0:
            int r12 = r12 + r11
            r8.A01 = r12
            if (r13 != r9) goto L_0x01f0
            int r1 = r8.A04()
        L_0x01e9:
            r0 = 0
            r8.A0I(r0)
            int r0 = r1 + 1
            goto L_0x0194
        L_0x01f0:
            int r1 = r8.A06()
            goto L_0x01e9
        L_0x01f5:
            r0 = -1
            goto L_0x010c
        L_0x01f9:
            r4.A02 = r1
            goto L_0x0076
        L_0x01fd:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Invalid UTF-8 sequence continuation byte: "
            java.lang.String r1 = X.C36381kD.A0z(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x020d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Invalid UTF-8 sequence first byte: "
            java.lang.String r1 = X.C36381kD.A0z(r2, r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r1)
            throw r0
        L_0x021d:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()
            throw r0
        L_0x0222:
            r6 = 1
        L_0x0223:
            X.9Rj r5 = r4.A0C
            boolean r0 = r5.A00(r3)
            if (r0 == 0) goto L_0x02b3
            long r7 = r3.A02
            long r0 = r4.A04
            long r7 = r7 - r0
            r4.A03 = r7
            X.9lW r10 = r5.A03
            X.9GG r2 = r4.A08
            boolean r0 = r4.A01(r2, r10, r0)
            if (r0 == 0) goto L_0x0241
            long r0 = r3.A02
            r4.A04 = r0
            goto L_0x0223
        L_0x0241:
            X.9GG r0 = r4.A08
            X.9uY r1 = r0.A00
            int r0 = r1.A0F
            r4.A00 = r0
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0254
            X.B2i r0 = r4.A06
            r0.B7a(r1)
            r4.A0A = r6
        L_0x0254:
            X.9GG r0 = r4.A08
            X.B2B r0 = r0.A01
            r11 = 0
            if (r0 != 0) goto L_0x0268
            long r7 = r3.A04
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0284
            X.9zd r0 = new X.9zd
            r0.<init>()
        L_0x0268:
            r4.A07 = r0
        L_0x026a:
            r4.A08 = r11
            r0 = 2
            r4.A01 = r0
            byte[] r2 = r10.A02
            int r0 = r2.length
            r1 = 65025(0xfe01, float:9.112E-41)
            if (r0 == r1) goto L_0x02b1
            int r0 = r10.A00
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.A02 = r0
            goto L_0x02b1
        L_0x0284:
            X.9XD r9 = r5.A02
            int r0 = r9.A03
            r0 = r0 & 4
            boolean r22 = X.AnonymousClass000.A1P(r0)
            long r5 = r4.A04
            int r1 = r9.A01
            int r0 = r9.A00
            int r1 = r1 + r0
            long r2 = (long) r1
            long r0 = r9.A04
            X.9ze r9 = new X.9ze
            r12 = r9
            r13 = r4
            r14 = r5
            r16 = r7
            r18 = r2
            r20 = r0
            r12.<init>(r13, r14, r16, r18, r20, r22)
            r4.A07 = r9
            goto L_0x026a
        L_0x02a9:
            long r1 = r4.A04
            int r0 = (int) r1
            r3.A02(r0)
            r4.A01 = r5
        L_0x02b1:
            r10 = 0
            return r10
        L_0x02b3:
            r0 = 3
            r4.A01 = r0
            r10 = -1
            return r10
        L_0x02b8:
            java.lang.String r0 = "Failed to determine bitstream type"
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209069zP.Bmm(X.9jm, X.9Bi):int");
    }

    public void BpY(long j, long j2) {
        AnonymousClass9Y0 r3 = this.A00;
        if (r3 != null) {
            C194819Rj r5 = r3.A0C;
            AnonymousClass9XD r0 = r5.A02;
            r0.A03 = 0;
            r0.A04 = 0;
            r0.A02 = 0;
            r0.A01 = 0;
            r0.A00 = 0;
            r5.A03.A0G(0);
            r5.A00 = -1;
            r5.A01 = false;
            if (j == 0) {
                r3.A00(!r3.A0B);
            } else if (r3.A01 != 0) {
                long A0E = C165597tg.A0E((long) r3.A00, j2);
                r3.A05 = A0E;
                r3.A07.Buq(A0E);
                r3.A01 = 2;
            }
        }
    }

    public boolean BuG(C201519jm r2) {
        try {
            return A00(r2);
        } catch (C187398xn unused) {
            return false;
        }
    }

    public void BKL(C209379zu r1) {
        this.A01 = r1;
    }
}
