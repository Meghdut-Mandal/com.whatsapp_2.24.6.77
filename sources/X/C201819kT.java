package X;

/* renamed from: X.9kT  reason: invalid class name and case insensitive filesystem */
public abstract class C201819kT {
    public static final C199629fe A00;

    static {
        C199629fe r0;
        if (!C203609oO.A06 || !C203609oO.A07) {
            r0 = new AnonymousClass8DN();
        } else {
            r0 = new AnonymousClass8DO();
        }
        A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r13 < 2048) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A[LOOP:1: B:19:0x0070->B:25:0x0083, LOOP_START, PHI: r1 r2 r14 
      PHI: (r1v3 char) = (r1v2 char), (r1v11 char) binds: [B:17:0x006a, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v14 long) binds: [B:17:0x006a, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 int) = (r14v1 int), (r14v8 int) binds: [B:17:0x006a, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.CharSequence r20, java.nio.ByteBuffer r21) {
        /*
            X.9fe r4 = A00
            r12 = r21
            boolean r0 = r12.hasArray()
            r10 = r20
            if (r0 == 0) goto L_0x0026
            int r3 = r12.arrayOffset()
            byte[] r2 = r12.array()
            int r1 = r12.position()
            int r1 = r1 + r3
            int r0 = r12.remaining()
            int r0 = r4.A01(r10, r2, r1, r0)
            int r0 = r0 - r3
        L_0x0022:
            r12.position(r0)
            return
        L_0x0026:
            boolean r0 = r12.isDirect()
            if (r0 == 0) goto L_0x0168
            boolean r0 = r4 instanceof X.AnonymousClass8DO
            if (r0 == 0) goto L_0x0168
            X.9Yh r9 = X.C203609oO.A02
            long r0 = X.C203609oO.A01
            long r20 = r9.A05(r12, r0)
            int r0 = r12.position()
            long r2 = (long) r0
            long r2 = r2 + r20
            int r0 = r12.limit()
            long r4 = (long) r0
            long r4 = r4 + r20
            int r8 = r10.length()
            long r0 = (long) r8
            long r13 = r4 - r2
            java.lang.String r11 = " at index "
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0153
            r14 = 0
        L_0x0054:
            r1 = 128(0x80, float:1.794E-43)
            r18 = 1
            if (r14 >= r8) goto L_0x006a
            char r0 = r10.charAt(r14)
            if (r0 >= r1) goto L_0x006a
            long r6 = r2 + r18
            byte r0 = (byte) r0
            r9.A07(r2, r0)
            int r14 = r14 + 1
            r2 = r6
            goto L_0x0054
        L_0x006a:
            if (r14 != r8) goto L_0x0070
        L_0x006c:
            long r2 = r2 - r20
            int r0 = (int) r2
            goto L_0x0022
        L_0x0070:
            if (r14 >= r8) goto L_0x006c
            char r13 = r10.charAt(r14)
            if (r13 >= r1) goto L_0x0088
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            long r6 = r2 + r18
            byte r0 = (byte) r13
            r9.A07(r2, r0)
            r2 = r6
        L_0x0083:
            int r14 = r14 + 1
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0070
        L_0x0088:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x00aa
        L_0x008c:
            r0 = 2
            long r6 = r4 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00aa
            long r6 = r2 + r18
            int r0 = r13 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r9.A07(r2, r0)
            long r2 = r6 + r18
            r1 = r13 & 63
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 | r0
            byte r0 = (byte) r1
        L_0x00a6:
            r9.A07(r6, r0)
            goto L_0x0083
        L_0x00aa:
            r15 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x00b4
            if (r15 >= r13) goto L_0x00da
        L_0x00b4:
            r16 = 3
            long r6 = r4 - r16
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
            long r0 = r2 + r18
            int r6 = r13 >>> 12
            r6 = r6 | 480(0x1e0, float:6.73E-43)
            byte r6 = (byte) r6
            r9.A07(r2, r6)
            long r6 = r0 + r18
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r15 = 128(0x80, float:1.794E-43)
            r2 = r2 | r15
            byte r2 = (byte) r2
            r9.A07(r0, r2)
            long r2 = r6 + r18
            r0 = r13 & 63
            r0 = r0 | r15
            byte r0 = (byte) r0
            goto L_0x00a6
        L_0x00da:
            r16 = 4
            long r6 = r4 - r16
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x012b
            int r6 = r14 + 1
            if (r6 == r8) goto L_0x0123
            char r1 = r10.charAt(r6)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x0122
            int r14 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r2 + r18
            int r7 = r14 >>> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r9.A07(r2, r7)
            long r2 = r0 + r18
            int r7 = r14 >>> 12
            r7 = r7 & 63
            r13 = 128(0x80, float:1.794E-43)
            r7 = r7 | r13
            byte r7 = (byte) r7
            r9.A07(r0, r7)
            long r0 = r2 + r18
            int r7 = r14 >>> 6
            r7 = r7 & 63
            r7 = r7 | r13
            byte r7 = (byte) r7
            r9.A07(r2, r7)
            long r2 = r0 + r18
            r7 = r14 & 63
            r7 = r7 | r13
            byte r7 = (byte) r7
            r9.A07(r0, r7)
            r14 = r6
            goto L_0x0083
        L_0x0122:
            r14 = r6
        L_0x0123:
            int r0 = r14 + -1
            X.92I r1 = new X.92I
            r1.<init>(r0, r8)
            throw r1
        L_0x012b:
            if (r1 > r13) goto L_0x0143
            if (r13 > r15) goto L_0x0143
            int r0 = r14 + 1
            if (r0 == r8) goto L_0x013d
            char r0 = r10.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0143
        L_0x013d:
            X.92I r1 = new X.92I
            r1.<init>(r14, r8)
            throw r1
        L_0x0143:
            r0 = 46
            java.lang.StringBuilder r0 = X.C165597tg.A0q(r0, r13)
            java.lang.String r0 = X.C36381kD.A0z(r11, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x0153:
            int r0 = r8 + -1
            char r2 = r10.charAt(r0)
            int r1 = r12.limit()
            r0 = 37
            java.lang.StringBuilder r0 = X.C165597tg.A0q(r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = X.C165567td.A0M(r11, r0, r1)
            throw r1
        L_0x0168:
            X.C199629fe.A00(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201819kT.A01(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new AnonymousClass92I(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass001.A08(C36381kD.A0z("UTF-8 length does not fit in int: ", C90524aI.A0h(54), ((long) i3) + 4294967296L));
    }
}
