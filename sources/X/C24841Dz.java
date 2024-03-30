package X;

/* renamed from: X.1Dz  reason: invalid class name and case insensitive filesystem */
public final class C24841Dz {
    public final C21010yW A00;
    public final C24821Dx A01;

    public C24841Dz(C21010yW r2, C24821Dx r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final AnonymousClass3S8 A00(AnonymousClass3S8 r73, AnonymousClass3JD r74, int i) {
        long j;
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        AnonymousClass3S8 r10 = r73;
        int i3 = i;
        if (i3 == 1) {
            j = 0;
            j3 = r10.A0B + 1;
            i2 = -16777217;
            j4 = 0;
            j2 = 0;
            j5 = 0;
        } else if (i3 != 2) {
            j = 0;
            j5 = r10.A0I + 1;
            i2 = -1073741825;
            j3 = 0;
            j4 = 0;
            j2 = 0;
        } else {
            j = 0;
            if (r74.A01) {
                j4 = r10.A0D + 1;
                i2 = -67108865;
                j3 = 0;
                j2 = 0;
                j5 = 0;
            } else {
                j2 = r10.A0G + 1;
                i2 = -268435457;
                j3 = 0;
                j4 = 0;
                j5 = 0;
            }
        }
        return AnonymousClass3S8.A00(r10, i2, j, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, j3, 0, j4, 0, j2, 0, j5, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        if (r2 != 32) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass3KT r76, int r77) {
        /*
            r75 = this;
            r0 = r75
            X.1Dx r0 = r0.A01
            r74 = r0
            X.6Pb r8 = r74.A02()
            r10 = r76
            int r1 = r10.A01
            r11 = 1
            r0 = 12
            long r15 = r8.A04
            if (r1 != r0) goto L_0x0017
            long r15 = r15 + r11
        L_0x0017:
            boolean r0 = r10.A02
            long r13 = r8.A09
            if (r0 == 0) goto L_0x001e
            long r13 = r13 + r11
        L_0x001e:
            boolean r0 = r10.A04
            long r6 = r8.A0B
            if (r0 == 0) goto L_0x0025
            long r6 = r6 + r11
        L_0x0025:
            boolean r0 = r10.A03
            long r4 = r8.A0A
            if (r0 == 0) goto L_0x002c
            long r4 = r4 + r11
        L_0x002c:
            boolean r0 = r10.A08
            long r2 = r8.A0C
            if (r0 == 0) goto L_0x0033
            long r2 = r2 + r11
        L_0x0033:
            long r0 = r8.A0F
            r72 = r0
            long r0 = r8.A0I
            r70 = r0
            long r0 = r8.A0E
            r68 = r0
            long r0 = r8.A0G
            r66 = r0
            long r0 = r8.A0H
            r24 = r0
            long r0 = r8.A0M
            r26 = r0
            long r0 = r8.A0P
            r28 = r0
            long r0 = r8.A0L
            r30 = r0
            long r0 = r8.A0N
            r32 = r0
            long r0 = r8.A0O
            r34 = r0
            long r0 = r8.A01
            r36 = r0
            long r0 = r8.A02
            r38 = r0
            long r0 = r8.A03
            r40 = r0
            long r0 = r8.A07
            r42 = r0
            long r0 = r8.A06
            r44 = r0
            long r0 = r8.A08
            r46 = r0
            long r0 = r8.A00
            r48 = r0
            long r0 = r8.A0J
            r50 = r0
            long r0 = r8.A0K
            r19 = r0
            long r0 = r8.A05
            r17 = r0
            long r0 = r8.A0D
            java.lang.Boolean r8 = r8.A0Q
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r48
            r48 = r50
            r50 = r19
            r52 = r17
            r54 = r15
            r56 = r13
            r58 = r6
            r60 = r4
            r62 = r2
            r64 = r0
            r13 = r8
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            int r2 = r10.A00
            r1 = 2
            r13 = 0
            r0 = r77
            if (r2 == r1) goto L_0x04c9
            r1 = 3
            if (r2 == r1) goto L_0x041c
            r1 = 4
            if (r2 == r1) goto L_0x0380
            r1 = 5
            if (r2 == r1) goto L_0x0380
            r1 = 8
            if (r2 == r1) goto L_0x02c5
            r1 = 9
            if (r2 == r1) goto L_0x0229
            r1 = 11
            if (r2 == r1) goto L_0x018d
            r1 = 16
            if (r2 == r1) goto L_0x00f1
            r1 = 31
            r13 = 1
            if (r2 == r1) goto L_0x04c9
            r1 = 32
            if (r2 == r1) goto L_0x041c
        L_0x00eb:
            r0 = r74
            r0.A04(r12)
            return
        L_0x00f1:
            long r8 = r12.A0J
            r0 = 1
            long r8 = r8 + r0
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A0M
            r26 = r0
            long r0 = r12.A0P
            r28 = r0
            long r0 = r12.A0L
            r30 = r0
            long r0 = r12.A0N
            r32 = r0
            long r0 = r12.A0O
            r34 = r0
            long r0 = r12.A01
            r36 = r0
            long r0 = r12.A02
            r38 = r0
            long r0 = r12.A03
            r40 = r0
            long r0 = r12.A07
            r42 = r0
            long r0 = r12.A06
            r44 = r0
            long r0 = r12.A08
            r46 = r0
            long r0 = r12.A00
            r20 = r0
            long r0 = r12.A0K
            r18 = r0
            long r15 = r12.A05
            long r13 = r12.A04
            long r10 = r12.A09
            long r6 = r12.A0B
            long r4 = r12.A0A
            long r2 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r20
            r48 = r8
            r50 = r18
            r52 = r15
            r54 = r13
            r56 = r10
            r58 = r6
            r60 = r4
            r62 = r2
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x018d:
            long r8 = r12.A05
            r0 = 1
            long r8 = r8 + r0
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A0M
            r26 = r0
            long r0 = r12.A0P
            r28 = r0
            long r0 = r12.A0L
            r30 = r0
            long r0 = r12.A0N
            r32 = r0
            long r0 = r12.A0O
            r34 = r0
            long r0 = r12.A01
            r36 = r0
            long r0 = r12.A02
            r38 = r0
            long r0 = r12.A03
            r40 = r0
            long r0 = r12.A07
            r42 = r0
            long r0 = r12.A06
            r44 = r0
            long r0 = r12.A08
            r46 = r0
            long r0 = r12.A00
            r20 = r0
            long r0 = r12.A0J
            r18 = r0
            long r15 = r12.A0K
            long r13 = r12.A04
            long r10 = r12.A09
            long r6 = r12.A0B
            long r4 = r12.A0A
            long r2 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r20
            r48 = r18
            r50 = r15
            r52 = r8
            r54 = r13
            r56 = r10
            r58 = r6
            r60 = r4
            r62 = r2
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x0229:
            long r8 = r12.A0K
            r0 = 1
            long r8 = r8 + r0
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A0M
            r26 = r0
            long r0 = r12.A0P
            r28 = r0
            long r0 = r12.A0L
            r30 = r0
            long r0 = r12.A0N
            r32 = r0
            long r0 = r12.A0O
            r34 = r0
            long r0 = r12.A01
            r36 = r0
            long r0 = r12.A02
            r38 = r0
            long r0 = r12.A03
            r40 = r0
            long r0 = r12.A07
            r42 = r0
            long r0 = r12.A06
            r44 = r0
            long r0 = r12.A08
            r46 = r0
            long r0 = r12.A00
            r20 = r0
            long r0 = r12.A0J
            r18 = r0
            long r15 = r12.A05
            long r13 = r12.A04
            long r10 = r12.A09
            long r6 = r12.A0B
            long r4 = r12.A0A
            long r2 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r20
            r48 = r18
            r50 = r8
            r52 = r15
            r54 = r13
            r56 = r10
            r58 = r6
            r60 = r4
            r62 = r2
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x02c5:
            r17 = 1
            r1 = 111(0x6f, float:1.56E-43)
            long r15 = r12.A02
            if (r0 != r1) goto L_0x02cf
            long r15 = r15 + r17
        L_0x02cf:
            r3 = 1
            long r13 = r12.A03
            if (r0 != r3) goto L_0x02d6
            long r13 = r13 + r17
        L_0x02d6:
            boolean r1 = r10.A06
            long r8 = r12.A08
            if (r1 == 0) goto L_0x02de
            long r8 = r8 + r17
        L_0x02de:
            long r6 = r12.A07
            boolean r10 = r10.A05
            long r1 = (long) r10
            long r6 = r6 + r1
            long r4 = r12.A06
            if (r10 == 0) goto L_0x037d
            if (r0 == r3) goto L_0x037d
        L_0x02ea:
            long r0 = (long) r3
            long r4 = r4 + r0
            long r2 = r12.A01
            long r2 = r2 + r17
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A0M
            r26 = r0
            long r0 = r12.A0P
            r28 = r0
            long r0 = r12.A0L
            r30 = r0
            long r0 = r12.A0N
            r32 = r0
            long r0 = r12.A0O
            r34 = r0
            long r0 = r12.A00
            r48 = r0
            long r0 = r12.A0J
            r50 = r0
            long r0 = r12.A0K
            r52 = r0
            long r0 = r12.A05
            r54 = r0
            long r0 = r12.A04
            r56 = r0
            long r0 = r12.A09
            r58 = r0
            long r0 = r12.A0B
            r20 = r0
            long r0 = r12.A0A
            r18 = r0
            long r10 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r2
            r36 = r15
            r38 = r13
            r40 = r6
            r42 = r4
            r44 = r8
            r46 = r48
            r48 = r50
            r50 = r52
            r52 = r54
            r54 = r56
            r56 = r58
            r58 = r20
            r60 = r18
            r62 = r10
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x037d:
            r3 = 0
            goto L_0x02ea
        L_0x0380:
            long r8 = r12.A00
            r0 = 1
            long r8 = r8 + r0
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A0M
            r26 = r0
            long r0 = r12.A0P
            r28 = r0
            long r0 = r12.A0L
            r30 = r0
            long r0 = r12.A0N
            r32 = r0
            long r0 = r12.A0O
            r34 = r0
            long r0 = r12.A01
            r36 = r0
            long r0 = r12.A02
            r38 = r0
            long r0 = r12.A03
            r40 = r0
            long r0 = r12.A07
            r42 = r0
            long r0 = r12.A06
            r44 = r0
            long r0 = r12.A08
            r46 = r0
            long r0 = r12.A0J
            r20 = r0
            long r0 = r12.A0K
            r18 = r0
            long r15 = r12.A05
            long r13 = r12.A04
            long r10 = r12.A09
            long r6 = r12.A0B
            long r4 = r12.A0A
            long r2 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r26
            r26 = r28
            r28 = r30
            r30 = r32
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r8
            r48 = r20
            r50 = r18
            r52 = r15
            r54 = r13
            r56 = r10
            r58 = r6
            r60 = r4
            r62 = r2
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x041c:
            boolean r2 = r10.A07
            r10 = 1
            r1 = 111(0x6f, float:1.56E-43)
            long r15 = r12.A0N
            if (r0 != r1) goto L_0x0427
            long r15 = r15 + r10
        L_0x0427:
            r1 = 1
            long r8 = r12.A0O
            if (r0 != r1) goto L_0x042d
            long r8 = r8 + r10
        L_0x042d:
            long r6 = r12.A0L
            if (r2 == 0) goto L_0x0432
            long r6 = r6 + r10
        L_0x0432:
            long r4 = r12.A0P
            if (r13 == 0) goto L_0x0437
            long r4 = r4 + r10
        L_0x0437:
            long r2 = r12.A0M
            long r2 = r2 + r10
            long r0 = r12.A0F
            r72 = r0
            long r0 = r12.A0I
            r70 = r0
            long r0 = r12.A0E
            r68 = r0
            long r0 = r12.A0G
            r66 = r0
            long r0 = r12.A0H
            r24 = r0
            long r0 = r12.A01
            r36 = r0
            long r0 = r12.A02
            r38 = r0
            long r0 = r12.A03
            r40 = r0
            long r0 = r12.A07
            r42 = r0
            long r0 = r12.A06
            r44 = r0
            long r0 = r12.A08
            r46 = r0
            long r0 = r12.A00
            r48 = r0
            long r0 = r12.A0J
            r50 = r0
            long r0 = r12.A0K
            r52 = r0
            long r0 = r12.A05
            r54 = r0
            long r0 = r12.A04
            r56 = r0
            long r0 = r12.A09
            r20 = r0
            long r0 = r12.A0B
            r18 = r0
            long r13 = r12.A0A
            long r10 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r17 = r12
            X.6Pb r12 = new X.6Pb
            r22 = r24
            r24 = r2
            r26 = r4
            r28 = r6
            r30 = r15
            r32 = r8
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r46
            r46 = r48
            r48 = r50
            r50 = r52
            r52 = r54
            r54 = r56
            r56 = r20
            r58 = r18
            r60 = r13
            r62 = r10
            r64 = r0
            r13 = r17
            r14 = r72
            r16 = r70
            r18 = r68
            r20 = r66
            r12.<init>(r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64)
            goto L_0x00eb
        L_0x04c9:
            boolean r4 = r10.A07
            r2 = 1
            r1 = 111(0x6f, float:1.56E-43)
            long r15 = r12.A0G
            if (r0 != r1) goto L_0x04d4
            long r15 = r15 + r2
        L_0x04d4:
            r1 = 1
            long r10 = r12.A0H
            if (r0 != r1) goto L_0x04da
            long r10 = r10 + r2
        L_0x04da:
            long r8 = r12.A0E
            if (r4 == 0) goto L_0x04df
            long r8 = r8 + r2
        L_0x04df:
            long r6 = r12.A0I
            if (r13 == 0) goto L_0x04e4
            long r6 = r6 + r2
        L_0x04e4:
            long r4 = r12.A0F
            long r4 = r4 + r2
            long r0 = r12.A0M
            r31 = r0
            long r0 = r12.A0P
            r33 = r0
            long r0 = r12.A0L
            r35 = r0
            long r0 = r12.A0N
            r37 = r0
            long r0 = r12.A0O
            r39 = r0
            long r0 = r12.A01
            r41 = r0
            long r0 = r12.A02
            r43 = r0
            long r0 = r12.A03
            r45 = r0
            long r0 = r12.A07
            r47 = r0
            long r0 = r12.A06
            r49 = r0
            long r0 = r12.A08
            r51 = r0
            long r0 = r12.A00
            r53 = r0
            long r0 = r12.A0J
            r55 = r0
            long r0 = r12.A0K
            r57 = r0
            long r0 = r12.A05
            r25 = r0
            long r0 = r12.A04
            r23 = r0
            long r0 = r12.A09
            r21 = r0
            long r0 = r12.A0B
            r19 = r0
            long r13 = r12.A0A
            long r2 = r12.A0C
            long r0 = r12.A0D
            java.lang.Boolean r12 = r12.A0Q
            r18 = r12
            X.6Pb r12 = new X.6Pb
            r27 = r10
            r29 = r31
            r31 = r33
            r33 = r35
            r35 = r37
            r37 = r39
            r39 = r41
            r41 = r43
            r43 = r45
            r45 = r47
            r47 = r49
            r49 = r51
            r51 = r53
            r53 = r55
            r55 = r57
            r57 = r25
            r59 = r23
            r61 = r21
            r63 = r19
            r65 = r13
            r67 = r2
            r69 = r0
            r17 = r12
            r19 = r4
            r21 = r6
            r23 = r8
            r25 = r15
            r17.<init>(r18, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69)
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24841Dz.A01(X.3KT, int):void");
    }
}
