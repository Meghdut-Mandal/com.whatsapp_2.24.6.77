package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9gs  reason: invalid class name and case insensitive filesystem */
public abstract class C200209gs {
    public static boolean[] A0J;
    public static boolean[] A0K;
    public static boolean[] A0L;
    public static boolean[] A0M;
    public static boolean[] A0N;
    public C194789Rg A00;
    public char A01;
    public int A02;
    public Object A03;
    public String A04;
    public String A05;
    public final C195339Tw A06 = new C195339Tw();
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public void A06() {
        char charAt;
        C22563Aos aos = (C22563Aos) this;
        int i = aos.A02 + 1;
        aos.A02 = i;
        if (i >= aos.A00) {
            charAt = 26;
        } else {
            charAt = aos.A01.charAt(i);
        }
        aos.A01 = charAt;
    }

    public void A07() {
        char charAt;
        C22563Aos aos = (C22563Aos) this;
        int i = aos.A02 + 1;
        aos.A02 = i;
        if (i >= aos.A00) {
            charAt = 26;
        } else {
            charAt = aos.A01.charAt(i);
        }
        aos.A01 = charAt;
    }

    public void A09(boolean[] zArr) {
        C22563Aos aos = (C22563Aos) this;
        int i = aos.A02;
        aos.A0A(zArr);
        aos.A0E(i, aos.A02);
    }

    public abstract Object A0B(boolean[] zArr);

    public abstract void A0C();

    static {
        boolean[] zArr = new boolean[126];
        A0K = zArr;
        boolean[] zArr2 = new boolean[126];
        A0L = zArr2;
        boolean[] zArr3 = new boolean[126];
        A0M = zArr3;
        boolean[] zArr4 = new boolean[126];
        A0N = zArr4;
        boolean[] zArr5 = new boolean[126];
        A0J = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0118, code lost:
        throw X.C22563Aos.A00(r1, r13.A02, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.AnonymousClass9YQ r14) {
        /*
            r13 = this;
            char r0 = r13.A01
            r10 = 123(0x7b, float:1.72E-43)
            if (r0 != r10) goto L_0x0119
            java.lang.Object r9 = r14.A02()
            r8 = 0
            r7 = 1
            r2 = 0
        L_0x000d:
            r13.A06()
            char r1 = r13.A01
            r0 = 9
            if (r1 == r0) goto L_0x000d
            r0 = 10
            if (r1 == r0) goto L_0x000d
            r0 = 13
            if (r1 == r0) goto L_0x000d
            r0 = 32
            if (r1 == r0) goto L_0x000d
            r11 = 44
            if (r1 == r11) goto L_0x00b4
            r12 = 58
            if (r1 == r12) goto L_0x0112
            r0 = 91
            if (r1 == r0) goto L_0x0112
            r0 = 93
            if (r1 == r0) goto L_0x0112
            if (r1 == r10) goto L_0x0112
            r6 = 125(0x7d, float:1.75E-43)
            if (r1 == r6) goto L_0x00fd
            r0 = 34
            if (r1 == r0) goto L_0x004e
            r0 = 39
            if (r1 == r0) goto L_0x004e
            boolean[] r0 = A0M
            r13.A09(r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0051
            X.928 r3 = X.C22563Aos.A01(r13, r7)
            throw r3
        L_0x004e:
            r13.A0C()
        L_0x0051:
            java.lang.String r5 = r13.A04
            r13.A08()
            char r1 = r13.A01
            r4 = 3
            r3 = 26
            r2 = 0
            if (r1 == r12) goto L_0x0069
            int r0 = r13.A02
            int r0 = r0 - r7
            if (r1 != r3) goto L_0x00c4
            X.928 r3 = new X.928
            r3.<init>(r2, r0, r4)
            throw r3
        L_0x0069:
            r1 = r13
            X.Aos r1 = (X.C22563Aos) r1
            int r0 = r1.A02
            int r12 = r0 + 1
            r1.A02 = r12
            int r0 = r1.A00
            if (r12 >= r0) goto L_0x00f1
            java.lang.String r0 = r1.A01
            char r0 = r0.charAt(r12)
            r1.A01 = r0
            r13.A05 = r5
            boolean[] r0 = A0N
            java.lang.Object r1 = r13.A04(r14, r0)
            boolean r0 = r14 instanceof X.C22576Ap5
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r14 instanceof X.C22577Ap6
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r14 instanceof X.C22575Ap4
            if (r0 == 0) goto L_0x00d2
            r0 = r9
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r5, r1)
        L_0x0098:
            r13.A05 = r2
            r13.A08()
            char r1 = r13.A01
            if (r1 == r6) goto L_0x010a
            if (r1 == r3) goto L_0x00c9
            if (r1 == r11) goto L_0x00c1
            int r0 = r13.A02
            int r0 = r0 - r7
            X.928 r3 = X.C22563Aos.A00(r1, r0, r7)
            throw r3
        L_0x00ad:
            r0 = r9
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r5, r1)
            goto L_0x0098
        L_0x00b4:
            if (r2 == 0) goto L_0x00c1
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x00c1
            int r0 = r13.A02
            X.928 r3 = X.C22563Aos.A00(r1, r0, r8)
            throw r3
        L_0x00c1:
            r2 = 1
            goto L_0x000d
        L_0x00c4:
            X.928 r3 = X.C22563Aos.A00(r1, r0, r8)
            throw r3
        L_0x00c9:
            int r0 = r13.A02
            int r0 = r0 - r7
            X.928 r3 = new X.928
            r3.<init>(r2, r0, r4)
            throw r3
        L_0x00d2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " setValue in "
            r1.append(r0)
            java.lang.Class r0 = r14.getClass()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.RuntimeException r3 = X.C90464aC.A0U(r5, r1)
            throw r3
        L_0x00f1:
            r1.A01 = r3
            int r1 = r12 + -1
            java.lang.String r0 = "EOF"
            X.928 r3 = new X.928
            r3.<init>(r0, r1, r4)
            throw r3
        L_0x00fd:
            if (r2 == 0) goto L_0x010a
            boolean r0 = r13.A0I
            if (r0 != 0) goto L_0x010a
            int r0 = r13.A02
            X.928 r3 = X.C22563Aos.A00(r1, r0, r8)
            throw r3
        L_0x010a:
            r13.A06()
            java.lang.Object r0 = r14.A03(r9)
            return r0
        L_0x0112:
            int r0 = r13.A02
            X.928 r3 = X.C22563Aos.A00(r1, r0, r8)
            throw r3
        L_0x0119:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r3 = X.C90514aH.A0s(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200209gs.A03(X.9YQ):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return A0B(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
        throw X.C22563Aos.A00(r3, r4.A02, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.AnonymousClass9YQ r5, boolean[] r6) {
        /*
            r4 = this;
        L_0x0000:
            char r3 = r4.A01
            r0 = 9
            if (r3 == r0) goto L_0x001b
            r0 = 10
            if (r3 == r0) goto L_0x001b
            r2 = 1
            switch(r3) {
                case 13: goto L_0x001b;
                case 32: goto L_0x001b;
                case 34: goto L_0x0024;
                case 39: goto L_0x0024;
                case 45: goto L_0x002a;
                case 78: goto L_0x002f;
                case 91: goto L_0x0058;
                case 93: goto L_0x00a9;
                case 102: goto L_0x00b1;
                case 110: goto L_0x00cd;
                case 116: goto L_0x00e8;
                case 123: goto L_0x0105;
                case 125: goto L_0x00a9;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r3) {
                case 48: goto L_0x002a;
                case 49: goto L_0x002a;
                case 50: goto L_0x002a;
                case 51: goto L_0x002a;
                case 52: goto L_0x002a;
                case 53: goto L_0x002a;
                case 54: goto L_0x002a;
                case 55: goto L_0x002a;
                case 56: goto L_0x002a;
                case 57: goto L_0x002a;
                case 58: goto L_0x00a9;
                default: goto L_0x0011;
            }
        L_0x0011:
            r4.A09(r6)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r4.A04
            return r0
        L_0x001b:
            r4.A06()
            goto L_0x0000
        L_0x001f:
            X.928 r0 = X.C22563Aos.A01(r4, r2)
            throw r0
        L_0x0024:
            r4.A0C()
            java.lang.String r0 = r4.A04
            return r0
        L_0x002a:
            java.lang.Object r0 = r4.A0B(r6)
            return r0
        L_0x002f:
            r4.A09(r6)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0053
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "NaN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0047
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0047:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0104
            int r1 = r4.A02
            X.928 r0 = new X.928
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0053:
            X.928 r0 = X.C22563Aos.A01(r4, r2)
            throw r0
        L_0x0058:
            java.lang.String r2 = r4.A05
            boolean r0 = r5 instanceof X.C22576Ap5
            if (r0 == 0) goto L_0x0067
            X.9Rg r0 = r5.A00
            X.9YQ r5 = r0.A01
        L_0x0062:
            java.lang.Object r0 = r4.A02(r5)
            return r0
        L_0x0067:
            boolean r0 = r5 instanceof X.C22577Ap6
            if (r0 != 0) goto L_0x0062
            boolean r0 = r5 instanceof X.C22575Ap4
            if (r0 == 0) goto L_0x0074
            X.9Rg r0 = r5.A00
            X.9YQ r5 = r0.A00
            goto L_0x0062
        L_0x0074:
            boolean r0 = r5 instanceof X.C22564Aot
            if (r0 == 0) goto L_0x008a
            r2 = r5
            X.Aot r2 = (X.C22564Aot) r2
            X.9YQ r5 = r2.A00
            if (r5 != 0) goto L_0x0062
            X.9Rg r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.9YQ r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x0062
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startArray in "
            r1.append(r0)
            java.lang.Class r0 = r5.getClass()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r2, r1)
            throw r0
        L_0x00a9:
            int r1 = r4.A02
            r0 = 0
            X.928 r0 = X.C22563Aos.A00(r3, r1, r0)
            throw r0
        L_0x00b1:
            r4.A09(r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00c1:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0104
            int r1 = r4.A02
            X.928 r0 = new X.928
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00cd:
            r4.A09(r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00dc
            r0 = 0
            return r0
        L_0x00dc:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0104
            int r1 = r4.A02
            X.928 r0 = new X.928
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00e8:
            r4.A09(r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00f8:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0104
            int r1 = r4.A02
            X.928 r0 = new X.928
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0104:
            return r3
        L_0x0105:
            java.lang.String r2 = r4.A05
            boolean r0 = r5 instanceof X.C22576Ap5
            if (r0 == 0) goto L_0x0114
            X.9Rg r0 = r5.A00
            X.9YQ r5 = r0.A01
        L_0x010f:
            java.lang.Object r0 = r4.A03(r5)
            return r0
        L_0x0114:
            boolean r0 = r5 instanceof X.C22577Ap6
            if (r0 != 0) goto L_0x010f
            boolean r0 = r5 instanceof X.C22575Ap4
            if (r0 == 0) goto L_0x0121
            X.9Rg r0 = r5.A00
            X.9YQ r5 = r0.A00
            goto L_0x010f
        L_0x0121:
            boolean r0 = r5 instanceof X.C22564Aot
            if (r0 == 0) goto L_0x0137
            r2 = r5
            X.Aot r2 = (X.C22564Aot) r2
            X.9YQ r5 = r2.A00
            if (r5 != 0) goto L_0x010f
            X.9Rg r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.9YQ r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x010f
        L_0x0137:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startObject(String key) in "
            r1.append(r0)
            java.lang.Class r0 = r5.getClass()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.RuntimeException r0 = X.C90464aC.A0U(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200209gs.A04(X.9YQ, boolean[]):java.lang.Object");
    }

    public void A05() {
        String str = this.A04;
        int length = str.length();
        if (length == 1) {
            return;
        }
        if (length != 2) {
            char A002 = C165597tg.A00(str);
            char charAt = this.A04.charAt(1);
            if (A002 == '-') {
                char charAt2 = this.A04.charAt(2);
                if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw C22563Aos.A01(this, 6);
                }
            } else if (A002 == '0' && charAt >= '0' && charAt <= '9') {
                throw C22563Aos.A01(this, 6);
            }
        } else if (str.equals("00")) {
            throw new AnonymousClass928(str, this.A02, 6);
        }
    }

    public void A08() {
        while (true) {
            char c = this.A01;
            if (c <= ' ' && c != 26) {
                A07();
            } else {
                return;
            }
        }
    }

    public void A0A(boolean[] zArr) {
        while (true) {
            char c = this.A01;
            if (c == 26) {
                return;
            }
            if (c < 0 || c >= '~' || !zArr[c]) {
                A07();
            } else {
                return;
            }
        }
    }

    public C200209gs(int i) {
        boolean z = false;
        this.A08 = AnonymousClass000.A1R(i & 4);
        this.A09 = AnonymousClass000.A1R(i & 2);
        this.A0H = AnonymousClass000.A1R(i & 1);
        this.A0C = AnonymousClass000.A1R(i & 8);
        this.A0G = AnonymousClass000.A1R(i & 16);
        this.A07 = AnonymousClass000.A1R(i & 32);
        this.A0I = AnonymousClass000.A1R(i & 64);
        this.A0F = AnonymousClass000.A1R(i & 128);
        this.A0A = C36381kD.A1U(i & 768, 768);
        this.A0B = AnonymousClass000.A1Q(i & 512);
        this.A0D = AnonymousClass000.A1R(i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A0E = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0 ? true : z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r1 == ':') goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r1 == ']') goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r1 == '}') goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r1 = A04(r8, A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if ((r8 instanceof X.C22576Ap5) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        if ((r8 instanceof X.C22577Ap6) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        if ((r8 instanceof X.C22575Ap4) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if ((r8 instanceof X.C22578Ap7) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Invalid or non Implemented status");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        throw X.C90514aH.A0s(X.C165567td.A0W(r8, " addValue(Object current, Object value) in ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006f, code lost:
        ((java.util.List) r3).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        ((java.util.AbstractCollection) r3).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        if (r5 == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        if (r7.A0I != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009f, code lost:
        throw X.C22563Aos.A00(r1, r7.A02, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a0, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        return r8.A03(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.AnonymousClass9YQ r8) {
        /*
            r7 = this;
            java.lang.Object r3 = r8.A01()
            char r1 = r7.A01
            r0 = 91
            if (r1 != r0) goto L_0x00bb
            r7.A06()
            char r1 = r7.A01
            r4 = 44
            r2 = 0
            if (r1 != r4) goto L_0x001f
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x001f
            int r0 = r7.A02
            X.928 r0 = X.C22563Aos.A00(r1, r0, r2)
            throw r0
        L_0x001f:
            r6 = 1
        L_0x0020:
            r5 = 0
        L_0x0021:
            char r1 = r7.A01
            r0 = 9
            if (r1 == r0) goto L_0x008f
            r0 = 10
            if (r1 == r0) goto L_0x008f
            r0 = 13
            if (r1 == r0) goto L_0x008f
            r0 = 26
            if (r1 == r0) goto L_0x00af
            r0 = 32
            if (r1 == r0) goto L_0x008f
            if (r1 == r4) goto L_0x007d
            r0 = 58
            if (r1 == r0) goto L_0x00a8
            r0 = 93
            if (r1 == r0) goto L_0x0093
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x00a8
            boolean[] r0 = A0L
            java.lang.Object r1 = r7.A04(r8, r0)
            boolean r0 = r8 instanceof X.C22576Ap5
            if (r0 != 0) goto L_0x0076
            boolean r0 = r8 instanceof X.C22577Ap6
            if (r0 != 0) goto L_0x006f
            boolean r0 = r8 instanceof X.C22575Ap4
            if (r0 != 0) goto L_0x0076
            boolean r0 = r8 instanceof X.C22578Ap7
            if (r0 != 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " addValue(Object current, Object value) in "
            java.lang.String r0 = X.C165567td.A0W(r8, r0, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x006f:
            r0 = r3
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x0020
        L_0x0076:
            r0 = r3
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x0020
        L_0x007d:
            if (r5 == 0) goto L_0x008a
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x008a
            int r0 = r7.A02
            X.928 r0 = X.C22563Aos.A00(r1, r0, r2)
            throw r0
        L_0x008a:
            r7.A06()
            r5 = 1
            goto L_0x0021
        L_0x008f:
            r7.A06()
            goto L_0x0021
        L_0x0093:
            if (r5 == 0) goto L_0x00a0
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x00a0
            int r0 = r7.A02
            X.928 r0 = X.C22563Aos.A00(r1, r0, r2)
            throw r0
        L_0x00a0:
            r7.A06()
            java.lang.Object r0 = r8.A03(r3)
            return r0
        L_0x00a8:
            int r0 = r7.A02
            X.928 r0 = X.C22563Aos.A00(r1, r0, r2)
            throw r0
        L_0x00af:
            int r3 = r7.A02
            int r3 = r3 - r6
            r2 = 3
            java.lang.String r1 = "EOF"
            X.928 r0 = new X.928
            r0.<init>(r1, r3, r2)
            throw r0
        L_0x00bb:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200209gs.A02(X.9YQ):java.lang.Object");
    }
}
