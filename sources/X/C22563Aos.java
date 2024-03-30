package X;

/* renamed from: X.Aos  reason: case insensitive filesystem */
public class C22563Aos extends C200209gs {
    public int A00;
    public String A01;

    public static AnonymousClass928 A01(C200209gs r3, int i) {
        return new AnonymousClass928(r3.A04, r3.A02, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
        if (r1 > r0) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0B(boolean[] r15) {
        /*
            r14 = this;
            int r2 = r14.A02
            r14.A06()
        L_0x0005:
            char r7 = r14.A01
            r0 = 48
            if (r7 < r0) goto L_0x0013
            r0 = 57
            if (r7 > r0) goto L_0x0013
            r14.A07()
            goto L_0x0005
        L_0x0013:
            r3 = 101(0x65, float:1.42E-43)
            r0 = 46
            r4 = 26
            r6 = 126(0x7e, float:1.77E-43)
            r1 = 69
            r5 = 1
            if (r7 == r0) goto L_0x0101
            if (r7 == r1) goto L_0x0112
            if (r7 == r3) goto L_0x0112
            r14.A08()
            char r1 = r14.A01
            if (r1 < 0) goto L_0x0044
            if (r1 >= r6) goto L_0x0044
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0044
            if (r1 == r4) goto L_0x0044
            r14.A0A(r15)
            int r0 = r14.A02
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e7
            X.928 r0 = A01(r14, r5)
            throw r0
        L_0x0044:
            int r0 = r14.A02
            r14.A0E(r2, r0)
            java.lang.String r2 = r14.A04
            int r4 = r2.length()
            r6 = 0
            char r1 = r2.charAt(r6)
            r3 = 6
            r8 = 48
            r0 = 45
            if (r1 != r0) goto L_0x0075
            r1 = 20
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x0072
            r0 = 3
            if (r4 < r0) goto L_0x0072
            char r0 = r2.charAt(r5)
            if (r0 != r8) goto L_0x0072
            int r1 = r14.A02
            X.928 r0 = new X.928
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0072:
            r10 = 1
            r13 = 1
            goto L_0x008e
        L_0x0075:
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x008a
            r0 = 2
            if (r4 < r0) goto L_0x008a
            char r0 = r2.charAt(r6)
            if (r0 != r8) goto L_0x008a
            int r1 = r14.A02
            X.928 r0 = new X.928
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x008a:
            r1 = 19
            r10 = 0
            r13 = 0
        L_0x008e:
            r9 = 10
            if (r4 >= r1) goto L_0x00a6
            r5 = 0
        L_0x0093:
            r6 = 0
        L_0x0095:
            r11 = 10
            if (r10 >= r4) goto L_0x00ab
            long r6 = r6 * r11
            int r3 = r10 + 1
            char r0 = r2.charAt(r10)
            int r0 = 48 - r0
            long r0 = (long) r0
            long r6 = r6 + r0
            r10 = r3
            goto L_0x0095
        L_0x00a6:
            if (r4 > r1) goto L_0x00c4
            int r4 = r4 + -1
            goto L_0x0093
        L_0x00ab:
            if (r5 == 0) goto L_0x00d2
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00ca
            if (r0 < 0) goto L_0x00c4
            char r1 = r2.charAt(r10)
            r0 = 55
            if (r13 == 0) goto L_0x00c2
            r0 = 56
        L_0x00c2:
            if (r1 <= r0) goto L_0x00ca
        L_0x00c4:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2, r9)
            return r0
        L_0x00ca:
            long r6 = r6 * r11
            char r0 = r2.charAt(r10)
            int r8 = r8 - r0
            long r0 = (long) r8
            long r6 = r6 + r0
        L_0x00d2:
            if (r13 == 0) goto L_0x00ea
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x00e5
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
            int r0 = (int) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00e5:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            return r0
        L_0x00ea:
            long r3 = -r6
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x00fc
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fc
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00fc:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            return r0
        L_0x0101:
            r14.A06()
        L_0x0104:
            char r7 = r14.A01
            r0 = 48
            if (r7 < r0) goto L_0x0112
            r0 = 57
            if (r7 > r0) goto L_0x0112
            r14.A07()
            goto L_0x0104
        L_0x0112:
            if (r7 == r1) goto L_0x0136
            if (r7 == r3) goto L_0x0136
            r14.A08()
            char r1 = r14.A01
            if (r1 < 0) goto L_0x0184
            if (r1 >= r6) goto L_0x0184
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0184
            if (r1 == r4) goto L_0x0184
            r14.A0A(r15)
            int r0 = r14.A02
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e7
            X.928 r0 = A01(r14, r5)
            throw r0
        L_0x0136:
            X.9Tw r3 = r14.A06
            r3.A00(r1)
            r14.A06()
            char r1 = r14.A01
            r0 = 43
            if (r1 == r0) goto L_0x0150
            r0 = 45
            if (r1 == r0) goto L_0x0150
            r0 = 48
            if (r1 < r0) goto L_0x01d4
            r0 = 57
            if (r1 > r0) goto L_0x01d4
        L_0x0150:
            r3.A00(r1)
            r14.A06()
        L_0x0156:
            char r1 = r14.A01
            r0 = 48
            if (r1 < r0) goto L_0x0164
            r0 = 57
            if (r1 > r0) goto L_0x0164
            r14.A07()
            goto L_0x0156
        L_0x0164:
            r14.A08()
            char r1 = r14.A01
            if (r1 < 0) goto L_0x0184
            if (r1 >= r6) goto L_0x0184
            boolean r0 = r15[r1]
            if (r0 != 0) goto L_0x0184
            if (r1 == r4) goto L_0x0184
            r14.A0A(r15)
            int r0 = r14.A02
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 != 0) goto L_0x01e7
            X.928 r0 = A01(r14, r5)
            throw r0
        L_0x0184:
            int r0 = r14.A02
            r14.A0E(r2, r0)
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x0190
            r14.A05()
        L_0x0190:
            boolean r0 = r14.A0F     // Catch:{ NumberFormatException -> 0x01cf }
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = r14.A04     // Catch:{ NumberFormatException -> 0x01cf }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.Float r4 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cf }
            return r4
        L_0x019f:
            java.lang.String r2 = r14.A04     // Catch:{ NumberFormatException -> 0x01cf }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x01cf }
            r0 = 18
            if (r1 <= r0) goto L_0x01c6
            java.math.BigDecimal r4 = X.C165617ti.A0b(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            boolean r0 = r14.A0E     // Catch:{ NumberFormatException -> 0x01cf }
            if (r0 != 0) goto L_0x01ce
            java.lang.String r3 = r14.A04     // Catch:{ NumberFormatException -> 0x01cf }
            double r1 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01cf }
            boolean r0 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x01cf }
            if (r0 == 0) goto L_0x01ce
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01cf }
            return r4
        L_0x01c6:
            double r0 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x01cf }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cf }
        L_0x01ce:
            return r4
        L_0x01cf:
            X.928 r0 = A01(r14, r5)
            throw r0
        L_0x01d4:
            r14.A0A(r15)
            int r0 = r14.A02
            r14.A0E(r2, r0)
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x01e7
            r14.A05()
        L_0x01e7:
            java.lang.String r0 = r14.A04
            return r0
        L_0x01ea:
            X.928 r0 = A01(r14, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22563Aos.A0B(boolean[]):java.lang.Object");
    }

    public void A0C() {
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        if (this.A0H || (c2 = this.A01) != '\'') {
            char c3 = this.A01;
            int i4 = this.A02 + 1;
            String str = this.A01;
            int indexOf = str.indexOf(c3, i4);
            if (indexOf != -1) {
                String substring = str.substring(i4, indexOf);
                this.A04 = substring;
                if (substring.indexOf(92) == -1) {
                    if (!this.A0C) {
                        int length = substring.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            char charAt = this.A04.charAt(i5);
                            if (charAt >= 0) {
                                if (charAt <= 31) {
                                    throw A00(charAt, this.A02 + i5, 0);
                                } else if (charAt == 127 && this.A0D) {
                                    throw A00(charAt, this.A02 + i5, 0);
                                }
                            }
                        }
                    }
                    this.A02 = indexOf;
                    A06();
                    return;
                }
                C195339Tw r7 = this.A06;
                r7.A01 = -1;
                char c4 = this.A01;
                while (true) {
                    A06();
                    char c5 = this.A01;
                    char c6 = '\"';
                    if (c5 == '\"' || c5 == '\'') {
                        if (c4 == c5) {
                            A06();
                            this.A04 = r7.toString();
                            return;
                        }
                    } else if (c5 == '\\') {
                        A06();
                        char c7 = this.A01;
                        if (c7 != '\"') {
                            if (c7 != '\'') {
                                c6 = '/';
                                if (c7 != '/') {
                                    if (c7 == '\\') {
                                        r7.A00('\\');
                                    } else if (c7 == 'b') {
                                        c6 = 8;
                                    } else if (c7 == 'f') {
                                        c6 = 12;
                                    } else if (c7 == 'n') {
                                        c6 = 10;
                                    } else if (c7 != 'r') {
                                        if (c7 == 'x') {
                                            i = 2;
                                        } else if (c7 == 't') {
                                            c6 = 9;
                                        } else if (c7 == 'u') {
                                            i = 4;
                                        } else {
                                            continue;
                                        }
                                        int i6 = 0;
                                        int i7 = 0;
                                        do {
                                            int i8 = i7 * 16;
                                            A06();
                                            c = this.A01;
                                            if (c <= '9') {
                                                i2 = c - '0';
                                                if (c < '0') {
                                                    if (c == 26) {
                                                        throw new AnonymousClass928("EOF", this.A02, 3);
                                                    }
                                                }
                                            } else {
                                                if (c <= 'F') {
                                                    if (c >= 'A') {
                                                        i3 = c - 'A';
                                                    }
                                                } else if (c >= 'a' && c <= 'f') {
                                                    i3 = c - 'a';
                                                }
                                                i2 = i3 + 10;
                                            }
                                            i7 = i8 + i2;
                                            i6++;
                                        } while (i6 < i);
                                        c6 = (char) i7;
                                    } else {
                                        c6 = 13;
                                    }
                                }
                            } else {
                                r7.A00('\'');
                            }
                        }
                        r7.A00(c6);
                    } else if (c5 != 127) {
                        switch (c5) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (!this.A0C) {
                                    throw A00(c5, this.A02, 0);
                                }
                                continue;
                            case 26:
                                throw new AnonymousClass928((Object) null, this.A02 - 1, 3);
                        }
                    } else if (this.A0C) {
                        continue;
                    } else if (this.A0D) {
                        throw A00(c5, this.A02, 0);
                    }
                    r7.A00(c5);
                }
                throw A00(c, this.A02, 4);
            }
            throw new AnonymousClass928((Object) null, this.A00, 3);
        } else if (this.A09) {
            A09(C200209gs.A0K);
        } else {
            throw A00(c2, this.A02, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r3 = A00(r3, r4.A02, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r0 = A0B(X.C200209gs.A0J);
        r4.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        r3 = r6.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r3 = r6.A03(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(java.lang.String r5, X.AnonymousClass9YQ r6) {
        /*
            r4 = this;
            X.9Rg r0 = r6.A00
            r4.A00 = r0
            r4.A01 = r5
            int r0 = r5.length()
            r4.A00 = r0
            r0 = -1
            r4.A02 = r0
        L_0x000f:
            r4.A06()     // Catch:{ IOException -> 0x0108 }
            char r3 = r4.A01     // Catch:{ IOException -> 0x0108 }
            r0 = 9
            if (r3 == r0) goto L_0x000f
            r0 = 10
            if (r3 == r0) goto L_0x000f
            r2 = 1
            switch(r3) {
                case 13: goto L_0x000f;
                case 32: goto L_0x000f;
                case 34: goto L_0x002e;
                case 39: goto L_0x002e;
                case 45: goto L_0x0035;
                case 78: goto L_0x003f;
                case 91: goto L_0x006d;
                case 93: goto L_0x0025;
                case 102: goto L_0x0072;
                case 110: goto L_0x0090;
                case 116: goto L_0x00ad;
                case 123: goto L_0x00d0;
                case 125: goto L_0x0025;
                default: goto L_0x0020;
            }     // Catch:{ IOException -> 0x0108 }
        L_0x0020:
            switch(r3) {
                case 48: goto L_0x0035;
                case 49: goto L_0x0035;
                case 50: goto L_0x0035;
                case 51: goto L_0x0035;
                case 52: goto L_0x0035;
                case 53: goto L_0x0035;
                case 54: goto L_0x0035;
                case 55: goto L_0x0035;
                case 56: goto L_0x0035;
                case 57: goto L_0x0035;
                case 58: goto L_0x0025;
                default: goto L_0x0023;
            }     // Catch:{ IOException -> 0x0108 }
        L_0x0023:
            goto L_0x00d5
        L_0x0025:
            int r1 = r4.A02     // Catch:{ IOException -> 0x0108 }
            r0 = 0
            X.928 r3 = A00(r3, r1, r0)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x002e:
            r4.A0C()     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = r4.A04     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e0
        L_0x0035:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            java.lang.Object r0 = r4.A0B(r0)     // Catch:{ IOException -> 0x0108 }
            r4.A03 = r0     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e0
        L_0x003f:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0108 }
            boolean r0 = r4.A08     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = "NaN"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x005a
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e0
        L_0x005a:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x0108 }
            if (r0 != 0) goto L_0x00cb
            int r0 = r4.A02     // Catch:{ IOException -> 0x0108 }
            X.928 r3 = new X.928     // Catch:{ IOException -> 0x0108 }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x0067:
            X.928 r3 = A01(r4, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x006d:
            java.lang.Object r3 = r4.A02(r6)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e4
        L_0x0072:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x0084
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e0
        L_0x0084:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x0108 }
            if (r0 != 0) goto L_0x00cb
            int r0 = r4.A02     // Catch:{ IOException -> 0x0108 }
            X.928 r3 = new X.928     // Catch:{ IOException -> 0x0108 }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x0090:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x00a1
            r3 = 0
            goto L_0x00e4
        L_0x00a1:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x0108 }
            if (r0 != 0) goto L_0x00cb
            int r0 = r4.A02     // Catch:{ IOException -> 0x0108 }
            X.928 r3 = new X.928     // Catch:{ IOException -> 0x0108 }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x00ad:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0108 }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x00bf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e0
        L_0x00bf:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x0108 }
            if (r0 != 0) goto L_0x00cb
            int r0 = r4.A02     // Catch:{ IOException -> 0x0108 }
            X.928 r3 = new X.928     // Catch:{ IOException -> 0x0108 }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x00cb:
            java.lang.Object r3 = r6.A03(r1)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e4
        L_0x00d0:
            java.lang.Object r3 = r4.A03(r6)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00e4
        L_0x00d5:
            boolean[] r0 = X.C200209gs.A0J     // Catch:{ IOException -> 0x0108 }
            r4.A09(r0)     // Catch:{ IOException -> 0x0108 }
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = r4.A04     // Catch:{ IOException -> 0x0108 }
        L_0x00e0:
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x0108 }
        L_0x00e4:
            boolean r0 = r4.A0A     // Catch:{ IOException -> 0x0108 }
            if (r0 == 0) goto L_0x0102
            boolean r0 = r4.A0B     // Catch:{ IOException -> 0x0108 }
            if (r0 != 0) goto L_0x00ef
            r4.A08()     // Catch:{ IOException -> 0x0108 }
        L_0x00ef:
            char r1 = r4.A01     // Catch:{ IOException -> 0x0108 }
            r0 = 26
            if (r1 == r0) goto L_0x0102
            int r0 = r4.A02     // Catch:{ IOException -> 0x0108 }
            int r0 = r0 - r2
            X.928 r3 = A00(r1, r0, r2)     // Catch:{ IOException -> 0x0108 }
        L_0x00fc:
            throw r3     // Catch:{ IOException -> 0x0108 }
        L_0x00fd:
            X.928 r3 = A01(r4, r2)     // Catch:{ IOException -> 0x0108 }
            goto L_0x00fc
        L_0x0102:
            r0 = 0
            r4.A04 = r0
            r4.A03 = r0
            return r3
        L_0x0108:
            r2 = move-exception
            int r1 = r4.A02
            X.928 r0 = new X.928
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22563Aos.A0D(java.lang.String, X.9YQ):java.lang.Object");
    }

    public void A0E(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.A01.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.A01.charAt(i3))) {
                this.A04 = this.A01.substring(i, i2);
            } else {
                i2--;
            }
        }
        this.A04 = this.A01.substring(i, i2);
    }

    public static AnonymousClass928 A00(char c, int i, int i2) {
        return new AnonymousClass928(Character.valueOf(c), i, i2);
    }

    public C22563Aos(int i) {
        super(i);
    }
}
