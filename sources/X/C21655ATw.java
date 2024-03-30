package X;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: X.ATw  reason: case insensitive filesystem */
public abstract class C21655ATw implements Closeable {
    public static final String[] A04 = new String[128];
    public int[] A00 = new int[32];
    public int A01;
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];

    public static void A0C(AnonymousClass81I r3) {
        r3.A00 = 0;
        int[] iArr = r3.A02;
        int i = r3.A01 - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double A0D() {
        /*
            r8 = this;
            r4 = r8
            X.81I r4 = (X.AnonymousClass81I) r4
            int r1 = A09(r4)
            r0 = 16
            if (r1 != r0) goto L_0x0012
            A0C(r4)
            long r0 = r4.A02
            double r2 = (double) r0
            return r2
        L_0x0012:
            r0 = 17
            java.lang.String r7 = "Expected a double but was "
            r6 = 11
            java.lang.String r5 = " at path "
            if (r1 != r0) goto L_0x002c
            X.AU1 r3 = r4.A04
            int r0 = r4.A01
            long r1 = (long) r0
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05
            java.lang.String r0 = r3.A03(r0, r1)
        L_0x0027:
            r4.A03 = r0
        L_0x0029:
            r4.A00 = r6
            goto L_0x004e
        L_0x002c:
            r0 = 9
            if (r1 != r0) goto L_0x0037
            X.AUq r0 = X.AnonymousClass81I.A06
        L_0x0032:
            java.lang.String r0 = X.AnonymousClass81I.A04(r4, r0)
            goto L_0x0027
        L_0x0037:
            r0 = 8
            if (r1 != r0) goto L_0x003e
            X.AUq r0 = X.AnonymousClass81I.A07
            goto L_0x0032
        L_0x003e:
            r0 = 10
            if (r1 != r0) goto L_0x0047
            java.lang.String r0 = X.AnonymousClass81I.A03(r4)
            goto L_0x0027
        L_0x0047:
            if (r1 == r6) goto L_0x0029
            X.Aam r1 = A0A(r4, r7)
            throw r1
        L_0x004e:
            java.lang.String r0 = r4.A03     // Catch:{ NumberFormatException -> 0x0084 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0084 }
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x0067
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x0067
            r0 = 0
            r4.A03 = r0
            A0C(r4)
            return r2
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "JSON forbids NaN and infinities: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r0 = r4.A0K()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8xM r1 = new X.8xM
            r1.<init>(r0)
            throw r1
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)
            java.lang.String r0 = r4.A03
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r4.A0K()
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.Aam r0 = new X.Aam
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21655ATw.A0D():double");
    }

    public int A0E() {
        C21671AUq aUq;
        AnonymousClass81I r6 = (AnonymousClass81I) this;
        int A09 = A09(r6);
        if (A09 == 16) {
            long j = r6.A02;
            int i = (int) j;
            if (j == ((long) i)) {
                A0C(r6);
                return i;
            }
            StringBuilder A0v = AnonymousClass000.A0v("Expected an int but was ");
            A0v.append(j);
            A0v.append(" at path ");
            throw new C21811Aam(AnonymousClass000.A0q(r6.A0K(), A0v));
        }
        if (A09 == 17) {
            r6.A03 = r6.A04.A03(AnonymousClass0S4.A05, (long) r6.A01);
        } else {
            if (A09 == 9) {
                aUq = AnonymousClass81I.A06;
            } else if (A09 == 8) {
                aUq = AnonymousClass81I.A07;
            } else if (A09 != 11) {
                throw A0A(r6, "Expected an int but was ");
            }
            String A042 = AnonymousClass81I.A04(r6, aUq);
            r6.A03 = A042;
            try {
                int parseInt = Integer.parseInt(A042);
                A0C(r6);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        r6.A00 = 11;
        try {
            String str = r6.A03;
            double parseDouble = Double.parseDouble(str);
            int i2 = (int) parseDouble;
            if (((double) i2) == parseDouble) {
                r6.A03 = null;
                A0C(r6);
                return i2;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D("Expected an int but was ", str, " at path ", A0u);
            throw new C21811Aam(AnonymousClass000.A0q(r6.A0K(), A0u));
        } catch (NumberFormatException unused2) {
            StringBuilder A0v2 = AnonymousClass000.A0v("Expected an int but was ");
            A0v2.append(r6.A03);
            A0v2.append(" at path ");
            throw new C21811Aam(AnonymousClass000.A0q(r6.A0K(), A0v2));
        }
    }

    public Integer A0H() {
        switch (A09((AnonymousClass81I) this)) {
            case 1:
                return C023109s.A0C;
            case 2:
                return C023109s.A0G;
            case 3:
                return C023109s.A00;
            case 4:
                return C023109s.A01;
            case 5:
            case 6:
                return C023109s.A0W;
            case 7:
                return C023109s.A0X;
            case 8:
            case 9:
            case 10:
            case 11:
                return C023109s.A0S;
            case 16:
            case 17:
                return C023109s.A0V;
            case 18:
                return C023109s.A0Y;
            default:
                return C023109s.A0R;
        }
    }

    public String A0I() {
        String str;
        C21671AUq aUq;
        AnonymousClass81I r3 = (AnonymousClass81I) this;
        int A09 = A09(r3);
        if (A09 == 14) {
            str = AnonymousClass81I.A03(r3);
        } else {
            if (A09 == 13) {
                aUq = AnonymousClass81I.A06;
            } else if (A09 == 12) {
                aUq = AnonymousClass81I.A07;
            } else if (A09 == 15) {
                str = r3.A03;
            } else {
                throw A0B(r3, "Expected a name but was ", AnonymousClass000.A0u());
            }
            str = AnonymousClass81I.A04(r3, aUq);
        }
        r3.A00 = 0;
        r3.A03[r3.A01 - 1] = str;
        return str;
    }

    public String A0J() {
        String A032;
        AnonymousClass81I r4 = (AnonymousClass81I) this;
        int A09 = A09(r4);
        if (A09 == 10) {
            A032 = AnonymousClass81I.A03(r4);
        } else if (A09 == 9) {
            A032 = AnonymousClass81I.A04(r4, AnonymousClass81I.A06);
        } else if (A09 == 8) {
            A032 = AnonymousClass81I.A04(r4, AnonymousClass81I.A07);
        } else if (A09 == 11) {
            A032 = r4.A03;
            r4.A03 = null;
        } else if (A09 == 16) {
            A032 = Long.toString(r4.A02);
        } else if (A09 == 17) {
            A032 = r4.A04.A03(AnonymousClass0S4.A05, (long) r4.A01);
        } else {
            throw A0B(r4, "Expected a string but was ", AnonymousClass000.A0u());
        }
        A0C(r4);
        return A032;
    }

    public void A0L() {
        AnonymousClass81I r3 = (AnonymousClass81I) this;
        if (A09(r3) == 3) {
            r3.A0R(1);
            r3.A02[r3.A01 - 1] = 0;
            r3.A00 = 0;
            return;
        }
        throw A0B(r3, "Expected BEGIN_ARRAY but was ", AnonymousClass000.A0u());
    }

    public void A0M() {
        AnonymousClass81I r2 = (AnonymousClass81I) this;
        if (A09(r2) == 1) {
            r2.A0R(3);
            r2.A00 = 0;
            return;
        }
        throw A0B(r2, "Expected BEGIN_OBJECT but was ", AnonymousClass000.A0u());
    }

    public void A0N() {
        AnonymousClass81I r2 = (AnonymousClass81I) this;
        if (A09(r2) == 4) {
            int i = r2.A01 - 1;
            r2.A01 = i;
            C165587tf.A1V(r2.A02, i - 1);
            r2.A00 = 0;
            return;
        }
        throw A0B(r2, "Expected END_ARRAY but was ", AnonymousClass000.A0u());
    }

    public void A0O() {
        AnonymousClass81I r3 = (AnonymousClass81I) this;
        if (A09(r3) == 2) {
            int i = r3.A01 - 1;
            r3.A01 = i;
            r3.A03[i] = null;
            C165587tf.A1V(r3.A02, i - 1);
            r3.A00 = 0;
            return;
        }
        throw A0B(r3, "Expected END_OBJECT but was ", AnonymousClass000.A0u());
    }

    public void A0P() {
        C21671AUq aUq;
        AnonymousClass81I r6 = (AnonymousClass81I) this;
        int A09 = A09(r6);
        if (A09 == 14) {
            long BKH = r6.A05.BKH(AnonymousClass81I.A08);
            AU1 au1 = r6.A04;
            if (BKH == -1) {
                BKH = au1.A00;
            }
            au1.A06(BKH);
        } else {
            if (A09 == 13) {
                aUq = AnonymousClass81I.A06;
            } else if (A09 == 12) {
                aUq = AnonymousClass81I.A07;
            } else if (A09 != 15) {
                throw A0B(r6, "Expected a name but was ", AnonymousClass000.A0u());
            }
            AnonymousClass81I.A06(r6, aUq);
        }
        r6.A00 = 0;
        r6.A03[r6.A01 - 1] = "null";
    }

    public void A0Q() {
        C21671AUq aUq;
        AnonymousClass81I r5 = (AnonymousClass81I) this;
        int i = 0;
        do {
            int A09 = A09(r5);
            if (A09 == 3) {
                r5.A0R(1);
            } else if (A09 == 1) {
                r5.A0R(3);
            } else {
                if (A09 == 4) {
                    i--;
                    if (i < 0) {
                        throw A0A(r5, "Expected a value but was ");
                    }
                } else if (A09 == 2) {
                    i--;
                    if (i < 0) {
                        throw A0A(r5, "Expected a value but was ");
                    }
                } else if (A09 == 14 || A09 == 10) {
                    long BKH = r5.A05.BKH(AnonymousClass81I.A08);
                    AU1 au1 = r5.A04;
                    if (BKH == -1) {
                        BKH = au1.A00;
                    }
                    au1.A06(BKH);
                    r5.A00 = 0;
                } else {
                    if (A09 == 9 || A09 == 13) {
                        aUq = AnonymousClass81I.A06;
                    } else if (A09 == 8 || A09 == 12) {
                        aUq = AnonymousClass81I.A07;
                    } else {
                        if (A09 == 17) {
                            r5.A04.A06((long) r5.A01);
                        } else if (A09 == 18) {
                            throw A0A(r5, "Expected a value but was ");
                        }
                        r5.A00 = 0;
                    }
                    AnonymousClass81I.A06(r5, aUq);
                    r5.A00 = 0;
                }
                r5.A01--;
                r5.A00 = 0;
            }
            i++;
            r5.A00 = 0;
        } while (i != 0);
        int[] iArr = r5.A02;
        int i2 = r5.A01 - 1;
        C165587tf.A1V(iArr, i2);
        r5.A03[i2] = "null";
    }

    public boolean A0S() {
        int A09 = A09((AnonymousClass81I) this);
        if (A09 == 2 || A09 == 4 || A09 == 18) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        AnonymousClass81I r4 = (AnonymousClass81I) this;
        int A09 = A09(r4);
        if (A09 == 5) {
            r4.A00 = 0;
            C165587tf.A1V(r4.A02, r4.A01 - 1);
            return true;
        } else if (A09 == 6) {
            r4.A00 = 0;
            C165587tf.A1V(r4.A02, r4.A01 - 1);
            return false;
        } else {
            throw A0B(r4, "Expected a boolean but was ", AnonymousClass000.A0u());
        }
    }

    static {
        String[] strArr;
        int i = 0;
        do {
            strArr = A04;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, i, 0);
            strArr[i] = String.format("\\u%04x", A0L);
            i++;
        } while (i <= 31);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static int A09(AnonymousClass81I r1) {
        int i = r1.A00;
        if (i == 0) {
            return AnonymousClass81I.A01(r1);
        }
        return i;
    }

    public static C21811Aam A0A(C21655ATw aTw, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(AnonymousClass93X.A00(aTw.A0H()));
        sb.append(" at path ");
        sb.append(aTw.A0K());
        return new C21811Aam(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r12 != -1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0132, code lost:
        if (r12 == -1) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8 A[LOOP:2: B:20:0x0060->B:66:0x00f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0F(X.C197499bo r20) {
        /*
            r19 = this;
            r10 = r19
            X.81I r10 = (X.AnonymousClass81I) r10
            int r1 = A09(r10)
            r0 = 12
            r9 = -1
            if (r1 < r0) goto L_0x0148
            r0 = 15
            if (r1 > r0) goto L_0x0148
            r18 = r20
            if (r1 != r0) goto L_0x0036
            java.lang.String r4 = r10.A03
            r0 = r18
            java.lang.String[] r3 = r0.A01
            int r2 = r3.length
            r1 = 0
            r12 = 0
        L_0x001e:
            if (r12 >= r2) goto L_0x0148
            r0 = r3[r12]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r10.A00 = r1
            java.lang.String[] r1 = r10.A03
            int r0 = r10.A01
            int r0 = r0 + -1
            r1[r0] = r4
        L_0x0032:
            return r12
        L_0x0033:
            int r12 = r12 + 1
            goto L_0x001e
        L_0x0036:
            X.B6g r11 = r10.A05
            r0 = r18
            X.AcG r8 = r0.A00
            X.AZL r11 = (X.AZL) r11
            r0 = 0
            X.AnonymousClass00C.A0C(r8, r0)
            boolean r0 = r11.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x004f:
            X.AU1 r15 = r11.A01
            X.9gY r14 = r15.A01
            if (r14 == 0) goto L_0x00fc
            byte[] r13 = r14.A06
            int r0 = r14.A01
            int r7 = r14.A00
            int[] r6 = r8.A00
            r5 = r14
            r3 = 0
            r12 = -1
        L_0x0060:
            int r1 = r3 + 1
            r4 = r6[r3]
            int r3 = r1 + 1
            r1 = r6[r1]
            if (r1 == r9) goto L_0x006b
            r12 = r1
        L_0x006b:
            if (r5 == 0) goto L_0x00fc
            r17 = 0
            if (r4 >= 0) goto L_0x00a3
            int r1 = -r4
            int r4 = r3 + r1
        L_0x0074:
            int r2 = r0 + 1
            byte r0 = r13[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r3 = r6[r3]
            if (r0 != r3) goto L_0x00c5
            boolean r0 = X.AnonymousClass000.A1S(r1, r4)
            if (r2 != r7) goto L_0x008f
            X.9gY r5 = r5.A02
            if (r5 != 0) goto L_0x0094
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x008f:
            if (r0 != 0) goto L_0x00a0
            r0 = r2
            r3 = r1
            goto L_0x0074
        L_0x0094:
            int r2 = r5.A01
            byte[] r13 = r5.A06
            int r7 = r5.A00
            if (r5 != r14) goto L_0x008f
            if (r0 == 0) goto L_0x00fc
            r5 = r17
        L_0x00a0:
            r0 = r6[r1]
            goto L_0x00d5
        L_0x00a3:
            int r2 = r0 + 1
            byte r0 = r13[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r0
            int r16 = r3 + r4
        L_0x00ac:
            r0 = r16
            if (r3 == r0) goto L_0x00c5
            r0 = r6[r3]
            if (r1 != r0) goto L_0x00c2
            int r3 = r3 + r4
            r0 = r6[r3]
            if (r2 != r7) goto L_0x00d5
            X.9gY r5 = r5.A02
            if (r5 != 0) goto L_0x00cb
            java.lang.RuntimeException r0 = X.C165567td.A0T()
            throw r0
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x00ac
        L_0x00c5:
            r0 = -2
            if (r12 == r0) goto L_0x00fc
            if (r12 == r9) goto L_0x010b
            goto L_0x00d8
        L_0x00cb:
            int r2 = r5.A01
            byte[] r13 = r5.A06
            int r7 = r5.A00
            if (r5 != r14) goto L_0x00d5
            r5 = r17
        L_0x00d5:
            if (r0 < 0) goto L_0x00f8
            r12 = r0
        L_0x00d8:
            X.AUq[] r0 = r8.A01
            r0 = r0[r12]
            int r0 = r0.A01()
            long r0 = (long) r0
            r15.A06(r0)
            if (r12 == r9) goto L_0x010b
            r0 = 0
            r10.A00 = r0
            java.lang.String[] r2 = r10.A03
            int r0 = r10.A01
            int r1 = r0 + -1
            r0 = r18
            java.lang.String[] r0 = r0.A01
            r0 = r0[r12]
            r2[r1] = r0
            return r12
        L_0x00f8:
            int r3 = -r0
            r0 = r2
            goto L_0x0060
        L_0x00fc:
            X.B6N r2 = r11.A02
            r0 = 8192(0x2000, float:1.14794E-41)
            long r0 = (long) r0
            long r3 = r2.Bmp(r15, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
        L_0x010b:
            java.lang.String[] r1 = r10.A03
            int r0 = r10.A01
            int r0 = r0 + -1
            r5 = r1[r0]
            java.lang.String r4 = r10.A0I()
            r0 = r18
            java.lang.String[] r3 = r0.A01
            int r2 = r3.length
            r1 = 0
            r12 = 0
        L_0x011e:
            if (r12 >= r2) goto L_0x0146
            r0 = r3[r12]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0143
            r10.A00 = r1
            java.lang.String[] r1 = r10.A03
            int r0 = r10.A01
            int r0 = r0 + -1
            r1[r0] = r4
            if (r12 != r9) goto L_0x0032
        L_0x0134:
            r0 = 15
            r10.A00 = r0
            r10.A03 = r4
            java.lang.String[] r1 = r10.A03
            int r0 = r10.A01
            int r0 = r0 + -1
            r1[r0] = r5
            return r12
        L_0x0143:
            int r12 = r12 + 1
            goto L_0x011e
        L_0x0146:
            r12 = -1
            goto L_0x0134
        L_0x0148:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21655ATw.A0F(X.9bo):int");
    }

    public final String A0K() {
        int i = this.A01;
        int[] iArr = this.A00;
        String[] strArr = this.A03;
        int[] iArr2 = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                A0u.append('[');
                A0u.append(iArr2[i2]);
                A0u.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                A0u.append('.');
                if (strArr[i2] != null) {
                    C165617ti.A0g(A0u, strArr, i2);
                }
            }
        }
        return A0u.toString();
    }

    public final void A0R(int i) {
        int i2 = this.A01;
        int[] iArr = this.A00;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.A00 = Arrays.copyOf(iArr, length * 2);
                String[] strArr = this.A03;
                this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A02;
                this.A02 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Nesting too deep at ");
                throw new C21811Aam(AnonymousClass000.A0q(A0K(), A0u));
            }
        }
        int[] iArr3 = this.A00;
        int i3 = this.A01;
        this.A01 = i3 + 1;
        iArr3[i3] = i;
    }

    public static float A08(C21655ATw aTw) {
        return (float) aTw.A0D();
    }

    public static C21811Aam A0B(C21655ATw aTw, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(AnonymousClass93X.A00(aTw.A0H()));
        sb.append(" at path ");
        sb.append(aTw.A0K());
        return new C21811Aam(sb.toString());
    }

    public final C187158xM A0G(String str) {
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(" at path ");
        throw new C187158xM(AnonymousClass000.A0q(A0K(), A0v));
    }
}
