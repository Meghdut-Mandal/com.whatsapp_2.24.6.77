package X;

import android.util.Pair;

/* renamed from: X.9kP  reason: invalid class name and case insensitive filesystem */
public abstract class C201799kP {
    public static final byte[] A00 = "OpusHead".getBytes(C114085gc.A05);

    public static Pair A00(C202309lW r19, int i, int i2) {
        int i3;
        int i4;
        C202309lW r6 = r19;
        int i5 = r6.A01;
        while (i5 - i < i2) {
            int A02 = C202309lW.A02(r6, i5);
            C1893393h.A00(AnonymousClass000.A1R(A02), "childAtomSize must be positive");
            if (r6.A03() == 1936289382) {
                int i6 = i5 + 8;
                AnonymousClass9MC r12 = null;
                boolean z = false;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A02) {
                    int A022 = C202309lW.A02(r6, i6);
                    int A03 = r6.A03();
                    if (A03 == 1718775137) {
                        num = Integer.valueOf(r6.A03());
                    } else if (A03 == 1935894637) {
                        r6.A0J(4);
                        str = r6.A0E(4);
                    } else if (A03 == 1935894633) {
                        i7 = i6;
                        i8 = A022;
                    }
                    i6 += A022;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C1893393h.A00(AnonymousClass000.A1V(num), "frma atom is mandatory");
                    C1893393h.A00(C36381kD.A1U(i7, -1), "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        int A023 = C202309lW.A02(r6, i9);
                        if (r6.A03() == 1952804451) {
                            int A032 = (r6.A03() >> 24) & 255;
                            r6.A0J(1);
                            if (A032 == 0) {
                                r6.A0J(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A04 = r6.A04();
                                i3 = (A04 & 240) >> 4;
                                i4 = A04 & 15;
                            }
                            boolean A1S = AnonymousClass000.A1S(r6.A04(), 1);
                            int A042 = r6.A04();
                            byte[] bArr2 = new byte[16];
                            r6.A0K(bArr2, 0, 16);
                            if (A1S && A042 == 0) {
                                int A043 = r6.A04();
                                bArr = new byte[A043];
                                r6.A0K(bArr, 0, A043);
                            }
                            r12 = new AnonymousClass9MC(str, bArr2, bArr, A042, i3, i4, A1S);
                            z = true;
                        } else {
                            i9 += A023;
                        }
                    }
                    C1893393h.A00(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, r12);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i5 += A02;
        }
        return null;
    }

    public static C199159en A01(String str, int i) {
        C199159en r1 = new C199159en();
        r1.A0P = Integer.toString(i);
        r1.A0R = str;
        return r1;
    }

    public static AnonymousClass9L9 A02(C202309lW r9, int i) {
        r9.A0I(i + 8 + 4);
        r9.A0J(1);
        do {
        } while ((r9.A04() & 128) == 128);
        int A01 = C202309lW.A01(r9, 2);
        if ((A01 & 128) != 0) {
            r9.A0J(2);
        }
        if ((A01 & 64) != 0) {
            r9.A0J(r9.A04());
        }
        if ((A01 & 32) != 0) {
            r9.A0J(2);
        }
        r9.A0J(1);
        do {
        } while ((r9.A04() & 128) == 128);
        String A03 = C203249nb.A03(r9.A04());
        if ("audio/mpeg".equals(A03) || "audio/vnd.dts".equals(A03) || "audio/vnd.dts.hd".equals(A03)) {
            return new AnonymousClass9L9(A03, (byte[]) null, -1, -1);
        }
        r9.A0J(4);
        long A09 = r9.A09();
        long A092 = r9.A09();
        int A012 = C202309lW.A01(r9, 1);
        int i2 = A012 & 127;
        while ((A012 & 128) == 128) {
            A012 = r9.A04();
            i2 = (i2 << 7) | (A012 & 127);
        }
        byte[] bArr = new byte[i2];
        r9.A0K(bArr, 0, i2);
        long j = -1;
        if (A092 <= 0) {
            A092 = -1;
        }
        if (A09 > 0) {
            j = A09;
        }
        return new AnonymousClass9L9(A03, bArr, A092, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: X.9MC[]} */
    /* JADX WARNING: type inference failed for: r3v67, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0804, code lost:
        if (r20 != null) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x083a, code lost:
        if (r22 <= 0) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0e1d, code lost:
        if (r1 == 7) goto L_0x0e1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x0fdc, code lost:
        if ((r7.A04() & 128) == 0) goto L_0x0fde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x0ff4, code lost:
        if (r0 == 7) goto L_0x0ff6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1013:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0819  */
    /* JADX WARNING: Removed duplicated region for block: B:888:0x119c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9OI A03(X.C21709AXg r73, X.C1688582h r74, X.C1688482g r75, long r76, boolean r78) {
        /*
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r67 = r74
            r0 = r67
            X.82h r4 = r0.A00(r1)
            java.util.Objects.requireNonNull(r4)
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.82g r0 = r4.A01(r0)
            java.util.Objects.requireNonNull(r0)
            X.9lW r1 = r0.A00
            r0 = 16
            int r1 = X.C202309lW.A02(r1, r0)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L_0x10cf
            r25 = 1
        L_0x0027:
            r33 = 0
            r1 = -1
            r0 = r25
            if (r0 == r1) goto L_0x11bb
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r67
            X.82g r0 = r0.A01(r1)
            java.util.Objects.requireNonNull(r0)
            X.9lW r8 = r0.A00
            r5 = 8
            int r9 = X.C202309lW.A00(r8)
            r7 = 16
            r0 = 16
            if (r9 != 0) goto L_0x004a
            r0 = 8
        L_0x004a:
            r8.A0J(r0)
            int r45 = r8.A03()
            r3 = 4
            r8.A0J(r3)
            int r6 = r8.A01
            if (r9 != 0) goto L_0x005a
            r5 = 4
        L_0x005a:
            r30 = 0
            r2 = 0
        L_0x005d:
            byte[] r1 = r8.A02
            int r0 = r6 + r2
            byte r1 = r1[r0]
            r0 = -1
            if (r1 == r0) goto L_0x10c8
            r2 = 0
        L_0x0067:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x10b4
            r8.A0J(r5)
        L_0x0071:
            r8.A0J(r7)
            int r6 = r8.A03()
            int r5 = r8.A03()
            r8.A0J(r3)
            int r7 = r8.A03()
            int r8 = r8.A03()
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            if (r6 != 0) goto L_0x10a8
            if (r5 != r3) goto L_0x109e
            if (r7 != r2) goto L_0x0095
            if (r8 != 0) goto L_0x0095
            r30 = 90
        L_0x0095:
            r71 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r76 > r71 ? 1 : (r76 == r71 ? 0 : -1))
            if (r2 == 0) goto L_0x00a0
            r0 = r76
        L_0x00a0:
            r2 = r75
            X.9lW r5 = r2.A00
            r3 = 8
            int r2 = X.C202309lW.A00(r5)
            if (r2 == 0) goto L_0x00ae
            r3 = 16
        L_0x00ae:
            r5.A0J(r3)
            long r42 = r5.A09()
            int r2 = (r0 > r71 ? 1 : (r0 == r71 ? 0 : -1))
            if (r2 == 0) goto L_0x00bf
            r2 = r42
            long r71 = com.facebook.android.exoplayer2.util.Util.A06(r0, r2)
        L_0x00bf:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.82h r1 = r4.A00(r0)
            java.util.Objects.requireNonNull(r1)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.82h r2 = r1.A00(r0)
            java.util.Objects.requireNonNull(r2)
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.82g r0 = r4.A01(r0)
            java.util.Objects.requireNonNull(r0)
            X.9lW r6 = r0.A00
            r3 = 8
            int r1 = X.C202309lW.A00(r6)
            r0 = 16
            if (r1 != 0) goto L_0x00eb
            r0 = 8
        L_0x00eb:
            r6.A0J(r0)
            long r4 = r6.A09()
            if (r1 != 0) goto L_0x00f5
            r3 = 4
        L_0x00f5:
            r6.A0J(r3)
            int r3 = r6.A06()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = ""
            r1.append(r0)
            int r0 = r3 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r3 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r3 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            android.util.Pair r44 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.82g r0 = r2.A01(r0)
            java.util.Objects.requireNonNull(r0)
            X.9lW r7 = r0.A00
            r0 = r44
            java.lang.Object r0 = r0.second
            r40 = r0
            r0 = r40
            java.lang.String r0 = (java.lang.String) r0
            r40 = r0
            r0 = 12
            int r41 = X.C202309lW.A02(r7, r0)
            r5 = 0
            r38 = 0
            r0 = r41
            X.9MC[] r0 = new X.AnonymousClass9MC[r0]
            r34 = r0
            r65 = 0
            r24 = 0
        L_0x0155:
            r1 = r24
            r0 = r41
            if (r1 >= r0) goto L_0x1137
            int r0 = r7.A01
            r16 = r0
            int r31 = r7.A03()
            boolean r0 = X.AnonymousClass000.A1R(r31)
            java.lang.String r39 = "childAtomSize must be positive"
            r1 = r39
            X.C1893393h.A00(r0, r1)
            int r6 = r7.A03()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r3 = r73
            if (r6 == r0) goto L_0x0751
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r6 == r0) goto L_0x0751
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r6 == r0) goto L_0x0751
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r6 == r0) goto L_0x0751
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r6 == r0) goto L_0x0751
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r6 == r0) goto L_0x0751
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r6 == r0) goto L_0x0751
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r6 == r0) goto L_0x0751
            r0 = 1211250227(0x48323633, float:182488.8)
            if (r6 == r0) goto L_0x0751
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 == r0) goto L_0x0751
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r6 == r0) goto L_0x0751
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r6 == r0) goto L_0x0751
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r6 == r0) goto L_0x0751
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r6 == r0) goto L_0x0751
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r6 == r0) goto L_0x0751
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r6 == r0) goto L_0x0751
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r6 == r0) goto L_0x02f6
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r6 == r0) goto L_0x02f6
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r6 == r0) goto L_0x02f6
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r6 == r0) goto L_0x02f6
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r6 == r0) goto L_0x02f6
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r6 == r0) goto L_0x02f6
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r6 == r0) goto L_0x02f6
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r6 == r0) goto L_0x02f6
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r6 == r0) goto L_0x029f
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 == r0) goto L_0x029f
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 == r0) goto L_0x029f
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 == r0) goto L_0x029f
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r6 == r0) goto L_0x029f
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r6 != r0) goto L_0x0285
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0I(r0)
            r7.A0B()
            java.lang.String r0 = r7.A0B()
            if (r0 == 0) goto L_0x027a
            r1 = r45
            X.9en r0 = A01(r0, r1)
            X.9uY r5 = new X.9uY
            r5.<init>(r0)
        L_0x027a:
            int r16 = r16 + r31
            r0 = r16
            r7.A0I(r0)
            int r24 = r24 + 1
            goto L_0x0155
        L_0x0285:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r6 != r0) goto L_0x027a
            X.9en r0 = new X.9en
            r0.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r45)
            r0.A0P = r1
            java.lang.String r1 = "application/x-camera-motion"
            r0.A0R = r1
            X.9uY r5 = new X.9uY
            r5.<init>(r0)
            goto L_0x027a
        L_0x029f:
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0I(r0)
            java.lang.String r4 = "application/ttml+xml"
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r6 == r2) goto L_0x02c8
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 != r2) goto L_0x02dc
            int r2 = r31 + -8
            int r4 = r2 + -8
            byte[] r3 = new byte[r4]
            r2 = 0
            r7.A0K(r3, r2, r4)
            X.1Ak r3 = X.C23931Ak.of(r3)
            java.lang.String r4 = "application/x-quicktime-tx3g"
        L_0x02c8:
            r2 = r45
            X.9en r2 = A01(r4, r2)
            r4 = r40
            r2.A0Q = r4
            r2.A0I = r0
            r2.A0S = r3
            X.9uY r5 = new X.9uY
            r5.<init>(r2)
            goto L_0x027a
        L_0x02dc:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 != r2) goto L_0x02e4
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x02c8
        L_0x02e4:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 != r2) goto L_0x02ec
            r0 = 0
            goto L_0x02c8
        L_0x02ec:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r6 != r2) goto L_0x10fb
            r65 = 1
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x02c8
        L_0x02f6:
            r11 = r3
            int r0 = r16 + 8
            r1 = 8
            int r0 = r0 + 8
            r7.A0I(r0)
            r0 = 6
            if (r78 == 0) goto L_0x0713
            int r8 = r7.A06()
            r7.A0J(r0)
        L_0x030a:
            r4 = 16
            r13 = 4
            r1 = 2
            r2 = 1
            if (r8 == 0) goto L_0x06e5
            if (r8 == r2) goto L_0x06e5
            if (r8 != r1) goto L_0x027a
            r7.A0J(r4)
            long r0 = r7.A08()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Math.round(r0)
            int r9 = (int) r0
            int r10 = r7.A05()
            r0 = 20
            r7.A0J(r0)
            r19 = 0
        L_0x0330:
            int r8 = r7.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r6 != r0) goto L_0x034f
            r1 = r16
            r0 = r31
            android.util.Pair r2 = A00(r7, r1, r0)
            if (r2 == 0) goto L_0x034c
            int r6 = X.C36381kD.A04(r2)
            if (r73 != 0) goto L_0x06ce
            r11 = 0
        L_0x0348:
            java.lang.Object r0 = r2.second
            r34[r24] = r0
        L_0x034c:
            r7.A0I(r8)
        L_0x034f:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r4 = "audio/raw"
            if (r6 != r0) goto L_0x0612
            java.lang.String r4 = "audio/ac3"
        L_0x035b:
            r18 = -1
        L_0x035d:
            r6 = 0
            r17 = 0
            r3 = 0
        L_0x0361:
            int r1 = r8 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x0719
            int r2 = X.C202309lW.A02(r7, r8)
            boolean r1 = X.AnonymousClass000.A1R(r2)
            r0 = r39
            X.C1893393h.A00(r1, r0)
            int r0 = r7.A03()
            r1 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r0 != r1) goto L_0x0390
            int r3 = r2 + -13
            byte[] r1 = new byte[r3]
            int r0 = r8 + 13
            r7.A0I(r0)
            r0 = 0
            r7.A0K(r1, r0, r3)
            X.1Ak r3 = X.C23931Ak.of(r1)
        L_0x038e:
            int r8 = r8 + r2
            goto L_0x0361
        L_0x0390:
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 == r12) goto L_0x059a
            if (r78 == 0) goto L_0x03c0
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            if (r0 != r1) goto L_0x03c0
            int r1 = r7.A01
            boolean r13 = X.C36371kC.A1T(r1, r8)
            r0 = r33
            X.C1893393h.A00(r13, r0)
        L_0x03a7:
            int r0 = r1 - r8
            if (r0 >= r2) goto L_0x038e
            int r14 = X.C202309lW.A02(r7, r1)
            boolean r13 = X.AnonymousClass000.A1R(r14)
            r0 = r39
            X.C1893393h.A00(r13, r0)
            int r0 = r7.A03()
            if (r0 == r12) goto L_0x059b
            int r1 = r1 + r14
            goto L_0x03a7
        L_0x03c0:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r0 != r1) goto L_0x0408
            int r0 = r8 + 8
            r7.A0I(r0)
            java.lang.String r0 = java.lang.Integer.toString(r45)
            int r1 = r7.A04()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r5 = r1 >> 6
            int[] r1 = X.AnonymousClass9Ap.A02
            r12 = r1[r5]
            int r13 = r7.A04()
            int[] r5 = X.AnonymousClass9Ap.A01
            r1 = r13 & 56
            int r1 = r1 >> 3
            r5 = r5[r1]
            r1 = r13 & 4
            if (r1 == 0) goto L_0x03ec
            int r5 = r5 + 1
        L_0x03ec:
            X.9en r1 = new X.9en
            r1.<init>()
            r1.A0P = r0
            java.lang.String r0 = "audio/ac3"
            r1.A0R = r0
            r1.A04 = r5
            r1.A0E = r12
            r1.A00(r11)
            r0 = r40
            r1.A0Q = r0
            X.9uY r5 = new X.9uY
            r5.<init>(r1)
            goto L_0x038e
        L_0x0408:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r0 != r1) goto L_0x0477
            int r0 = r8 + 8
            r7.A0I(r0)
            java.lang.String r13 = java.lang.Integer.toString(r45)
            r0 = 2
            int r1 = X.C202309lW.A01(r7, r0)
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r5 = r1 >> 6
            int[] r1 = X.AnonymousClass9Ap.A02
            r12 = r1[r5]
            int r14 = r7.A04()
            int[] r5 = X.AnonymousClass9Ap.A01
            r1 = r14 & 14
            int r1 = r1 >> 1
            r5 = r5[r1]
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0435
            int r5 = r5 + 1
        L_0x0435:
            int r1 = r7.A04()
            r1 = r1 & 30
            int r1 = r1 >> 1
            if (r1 <= 0) goto L_0x0448
            int r1 = r7.A04()
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0448
            int r5 = r5 + 2
        L_0x0448:
            int r1 = r7.A00
            int r0 = r7.A01
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0474
            int r0 = r7.A04()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0474
            java.lang.String r1 = "audio/eac3-joc"
        L_0x0459:
            X.9en r0 = new X.9en
            r0.<init>()
            r0.A0P = r13
            r0.A0R = r1
            r0.A04 = r5
            r0.A0E = r12
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.9uY r5 = new X.9uY
            r5.<init>(r0)
            goto L_0x038e
        L_0x0474:
            java.lang.String r1 = "audio/eac3"
            goto L_0x0459
        L_0x0477:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r0 != r1) goto L_0x04b5
            int r0 = r8 + 8
            r7.A0I(r0)
            java.lang.String r12 = java.lang.Integer.toString(r45)
            r0 = 1
            int r0 = X.C202309lW.A01(r7, r0)
            r0 = r0 & 32
            int r5 = r0 >> 5
            r0 = 1
            r1 = 44100(0xac44, float:6.1797E-41)
            if (r5 != r0) goto L_0x0497
            r1 = 48000(0xbb80, float:6.7262E-41)
        L_0x0497:
            X.9en r0 = new X.9en
            r0.<init>()
            r0.A0P = r12
            java.lang.String r5 = "audio/ac4"
            r0.A0R = r5
            r5 = 2
            r0.A04 = r5
            r0.A0E = r1
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.9uY r5 = new X.9uY
            r5.<init>(r0)
            goto L_0x038e
        L_0x04b5:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r0 != r1) goto L_0x04c1
            if (r19 <= 0) goto L_0x1100
            r9 = r19
            r10 = 2
            goto L_0x038e
        L_0x04c1:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r0 != r1) goto L_0x04de
            r0 = r45
            X.9en r0 = A01(r4, r0)
            r0.A04 = r10
            r0.A0E = r9
            r0.A00(r11)
            r1 = r40
            r0.A0Q = r1
            X.9uY r5 = new X.9uY
            r5.<init>(r0)
            goto L_0x038e
        L_0x04de:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r0 != r1) goto L_0x0529
            int r1 = r2 + -8
            byte[] r3 = A00
            int r0 = r3.length
            int r12 = r0 + r1
            byte[] r12 = java.util.Arrays.copyOf(r3, r12)
            int r3 = r8 + 8
            r7.A0I(r3)
            r7.A0K(r12, r0, r1)
            r0 = 11
            byte r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            r0 = 10
            byte r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            long r0 = (long) r0
            r13 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r13
            r13 = 48000(0xbb80, double:2.3715E-319)
            long r0 = r0 / r13
            r3 = 3
            java.util.ArrayList r3 = X.C36441kJ.A14(r3)
            r3.add(r12)
            byte[] r0 = X.C165597tg.A1U(r0)
            r3.add(r0)
            r0 = 80000000(0x4c4b400, double:3.95252517E-316)
            byte[] r0 = X.C165597tg.A1U(r0)
            r3.add(r0)
            goto L_0x038e
        L_0x0529:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r0 != r1) goto L_0x0557
            int r3 = r2 + -12
            int r0 = r3 + 4
            byte[] r1 = new byte[r0]
            r12 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r12
            r12 = 76
            r0 = 1
            r1[r0] = r12
            r12 = 97
            r0 = 2
            r1[r0] = r12
            r12 = 3
            r0 = 67
            r1[r12] = r0
            int r0 = r8 + 12
            r7.A0I(r0)
            r0 = 4
            r7.A0K(r1, r0, r3)
            X.1Ak r3 = X.C23931Ak.of(r1)
            goto L_0x038e
        L_0x0557:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r0 != r1) goto L_0x038e
            int r3 = r2 + -12
            byte[] r0 = new byte[r3]
            int r1 = r8 + 12
            r7.A0I(r1)
            r1 = 0
            r7.A0K(r0, r1, r3)
            X.9lW r3 = new X.9lW
            r3.<init>((byte[]) r0)
            r1 = 9
            r3.A0I(r1)
            int r9 = r3.A04()
            r1 = 20
            r3.A0I(r1)
            int r1 = r3.A05()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            int r9 = X.C36381kD.A04(r1)
            int r10 = X.C36381kD.A03(r1)
            X.1Ak r3 = X.C23931Ak.of(r0)
            goto L_0x038e
        L_0x059a:
            r1 = r8
        L_0x059b:
            r15 = -1
            if (r1 == r15) goto L_0x038e
            X.9L9 r6 = A02(r7, r1)
            java.lang.String r4 = r6.A02
            byte[] r12 = r6.A03
            if (r12 == 0) goto L_0x038e
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x060c
            X.9jM r10 = new X.9jM
            r10.<init>(r12)
            r0 = 5
            int r0 = r10.A01(r0)
            r9 = 31
            if (r0 != r9) goto L_0x05c5
            r0 = 6
            int r0 = r10.A01(r0)
            int r0 = r0 + 32
        L_0x05c5:
            int r3 = X.C196929al.A00(r10)
            r1 = 4
            int r17 = r10.A01(r1)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r13 = "mp4a.40."
            java.lang.String r14 = X.AnonymousClass000.A0r(r13, r14, r0)
            r13 = 5
            if (r0 == r13) goto L_0x05df
            r13 = 29
            if (r0 != r13) goto L_0x05f9
        L_0x05df:
            int r3 = X.C196929al.A00(r10)
            r0 = 5
            int r0 = r10.A01(r0)
            if (r0 != r9) goto L_0x05f1
            r0 = 6
            int r0 = r10.A01(r0)
            int r0 = r0 + 32
        L_0x05f1:
            r9 = 22
            if (r0 != r9) goto L_0x05f9
            int r17 = r10.A01(r1)
        L_0x05f9:
            int[] r0 = X.C196929al.A00
            r1 = r0[r17]
            if (r1 == r15) goto L_0x1115
            X.9Ix r0 = new X.9Ix
            r0.<init>(r3, r1, r14)
            int r9 = r0.A01
            int r10 = r0.A00
            java.lang.String r0 = r0.A02
            r17 = r0
        L_0x060c:
            X.1Ak r3 = X.C23931Ak.of(r12)
            goto L_0x038e
        L_0x0612:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r6 != r0) goto L_0x061b
            java.lang.String r4 = "audio/eac3"
            goto L_0x035b
        L_0x061b:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r6 != r0) goto L_0x0624
            java.lang.String r4 = "audio/ac4"
            goto L_0x035b
        L_0x0624:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r6 != r0) goto L_0x062d
            java.lang.String r4 = "audio/vnd.dts"
            goto L_0x035b
        L_0x062d:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r6 == r0) goto L_0x06ca
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r6 == r0) goto L_0x06ca
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r6 != r0) goto L_0x0640
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x035b
        L_0x0640:
            r0 = 1685353336(0x64747378, float:1.8037304E22)
            if (r6 != r0) goto L_0x0649
            java.lang.String r4 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x035b
        L_0x0649:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r6 != r0) goto L_0x0652
            java.lang.String r4 = "audio/3gpp"
            goto L_0x035b
        L_0x0652:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r6 != r0) goto L_0x065b
            java.lang.String r4 = "audio/amr-wb"
            goto L_0x035b
        L_0x065b:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r6 == r0) goto L_0x06c6
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r6 == r0) goto L_0x06c6
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r6 != r0) goto L_0x066e
            r18 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x035d
        L_0x066e:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r6 == r0) goto L_0x06c2
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r6 == r0) goto L_0x06c2
            r0 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r6 != r0) goto L_0x0681
            java.lang.String r4 = "audio/mha1"
            goto L_0x035b
        L_0x0681:
            r0 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r6 != r0) goto L_0x068a
            java.lang.String r4 = "audio/mhm1"
            goto L_0x035b
        L_0x068a:
            if (r6 != r1) goto L_0x0690
            java.lang.String r4 = "audio/alac"
            goto L_0x035b
        L_0x0690:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r6 != r0) goto L_0x0699
            java.lang.String r4 = "audio/g711-alaw"
            goto L_0x035b
        L_0x0699:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r6 != r0) goto L_0x06a2
            java.lang.String r4 = "audio/g711-mlaw"
            goto L_0x035b
        L_0x06a2:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r6 != r0) goto L_0x06ab
            java.lang.String r4 = "audio/opus"
            goto L_0x035b
        L_0x06ab:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r6 != r0) goto L_0x06b4
            java.lang.String r4 = "audio/flac"
            goto L_0x035b
        L_0x06b4:
            r0 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r6 != r0) goto L_0x06bd
            java.lang.String r4 = "audio/true-hd"
            goto L_0x035b
        L_0x06bd:
            r18 = -1
            r4 = 0
            goto L_0x035d
        L_0x06c2:
            java.lang.String r4 = "audio/mpeg"
            goto L_0x035b
        L_0x06c6:
            r18 = 2
            goto L_0x035d
        L_0x06ca:
            java.lang.String r4 = "audio/vnd.dts.hd"
            goto L_0x035b
        L_0x06ce:
            java.lang.Object r0 = r2.second
            X.9MC r0 = (X.AnonymousClass9MC) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r3.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r0, r1)
            if (r0 != 0) goto L_0x0348
            X.9uV[] r0 = r3.A03
            X.AXg r11 = new X.AXg
            r11.<init>(r1, r0)
            goto L_0x0348
        L_0x06e5:
            int r10 = r7.A06()
            r7.A0J(r0)
            byte[] r9 = r7.A02
            int r0 = r7.A01
            int r1 = r0 + 1
            r7.A01 = r1
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r0 << 8
            int r0 = r1 + 1
            r7.A01 = r0
            byte r1 = r9[r1]
            r9 = r1 & 255(0xff, float:3.57E-43)
            r9 = r9 | r12
            int r0 = r0 + 2
            r7.A01 = r0
            int r0 = r0 - r13
            int r19 = X.C202309lW.A02(r7, r0)
            if (r8 != r2) goto L_0x0330
            r7.A0J(r4)
            goto L_0x0330
        L_0x0713:
            r7.A0J(r1)
            r8 = 0
            goto L_0x030a
        L_0x0719:
            if (r5 != 0) goto L_0x027a
            if (r4 == 0) goto L_0x027a
            r0 = r45
            X.9en r2 = A01(r4, r0)
            r0 = r17
            r2.A0N = r0
            r2.A04 = r10
            r2.A0E = r9
            r0 = r18
            r2.A0A = r0
            r2.A0S = r3
            r2.A00(r11)
            r0 = r40
            r2.A0Q = r0
            if (r6 == 0) goto L_0x074a
            long r0 = r6.A00
            int r0 = X.C129276Gg.A00(r0)
            r2.A03 = r0
            long r0 = r6.A01
            int r0 = X.C129276Gg.A00(r0)
            r2.A0B = r0
        L_0x074a:
            X.9uY r5 = new X.9uY
            r5.<init>(r2)
            goto L_0x027a
        L_0x0751:
            r32 = r3
            int r0 = r16 + 8
            int r0 = r0 + 8
            r7.A0I(r0)
            r0 = 16
            r7.A0J(r0)
            int r36 = r7.A06()
            int r37 = r7.A06()
            r0 = 50
            r7.A0J(r0)
            int r0 = r7.A01
            r28 = r0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r6 != r0) goto L_0x0790
            r1 = r16
            r0 = r31
            android.util.Pair r2 = A00(r7, r1, r0)
            if (r2 == 0) goto L_0x078b
            int r6 = X.C36381kD.A04(r2)
            if (r73 != 0) goto L_0x1085
            r32 = 0
        L_0x0787:
            java.lang.Object r0 = r2.second
            r34[r24] = r0
        L_0x078b:
            r0 = r28
            r7.A0I(r0)
        L_0x0790:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            java.lang.String r35 = "video/3gpp"
            if (r6 != r0) goto L_0x107b
            java.lang.String r11 = "video/mpeg"
        L_0x0799:
            r27 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r49 = 0
            r48 = 0
            r21 = -1
            r19 = -1
            r18 = -1
            r17 = -1
            r20 = 0
            r29 = 0
            r23 = 0
        L_0x07af:
            int r1 = r28 - r16
            r0 = r31
            if (r1 >= r0) goto L_0x07ca
            r0 = r28
            r7.A0I(r0)
            int r2 = r7.A01
            int r22 = r7.A03()
            if (r22 != 0) goto L_0x0839
            int r1 = r7.A01
            int r1 = r1 - r16
            r0 = r31
            if (r1 != r0) goto L_0x083c
        L_0x07ca:
            if (r11 == 0) goto L_0x027a
            r0 = r45
            X.9en r2 = A01(r11, r0)
            r0 = r49
            r2.A0N = r0
            r0 = r36
            r2.A0H = r0
            r0 = r37
            r2.A08 = r0
            r0 = r27
            r2.A01 = r0
            r0 = r30
            r2.A0D = r0
            r0 = r26
            r2.A0T = r0
            r0 = r21
            r2.A0G = r0
            r0 = r48
            r2.A0S = r0
            r0 = r32
            r2.A00(r0)
            r0 = -1
            r1 = r19
            if (r1 != r0) goto L_0x0834
            r1 = r18
            if (r1 != r0) goto L_0x0834
            r1 = r17
            if (r1 != r0) goto L_0x0834
            if (r20 == 0) goto L_0x0817
        L_0x0806:
            byte[] r1 = r20.array()
        L_0x080a:
            X.9tt r0 = new X.9tt
            r3 = r19
            r4 = r18
            r5 = r17
            r0.<init>(r1, r3, r4, r5)
            r2.A0M = r0
        L_0x0817:
            if (r29 == 0) goto L_0x082d
            r0 = r29
            long r0 = r0.A00
            int r0 = X.C129276Gg.A00(r0)
            r2.A03 = r0
            r0 = r29
            long r0 = r0.A01
            int r0 = X.C129276Gg.A00(r0)
            r2.A0B = r0
        L_0x082d:
            X.9uY r5 = new X.9uY
            r5.<init>(r2)
            goto L_0x027a
        L_0x0834:
            if (r20 != 0) goto L_0x0806
            r1 = r33
            goto L_0x080a
        L_0x0839:
            r1 = 1
            if (r22 > 0) goto L_0x083d
        L_0x083c:
            r1 = 0
        L_0x083d:
            r0 = r39
            X.C1893393h.A00(r1, r0)
            int r3 = r7.A03()
            r0 = 1635148611(0x61766343, float:2.8406573E20)
            if (r3 != r0) goto L_0x0a0e
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r1, r0)
            int r0 = r2 + 8
            r7.A0I(r0)
            r0 = 4
            int r1 = X.C202309lW.A01(r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 3
            r1 = r1 & 3
            int r14 = r1 + 1
            if (r14 == r0) goto L_0x111e
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11 = r0 & 31
            r9 = 0
            r8 = 0
        L_0x0871:
            if (r8 >= r11) goto L_0x0891
            int r4 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r12 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r7.A0J(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r3 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r2 = X.C113655ft.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 4
            r1 = 4
            int r0 = r0 + r4
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.System.arraycopy(r2, r9, r0, r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r10.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r8 = r8 + 1
            goto L_0x0871
        L_0x0891:
            int r13 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r8 = 0
        L_0x0896:
            if (r8 >= r13) goto L_0x08b6
            int r4 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r12 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r7.A0J(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r3 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r2 = X.C113655ft.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 4
            r1 = 4
            int r0 = r0 + r4
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.System.arraycopy(r2, r9, r0, r9, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.System.arraycopy(r3, r12, r0, r1, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r10.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r8 = r8 + 1
            goto L_0x0896
        L_0x08b6:
            r0 = 0
            if (r11 <= 0) goto L_0x09d9
            java.lang.Object r0 = r10.get(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r0 = (byte[]) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.Object r2 = r10.get(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            byte[] r2 = (byte[]) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r1 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = r14 + 1
            X.9lG r9 = new X.9lG     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r9.<init>(r2, r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 8
            int r8 = r9.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r15 = r9.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r13 = r9.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r1 = 3
            r4 = 1
            r0 = 100
            if (r8 == r0) goto L_0x0908
            r0 = 110(0x6e, float:1.54E-43)
            if (r8 == r0) goto L_0x0908
            r0 = 122(0x7a, float:1.71E-43)
            if (r8 == r0) goto L_0x0908
            r0 = 244(0xf4, float:3.42E-43)
            if (r8 == r0) goto L_0x0908
            r0 = 44
            if (r8 == r0) goto L_0x0908
            r0 = 83
            if (r8 == r0) goto L_0x0908
            r0 = 86
            if (r8 == r0) goto L_0x0908
            r0 = 118(0x76, float:1.65E-43)
            if (r8 == r0) goto L_0x0908
            r0 = 128(0x80, float:1.794E-43)
            if (r8 == r0) goto L_0x0908
            r0 = 138(0x8a, float:1.93E-43)
            if (r8 != r0) goto L_0x095c
        L_0x0908:
            int r0 = X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 != r1) goto L_0x0911
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0911:
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r2 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r2 == 0) goto L_0x095c
            r11 = 12
            if (r0 == r1) goto L_0x0926
            r11 = 8
        L_0x0926:
            r3 = 0
        L_0x0927:
            boolean r0 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0957
            r0 = 6
            r2 = 64
            if (r3 >= r0) goto L_0x0934
            r2 = 16
        L_0x0934:
            r46 = 8
            r1 = 0
        L_0x0937:
            int r38 = X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r12 = r38 % 2
            r0 = 1
            if (r12 != 0) goto L_0x0941
            r0 = -1
        L_0x0941:
            int r12 = r38 + 1
            int r12 = r12 / 2
            int r0 = r0 * r12
            int r0 = r0 + r46
            int r0 = r0 + 256
            int r0 = r0 % 256
            if (r0 == 0) goto L_0x0950
            r46 = r0
        L_0x0950:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0957
            if (r0 == 0) goto L_0x0950
            goto L_0x0937
        L_0x0957:
            int r3 = r3 + 1
            if (r3 >= r11) goto L_0x095c
            goto L_0x0927
        L_0x095c:
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 != 0) goto L_0x09b7
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0968:
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 != 0) goto L_0x097d
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x097d:
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            boolean r0 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x0992
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x0992:
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x09e4
            boolean r0 = r9.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x09e4
            r0 = 8
            int r2 = r9.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x09dc
            r2 = 16
            int r0 = r9.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r2 = r9.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            if (r0 == 0) goto L_0x09e4
            goto L_0x09d3
        L_0x09b7:
            if (r0 != r4) goto L_0x0968
            r9.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r0 = X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            long r2 = (long) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r11 = 0
        L_0x09c8:
            long r0 = (long) r11     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0968
            X.C202209lG.A00(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            int r11 = r11 + 1
            goto L_0x09c8
        L_0x09d3:
            if (r2 == 0) goto L_0x09e4
            float r1 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            float r0 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            float r1 = r1 / r0
            goto L_0x09e4
        L_0x09d9:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x09f7
        L_0x09dc:
            float[] r3 = X.C190949Ay.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r0 = 17
            if (r2 >= r0) goto L_0x09fe
            r1 = r3[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x09e4:
            java.lang.Object[] r0 = X.C36441kJ.A1Q()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.AnonymousClass000.A1J(r0, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.AnonymousClass000.A1L(r0, r15, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            X.C36331k8.A1V(r0, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r2 = "avc1.%02X%02X%02X"
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x09f7:
            X.9LD r2 = new X.9LD     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            r2.<init>(r0, r10, r1, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x1063
        L_0x09fe:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r2 = X.AnonymousClass000.A0r(r0, r3, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            goto L_0x09e4
        L_0x0a0e:
            r0 = 1752589123(0x68766343, float:4.6541328E24)
            if (r3 != r0) goto L_0x0dd1
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r1, r0)
            int r0 = r2 + 8
            r7.A0I(r0)
            r0 = 21
            int r0 = X.C202309lW.A01(r7, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r64 = r0 & 3
            int r63 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r3 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = 0
            r62 = 0
        L_0x0a32:
            r1 = 1
            r0 = r63
            if (r2 >= r0) goto L_0x0a52
            r7.A0J(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r4 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r1 = 0
        L_0x0a3f:
            if (r1 >= r4) goto L_0x0a4f
            int r0 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r8 = r0 + 4
            int r62 = r62 + r8
            r7.A0J(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r1 = r1 + 1
            goto L_0x0a3f
        L_0x0a4f:
            int r2 = r2 + 1
            goto L_0x0a32
        L_0x0a52:
            r7.A0I(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r62
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r66 = r0
            r2 = 0
            r61 = 0
            r11 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0a61:
            r1 = r61
            r0 = r63
            if (r1 >= r0) goto L_0x0da9
            int r0 = r7.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10 = r0 & 127(0x7f, float:1.78E-43)
            int r60 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r59 = 0
        L_0x0a73:
            r1 = r59
            r0 = r60
            if (r1 >= r0) goto L_0x0da5
            int r58 = r7.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            byte[] r4 = X.C190949Ay.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r3 = 4
            r1 = 0
            r0 = r66
            java.lang.System.arraycopy(r4, r1, r0, r11, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r11 = r11 + 4
            byte[] r4 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r3 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r1 = r0
            r0 = r58
            java.lang.System.arraycopy(r4, r3, r1, r11, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 33
            if (r10 != r0) goto L_0x0d9a
            if (r59 != 0) goto L_0x0d9a
            int r2 = r11 + r58
            int r1 = r11 + 2
            X.9lG r10 = new X.9lG     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r66
            r10.<init>(r0, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 4
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = 3
            int r1 = r10.A03(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 2
            int r57 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r56 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 5
            int r55 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r54 = 0
            r3 = 0
        L_0x0ac0:
            r0 = 32
            r9 = 1
            if (r3 >= r0) goto L_0x0ad1
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0ace
            int r9 = r9 << r3
            r54 = r54 | r9
        L_0x0ace:
            int r3 = r3 + 1
            goto L_0x0ac0
        L_0x0ad1:
            r3 = 6
            int[] r0 = new int[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r53 = r0
            r4 = 0
        L_0x0ad7:
            r0 = 8
            int r0 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r53[r4] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x0ad7
            r0 = 8
            int r52 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r3 = 0
            r0 = 0
        L_0x0aeb:
            if (r3 >= r1) goto L_0x0b00
            boolean r4 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r4 == 0) goto L_0x0af5
            int r0 = r0 + 89
        L_0x0af5:
            boolean r4 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r4 == 0) goto L_0x0afd
            int r0 = r0 + 8
        L_0x0afd:
            int r3 = r3 + 1
            goto L_0x0aeb
        L_0x0b00:
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r1 <= 0) goto L_0x0b0c
            int r0 = 8 - r1
            int r0 = r0 * 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0b0c:
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 != r2) goto L_0x0b18
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0b18:
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0b30
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0b30:
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r51 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r2 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r1
            if (r2 == 0) goto L_0x0b42
            r0 = 0
        L_0x0b42:
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 > r1) goto L_0x0b50
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = r0 + 1
            goto L_0x0b42
        L_0x0b50:
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0b9d
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0b9d
            r1 = 0
        L_0x0b69:
            r2 = 0
        L_0x0b6a:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r4 = 1
            if (r0 != 0) goto L_0x0b75
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            goto L_0x0b8f
        L_0x0b75:
            r3 = 64
            int r0 = r1 << 1
            int r0 = r0 + 4
            int r0 = r9 << r0
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r1 <= r9) goto L_0x0b86
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0b86:
            r0 = 0
        L_0x0b87:
            if (r0 >= r3) goto L_0x0b8f
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = r0 + 1
            goto L_0x0b87
        L_0x0b8f:
            r0 = 3
            if (r1 != r0) goto L_0x0b93
            r4 = 3
        L_0x0b93:
            int r2 = r2 + r4
            r0 = 6
            if (r2 < r0) goto L_0x0b6a
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0b9d
            goto L_0x0b69
        L_0x0b9d:
            r0 = 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0bb5
            r0 = 8
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0bb5:
            int r50 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 0
            int[] r15 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int[] r12 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r8 = -1
            r4 = -1
            r49 = 0
        L_0x0bc2:
            r1 = r50
            r0 = r49
            if (r0 >= r1) goto L_0x0cb1
            if (r0 == 0) goto L_0x0c7f
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0c7f
            int r13 = r8 + r4
            boolean r2 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r1 = r0 + 1
            int r0 = r2 * 2
            int r48 = 1 - r0
            int r48 = r48 * r1
            int r2 = r13 + 1
            boolean[] r3 = new boolean[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 0
        L_0x0be7:
            if (r0 > r13) goto L_0x0bfb
            boolean r1 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r1 != 0) goto L_0x0bf6
            boolean r1 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r3[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            goto L_0x0bf8
        L_0x0bf6:
            r3[r0] = r9     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0bf8:
            int r0 = r0 + 1
            goto L_0x0be7
        L_0x0bfb:
            int[] r1 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int[] r14 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r46 = r4 + -1
            r2 = 0
        L_0x0c02:
            if (r46 < 0) goto L_0x0c18
            r38 = r12[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r38 = r38 + r48
            if (r38 >= 0) goto L_0x0c15
            int r0 = r8 + r46
            boolean r0 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0c15
            int r0 = r2 + 1
            r1[r2] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = r0
        L_0x0c15:
            int r46 = r46 + -1
            goto L_0x0c02
        L_0x0c18:
            if (r48 >= 0) goto L_0x0c23
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0c23
            int r0 = r2 + 1
            r1[r2] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = r0
        L_0x0c23:
            r0 = 0
        L_0x0c24:
            if (r0 >= r8) goto L_0x0c39
            r46 = r15[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r46 = r46 + r48
            if (r46 >= 0) goto L_0x0c36
            boolean r38 = r3[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r38 == 0) goto L_0x0c36
            int r38 = r2 + 1
            r1[r2] = r46     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = r38
        L_0x0c36:
            int r0 = r0 + 1
            goto L_0x0c24
        L_0x0c39:
            int[] r47 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r46 = r8 + -1
            r1 = 0
        L_0x0c40:
            if (r46 < 0) goto L_0x0c54
            r38 = r15[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r38 = r38 + r48
            if (r38 <= 0) goto L_0x0c51
            boolean r0 = r3[r46]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0c51
            int r0 = r1 + 1
            r14[r1] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r1 = r0
        L_0x0c51:
            int r46 = r46 + -1
            goto L_0x0c40
        L_0x0c54:
            if (r48 <= 0) goto L_0x0c5f
            boolean r0 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0c5f
            int r0 = r1 + 1
            r14[r1] = r48     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r1 = r0
        L_0x0c5f:
            r0 = 0
        L_0x0c60:
            if (r0 >= r4) goto L_0x0c76
            r15 = r12[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r15 = r15 + r48
            if (r15 <= 0) goto L_0x0c73
            int r13 = r8 + r0
            boolean r13 = r3[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r13 == 0) goto L_0x0c73
            int r13 = r1 + 1
            r14[r1] = r15     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r1 = r13
        L_0x0c73:
            int r0 = r0 + 1
            goto L_0x0c60
        L_0x0c76:
            int[] r12 = java.util.Arrays.copyOf(r14, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r15 = r47
            r8 = r2
            r4 = r1
            goto L_0x0cad
        L_0x0c7f:
            int r8 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r4 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int[] r15 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 0
        L_0x0c8a:
            if (r0 >= r8) goto L_0x0c9a
            int r1 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r1 = r1 + 1
            r15[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = r0 + 1
            goto L_0x0c8a
        L_0x0c9a:
            int[] r12 = new int[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 0
        L_0x0c9d:
            if (r0 >= r4) goto L_0x0cad
            int r1 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r1 = r1 + 1
            r12[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = r0 + 1
            goto L_0x0c9d
        L_0x0cad:
            int r49 = r49 + 1
            goto L_0x0bc2
        L_0x0cb1:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0cc8
            r1 = 0
        L_0x0cb8:
            int r0 = X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r1 >= r0) goto L_0x0cc8
            int r0 = r51 + 4
            int r0 = r0 + 1
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r1 = r1 + 1
            goto L_0x0cb8
        L_0x0cc8:
            r0 = 2
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r8 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0d2e
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0cfe
            r0 = 8
            int r2 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x0cf6
            r0 = 16
            int r1 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r0 = r10.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r1 == 0) goto L_0x0cfe
            if (r0 == 0) goto L_0x0cfe
            float r8 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            float r8 = r8 / r0
            goto L_0x0cfe
        L_0x0cf6:
            float[] r1 = X.C190949Ay.A03     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 17
            if (r2 >= r0) goto L_0x0d45
            r8 = r1[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0cfe:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0d07
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0d07:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0d1c
            r0 = 4
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0d1c
            r0 = 24
            r10.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0d1c:
            boolean r0 = r10.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 == 0) goto L_0x0d28
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.C202209lG.A00(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0d28:
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r10.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0d2e:
            r10 = 33
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String[] r0 = X.C113655ft.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r0[r57]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r4 = 0
            r1[r4] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r55
            X.AnonymousClass000.A1L(r1, r0, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r54
            X.C36331k8.A1V(r1, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            goto L_0x0d55
        L_0x0d45:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String r0 = "NalUnitUtil"
            android.util.Log.w(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            goto L_0x0cfe
        L_0x0d55:
            r0 = 76
            if (r56 == 0) goto L_0x0d5b
            r0 = 72
        L_0x0d5b:
            java.lang.Character r2 = java.lang.Character.valueOf(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = 3
            r1[r0] = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r2 = 4
            r0 = r52
            X.AnonymousClass000.A1L(r1, r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String r2 = "hvc1.%s%d.%X.%c%d"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.StringBuilder r12 = X.C90524aI.A0i(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r3 = 6
        L_0x0d75:
            int r0 = r3 + -1
            r0 = r53[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            if (r0 != 0) goto L_0x0d80
            int r3 = r3 + -1
            if (r3 <= 0) goto L_0x0d96
            goto L_0x0d75
        L_0x0d80:
            r2 = 0
        L_0x0d81:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0 = r53[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            X.AnonymousClass000.A1L(r1, r0, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.lang.String r0 = ".%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r12.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0d96
            goto L_0x0d81
        L_0x0d96:
            java.lang.String r2 = r12.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0d9a:
            int r11 = r11 + r58
            r0 = r58
            r7.A0J(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            int r59 = r59 + 1
            goto L_0x0a73
        L_0x0da5:
            int r61 = r61 + 1
            goto L_0x0a61
        L_0x0da9:
            if (r62 != 0) goto L_0x0db0
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            goto L_0x0db4
        L_0x0db0:
            java.util.List r3 = java.util.Collections.singletonList(r66)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
        L_0x0db4:
            int r1 = r64 + 1
            X.9LE r0 = new X.9LE     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            r0.<init>(r2, r3, r8, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x112d }
            java.util.List r1 = r0.A03
            r48 = r1
            int r1 = r0.A01
            r38 = r1
            if (r23 != 0) goto L_0x0dc9
            float r1 = r0.A00
            r27 = r1
        L_0x0dc9:
            java.lang.String r0 = r0.A02
            r49 = r0
            java.lang.String r11 = "video/hevc"
            goto L_0x1077
        L_0x0dd1:
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r3 == r0) goto L_0x101b
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r3 == r0) goto L_0x101b
            r0 = 1987076931(0x76706343, float:1.21891066E33)
            r1 = 2
            if (r3 != r0) goto L_0x0e48
            boolean r3 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r3, r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 != r0) goto L_0x0e45
            java.lang.String r11 = "video/x-vnd.on2.vp8"
        L_0x0df1:
            int r0 = r2 + 12
            r7.A0I(r0)
            int r0 = X.C202309lW.A01(r7, r1)
            r0 = r0 & 1
            boolean r4 = X.AnonymousClass000.A1P(r0)
            int r1 = r7.A04()
            int r2 = r7.A04()
            r19 = 1
            r0 = 1
            if (r1 == r0) goto L_0x0e21
            r0 = 9
            r3 = 6
            if (r1 == r0) goto L_0x0e42
            r0 = 4
            if (r1 == r0) goto L_0x0e1f
            r0 = 5
            if (r1 == r0) goto L_0x0e1f
            if (r1 == r3) goto L_0x0e1f
            r0 = 7
            r19 = -1
            if (r1 != r0) goto L_0x0e21
        L_0x0e1f:
            r19 = 2
        L_0x0e21:
            r18 = 2
            if (r4 == 0) goto L_0x0e27
            r18 = 1
        L_0x0e27:
            r0 = 1
            if (r2 == r0) goto L_0x0e3e
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x1077
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x1077
            if (r2 == r1) goto L_0x0e3e
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x1077
        L_0x0e3e:
            r17 = 3
            goto L_0x1077
        L_0x0e42:
            r19 = 6
            goto L_0x0e21
        L_0x0e45:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            goto L_0x0df1
        L_0x0e48:
            r0 = 1635135811(0x61763143, float:2.8384055E20)
            if (r3 != r0) goto L_0x0e5a
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r1, r0)
            java.lang.String r11 = "video/av01"
            goto L_0x1077
        L_0x0e5a:
            r0 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r3 != r0) goto L_0x0e84
            if (r20 != 0) goto L_0x0e6d
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0e6d:
            r0 = 21
            r1 = r20
            r1.position(r0)
            short r0 = r7.A0F()
            r1.putShort(r0)
            short r0 = r7.A0F()
            r1.putShort(r0)
            goto L_0x1077
        L_0x0e84:
            r0 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r3 != r0) goto L_0x0ef6
            if (r20 != 0) goto L_0x0e97
            r0 = 25
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r20 = r1.order(r0)
        L_0x0e97:
            short r14 = r7.A0F()
            short r47 = r7.A0F()
            short r46 = r7.A0F()
            short r15 = r7.A0F()
            short r13 = r7.A0F()
            short r12 = r7.A0F()
            short r10 = r7.A0F()
            short r9 = r7.A0F()
            long r2 = r7.A09()
            long r0 = r7.A09()
            r8 = 1
            r4 = r20
            r4.position(r8)
            r4.putShort(r13)
            r4.putShort(r12)
            r4.putShort(r14)
            r8 = r4
            r4 = r47
            r8.putShort(r4)
            r4 = r46
            r8.putShort(r4)
            r8.putShort(r15)
            r8.putShort(r10)
            r8.putShort(r9)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 / r8
            int r4 = (int) r2
            short r3 = (short) r4
            r2 = r20
            r2.putShort(r3)
            long r0 = r0 / r8
            int r2 = (int) r0
            short r0 = (short) r2
            r1 = r20
            r1.putShort(r0)
            goto L_0x1077
        L_0x0ef6:
            r0 = 1681012275(0x64323633, float:1.3149704E22)
            if (r3 != r0) goto L_0x0f08
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r1, r0)
            r11 = r35
            goto L_0x1077
        L_0x0f08:
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r3 != r0) goto L_0x0f28
            boolean r1 = X.AnonymousClass000.A1W(r11)
            r0 = r33
            X.C1893393h.A00(r1, r0)
            X.9L9 r29 = A02(r7, r2)
            r0 = r29
            java.lang.String r11 = r0.A02
            byte[] r0 = r0.A03
            if (r0 == 0) goto L_0x1077
            X.1Ak r48 = X.C23931Ak.of(r0)
            goto L_0x1077
        L_0x0f28:
            r0 = 1885434736(0x70617370, float:2.7909473E29)
            if (r3 != r0) goto L_0x0f44
            int r0 = r2 + 8
            r7.A0I(r0)
            int r0 = r7.A05()
            int r1 = r7.A05()
            float r0 = (float) r0
            r27 = r0
            float r0 = (float) r1
            float r27 = r27 / r0
            r23 = 1
            goto L_0x1077
        L_0x0f44:
            r0 = 1937126244(0x73763364, float:1.9506033E31)
            if (r3 != r0) goto L_0x0f6d
            int r4 = r2 + 8
        L_0x0f4b:
            int r1 = r4 - r2
            r0 = r22
            if (r1 >= r0) goto L_0x0f69
            int r3 = X.C202309lW.A02(r7, r4)
            int r1 = r7.A03()
            r0 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r0) goto L_0x0f67
            byte[] r0 = r7.A02
            int r3 = r3 + r4
            byte[] r26 = java.util.Arrays.copyOfRange(r0, r4, r3)
            goto L_0x1077
        L_0x0f67:
            int r4 = r4 + r3
            goto L_0x0f4b
        L_0x0f69:
            r26 = 0
            goto L_0x1077
        L_0x0f6d:
            r0 = 1936995172(0x73743364, float:1.9347576E31)
            if (r3 != r0) goto L_0x0f99
            int r0 = r7.A04()
            r3 = 3
            r7.A0J(r3)
            if (r0 != 0) goto L_0x1077
            int r2 = r7.A04()
            if (r2 == 0) goto L_0x0f95
            r0 = 1
            if (r2 == r0) goto L_0x0f91
            if (r2 == r1) goto L_0x0f8d
            if (r2 != r3) goto L_0x1077
            r21 = 3
            goto L_0x1077
        L_0x0f8d:
            r21 = 2
            goto L_0x1077
        L_0x0f91:
            r21 = 1
            goto L_0x1077
        L_0x0f95:
            r21 = 0
            goto L_0x1077
        L_0x0f99:
            r0 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r3 != r0) goto L_0x1077
            int r2 = r7.A03()
            r0 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r2 == r0) goto L_0x0fc4
            r0 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r2 == r0) goto L_0x0fc4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported color type: "
            r1.append(r0)
            java.lang.String r0 = X.C201069ij.A00(r2)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x1077
        L_0x0fc4:
            int r0 = r7.A06()
            int r2 = r7.A06()
            r7.A0J(r1)
            r1 = 19
            r3 = r22
            if (r3 != r1) goto L_0x0fde
            int r1 = r7.A04()
            r1 = r1 & 128(0x80, float:1.794E-43)
            r4 = 1
            if (r1 != 0) goto L_0x0fdf
        L_0x0fde:
            r4 = 0
        L_0x0fdf:
            r19 = 1
            r1 = 1
            if (r0 == r1) goto L_0x0ff8
            r1 = 9
            r3 = 6
            if (r0 == r1) goto L_0x1018
            r1 = 4
            if (r0 == r1) goto L_0x0ff6
            r1 = 5
            if (r0 == r1) goto L_0x0ff6
            if (r0 == r3) goto L_0x0ff6
            r1 = 7
            r19 = -1
            if (r0 != r1) goto L_0x0ff8
        L_0x0ff6:
            r19 = 2
        L_0x0ff8:
            r18 = 2
            if (r4 == 0) goto L_0x0ffe
            r18 = 1
        L_0x0ffe:
            r0 = 1
            if (r2 == r0) goto L_0x1015
            r0 = 16
            r1 = 6
            r17 = 6
            if (r2 == r0) goto L_0x1077
            r0 = 18
            r17 = 7
            if (r2 == r0) goto L_0x1077
            if (r2 == r1) goto L_0x1015
            r0 = 7
            r17 = -1
            if (r2 != r0) goto L_0x1077
        L_0x1015:
            r17 = 3
            goto L_0x1077
        L_0x1018:
            r19 = 6
            goto L_0x0ff8
        L_0x101b:
            r0 = 2
            int r0 = X.C202309lW.A01(r7, r0)
            int r3 = r0 >> 1
            r4 = r0 & 1
            r2 = 5
            int r4 = r4 << r2
            int r0 = r7.A04()
            int r0 = r0 >> 3
            r1 = r0 & 31
            r1 = r1 | r4
            r0 = 4
            if (r3 == r0) goto L_0x1060
            if (r3 == r2) goto L_0x1060
            r0 = 7
            if (r3 == r0) goto L_0x1060
            r0 = 8
            if (r3 != r0) goto L_0x1059
            java.lang.String r0 = "hev1"
        L_0x103d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = ".0"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r2, r1)
            X.9Bp r0 = new X.9Bp
            r0.<init>(r1)
            java.lang.String r0 = r0.A00
            r49 = r0
            java.lang.String r11 = "video/dolby-vision"
            goto L_0x1077
        L_0x1059:
            r0 = 9
            if (r3 != r0) goto L_0x1077
            java.lang.String r0 = "avc3"
            goto L_0x103d
        L_0x1060:
            java.lang.String r0 = "dvhe"
            goto L_0x103d
        L_0x1063:
            java.util.List r0 = r2.A03
            r48 = r0
            int r0 = r2.A01
            r38 = r0
            if (r23 != 0) goto L_0x1071
            float r0 = r2.A00
            r27 = r0
        L_0x1071:
            java.lang.String r0 = r2.A02
            r49 = r0
            java.lang.String r11 = "video/avc"
        L_0x1077:
            int r28 = r28 + r22
            goto L_0x07af
        L_0x107b:
            r0 = 1211250227(0x48323633, float:182488.8)
            r11 = 0
            if (r6 != r0) goto L_0x0799
            r11 = r35
            goto L_0x0799
        L_0x1085:
            java.lang.Object r0 = r2.second
            X.9MC r0 = (X.AnonymousClass9MC) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r3.A02
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0E(r0, r1)
            if (r0 != 0) goto L_0x0787
            X.9uV[] r3 = r3.A03
            X.AXg r32 = new X.AXg
            r0 = r32
            r0.<init>(r1, r3)
            goto L_0x0787
        L_0x109e:
            if (r5 != r2) goto L_0x0095
            if (r7 != r3) goto L_0x0095
            if (r8 != 0) goto L_0x0095
            r30 = 270(0x10e, float:3.78E-43)
            goto L_0x0095
        L_0x10a8:
            if (r6 != r2) goto L_0x0095
            if (r5 != 0) goto L_0x0095
            if (r7 != 0) goto L_0x0095
            if (r8 != r2) goto L_0x0095
            r30 = 180(0xb4, float:2.52E-43)
            goto L_0x0095
        L_0x10b4:
            if (r9 != 0) goto L_0x10c3
            long r9 = r8.A09()
        L_0x10ba:
            r5 = 0
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0071
            r0 = r9
            goto L_0x0071
        L_0x10c3:
            long r9 = r8.A0A()
            goto L_0x10ba
        L_0x10c8:
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x005d
            r2 = 1
            goto L_0x0067
        L_0x10cf:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto L_0x10d8
            r25 = 2
            goto L_0x0027
        L_0x10d8:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L_0x10f7
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L_0x10f7
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L_0x10f7
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 == r0) goto L_0x10f7
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r25 = -1
            if (r1 != r0) goto L_0x0027
            r25 = 5
            goto L_0x0027
        L_0x10f7:
            r25 = 3
            goto L_0x0027
        L_0x10fb:
            java.lang.IllegalStateException r3 = X.C165617ti.A0V()
            throw r3
        L_0x1100:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0 = r19
            java.lang.String r2 = X.AnonymousClass000.A0r(r1, r2, r0)
            r1 = 1
            X.8xn r3 = new X.8xn
            r0 = r33
            r3.<init>(r2, r0, r1)
            throw r3
        L_0x1115:
            r3 = 1
            r2 = r33
            X.8xn r1 = new X.8xn
            r1.<init>(r2, r2, r3)
            throw r1
        L_0x111e:
            java.lang.IllegalStateException r0 = X.C165617ti.A0V()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1123 }
        L_0x1123:
            r3 = move-exception
            java.lang.String r2 = "Error parsing AVC config"
            r1 = 1
            X.8xn r0 = new X.8xn
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x112d:
            r3 = move-exception
            java.lang.String r2 = "Error parsing HEVC config"
            r1 = 1
            X.8xn r0 = new X.8xn
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x1137:
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r0 = r67
            X.82h r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x11bc
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.82g r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x11bc
            X.9lW r9 = r0.A00
            int r8 = X.C202309lW.A00(r9)
            int r7 = r9.A05()
            long[] r6 = new long[r7]
            long[] r4 = new long[r7]
            r3 = 0
        L_0x115a:
            if (r3 >= r7) goto L_0x118c
            r2 = 1
            if (r8 != r2) goto L_0x1180
            long r0 = r9.A0A()
        L_0x1163:
            r6[r3] = r0
            if (r8 != r2) goto L_0x117a
            long r0 = r9.A08()
        L_0x116b:
            r4[r3] = r0
            short r0 = r9.A0F()
            if (r0 != r2) goto L_0x1185
            r0 = 2
            r9.A0J(r0)
            int r3 = r3 + 1
            goto L_0x115a
        L_0x117a:
            int r0 = r9.A03()
            long r0 = (long) r0
            goto L_0x116b
        L_0x1180:
            long r0 = r9.A09()
            goto L_0x1163
        L_0x1185:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x118c:
            android.util.Pair r0 = android.util.Pair.create(r6, r4)
            if (r0 == 0) goto L_0x11bc
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x119a:
            if (r5 == 0) goto L_0x11bb
            r2 = r44
            java.lang.Object r2 = r2.first
            long r67 = X.C36431kI.A09(r2)
            X.9OI r33 = new X.9OI
            r58 = r33
            r59 = r5
            r60 = r1
            r61 = r0
            r62 = r34
            r63 = r45
            r64 = r25
            r66 = r38
            r69 = r42
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r69, r71)
        L_0x11bb:
            return r33
        L_0x11bc:
            r1 = r33
            r0 = r1
            goto L_0x119a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201799kP.A03(X.AXg, X.82h, X.82g, long, boolean):X.9OI");
    }
}
