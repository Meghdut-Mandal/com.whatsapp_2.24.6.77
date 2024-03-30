package X;

import java.io.EOFException;
import java.util.Objects;

/* renamed from: X.81I  reason: invalid class name */
public final class AnonymousClass81I extends C21655ATw {
    public static final C21671AUq A06 = C196989at.A00("\"\\");
    public static final C21671AUq A07 = C196989at.A00("'\\");
    public static final C21671AUq A08 = C196989at.A00("{}[]:, \n\t\r\f/\\;#=");
    public static final C21671AUq A09 = C196989at.A00("*/");
    public static final C21671AUq A0A = C196989at.A00("\n\r");
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final AU1 A04;
    public final C23125B6g A05;

    private int A02(boolean z) {
        int i = 0;
        while (true) {
            C23125B6g b6g = this.A05;
            int i2 = i + 1;
            if (b6g.BoJ((long) i2)) {
                AU1 au1 = this.A04;
                byte A012 = au1.A01((long) i);
                if (A012 == 10 || A012 == 32 || A012 == 13 || A012 == 9) {
                    i = i2;
                } else {
                    au1.A06((long) (i2 - 1));
                    if (A012 == 47) {
                        if (b6g.BoJ(2)) {
                            A05();
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    } else if (A012 == 35) {
                        A05();
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    return A012;
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public static String A04(AnonymousClass81I r6, C21671AUq aUq) {
        StringBuilder sb = null;
        while (true) {
            long BKH = r6.A05.BKH(aUq);
            if (BKH != -1) {
                AU1 au1 = r6.A04;
                if (au1.A01(BKH) == 92) {
                    if (sb == null) {
                        sb = AnonymousClass000.A0u();
                    }
                    sb.append(au1.A03(AnonymousClass0S4.A05, BKH));
                    au1.A00();
                    sb.append(r6.A00());
                } else {
                    String A032 = au1.A03(AnonymousClass0S4.A05, BKH);
                    if (sb == null) {
                        au1.A00();
                        return A032;
                    }
                    sb.append(A032);
                    au1.A00();
                    return sb.toString();
                }
            } else {
                throw r6.A0G("Unterminated string");
            }
        }
    }

    public void close() {
        this.A00 = 0;
        this.A00[0] = 8;
        this.A01 = 1;
        AU1 au1 = this.A04;
        au1.A06(au1.A00);
        this.A05.close();
    }

    static {
        C21671AUq aUq = C21671AUq.A02;
    }

    private char A00() {
        String str;
        StringBuilder A0u;
        int i;
        C23125B6g b6g = this.A05;
        if (b6g.BoJ(1)) {
            AU1 au1 = this.A04;
            byte A002 = au1.A00();
            if (A002 == 10 || A002 == 34 || A002 == 39 || A002 == 47 || A002 == 92) {
                return (char) A002;
            }
            if (A002 == 98) {
                return 8;
            }
            if (A002 == 102) {
                return 12;
            }
            if (A002 == 110) {
                return 10;
            }
            if (A002 == 114) {
                return 13;
            }
            if (A002 == 116) {
                return 9;
            }
            if (A002 != 117) {
                A0u = AnonymousClass000.A0u();
                A0u.append("Invalid escape sequence: \\");
                A0u.append((char) A002);
            } else if (b6g.BoJ(4)) {
                int i2 = 0;
                char c = 0;
                do {
                    byte A012 = au1.A01((long) i2);
                    char c2 = (char) (c << 4);
                    if (A012 >= 48) {
                        int i3 = A012 - 48;
                        if (A012 > 57) {
                            if (A012 >= 97) {
                                if (A012 <= 102) {
                                    i = A012 - 97;
                                }
                            } else if (A012 >= 65 && A012 <= 70) {
                                i = A012 - 65;
                            }
                            i3 = i + 10;
                        }
                        c = (char) (c2 + i3);
                        i2++;
                    }
                    A0u = AnonymousClass000.A0u();
                    A0u.append("\\u");
                    A0u.append(au1.A03(AnonymousClass0S4.A05, 4));
                } while (i2 < 4);
                au1.A06(4);
                return c;
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Unterminated escape sequence at path ");
                throw new EOFException(AnonymousClass000.A0q(A0K(), A0u2));
            }
            str = A0u.toString();
        } else {
            str = "Unterminated escape sequence";
        }
        throw A0G(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01de, code lost:
        if (r8.A07(r1) != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e0, code lost:
        if (r11 != 2) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01e2, code lost:
        if (r19 == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01e8, code lost:
        if (r4 != Long.MIN_VALUE) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01ea, code lost:
        if (r18 == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01ee, code lost:
        if (r4 != 0) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01f0, code lost:
        if (r18 != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01f2, code lost:
        r4 = -r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01f3, code lost:
        r8.A02 = r4;
        r6.A06((long) r12);
        r5 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01fe, code lost:
        if (r18 == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0201, code lost:
        if (r11 == 2) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0203, code lost:
        if (r11 == 4) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0205, code lost:
        if (r11 != 7) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0207, code lost:
        r8.A01 = r12;
        r5 = 17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.AnonymousClass81I r19) {
        /*
            r8 = r19
            int[] r15 = r8.A00
            int r13 = r8.A01
            r7 = 1
            int r13 = r13 - r7
            r6 = r15[r13]
            r2 = 0
            r11 = 34
            r5 = 93
            r10 = 3
            r14 = 7
            r4 = 59
            r1 = 44
            r9 = 4
            r12 = 2
            if (r6 != r7) goto L_0x013b
            r15[r13] = r12
        L_0x001c:
            int r12 = r8.A02(r7)
            if (r12 == r11) goto L_0x0132
            r0 = 39
            if (r12 == r0) goto L_0x0240
            if (r12 == r1) goto L_0x015d
            if (r12 == r4) goto L_0x015d
            r0 = 91
            if (r12 == r0) goto L_0x0238
            if (r12 == r5) goto L_0x0153
            r0 = 123(0x7b, float:1.72E-43)
            if (r12 == r0) goto L_0x0230
            X.AU1 r6 = r8.A04
            byte r1 = r6.A01(r2)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x012b
            r0 = 84
            if (r1 == r0) goto L_0x012b
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x0124
            r0 = 70
            if (r1 == r0) goto L_0x0124
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x0052
            r0 = 78
            if (r1 != r0) goto L_0x007c
        L_0x0052:
            r5 = 7
            java.lang.String r13 = "null"
            java.lang.String r12 = "NULL"
        L_0x0057:
            int r4 = r13.length()
            r11 = 1
        L_0x005c:
            if (r11 >= r4) goto L_0x0106
            X.B6g r15 = r8.A05
            int r16 = r11 + 1
            r0 = r16
            long r0 = (long) r0
            boolean r0 = r15.BoJ(r0)
            if (r0 == 0) goto L_0x007c
            long r0 = (long) r11
            byte r1 = r6.A01(r0)
            char r0 = r13.charAt(r11)
            if (r1 == r0) goto L_0x0102
            char r0 = r12.charAt(r11)
            if (r1 == r0) goto L_0x0102
        L_0x007c:
            r4 = 0
            r12 = 0
            r11 = 0
            r19 = 1
            r18 = 0
        L_0x0084:
            X.B6g r13 = r8.A05
            int r17 = r12 + 1
            r0 = r17
            long r0 = (long) r0
            boolean r0 = r13.BoJ(r0)
            r13 = 2
            if (r0 == 0) goto L_0x01e0
            long r0 = (long) r12
            byte r1 = r6.A01(r0)
            r0 = 43
            r15 = 5
            if (r1 == r0) goto L_0x00fe
            r0 = 69
            if (r1 == r0) goto L_0x00f8
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x00f8
            r0 = 45
            if (r1 == r0) goto L_0x00f2
            r0 = 46
            if (r1 == r0) goto L_0x00ee
            r0 = 48
            if (r1 < r0) goto L_0x01da
            r0 = 57
            if (r1 > r0) goto L_0x01da
            if (r11 == r7) goto L_0x00e8
            if (r11 == 0) goto L_0x00e8
            if (r11 != r13) goto L_0x00dd
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x020c
            r15 = 10
            long r15 = r15 * r4
            int r0 = r1 + -48
            long r0 = (long) r0
            long r15 = r15 - r0
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x00d4
            if (r0 != 0) goto L_0x00db
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
        L_0x00d4:
            r0 = 1
        L_0x00d5:
            r19 = r19 & r0
            r4 = r15
        L_0x00d8:
            r12 = r17
            goto L_0x0084
        L_0x00db:
            r0 = 0
            goto L_0x00d5
        L_0x00dd:
            if (r11 != r10) goto L_0x00e1
            r11 = 4
            goto L_0x00d8
        L_0x00e1:
            if (r11 == r15) goto L_0x00e6
            r0 = 6
            if (r11 != r0) goto L_0x00d8
        L_0x00e6:
            r11 = 7
            goto L_0x00d8
        L_0x00e8:
            int r0 = r1 + -48
            int r0 = -r0
            long r4 = (long) r0
            r11 = 2
            goto L_0x00d8
        L_0x00ee:
            if (r11 != r13) goto L_0x020c
            r11 = 3
            goto L_0x00d8
        L_0x00f2:
            if (r11 != 0) goto L_0x00fe
            r11 = 1
            r18 = 1
            goto L_0x00d8
        L_0x00f8:
            if (r11 == r13) goto L_0x00fc
            if (r11 != r9) goto L_0x020c
        L_0x00fc:
            r11 = 5
            goto L_0x00d8
        L_0x00fe:
            if (r11 != r15) goto L_0x020c
            r11 = 6
            goto L_0x00d8
        L_0x0102:
            r11 = r16
            goto L_0x005c
        L_0x0106:
            X.B6g r11 = r8.A05
            int r0 = r4 + 1
            long r0 = (long) r0
            boolean r0 = r11.BoJ(r0)
            if (r0 == 0) goto L_0x011e
            long r0 = (long) r4
            byte r0 = r6.A01(r0)
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x011e
            goto L_0x007c
        L_0x011e:
            long r0 = (long) r4
            r6.A06(r0)
            goto L_0x01fb
        L_0x0124:
            r5 = 6
            java.lang.String r13 = "false"
            java.lang.String r12 = "FALSE"
            goto L_0x0057
        L_0x012b:
            r5 = 5
            java.lang.String r13 = "true"
            java.lang.String r12 = "TRUE"
            goto L_0x0057
        L_0x0132:
            X.AU1 r0 = r8.A04
            r0.A00()
            r5 = 9
            goto L_0x01fb
        L_0x013b:
            if (r6 != r12) goto L_0x0165
            int r12 = r8.A02(r7)
            X.AU1 r0 = r8.A04
            r0.A00()
            if (r12 == r1) goto L_0x001c
            if (r12 == r4) goto L_0x0256
            if (r12 == r5) goto L_0x015a
            java.lang.String r0 = "Unterminated array"
        L_0x014e:
            X.8xM r0 = r8.A0G(r0)
            throw r0
        L_0x0153:
            if (r6 != r7) goto L_0x015d
            X.AU1 r0 = r8.A04
            r0.A00()
        L_0x015a:
            r8.A00 = r9
            return r9
        L_0x015d:
            if (r6 == r7) goto L_0x024b
            r0 = 2
            if (r6 == r0) goto L_0x024b
            java.lang.String r0 = "Unexpected value"
            goto L_0x014e
        L_0x0165:
            r0 = 5
            if (r6 == r10) goto L_0x01a1
            if (r6 == r0) goto L_0x01a1
            if (r6 != r9) goto L_0x018d
            r15[r13] = r0
            int r12 = r8.A02(r7)
            X.AU1 r0 = r8.A04
            r0.A00()
            r0 = 58
            if (r12 == r0) goto L_0x001c
            r0 = 61
            if (r12 != r0) goto L_0x018a
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x018a:
            java.lang.String r0 = "Expected ':'"
            goto L_0x014e
        L_0x018d:
            r0 = 6
            if (r6 != r0) goto L_0x0194
            r15[r13] = r14
            goto L_0x001c
        L_0x0194:
            if (r6 != r14) goto L_0x0225
            r0 = 0
            int r1 = r8.A02(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0261
            r5 = 18
            goto L_0x01fb
        L_0x01a1:
            r15[r13] = r9
            r5 = 125(0x7d, float:1.75E-43)
            if (r6 != r0) goto L_0x01b9
            int r3 = r8.A02(r7)
            X.AU1 r2 = r8.A04
            r2.A00()
            if (r3 == r1) goto L_0x01b9
            if (r3 == r4) goto L_0x026c
            if (r3 == r5) goto L_0x027e
            java.lang.String r0 = "Unterminated object"
            goto L_0x014e
        L_0x01b9:
            int r2 = r8.A02(r7)
            if (r2 == r11) goto L_0x01d2
            r1 = 39
            if (r2 == r1) goto L_0x0286
            java.lang.String r1 = "Expected name"
            if (r2 == r5) goto L_0x0277
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x01d2:
            X.AU1 r0 = r8.A04
            r0.A00()
            r5 = 13
            goto L_0x01fb
        L_0x01da:
            boolean r0 = r8.A07(r1)
            if (r0 != 0) goto L_0x020c
        L_0x01e0:
            if (r11 != r13) goto L_0x0201
            if (r19 == 0) goto L_0x0207
            r9 = -9223372036854775808
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x01ec
            if (r18 == 0) goto L_0x0207
        L_0x01ec:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            if (r18 != 0) goto L_0x0207
        L_0x01f2:
            long r4 = -r4
        L_0x01f3:
            r8.A02 = r4
            long r0 = (long) r12
            r6.A06(r0)
            r5 = 16
        L_0x01fb:
            r8.A00 = r5
            return r5
        L_0x01fe:
            if (r18 == 0) goto L_0x01f2
            goto L_0x01f3
        L_0x0201:
            if (r11 == r13) goto L_0x0207
            if (r11 == r9) goto L_0x0207
            if (r11 != r14) goto L_0x020c
        L_0x0207:
            r8.A01 = r12
            r5 = 17
            goto L_0x01fb
        L_0x020c:
            byte r0 = r6.A01(r2)
            boolean r0 = r8.A07(r0)
            if (r0 == 0) goto L_0x0221
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0221:
            java.lang.String r0 = "Expected value"
            goto L_0x014e
        L_0x0225:
            r0 = 8
            if (r6 != r0) goto L_0x001c
            java.lang.String r0 = "JsonReader is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0230:
            X.AU1 r0 = r8.A04
            r0.A00()
            r8.A00 = r7
            return r7
        L_0x0238:
            X.AU1 r0 = r8.A04
            r0.A00()
            r8.A00 = r10
            return r10
        L_0x0240:
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x024b:
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0256:
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0261:
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x026c:
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0277:
            if (r6 == r0) goto L_0x0281
            X.AU1 r0 = r8.A04
            r0.A00()
        L_0x027e:
            r8.A00 = r12
            return r12
        L_0x0281:
            X.8xM r0 = r8.A0G(r1)
            throw r0
        L_0x0286:
            X.AU1 r0 = r8.A04
            r0.A00()
            r8.A05()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81I.A01(X.81I):int");
    }

    public static String A03(AnonymousClass81I r6) {
        long BKH = r6.A05.BKH(A08);
        if (BKH != -1) {
            return r6.A04.A03(AnonymousClass0S4.A05, BKH);
        }
        AU1 au1 = r6.A04;
        return au1.A03(AnonymousClass0S4.A05, au1.A00);
    }

    private void A05() {
        throw A0G("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public static void A06(AnonymousClass81I r7, C21671AUq aUq) {
        while (true) {
            long BKH = r7.A05.BKH(aUq);
            if (BKH != -1) {
                AU1 au1 = r7.A04;
                byte A012 = au1.A01(BKH);
                long j = BKH + 1;
                if (A012 == 92) {
                    au1.A06(j);
                    r7.A00();
                } else {
                    au1.A06(j);
                    return;
                }
            } else {
                throw r7.A0G("Unterminated string");
            }
        }
    }

    private boolean A07(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A05();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass81I(C23125B6g b6g) {
        Objects.requireNonNull(b6g, "source == null");
        this.A05 = b6g;
        this.A04 = ((AZL) b6g).A01;
        A0R(6);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("JsonReader(");
        A0u.append(this.A05);
        return C90474aD.A0f(A0u);
    }
}
