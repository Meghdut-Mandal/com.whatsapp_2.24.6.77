package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6fF  reason: invalid class name and case insensitive filesystem */
public final class C136916fF implements C161337ma {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public AnonymousClass0G5 A06;
    public AnonymousClass61S A07 = new AnonymousClass61S();
    public AnonymousClass61S A08 = new AnonymousClass61S();
    public AnonymousClass64B A09;
    public C161557n6 A0A = C93824hC.A00;
    public C161557n6 A0B;
    public AnonymousClass6QL A0C;
    public C1496372c A0D;
    public AnonymousClass6YK A0E;
    public C114315h1 A0F;
    public C114315h1 A0G;
    public C114315h1 A0H;
    public C118285nd A0I;
    public C114325h2 A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public int[] A0S;
    public AnonymousClass606 A0T;
    public final C157567dk A0U;
    public final C129136Fi A0V;
    public final C161477my A0W;
    public final AnonymousClass61S A0X = new AnonymousClass61S();
    public final C1496372c A0Y;
    public final C114305h0 A0Z = new C114305h0();
    public final C114305h0 A0a = new C114305h0();
    public final AnonymousClass6WG A0b;
    public final List A0c = AnonymousClass001.A0I();
    public final Set A0d;
    public final AnonymousClass61S A0e = new AnonymousClass61S();
    public final AnonymousClass61S A0f;
    public final AnonymousClass6Y9 A0g = new AnonymousClass6Y9(this, 0);

    private final void A0A(int i) {
        A02(this, i, 0, false);
        AnonymousClass6WG.A02(this.A0b);
    }

    public static void A0G(C136916fF r1) {
        A0M(r1, false);
        A0M(r1, false);
    }

    public static final void A0I(C136916fF r3) {
        r3.A09 = null;
        r3.A04 = 0;
        r3.A03 = 0;
        r3.A02 = 0;
        r3.A0N = false;
        AnonymousClass6WG r2 = r3.A0b;
        r2.A06 = false;
        r2.A0A.A00 = 0;
        r2.A03 = 0;
        r3.A0Z.A00.clear();
        r3.A0S = null;
        r3.A06 = null;
    }

    public static void A0L(C136916fF r1, boolean z) {
        A0M(r1, false);
        A0M(r1, z);
        A0M(r1, false);
        A0M(r1, false);
    }

    public void B6X() {
        A0M(this, false);
        C136976fO A0P2 = A0P();
        if (A0P2 != null) {
            int i = A0P2.A01;
            if ((i & 1) != 0) {
                A0P2.A01 = i | 2;
            }
        }
    }

    public void BuS() {
        A0K(this, (Object) null, (Object) null, -127, 0);
    }

    public void Bum(int i) {
        A0K(this, (Object) null, (Object) null, i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C136916fF Bun(int r5) {
        /*
            r4 = this;
            r1 = 0
            r0 = 0
            A0K(r4, r0, r0, r5, r1)
            boolean r0 = r4.A0L
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x002c
            X.7my r0 = r4.A0W
            X.AnonymousClass00C.A0E(r0, r2)
            X.6fP r0 = (X.C136986fP) r0
            X.6fO r1 = new X.6fO
            r1.<init>(r0)
            X.5h0 r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            r4.A0R(r1)
            int r0 = r4.A01
            r1.A00 = r0
            int r0 = r1.A01
            r0 = r0 & -17
            r1.A01 = r0
            return r4
        L_0x002c:
            java.util.List r1 = r4.A0c
            X.6QL r0 = r4.A0C
            int r0 = r0.A05
            int r0 = X.AnonymousClass6XJ.A00(r1, r0)
            if (r0 < 0) goto L_0x008c
            java.lang.Object r1 = r1.remove(r0)
        L_0x003c:
            X.6QL r0 = r4.A0C
            java.lang.Object r3 = r0.A04()
            java.lang.Object r0 = X.C129736Ig.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0084
            X.7my r0 = r4.A0W
            X.AnonymousClass00C.A0E(r0, r2)
            X.6fP r0 = (X.C136986fP) r0
            X.6fO r3 = new X.6fO
            r3.<init>(r0)
            r4.A0R(r3)
        L_0x0059:
            r2 = 0
            if (r1 != 0) goto L_0x0066
            int r1 = r3.A01
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0067
            r0 = r1 & -65
            r3.A01 = r0
        L_0x0066:
            r2 = 1
        L_0x0067:
            int r0 = r3.A01
            if (r2 == 0) goto L_0x0081
            r0 = r0 | 8
        L_0x006d:
            r3.A01 = r0
            X.5h0 r0 = r4.A0Z
            java.util.ArrayList r0 = r0.A00
            r0.add(r3)
            int r0 = r4.A01
            r3.A00 = r0
            int r0 = r3.A01
            r0 = r0 & -17
            r3.A01 = r0
            return r4
        L_0x0081:
            r0 = r0 & -9
            goto L_0x006d
        L_0x0084:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            X.AnonymousClass00C.A0E(r3, r0)
            X.6fO r3 = (X.C136976fO) r3
            goto L_0x0059
        L_0x008c:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.Bun(int):X.6fF");
    }

    public void Bup() {
        A0K(this, (Object) null, (Object) null, 125, 2);
        this.A0N = true;
    }

    private final int A00(int i) {
        int i2;
        int A022;
        if (i < 0) {
            AnonymousClass0G5 r2 = this.A06;
            if (r2 == null || (A022 = r2.A02(i)) < 0) {
                return 0;
            }
            return r2.A03[A022];
        }
        int[] iArr = this.A0S;
        if (iArr == null || (i2 = iArr[i]) < 0) {
            return C90494aF.A0C(this.A0C.A09, i * 5);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r1.equals(X.C129736Ig.A00) == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A01(int r6, int r7, int r8) {
        /*
            r5 = this;
            if (r6 == r7) goto L_0x0029
            X.6QL r4 = r5.A0C
            int[] r2 = r4.A09
            int r3 = r6 * 5
            int r0 = r3 + 1
            r1 = r2[r0]
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = X.AnonymousClass6QL.A00(r4, r2, r6)
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0053
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r2 = r1.ordinal()
        L_0x0021:
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r2 != r0) goto L_0x0040
            r8 = 126665345(0x78cc281, float:2.1179178E-34)
        L_0x0029:
            return r8
        L_0x002a:
            r2 = 0
            goto L_0x0040
        L_0x002c:
            r2 = r2[r3]
            r0 = 207(0xcf, float:2.9E-43)
            if (r2 != r0) goto L_0x0021
            java.lang.Object r1 = r4.A05(r6)
            if (r1 == 0) goto L_0x0040
            java.lang.Object r0 = X.C129736Ig.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0053
        L_0x0040:
            X.6QL r0 = r5.A0C
            int[] r1 = r0.A09
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r5.A01(r0, r7, r8)
            r0 = 3
            int r8 = java.lang.Integer.rotateLeft(r1, r0)
            r8 = r8 ^ r2
            return r8
        L_0x0053:
            int r2 = r1.hashCode()
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A01(int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        if (r8 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        r0 = r13 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        r9 = r9 + A02(r11, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
        if (r8 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ee, code lost:
        r0 = r11.A0b;
        X.AnonymousClass6WG.A02(r0);
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
        if (r14 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010f, code lost:
        if (X.AnonymousClass6QR.A03(r5.A09, r12) != false) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A02(X.C136916fF r11, int r12, int r13, boolean r14) {
        /*
            X.6QL r5 = r11.A0C
            int[] r4 = r5.A09
            int r6 = r12 * 5
            r3 = 1
            int r9 = r6 + 1
            r1 = r4[r9]
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0011
            r3 = 0
        L_0x0011:
            r10 = 1
            r2 = 0
            if (r3 == 0) goto L_0x00ac
            r3 = r4[r6]
            java.lang.Object r1 = X.AnonymousClass6QL.A00(r5, r4, r12)
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r3 == r0) goto L_0x0109
            r0 = 206(0xce, float:2.89E-43)
            if (r3 != r0) goto L_0x0109
            java.lang.Object r0 = X.AnonymousClass6XJ.A04
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0109
            java.lang.Object r1 = r5.A06(r12, r2)
            boolean r0 = r1 instanceof X.C137046fV
            if (r0 == 0) goto L_0x0112
            X.6fV r1 = (X.C137046fV) r1
            if (r1 == 0) goto L_0x0112
            X.4gi r0 = r1.A00
            java.util.Set r0 = r0.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r7 = r8.next()
            X.6fF r7 = (X.C136916fF) r7
            X.72c r3 = r7.A0Y
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x009b
            int[] r0 = r3.A07
            r1 = r0[r10]
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            X.5h1 r0 = new X.5h1
            r0.<init>()
            r7.A0G = r0
            X.6QL r6 = r3.A01()
            r7.A0C = r6     // Catch:{ all -> 0x00a7 }
            X.6WG r4 = r7.A0b     // Catch:{ all -> 0x00a7 }
            X.5h1 r3 = r4.A05     // Catch:{ all -> 0x00a7 }
            r4.A05 = r0     // Catch:{ all -> 0x00a3 }
            r7.A0A(r2)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass6WG.A00(r4)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0096
            X.5h1 r0 = r4.A05     // Catch:{ all -> 0x00a3 }
            X.6Ek r1 = r0.A00     // Catch:{ all -> 0x00a3 }
            X.4gt r0 = X.C93634gt.A00     // Catch:{ all -> 0x00a3 }
            r1.A04(r0)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0096
            X.AnonymousClass6WG.A03(r4, r2)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass6WG.A03(r4, r2)     // Catch:{ all -> 0x00a3 }
            X.5h1 r0 = r4.A05     // Catch:{ all -> 0x00a3 }
            X.6Ek r1 = r0.A00     // Catch:{ all -> 0x00a3 }
            X.4go r0 = X.C93584go.A00     // Catch:{ all -> 0x00a3 }
            r1.A04(r0)     // Catch:{ all -> 0x00a3 }
            r4.A06 = r2     // Catch:{ all -> 0x00a3 }
        L_0x0096:
            r4.A05 = r3     // Catch:{ all -> 0x00a7 }
            r6.A07()
        L_0x009b:
            X.6Fi r1 = r11.A0V
            X.7my r0 = r7.A0W
            r1.A09(r0)
            goto L_0x0040
        L_0x00a3:
            r0 = move-exception
            r4.A05 = r3     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r6.A07()
            throw r0
        L_0x00ac:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0109
            int r0 = r6 + 3
            r3 = r4[r0]
            int r3 = r3 + r12
            int r2 = r12 + 1
            r9 = 0
        L_0x00b9:
            int[] r0 = r5.A09
            if (r2 >= r3) goto L_0x0102
            boolean r8 = X.AnonymousClass6QR.A03(r0, r2)
            if (r8 == 0) goto L_0x00fe
            X.6WG r7 = r11.A0b
            X.AnonymousClass6WG.A02(r7)
            int[] r6 = r5.A09
            boolean r0 = X.AnonymousClass6QR.A03(r6, r2)
            if (r0 == 0) goto L_0x00fc
            java.lang.Object[] r1 = r5.A0A
            int r0 = r2 * 5
            int r0 = r0 + 4
            r0 = r6[r0]
            r1 = r1[r0]
        L_0x00da:
            X.5h0 r0 = r7.A04
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
        L_0x00e1:
            r1 = 1
            r0 = 0
            if (r8 != 0) goto L_0x00e7
        L_0x00e5:
            int r0 = r13 + r9
        L_0x00e7:
            int r0 = A02(r11, r2, r0, r1)
            int r9 = r9 + r0
            if (r8 == 0) goto L_0x00f6
            X.6WG r0 = r11.A0b
            X.AnonymousClass6WG.A02(r0)
            r0.A04()
        L_0x00f6:
            int r0 = X.C90524aI.A05(r4, r2)
            int r2 = r2 + r0
            goto L_0x00b9
        L_0x00fc:
            r1 = 0
            goto L_0x00da
        L_0x00fe:
            r1 = 0
            if (r14 == 0) goto L_0x00e5
            goto L_0x00e1
        L_0x0102:
            boolean r0 = X.AnonymousClass6QR.A03(r0, r12)
            if (r0 != 0) goto L_0x0111
            return r9
        L_0x0109:
            int[] r0 = r5.A09
            boolean r0 = X.AnonymousClass6QR.A03(r0, r12)
            if (r0 == 0) goto L_0x0112
        L_0x0111:
            return r10
        L_0x0112:
            int[] r0 = r5.A09
            r10 = r0[r9]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r10 = r10 & r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A02(X.6fF, int, int, boolean):int");
    }

    public static int A03(Object obj, Object obj2, int i) {
        if (obj == null) {
            if (obj2 == null || i != 207 || obj2.equals(C129736Ig.A00)) {
                return i;
            }
            return obj2.hashCode();
        } else if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        } else {
            return obj.hashCode();
        }
    }

    public static final C161557n6 A04(C136916fF r9) {
        Object A052;
        Object obj;
        C161557n6 r0 = r9.A0B;
        if (r0 == null) {
            int i = r9.A0C.A05;
            if (r9.A0L && r9.A0R) {
                AnonymousClass6YK r2 = r9.A0E;
                int i2 = r2.A08;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    int[] iArr = r2.A0G;
                    if (iArr[AnonymousClass6YK.A01(r2, i2) * 5] == 202) {
                        int A012 = AnonymousClass6YK.A01(r2, i2) * 5;
                        int i3 = iArr[A012 + 1];
                        if ((536870912 & i3) != 0) {
                            obj = r2.A0H[iArr[A012 + 4] + AnonymousClass6QR.A00(i3 >> 30)];
                        } else {
                            obj = null;
                        }
                        if (AnonymousClass00C.A0J(obj, AnonymousClass6XJ.A00)) {
                            AnonymousClass6YK r6 = r9.A0E;
                            int A013 = AnonymousClass6YK.A01(r6, i2);
                            int[] iArr2 = r6.A0G;
                            int i4 = iArr2[(A013 * 5) + 1];
                            if ((268435456 & i4) != 0) {
                                A052 = r6.A0H[AnonymousClass6YK.A03(r6, iArr2, A013) + AnonymousClass6QR.A00(i4 >> 29)];
                            } else {
                                A052 = C129736Ig.A00;
                            }
                        }
                    }
                    r2 = r9.A0E;
                    i2 = AnonymousClass6YK.A04(r2, r2.A0G, i2);
                }
                AnonymousClass00C.A0E(A052, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                r0 = (C161557n6) A052;
                r9.A0B = r0;
            }
            AnonymousClass6QL r3 = r9.A0C;
            if (r3.A07 > 0) {
                while (true) {
                    if (i <= 0) {
                        break;
                    }
                    int[] iArr3 = r3.A09;
                    int i5 = i * 5;
                    if (iArr3[i5] != 202 || !AnonymousClass00C.A0J(AnonymousClass6QL.A00(r3, iArr3, i), AnonymousClass6XJ.A00)) {
                        r3 = r9.A0C;
                        i = r3.A09[i5 + 2];
                    } else {
                        C114325h2 r02 = r9.A0J;
                        if (r02 == null || (r0 = (C161557n6) r02.A00.get(i)) == null) {
                            A052 = r9.A0C.A05(i);
                        }
                    }
                }
                r9.A0B = r0;
            }
            r0 = r9.A0A;
            r9.A0B = r0;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.7n6, java.util.Map, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C93824hC A05(X.C136916fF r5, X.C161557n6 r6, X.C161557n6 r7) {
        /*
            X.4hC r6 = (X.C93824hC) r6
            X.4hD r0 = new X.4hD
            r0.<init>(r6)
            r0.putAll(r7)
            X.4hC r4 = r0.A06()
            java.lang.Object r3 = X.AnonymousClass6XJ.A03
            r2 = 204(0xcc, float:2.86E-43)
            r1 = 0
            r0 = 0
            A0K(r5, r3, r0, r2, r1)
            r5.A0Q()
            r5.A0R(r4)
            r5.A0Q()
            r5.A0R(r7)
            A0M(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A05(X.6fF, X.7n6, X.7n6):X.4hC");
    }

    private final void A06() {
        AnonymousClass6XJ.A06(this.A0E.A0F);
        C1496372c r0 = new C1496372c();
        this.A0D = r0;
        AnonymousClass6YK A022 = r0.A02();
        A022.A0L();
        this.A0E = A022;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01eb A[EDGE_INSN: B:97:0x01eb->B:91:0x01eb ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A07() {
        /*
            r27 = this;
            r26 = r27
            r0 = r26
            boolean r0 = r0.A0M
            r25 = r0
            r1 = 1
            r0 = r26
            r0.A0M = r1
            X.6QL r7 = r0.A0C
            int r5 = r7.A05
            r24 = r5
            int[] r0 = r7.A09
            int r6 = X.C90524aI.A05(r0, r5)
            int r6 = r6 + r5
            r0 = r26
            int r4 = r0.A04
            int r2 = r0.A02
            int r3 = r0.A03
            java.util.List r1 = r0.A0c
            int r0 = r7.A01
            int r7 = X.AnonymousClass6XJ.A00(r1, r0)
            if (r7 >= 0) goto L_0x002f
            int r0 = r7 + 1
            int r7 = -r0
        L_0x002f:
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x01e7
            java.lang.Object r7 = r1.get(r7)
            X.5rq r7 = (X.C120645rq) r7
            int r0 = r7.A01
            if (r0 >= r6) goto L_0x01e7
            r23 = 0
        L_0x0041:
            int r11 = r7.A01
            int r0 = X.AnonymousClass6XJ.A00(r1, r11)
            if (r0 < 0) goto L_0x004c
            r1.remove(r0)
        L_0x004c:
            X.6fO r0 = r7.A02
            X.76f r8 = r7.A00
            if (r8 == 0) goto L_0x00fe
            X.0GA r12 = r0.A03
            if (r12 == 0) goto L_0x00fe
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x00fe
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00d5
        L_0x0066:
            r0 = r26
            X.5h0 r0 = r0.A0Z
            X.6fO r9 = r7.A02
            java.util.ArrayList r11 = r0.A00
            r11.add(r9)
            X.7iF r14 = r9.A05
            if (r14 == 0) goto L_0x00cc
            X.0G9 r7 = r9.A02
            if (r7 == 0) goto L_0x00cc
            int r0 = r9.A01
            r0 = r0 | 32
            r9.A01 = r0
            java.lang.Object[] r0 = r7.A04     // Catch:{ all -> 0x01c1 }
            r22 = r0
            long[] r15 = r7.A03     // Catch:{ all -> 0x01c1 }
            int r0 = r15.length     // Catch:{ all -> 0x01c1 }
            int r13 = r0 + -2
            if (r13 < 0) goto L_0x00c6
            r12 = 0
        L_0x008b:
            r20 = r15[r12]     // Catch:{ all -> 0x01c1 }
            long r16 = X.AnonymousClass000.A0Q(r20)
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r7
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            int r0 = r12 - r13
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r8 = 8 - r0
            r7 = 0
        L_0x00a6:
            if (r7 >= r8) goto L_0x00bf
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ba
            int r0 = r12 << 3
            int r0 = r0 + r7
            r0 = r22[r0]     // Catch:{ all -> 0x01c1 }
            r14.Bn3(r0)     // Catch:{ all -> 0x01c1 }
        L_0x00ba:
            long r20 = r20 >> r10
            int r7 = r7 + 1
            goto L_0x00a6
        L_0x00bf:
            if (r8 != r10) goto L_0x00c6
        L_0x00c1:
            if (r12 == r13) goto L_0x00c6
            int r12 = r12 + 1
            goto L_0x008b
        L_0x00c6:
            int r0 = r9.A01
            r0 = r0 & -33
            r9.A01 = r0
        L_0x00cc:
            int r0 = X.C90504aG.A0C(r11)
            r11.remove(r0)
            goto L_0x01a0
        L_0x00d5:
            java.util.Iterator r13 = r8.iterator()
        L_0x00d9:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r10 = r13.next()
            boolean r0 = r10 instanceof X.C161537n4
            if (r0 == 0) goto L_0x00fe
            X.7n4 r10 = (X.C161537n4) r10
            X.7dm r9 = X.C94014hV.A01(r10)
            X.4hb r0 = r10.BAf()
            java.lang.Object r8 = r0.A04
            java.lang.Object r0 = r12.A02(r10)
            boolean r0 = r9.B6k(r8, r0)
            if (r0 == 0) goto L_0x00fe
            goto L_0x00d9
        L_0x00fe:
            r0 = r26
            X.6QL r0 = r0.A0C
            r0.A0B(r11)
            int r9 = r0.A01
            r8 = r26
            r0 = r24
            r8.A0E(r0, r9, r5)
            r10 = r4
            X.6QL r0 = r8.A0C
            int[] r13 = r0.A09
            int r0 = r9 * 5
            r8 = r0
        L_0x0116:
            int r0 = r0 + 2
            r12 = r13[r0]
            if (r12 == r5) goto L_0x0125
            boolean r0 = X.AnonymousClass6QR.A03(r13, r12)
            if (r0 != 0) goto L_0x0125
            int r0 = r12 * 5
            goto L_0x0116
        L_0x0125:
            boolean r0 = X.AnonymousClass6QR.A03(r13, r12)
            if (r0 == 0) goto L_0x012c
            r10 = 0
        L_0x012c:
            if (r12 == r9) goto L_0x015c
            r0 = r26
            int r13 = r0.A00(r12)
            X.6QL r0 = r0.A0C
            int[] r0 = r0.A09
            int r0 = X.C90494aF.A0C(r0, r8)
            int r13 = r13 - r0
            int r13 = r13 + r10
        L_0x013e:
            if (r10 >= r13) goto L_0x015c
            if (r12 == r11) goto L_0x015c
            int r12 = r12 + 1
        L_0x0144:
            if (r12 >= r11) goto L_0x015c
            r0 = r26
            X.6QL r0 = r0.A0C
            int[] r0 = r0.A09
            int r14 = X.C90524aI.A05(r0, r12)
            int r14 = r14 + r12
            if (r11 < r14) goto L_0x013e
            r0 = r26
            int r0 = r0.A00(r12)
            int r10 = r10 + r0
            r12 = r14
            goto L_0x0144
        L_0x015c:
            r0 = r26
            r0.A04 = r10
            X.6QL r0 = r0.A0C
            r24 = r9
            int[] r9 = r0.A09
            int r0 = r8 + 2
            r8 = r9[r0]
            r0 = r26
            int r8 = r0.A01(r8, r5, r2)
            r0.A02 = r8
            r9 = 0
            r0.A0B = r9
            X.6fO r0 = r7.A02
            X.03v r8 = r0.A06
            java.lang.Integer r7 = X.C36361kB.A0i()
            if (r8 == 0) goto L_0x01e0
            r0 = r26
            r8.invoke(r0, r7)
            r0.A0B = r9
            X.6QL r9 = r0.A0C
            int[] r0 = r9.A09
            int r8 = X.C90524aI.A05(r0, r5)
            int r8 = r8 + r5
            int r7 = r9.A01
            r0 = 0
            if (r7 < r5) goto L_0x01c9
            if (r7 > r8) goto L_0x01c9
            r9.A05 = r5
            r9.A00 = r8
            r9.A02 = r0
            r9.A03 = r0
            r23 = 1
        L_0x01a0:
            r0 = r26
            X.6QL r0 = r0.A0C
            int r0 = r0.A01
            int r7 = X.AnonymousClass6XJ.A00(r1, r0)
            if (r7 >= 0) goto L_0x01af
            int r0 = r7 + 1
            int r7 = -r0
        L_0x01af:
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x01eb
            java.lang.Object r7 = r1.get(r7)
            X.5rq r7 = (X.C120645rq) r7
            int r0 = r7.A01
            if (r0 >= r6) goto L_0x01eb
            goto L_0x0041
        L_0x01c1:
            r1 = move-exception
            int r0 = r9.A01
            r0 = r0 & -33
            r9.A01 = r0
            throw r1
        L_0x01c9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Index "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not a parent of "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r7)
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x01e0:
            java.lang.String r0 = "Invalid restart scope"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x01e7:
            r26.A09()
            goto L_0x0204
        L_0x01eb:
            if (r23 == 0) goto L_0x01e7
            r1 = r26
            r0 = r24
            r1.A0E(r0, r5, r5)
            X.6QL r0 = r1.A0C
            r0.A09()
            r0 = r1
            int r1 = r1.A00(r5)
            int r4 = r4 + r1
            r0.A04 = r4
            int r3 = r3 + r1
            r0.A03 = r3
        L_0x0204:
            r0 = r26
            r0.A02 = r2
            r1 = r25
            r0.A0M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A07():void");
    }

    private final void A08() {
        A0A(this.A0C.A01);
        AnonymousClass6WG r3 = this.A0b;
        AnonymousClass6WG.A01(r3);
        r3.A05.A00.A04(C93614gr.A00);
        int i = r3.A03;
        AnonymousClass6QL r0 = r3.A09.A0C;
        r3.A03 = i + C90524aI.A05(r0.A09, r0.A01);
    }

    private final void A09() {
        int i;
        AnonymousClass6QL r2 = this.A0C;
        int i2 = r2.A05;
        if (i2 >= 0) {
            i = C90494aF.A0C(r2.A09, i2 * 5);
        } else {
            i = 0;
        }
        this.A03 = i;
        r2.A09();
    }

    private final void A0B(int i, int i2) {
        Object obj;
        if (i > 0 && i != i2) {
            AnonymousClass6QL r5 = this.A0C;
            int i3 = i * 5;
            A0B(r5.A09[i3 + 2], i2);
            int[] iArr = r5.A09;
            if (AnonymousClass6QR.A03(iArr, i)) {
                AnonymousClass6WG r2 = this.A0b;
                if (AnonymousClass6QR.A03(iArr, i)) {
                    obj = r5.A0A[iArr[i3 + 4]];
                } else {
                    obj = null;
                }
                r2.A04.A00.add(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (((((~r4) << 6) & r4) & -9187201950435737472L) == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r11 = X.AnonymousClass0G5.A00(r9, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r9.A00 != 0) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        if (X.AnonymousClass000.A0T(r27, r11) == 254) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        r0 = X.C05860Ri.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r8 == 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r1 = (r8 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        r24 = r9.A02;
        r23 = r9.A03;
        X.AnonymousClass0G5.A01(r9, r1);
        r22 = r9.A02;
        r21 = r9.A03;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        if (r13 >= r8) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        if (X.AnonymousClass000.A0T(r27, r13) >= 128) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        r20 = r24[r13];
        r1 = -862048943 * r20;
        r1 = r1 ^ (r1 << 16);
        r12 = X.AnonymousClass0G5.A00(r9, r1 >>> 7);
        r2 = (long) (r1 & 127);
        r11 = r9.A04;
        r19 = r12 >> 3;
        r18 = (r12 & 7) << 3;
        r11[r19] = (r11[r19] & (~(255 << r18))) | (r2 << r18);
        r0 = X.AnonymousClass001.A01(r12, r9.A00);
        r19 = r0 >> 3;
        r18 = (r0 & 7) << 3;
        r11[r19] = (r11[r19] & (~(255 << r18))) | (r2 << r18);
        r22[r12] = r20;
        r21[r12] = r23[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0115, code lost:
        r11 = X.AnonymousClass0G5.A00(r9, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011b, code lost:
        r9.A01++;
        r3 = r9.A00;
        r8 = r9.A04;
        r17 = r11 >> 3;
        r15 = r8[r17];
        r14 = (r11 & 7) << 3;
        r9.A00 = r3 - (X.AnonymousClass000.A1Q((((r15 >> r14) & 255) > 128 ? 1 : (((r15 >> r14) & 255) == 128 ? 0 : -1))) ? 1 : 0);
        r8[r17] = (r15 & (~(255 << r14))) | (r6 << r14);
        r0 = X.AnonymousClass001.A01(r11, r9.A00);
        r13 = r0 >> 3;
        r12 = (r0 & 7) << 3;
        r8[r13] = ((~(255 << r12)) & r8[r13]) | (r6 << r12);
        r3 = ~r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0C(int r29, int r30) {
        /*
            r28 = this;
            r4 = r28
            r10 = r29
            int r1 = r4.A00(r10)
            r26 = r30
            r0 = r26
            if (r1 == r0) goto L_0x0165
            if (r29 >= 0) goto L_0x0101
            X.0G5 r9 = r4.A06
            if (r9 != 0) goto L_0x001c
            r0 = 6
            X.0G5 r9 = new X.0G5
            r9.<init>(r0)
            r4.A06 = r9
        L_0x001c:
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r29
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r25 = r1 >>> 7
            r12 = r1 & 127(0x7f, float:1.78E-43)
            int r8 = r9.A00
            r11 = r25 & r8
            r17 = 0
        L_0x002e:
            long[] r0 = r9.A04
            r27 = r0
            long r4 = X.AnonymousClass000.A0S(r0, r11)
            long r6 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r6 * r15
            long r2 = r4 ^ r0
            long r13 = r2 - r15
            long r0 = ~r2
            long r0 = r0 & r13
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
        L_0x004a:
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0064
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r2 = r2 >> 3
            int r3 = r11 + r2
            r3 = r3 & r8
            int[] r2 = r9.A02
            r2 = r2[r3]
            if (r2 == r10) goto L_0x015a
            long r0 = X.AnonymousClass000.A0P(r0)
            goto L_0x004a
        L_0x0064:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r0 = r0 & r4
            long r0 = r0 & r15
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00fa
            r0 = r25
            int r11 = X.AnonymousClass0G5.A00(r9, r0)
            int r0 = r9.A00
            r4 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x011b
            r0 = r27
            long r12 = X.AnonymousClass000.A0T(r0, r11)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011b
            X.0GA r0 = X.C05860Ri.A01
            r1 = 6
            if (r8 == 0) goto L_0x008e
            int r0 = r8 * 2
            int r1 = r0 + 1
        L_0x008e:
            int[] r0 = r9.A02
            r24 = r0
            int[] r0 = r9.A03
            r23 = r0
            X.AnonymousClass0G5.A01(r9, r1)
            int[] r0 = r9.A02
            r22 = r0
            int[] r0 = r9.A03
            r21 = r0
            r13 = 0
        L_0x00a2:
            if (r13 >= r8) goto L_0x0115
            r0 = r27
            long r11 = X.AnonymousClass000.A0T(r0, r13)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f7
            r20 = r24[r13]
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r20
            int r0 = r1 << 16
            r1 = r1 ^ r0
            int r0 = r1 >>> 7
            int r12 = X.AnonymousClass0G5.A00(r9, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r0
            long[] r11 = r9.A04
            int r19 = r12 >> 3
            r0 = r12 & 7
            int r18 = r0 << 3
            r16 = r11[r19]
            long r14 = r4 << r18
            long r0 = ~r14
            long r16 = r16 & r0
            long r0 = r2 << r18
            long r16 = r16 | r0
            r11[r19] = r16
            int r0 = r9.A00
            int r0 = X.AnonymousClass001.A01(r12, r0)
            int r19 = r0 >> 3
            r0 = r0 & 7
            int r18 = r0 << 3
            r16 = r11[r19]
            long r14 = r4 << r18
            long r0 = ~r14
            long r16 = r16 & r0
            long r2 = r2 << r18
            long r16 = r16 | r2
            r11[r19] = r16
            r22[r12] = r20
            r0 = r23[r13]
            r21[r12] = r0
        L_0x00f7:
            int r13 = r13 + 1
            goto L_0x00a2
        L_0x00fa:
            int r17 = r17 + 8
            int r11 = r11 + r17
            r11 = r11 & r8
            goto L_0x002e
        L_0x0101:
            int[] r3 = r4.A0S
            if (r3 != 0) goto L_0x0112
            X.6QL r0 = r4.A0C
            int r2 = r0.A07
            int[] r3 = new int[r2]
            r1 = -1
            r0 = 0
            java.util.Arrays.fill(r3, r0, r2, r1)
            r4.A0S = r3
        L_0x0112:
            r3[r29] = r30
            return
        L_0x0115:
            r0 = r25
            int r11 = X.AnonymousClass0G5.A00(r9, r0)
        L_0x011b:
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            int r3 = r9.A00
            long[] r8 = r9.A04
            int r17 = r11 >> 3
            r15 = r8[r17]
            r0 = r11 & 7
            int r14 = r0 << 3
            long r12 = r15 >> r14
            long r12 = r12 & r4
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            int r3 = r3 - r0
            r9.A00 = r3
            long r2 = r4 << r14
            long r0 = ~r2
            long r15 = r15 & r0
            long r0 = r6 << r14
            long r15 = r15 | r0
            r8[r17] = r15
            int r0 = r9.A00
            int r0 = X.AnonymousClass001.A01(r11, r0)
            int r13 = r0 >> 3
            r0 = r0 & 7
            int r12 = r0 << 3
            r2 = r8[r13]
            long r4 = r4 << r12
            long r0 = ~r4
            long r0 = r0 & r2
            long r6 = r6 << r12
            long r0 = r0 | r6
            r8[r13] = r0
            int r3 = ~r11
        L_0x015a:
            if (r3 >= 0) goto L_0x015d
            int r3 = ~r3
        L_0x015d:
            int[] r0 = r9.A02
            r0[r3] = r29
            int[] r0 = r9.A03
            r0[r3] = r30
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A0C(int, int):void");
    }

    private final void A0E(int i, int i2, int i3) {
        AnonymousClass6QL r4 = this.A0C;
        int i4 = i;
        int i5 = i2;
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                i4 = i3;
            } else {
                int[] iArr = r4.A09;
                int i6 = iArr[(i * 5) + 2];
                if (i6 == i2) {
                    i4 = i2;
                } else {
                    int i7 = iArr[(i2 * 5) + 2];
                    if (i7 != i) {
                        if (i6 == i7) {
                            i4 = i6;
                        } else {
                            int i8 = i;
                            int i9 = 0;
                            while (i8 > 0 && i8 != i3) {
                                i8 = iArr[(i8 * 5) + 2];
                                i9++;
                            }
                            int i10 = i2;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i3) {
                                i10 = iArr[(i10 * 5) + 2];
                                i11++;
                            }
                            int i12 = i9 - i11;
                            for (int i13 = 0; i13 < i12; i13++) {
                                i4 = iArr[(i4 * 5) + 2];
                            }
                            int i14 = i11 - i9;
                            for (int i15 = 0; i15 < i14; i15++) {
                                i5 = iArr[(i5 * 5) + 2];
                            }
                            while (i4 != i5) {
                                i4 = iArr[(i4 * 5) + 2];
                                i5 = iArr[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            }
        }
        while (i > 0 && i != i4) {
            if (AnonymousClass6QR.A03(r4.A09, i)) {
                this.A0b.A04();
            }
            i = r4.A09[(i * 5) + 2];
        }
        A0B(i2, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r9 = r13.A0Y;
        r13.A0C = r9.A01();
        r10 = 0;
        A0K(r13, (java.lang.Object) null, (java.lang.Object) null, 100, 0);
        r7 = r13.A0V;
        r6 = r7 instanceof X.C93534gi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r6 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        ((X.C93534gi) r7).A07.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r6 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        r0 = X.C112285de.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r0 = (X.C161557n6) ((X.C93534gi) r7).A02.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r13.A0A = r0;
        r13.A0X.A01(r13.A0O ? 1 : 0);
        r13.A0O = r13.B2f(r13.A0A);
        r13.A0B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (r13.A0K != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if ((r7 instanceof androidx.compose.runtime.Recomposer) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        r0 = ((X.C93534gi) r7).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        r13.A0K = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r13.A0Q != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if ((r7 instanceof androidx.compose.runtime.Recomposer) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r0 = ((X.C93534gi) r7).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r13.A0Q = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r5 = (java.util.Set) X.AnonymousClass6G0.A02(X.C112325di.A00, r13.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r5 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        r5.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if ((r7 instanceof androidx.compose.runtime.Recomposer) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r1 = (X.C93534gi) r7;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r0 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r0 = X.C36441kJ.A16();
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r0.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if ((r7 instanceof androidx.compose.runtime.Recomposer) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        r0 = 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        r0 = ((X.C93534gi) r7).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        A0K(r13, (java.lang.Object) null, (java.lang.Object) null, r0, 0);
        r9 = r13.A0Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        if (r9 == r15) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        if (r15 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        r13.A0R(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
        r0 = r13.A0g;
        r5 = X.C129756Ii.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r5.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        if (r15 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        A0K(r13, X.AnonymousClass6XJ.A01, (java.lang.Object) null, 200, 0);
        X.C07710Yz.A03(r15, 2);
        r15.invoke(r13, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        if (r13.A0O == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0114, code lost:
        if (r9 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011c, code lost:
        if (r9.equals(X.C129736Ig.A00) != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
        A0K(r13, X.AnonymousClass6XJ.A01, (java.lang.Object) null, 200, 0);
        X.C07710Yz.A03(r9, 2);
        r9 = (X.C009003v) r9;
        X.AnonymousClass00C.A0E(r9, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        X.C07710Yz.A03(r9, 2);
        r9.invoke(r13, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        A0M(r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        if (r3.isEmpty() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r13.A03 += r13.A0C.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        r11 = r13.A0C;
        r9 = r11.A01;
        r8 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0157, code lost:
        if (r9 >= r8) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0159, code lost:
        r10 = r11.A09[r9 * 5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015f, code lost:
        if (r9 >= r8) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0162, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0164, code lost:
        r9 = X.AnonymousClass6QL.A00(r11, r11.A09, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016a, code lost:
        r8 = r11.A03();
        r13.A02 = A03(r9, r8, r10) ^ java.lang.Integer.rotateLeft(r13.A02, 3);
        r13.A0O(X.AnonymousClass6QR.A03(r11.A09, r11.A01), (java.lang.Object) null);
        r13.A07();
        r11.A08();
        r13.A02 = java.lang.Integer.rotateRight(A03(r9, r8, r10) ^ r13.A02, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r5.A04(r5.A00 - 1);
        A0M(r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a5, code lost:
        if (r6 == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a7, code lost:
        r1 = ((X.C93534gi) r7).A07;
        r1.A00--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b1, code lost:
        A0M(r13, false);
        r4 = r13.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b8, code lost:
        if (r4.A06 == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        X.AnonymousClass6WG.A03(r4, false);
        X.AnonymousClass6WG.A03(r4, false);
        r4.A05.A00.A04(X.C93584go.A00);
        r4.A06 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cb, code lost:
        X.AnonymousClass6WG.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d2, code lost:
        if (r4.A0A.A00 != 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dc, code lost:
        if (r13.A0a.A00.isEmpty() == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01de, code lost:
        A0I(r13);
        r13.A0C.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r13.A0M = false;
        r3.clear();
        r13.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1 = X.AnonymousClass6XJ.A01("Start/end imbalance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r5.A04(r5.A00 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0201, code lost:
        r1 = X.AnonymousClass6XJ.A01("Missed recording an endGroup()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0208, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r13.A0M = false;
        r3.clear();
        A0H(r13);
        r13.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0214, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r3 = r13.A0c;
        X.AnonymousClass03X.A08(r3, X.AnonymousClass6XJ.A05);
        r13.A04 = 0;
        r13.A0M = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(X.C136916fF r13, X.C132146Si r14, X.C009003v r15) {
        /*
            boolean r0 = r13.A0M
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = "Compose:recompose"
            android.os.Trace.beginSection(r0)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x0215 }
            int r0 = r0.A04()     // Catch:{ all -> 0x0215 }
            r13.A01 = r0     // Catch:{ all -> 0x0215 }
            r0 = 0
            r13.A0J = r0     // Catch:{ all -> 0x0215 }
            int r8 = r14.A00     // Catch:{ all -> 0x0215 }
            r2 = 0
            r7 = 0
        L_0x001d:
            if (r7 >= r8) goto L_0x0043
            java.lang.Object[] r0 = r14.A01     // Catch:{ all -> 0x0215 }
            r6 = r0[r7]     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            X.AnonymousClass00C.A0E(r6, r0)     // Catch:{ all -> 0x0215 }
            java.lang.Object[] r0 = r14.A02     // Catch:{ all -> 0x0215 }
            r5 = r0[r7]     // Catch:{ all -> 0x0215 }
            X.76f r5 = (X.C1506876f) r5     // Catch:{ all -> 0x0215 }
            X.6fO r6 = (X.C136976fO) r6     // Catch:{ all -> 0x0215 }
            X.606 r0 = r6.A04     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x01ee
            int r3 = r0.A00     // Catch:{ all -> 0x0215 }
            java.util.List r1 = r13.A0c     // Catch:{ all -> 0x0215 }
            X.5rq r0 = new X.5rq     // Catch:{ all -> 0x0215 }
            r0.<init>(r6, r5, r3)     // Catch:{ all -> 0x0215 }
            r1.add(r0)     // Catch:{ all -> 0x0215 }
            int r7 = r7 + 1
            goto L_0x001d
        L_0x0043:
            java.util.List r3 = r13.A0c     // Catch:{ all -> 0x0215 }
            java.util.Comparator r0 = X.AnonymousClass6XJ.A05     // Catch:{ all -> 0x0215 }
            X.AnonymousClass03X.A08(r3, r0)     // Catch:{ all -> 0x0215 }
            r13.A04 = r2     // Catch:{ all -> 0x0215 }
            r13.A0M = r4     // Catch:{ all -> 0x0215 }
            X.72c r9 = r13.A0Y     // Catch:{ all -> 0x0208 }
            X.6QL r0 = r9.A01()     // Catch:{ all -> 0x0208 }
            r13.A0C = r0     // Catch:{ all -> 0x0208 }
            r0 = 100
            r10 = 0
            r8 = 0
            A0K(r13, r8, r8, r0, r2)     // Catch:{ all -> 0x0208 }
            X.6Fi r7 = r13.A0V     // Catch:{ all -> 0x0208 }
            boolean r6 = r7 instanceof X.C93534gi     // Catch:{ all -> 0x0208 }
            if (r6 == 0) goto L_0x006e
            r0 = r7
            X.4gi r0 = (X.C93534gi) r0     // Catch:{ all -> 0x0208 }
            X.6fF r1 = r0.A07     // Catch:{ all -> 0x0208 }
            int r0 = r1.A00     // Catch:{ all -> 0x0208 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0208 }
        L_0x006e:
            if (r6 == 0) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            X.7n6 r0 = X.C112285de.A00     // Catch:{ all -> 0x0208 }
            goto L_0x007f
        L_0x0074:
            r0 = r7
            X.4gi r0 = (X.C93534gi) r0     // Catch:{ all -> 0x0208 }
            X.7n5 r0 = r0.A02     // Catch:{ all -> 0x0208 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0208 }
            X.7n6 r0 = (X.C161557n6) r0     // Catch:{ all -> 0x0208 }
        L_0x007f:
            r13.A0A = r0     // Catch:{ all -> 0x0208 }
            X.61S r1 = r13.A0X     // Catch:{ all -> 0x0208 }
            boolean r0 = r13.A0O     // Catch:{ all -> 0x0208 }
            r1.A01(r0)     // Catch:{ all -> 0x0208 }
            X.7n6 r0 = r13.A0A     // Catch:{ all -> 0x0208 }
            boolean r0 = r13.B2f(r0)     // Catch:{ all -> 0x0208 }
            r13.A0O = r0     // Catch:{ all -> 0x0208 }
            r13.A0B = r8     // Catch:{ all -> 0x0208 }
            boolean r0 = r13.A0K     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r7 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x009c
            r0 = 0
            goto L_0x00a1
        L_0x009c:
            r0 = r7
            X.4gi r0 = (X.C93534gi) r0     // Catch:{ all -> 0x0208 }
            boolean r0 = r0.A04     // Catch:{ all -> 0x0208 }
        L_0x00a1:
            r13.A0K = r0     // Catch:{ all -> 0x0208 }
        L_0x00a3:
            boolean r0 = r13.A0Q     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r7 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x00ad
            r0 = 0
            goto L_0x00b2
        L_0x00ad:
            r0 = r7
            X.4gi r0 = (X.C93534gi) r0     // Catch:{ all -> 0x0208 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x0208 }
        L_0x00b2:
            r13.A0Q = r0     // Catch:{ all -> 0x0208 }
        L_0x00b4:
            X.7n6 r1 = r13.A0A     // Catch:{ all -> 0x0208 }
            X.4gm r0 = X.C112325di.A00     // Catch:{ all -> 0x0208 }
            java.lang.Object r5 = X.AnonymousClass6G0.A02(r0, r1)     // Catch:{ all -> 0x0208 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x0208 }
            if (r5 == 0) goto L_0x00d7
            r5.add(r9)     // Catch:{ all -> 0x0208 }
            boolean r0 = r7 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x00d7
            r1 = r7
            X.4gi r1 = (X.C93534gi) r1     // Catch:{ all -> 0x0208 }
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x00d4
            java.util.HashSet r0 = X.C36441kJ.A16()     // Catch:{ all -> 0x0208 }
            r1.A00 = r0     // Catch:{ all -> 0x0208 }
        L_0x00d4:
            r0.add(r5)     // Catch:{ all -> 0x0208 }
        L_0x00d7:
            boolean r0 = r7 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x00de
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00e3
        L_0x00de:
            r0 = r7
            X.4gi r0 = (X.C93534gi) r0     // Catch:{ all -> 0x0208 }
            int r0 = r0.A01     // Catch:{ all -> 0x0208 }
        L_0x00e3:
            A0K(r13, r8, r8, r0, r2)     // Catch:{ all -> 0x0208 }
            java.lang.Object r9 = r13.A0Q()     // Catch:{ all -> 0x0208 }
            if (r9 == r15) goto L_0x00f1
            if (r15 == 0) goto L_0x00f1
            r13.A0R(r15)     // Catch:{ all -> 0x0208 }
        L_0x00f1:
            X.6Y9 r0 = r13.A0g     // Catch:{ all -> 0x0208 }
            X.76e r5 = X.C129756Ii.A00()     // Catch:{ all -> 0x0208 }
            r5.A0D(r0)     // Catch:{ all -> 0x01f9 }
            if (r15 == 0) goto L_0x0110
            java.lang.Object r8 = X.AnonymousClass6XJ.A01     // Catch:{ all -> 0x01f9 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 0
            A0K(r13, r8, r0, r1, r2)     // Catch:{ all -> 0x01f9 }
            r0 = 2
            X.C07710Yz.A03(r15, r0)     // Catch:{ all -> 0x01f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01f9 }
            r15.invoke(r13, r0)     // Catch:{ all -> 0x01f9 }
            goto L_0x013b
        L_0x0110:
            boolean r0 = r13.A0O     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x013f
            if (r9 == 0) goto L_0x013f
            java.lang.Object r0 = X.C129736Ig.A00     // Catch:{ all -> 0x01f9 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01f9 }
            if (r0 != 0) goto L_0x013f
            java.lang.Object r8 = X.AnonymousClass6XJ.A01     // Catch:{ all -> 0x01f9 }
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 0
            A0K(r13, r8, r0, r1, r2)     // Catch:{ all -> 0x01f9 }
            r1 = 2
            X.C07710Yz.A03(r9, r1)     // Catch:{ all -> 0x01f9 }
            X.03v r9 = (X.C009003v) r9     // Catch:{ all -> 0x01f9 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>"
            X.AnonymousClass00C.A0E(r9, r0)     // Catch:{ all -> 0x01f9 }
            X.C07710Yz.A03(r9, r1)     // Catch:{ all -> 0x01f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01f9 }
            r9.invoke(r13, r0)     // Catch:{ all -> 0x01f9 }
        L_0x013b:
            A0M(r13, r2)     // Catch:{ all -> 0x01f9 }
            goto L_0x019c
        L_0x013f:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x01f9 }
            if (r0 == 0) goto L_0x0151
            int r1 = r13.A03     // Catch:{ all -> 0x01f9 }
            X.6QL r0 = r13.A0C     // Catch:{ all -> 0x01f9 }
            int r0 = r0.A01()     // Catch:{ all -> 0x01f9 }
            int r1 = r1 + r0
            r13.A03 = r1     // Catch:{ all -> 0x01f9 }
            goto L_0x019c
        L_0x0151:
            X.6QL r11 = r13.A0C     // Catch:{ all -> 0x01f9 }
            int r9 = r11.A01     // Catch:{ all -> 0x01f9 }
            int r8 = r11.A00     // Catch:{ all -> 0x01f9 }
            if (r9 >= r8) goto L_0x015f
            int[] r1 = r11.A09     // Catch:{ all -> 0x01f9 }
            int r0 = r9 * 5
            r10 = r1[r0]     // Catch:{ all -> 0x01f9 }
        L_0x015f:
            if (r9 >= r8) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r9 = 0
            goto L_0x016a
        L_0x0164:
            int[] r0 = r11.A09     // Catch:{ all -> 0x01f9 }
            java.lang.Object r9 = X.AnonymousClass6QL.A00(r11, r0, r9)     // Catch:{ all -> 0x01f9 }
        L_0x016a:
            java.lang.Object r8 = r11.A03()     // Catch:{ all -> 0x01f9 }
            int r12 = A03(r9, r8, r10)     // Catch:{ all -> 0x01f9 }
            int r1 = r13.A02     // Catch:{ all -> 0x01f9 }
            r0 = 3
            int r0 = java.lang.Integer.rotateLeft(r1, r0)     // Catch:{ all -> 0x01f9 }
            r12 = r12 ^ r0
            r13.A02 = r12     // Catch:{ all -> 0x01f9 }
            int[] r1 = r11.A09     // Catch:{ all -> 0x01f9 }
            int r0 = r11.A01     // Catch:{ all -> 0x01f9 }
            boolean r1 = X.AnonymousClass6QR.A03(r1, r0)     // Catch:{ all -> 0x01f9 }
            r0 = 0
            r13.A0O(r1, r0)     // Catch:{ all -> 0x01f9 }
            r13.A07()     // Catch:{ all -> 0x01f9 }
            r11.A08()     // Catch:{ all -> 0x01f9 }
            int r1 = A03(r9, r8, r10)     // Catch:{ all -> 0x01f9 }
            int r0 = r13.A02     // Catch:{ all -> 0x01f9 }
            r1 = r1 ^ r0
            r0 = 3
            int r0 = java.lang.Integer.rotateRight(r1, r0)     // Catch:{ all -> 0x01f9 }
            r13.A02 = r0     // Catch:{ all -> 0x01f9 }
        L_0x019c:
            int r0 = r5.A00     // Catch:{ all -> 0x0208 }
            int r0 = r0 - r4
            r5.A04(r0)     // Catch:{ all -> 0x0208 }
            A0M(r13, r2)     // Catch:{ all -> 0x0208 }
            if (r6 == 0) goto L_0x01b1
            X.4gi r7 = (X.C93534gi) r7     // Catch:{ all -> 0x0208 }
            X.6fF r1 = r7.A07     // Catch:{ all -> 0x0208 }
            int r0 = r1.A00     // Catch:{ all -> 0x0208 }
            int r0 = r0 + -1
            r1.A00 = r0     // Catch:{ all -> 0x0208 }
        L_0x01b1:
            A0M(r13, r2)     // Catch:{ all -> 0x0208 }
            X.6WG r4 = r13.A0b     // Catch:{ all -> 0x0208 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01cb
            X.AnonymousClass6WG.A03(r4, r2)     // Catch:{ all -> 0x0208 }
            X.AnonymousClass6WG.A03(r4, r2)     // Catch:{ all -> 0x0208 }
            X.5h1 r0 = r4.A05     // Catch:{ all -> 0x0208 }
            X.6Ek r1 = r0.A00     // Catch:{ all -> 0x0208 }
            X.4go r0 = X.C93584go.A00     // Catch:{ all -> 0x0208 }
            r1.A04(r0)     // Catch:{ all -> 0x0208 }
            r4.A06 = r2     // Catch:{ all -> 0x0208 }
        L_0x01cb:
            X.AnonymousClass6WG.A00(r4)     // Catch:{ all -> 0x0208 }
            X.61S r0 = r4.A0A     // Catch:{ all -> 0x0208 }
            int r0 = r0.A00     // Catch:{ all -> 0x0208 }
            if (r0 != 0) goto L_0x0201
            X.5h0 r0 = r13.A0a     // Catch:{ all -> 0x0208 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x0208 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01f2
            A0I(r13)     // Catch:{ all -> 0x0208 }
            X.6QL r0 = r13.A0C     // Catch:{ all -> 0x0208 }
            r0.A07()     // Catch:{ all -> 0x0208 }
            r13.A0M = r2     // Catch:{ all -> 0x0215 }
            r3.clear()     // Catch:{ all -> 0x0215 }
            r13.A06()     // Catch:{ all -> 0x0215 }
        L_0x01ee:
            android.os.Trace.endSection()
            return
        L_0x01f2:
            java.lang.String r0 = "Start/end imbalance"
            java.lang.RuntimeException r1 = X.AnonymousClass6XJ.A01(r0)     // Catch:{ all -> 0x0208 }
            goto L_0x0207
        L_0x01f9:
            r1 = move-exception
            int r0 = r5.A00     // Catch:{ all -> 0x0208 }
            int r0 = r0 - r4
            r5.A04(r0)     // Catch:{ all -> 0x0208 }
            goto L_0x0207
        L_0x0201:
            java.lang.String r0 = "Missed recording an endGroup()"
            java.lang.RuntimeException r1 = X.AnonymousClass6XJ.A01(r0)     // Catch:{ all -> 0x0208 }
        L_0x0207:
            throw r1     // Catch:{ all -> 0x0208 }
        L_0x0208:
            r0 = move-exception
            r13.A0M = r2     // Catch:{ all -> 0x0215 }
            r3.clear()     // Catch:{ all -> 0x0215 }
            A0H(r13)     // Catch:{ all -> 0x0215 }
            r13.A06()     // Catch:{ all -> 0x0215 }
            throw r0     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x021a:
            java.lang.String r0 = "Reentrant composition is not supported"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A0J(X.6fF, X.6Si, X.03v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020f, code lost:
        if (r1 == r6) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
        if (r5.A0P == false) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0K(X.C136916fF r16, java.lang.Object r17, java.lang.Object r18, int r19, int r20) {
        /*
            r12 = r17
            r5 = r16
            boolean r0 = r5.A0N
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02e6
            r11 = r18
            r2 = r19
            int r3 = A03(r12, r11, r2)
            int r1 = r5.A02
            r0 = 3
            int r0 = java.lang.Integer.rotateLeft(r1, r0)
            r3 = r3 ^ r0
            r5.A02 = r3
            r4 = 0
            r8 = 1
            r19 = 0
            r1 = r20
            boolean r3 = X.C36381kD.A1U(r1, r4)
            boolean r0 = r5.A0L
            r6 = -1
            r10 = 0
            if (r0 == 0) goto L_0x009c
            X.6QL r1 = r5.A0C
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            X.6YK r1 = r5.A0E
            int r7 = r1.A00
            if (r3 == 0) goto L_0x0088
            java.lang.Object r0 = X.C129736Ig.A00
            X.AnonymousClass6YK.A0F(r1, r0, r0, r2, r8)
        L_0x003f:
            X.64B r9 = r5.A09
            if (r9 == 0) goto L_0x0068
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r0 = -2 - r7
            X.5uB r8 = new X.5uB
            r8.<init>(r1, r2, r0, r6)
            int r7 = r5.A04
            int r0 = r9.A01
            int r7 = r7 - r0
            java.util.HashMap r2 = r9.A02
            int r0 = r8.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.5rp r0 = new X.5rp
            r0.<init>(r6, r7, r4)
            r2.put(r1, r0)
            java.util.List r0 = r9.A04
            r0.add(r8)
        L_0x0068:
            X.5h0 r0 = r5.A0a
            X.64B r1 = r5.A09
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            r5.A09 = r10
            X.61S r1 = r5.A08
            int r0 = r5.A04
            r1.A01(r0)
            if (r3 == 0) goto L_0x007e
            r5.A04 = r4
        L_0x007e:
            X.61S r1 = r5.A07
            int r0 = r5.A03
            r1.A01(r0)
            r5.A03 = r4
            return
        L_0x0088:
            if (r18 == 0) goto L_0x0092
            if (r17 != 0) goto L_0x008e
            java.lang.Object r12 = X.C129736Ig.A00
        L_0x008e:
            X.AnonymousClass6YK.A0F(r1, r12, r11, r2, r4)
            goto L_0x003f
        L_0x0092:
            if (r17 != 0) goto L_0x0096
            java.lang.Object r12 = X.C129736Ig.A00
        L_0x0096:
            java.lang.Object r0 = X.C129736Ig.A00
            X.AnonymousClass6YK.A0F(r1, r12, r0, r2, r4)
            goto L_0x003f
        L_0x009c:
            if (r1 != r8) goto L_0x00a4
            boolean r0 = r5.A0P
            r18 = 1
            if (r0 != 0) goto L_0x00a6
        L_0x00a4:
            r18 = 0
        L_0x00a6:
            X.64B r0 = r5.A09
            if (r0 != 0) goto L_0x00cd
            X.6QL r13 = r5.A0C
            int r9 = r13.A01
            int r7 = r13.A00
            if (r9 >= r7) goto L_0x01ae
            int[] r1 = r13.A09
            int r0 = r9 * 5
            r0 = r1[r0]
        L_0x00b8:
            if (r18 != 0) goto L_0x0167
            if (r0 != r2) goto L_0x0167
            if (r9 >= r7) goto L_0x0164
            int[] r0 = r13.A09
            java.lang.Object r0 = X.AnonymousClass6QL.A00(r13, r0, r9)
        L_0x00c4:
            boolean r0 = X.AnonymousClass00C.A0J(r12, r0)
            if (r0 == 0) goto L_0x0167
            r5.A0O(r3, r11)
        L_0x00cd:
            X.64B r9 = r5.A09
            if (r9 == 0) goto L_0x0068
            if (r12 == 0) goto L_0x015e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            X.3Hg r13 = new X.3Hg
            r13.<init>(r0, r12)
        L_0x00dc:
            X.00T r0 = r9.A05
            java.lang.Object r7 = r0.getValue()
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            java.lang.Object r0 = r7.get(r13)
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            if (r0 == 0) goto L_0x015c
            java.lang.Object r1 = X.C007103b.A0I(r0)
            if (r1 == 0) goto L_0x015c
            java.lang.Object r0 = r7.get(r13)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0106
            r0.remove(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0106
            r7.remove(r13)
        L_0x0106:
            X.5uB r1 = (X.C122025uB) r1
            if (r18 != 0) goto L_0x021a
            if (r1 == 0) goto L_0x021a
            java.util.List r0 = r9.A04
            r0.add(r1)
            int r8 = r1.A01
            java.util.HashMap r2 = r9.A02
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r2.get(r7)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x015a
            int r1 = r0.A01
        L_0x0123:
            int r0 = r9.A01
            int r1 = r1 + r0
            r5.A04 = r1
            java.lang.Object r0 = r2.get(r7)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x0158
            int r12 = r0.A02
        L_0x0132:
            int r13 = r9.A00
            int r1 = r12 - r13
            if (r12 <= r13) goto L_0x01b1
            java.util.Iterator r7 = X.C36391kE.A10(r2)
        L_0x013c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r2 = r7.next()
            X.5rp r2 = (X.C120635rp) r2
            int r0 = r2.A02
            if (r0 != r12) goto L_0x014f
            r2.A02 = r13
            goto L_0x013c
        L_0x014f:
            if (r13 > r0) goto L_0x013c
            if (r0 >= r12) goto L_0x013c
            int r0 = r0 + 1
            r2.A02 = r0
            goto L_0x013c
        L_0x0158:
            r12 = -1
            goto L_0x0132
        L_0x015a:
            r1 = -1
            goto L_0x0123
        L_0x015c:
            r1 = 0
            goto L_0x0106
        L_0x015e:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            goto L_0x00dc
        L_0x0164:
            r0 = 0
            goto L_0x00c4
        L_0x0167:
            X.6QL r9 = r5.A0C
            java.util.ArrayList r17 = X.AnonymousClass001.A0I()
            int r0 = r9.A04
            if (r0 > 0) goto L_0x01a1
            int r7 = r9.A01
        L_0x0173:
            int r0 = r9.A00
            if (r7 >= r0) goto L_0x01a1
            int[] r13 = r9.A09
            int r0 = r7 * 5
            r1 = r13[r0]
            java.lang.Object r16 = X.AnonymousClass6QL.A00(r9, r13, r7)
            boolean r0 = X.AnonymousClass6QR.A03(r13, r7)
            if (r0 == 0) goto L_0x019a
            r15 = 1
        L_0x0188:
            X.5uB r14 = new X.5uB
            r0 = r16
            r14.<init>(r0, r1, r7, r15)
            r0 = r17
            r0.add(r14)
            int r0 = X.C90524aI.A05(r13, r7)
            int r7 = r7 + r0
            goto L_0x0173
        L_0x019a:
            int r0 = r7 * 5
            int r15 = X.C90494aF.A0C(r13, r0)
            goto L_0x0188
        L_0x01a1:
            int r7 = r5.A04
            X.64B r1 = new X.64B
            r0 = r17
            r1.<init>(r0, r7)
            r5.A09 = r1
            goto L_0x00cd
        L_0x01ae:
            r0 = 0
            goto L_0x00b8
        L_0x01b1:
            if (r13 <= r12) goto L_0x01d5
            java.util.Iterator r9 = X.C36391kE.A10(r2)
        L_0x01b7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r7 = r9.next()
            X.5rp r7 = (X.C120635rp) r7
            int r2 = r7.A02
            if (r2 != r12) goto L_0x01ca
            r7.A02 = r13
            goto L_0x01b7
        L_0x01ca:
            int r0 = r12 + 1
            if (r0 > r2) goto L_0x01b7
            if (r2 >= r13) goto L_0x01b7
            int r0 = r2 + -1
            r7.A02 = r0
            goto L_0x01b7
        L_0x01d5:
            X.6WG r7 = r5.A0b
            int r2 = r7.A03
            X.6fF r0 = r7.A09
            X.6QL r0 = r0.A0C
            int r0 = r0.A01
            int r0 = r8 - r0
            int r2 = r2 + r0
            r7.A03 = r2
            X.6QL r0 = r5.A0C
            r0.A0B(r8)
            if (r1 <= 0) goto L_0x0211
            X.AnonymousClass6WG.A01(r7)
            X.5h1 r0 = r7.A05
            X.6Ek r9 = r0.A00
            X.4h1 r8 = X.C93714h1.A00
            r9.A05(r8)
            r7 = 0
            X.AnonymousClass6G3.A00(r9, r4, r1)
            int r1 = r9.A03
            int r12 = r8.A00
            int r0 = 32 - r12
            int r0 = r6 >>> r0
            if (r12 != 0) goto L_0x0206
            r0 = 0
        L_0x0206:
            if (r1 != r0) goto L_0x02a6
            int r1 = r9.A04
            int r0 = r8.A01
            if (r0 != 0) goto L_0x0216
            r6 = 0
        L_0x020f:
            if (r1 != r6) goto L_0x02a6
        L_0x0211:
            r5.A0O(r3, r11)
            goto L_0x0068
        L_0x0216:
            int r0 = 32 - r0
            int r6 = r6 >>> r0
            goto L_0x020f
        L_0x021a:
            X.6QL r1 = r5.A0C
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            r5.A0L = r8
            r5.A0B = r10
            X.6YK r7 = r5.A0E
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x0244
            X.72c r0 = r5.A0D
            X.6YK r7 = r0.A02()
            r5.A0E = r7
            int r1 = r7.A01
            r7.A00 = r1
            int[] r0 = r7.A0G
            int r0 = X.AnonymousClass6YK.A02(r7, r0, r1)
            r7.A02 = r0
            r5.A0R = r4
            r5.A0B = r10
        L_0x0244:
            r7.A0K()
            X.6YK r1 = r5.A0E
            int r7 = r1.A00
            if (r3 == 0) goto L_0x0292
            java.lang.Object r0 = X.C129736Ig.A00
            X.AnonymousClass6YK.A0F(r1, r0, r0, r2, r8)
        L_0x0252:
            X.6YK r0 = r5.A0E
            X.606 r0 = r0.A0I(r7)
            r5.A0T = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r0 = -2 - r7
            X.5uB r8 = new X.5uB
            r8.<init>(r1, r2, r0, r6)
            int r7 = r5.A04
            int r0 = r9.A01
            int r7 = r7 - r0
            java.util.HashMap r2 = r9.A02
            int r0 = r8.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.5rp r0 = new X.5rp
            r0.<init>(r6, r7, r4)
            r2.put(r1, r0)
            java.util.List r0 = r9.A04
            r0.add(r8)
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            if (r3 != 0) goto L_0x0289
            int r0 = r5.A04
            r19 = r0
        L_0x0289:
            X.64B r10 = new X.64B
            r0 = r19
            r10.<init>(r1, r0)
            goto L_0x0068
        L_0x0292:
            if (r11 == 0) goto L_0x029c
            if (r12 != 0) goto L_0x0298
            java.lang.Object r12 = X.C129736Ig.A00
        L_0x0298:
            X.AnonymousClass6YK.A0F(r1, r12, r11, r2, r4)
            goto L_0x0252
        L_0x029c:
            if (r12 != 0) goto L_0x02a0
            java.lang.Object r12 = X.C129736Ig.A00
        L_0x02a0:
            java.lang.Object r0 = X.C129736Ig.A00
            X.AnonymousClass6YK.A0F(r1, r12, r0, r2, r4)
            goto L_0x0252
        L_0x02a6:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
            r6 = 0
        L_0x02ac:
            java.lang.String r5 = ", "
            if (r1 >= r12) goto L_0x02c2
            int r0 = X.C128976Ek.A00(r9, r1)
            if (r0 == 0) goto L_0x02bf
            if (r6 <= 0) goto L_0x02bb
            r2.append(r5)
        L_0x02bb:
            int r6 = X.AnonymousClass6EM.A00(r8, r2, r1, r6)
        L_0x02bf:
            int r1 = r1 + 1
            goto L_0x02ac
        L_0x02c2:
            java.lang.String r4 = X.C36381kD.A0y(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            int r2 = r8.A01
            r1 = 0
        L_0x02cd:
            if (r7 >= r2) goto L_0x02e1
            int r0 = X.C128976Ek.A01(r9, r7)
            if (r0 == 0) goto L_0x02de
            if (r6 <= 0) goto L_0x02da
            r3.append(r5)
        L_0x02da:
            int r1 = X.AnonymousClass6EM.A01(r8, r3, r7, r1)
        L_0x02de:
            int r7 = r7 + 1
            goto L_0x02cd
        L_0x02e1:
            java.lang.IllegalStateException r0 = X.C90464aC.A0Q(r3, r8, r4, r6, r1)
            throw r0
        L_0x02e6:
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A0K(X.6fF, java.lang.Object, java.lang.Object, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [int] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5, types: [int] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0M(X.C136916fF r21, boolean r22) {
        /*
            r14 = r21
            boolean r0 = r14.A0L
            if (r0 == 0) goto L_0x0085
            X.6YK r7 = r14.A0E
            int r0 = r7.A08
            int[] r6 = r7.A0G
            int r3 = X.AnonymousClass6YK.A01(r7, r0)
            int r1 = r3 * 5
            r5 = r6[r1]
            int r0 = r1 + 1
            r8 = r6[r0]
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0083
            java.lang.Object[] r2 = r7.A0H
            int r0 = r1 + 4
            r1 = r6[r0]
            int r0 = r8 >> 30
            int r0 = X.AnonymousClass6QR.A00(r0)
            int r1 = r1 + r0
            r4 = r2[r1]
        L_0x002c:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0080
            java.lang.Object[] r2 = r7.A0H
            int r1 = X.AnonymousClass6YK.A03(r7, r6, r3)
            int r0 = r8 >> 29
            int r0 = X.AnonymousClass6QR.A00(r0)
            int r1 = r1 + r0
            r0 = r2[r1]
        L_0x0040:
            int r1 = A03(r4, r0, r5)
            int r0 = r14.A02
            r1 = r1 ^ r0
            r0 = 3
            int r0 = java.lang.Integer.rotateRight(r1, r0)
            r14.A02 = r0
            int r13 = r14.A03
            X.64B r12 = r14.A09
            if (r12 == 0) goto L_0x01ed
            java.util.List r0 = r12.A03
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01ed
            java.util.List r0 = r12.A03
            r21 = r0
            java.util.List r0 = r12.A04
            r20 = r0
            int r0 = r20.size()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r0)
            int r2 = r20.size()
            r1 = 0
        L_0x0072:
            if (r1 >= r2) goto L_0x0098
            r0 = r20
            java.lang.Object r0 = r0.get(r1)
            r11.add(r0)
            int r1 = r1 + 1
            goto L_0x0072
        L_0x0080:
            java.lang.Object r0 = X.C129736Ig.A00
            goto L_0x0040
        L_0x0083:
            r4 = 0
            goto L_0x002c
        L_0x0085:
            X.6QL r3 = r14.A0C
            int r2 = r3.A05
            int[] r1 = r3.A09
            int r0 = r2 * 5
            r5 = r1[r0]
            java.lang.Object r4 = X.AnonymousClass6QL.A00(r3, r1, r2)
            java.lang.Object r0 = r3.A05(r2)
            goto L_0x0040
        L_0x0098:
            java.util.LinkedHashSet r18 = X.C36441kJ.A17()
            int r17 = r20.size()
            int r16 = r21.size()
            r10 = 0
            r9 = 0
            r8 = 0
        L_0x00a7:
            r0 = r16
            if (r10 >= r0) goto L_0x01cf
            r0 = r21
            java.lang.Object r1 = r0.get(r10)
            X.5uB r1 = (X.C122025uB) r1
            boolean r0 = r11.contains(r1)
            if (r0 != 0) goto L_0x0102
            java.util.HashMap r2 = r12.A02
            int r0 = r1.A01
            java.lang.Object r0 = X.C90484aE.A0j(r2, r0)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x0100
            int r2 = r0.A01
        L_0x00c7:
            X.6WG r3 = r14.A0b
            int r0 = r12.A01
            int r2 = r2 + r0
            int r0 = r1.A02
            r3.A05(r2, r0)
            int r2 = r1.A01
            r0 = 0
            r12.A00(r2, r0)
            int r1 = r3.A03
            X.6fF r0 = r3.A09
            X.6QL r0 = r0.A0C
            int r0 = r0.A01
            int r0 = r2 - r0
            int r1 = r1 + r0
            r3.A03 = r1
            X.6QL r0 = r14.A0C
            r0.A0B(r2)
            r14.A08()
            X.6QL r0 = r14.A0C
            r0.A01()
            java.util.List r1 = r14.A0c
            int[] r0 = r0.A09
            int r0 = X.C90524aI.A05(r0, r2)
            int r0 = r0 + r2
            X.AnonymousClass6XJ.A05(r1, r2, r0)
        L_0x00fd:
            int r10 = r10 + 1
            goto L_0x00a7
        L_0x0100:
            r2 = -1
            goto L_0x00c7
        L_0x0102:
            r0 = r18
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00fd
            r0 = r17
            if (r9 >= r0) goto L_0x00a7
            r0 = r20
            java.lang.Object r7 = r0.get(r9)
            X.5uB r7 = (X.C122025uB) r7
            if (r7 == r1) goto L_0x01b7
            java.util.HashMap r0 = r12.A02
            r19 = r0
            int r1 = r7.A01
            java.lang.Object r0 = X.C90484aE.A0j(r0, r1)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x018e
            int r6 = r0.A01
        L_0x0128:
            r0 = r18
            r0.add(r7)
            if (r6 == r8) goto L_0x01b9
            int r1 = r7.A01
            r0 = r19
            java.lang.Object r0 = X.C90484aE.A0j(r0, r1)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x018b
            int r5 = r0.A00
        L_0x013d:
            X.6WG r4 = r14.A0b
            int r0 = r12.A01
            int r15 = r0 + r6
            int r3 = r8 + r0
            if (r5 <= 0) goto L_0x015c
            int r2 = r4.A00
            if (r2 <= 0) goto L_0x0181
            int r0 = r4.A01
            r1 = r0
            int r0 = r15 - r2
            if (r1 != r0) goto L_0x0181
            int r0 = r4.A02
            r1 = r0
            int r0 = r3 - r2
            if (r1 != r0) goto L_0x0181
            int r2 = r2 + r5
            r4.A00 = r2
        L_0x015c:
            if (r6 <= r8) goto L_0x0190
            java.util.Iterator r3 = X.C36391kE.A10(r19)
        L_0x0162:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r2 = r3.next()
            X.5rp r2 = (X.C120635rp) r2
            int r1 = r2.A01
            if (r6 > r1) goto L_0x017b
            int r0 = r6 + r5
            if (r1 >= r0) goto L_0x017b
            int r1 = r1 - r6
            int r1 = r1 + r8
        L_0x0178:
            r2.A01 = r1
            goto L_0x0162
        L_0x017b:
            if (r8 > r1) goto L_0x0162
            if (r1 >= r6) goto L_0x0162
            int r1 = r1 + r5
            goto L_0x0178
        L_0x0181:
            X.AnonymousClass6WG.A02(r4)
            r4.A01 = r15
            r4.A02 = r3
            r4.A00 = r5
            goto L_0x015c
        L_0x018b:
            int r5 = r7.A02
            goto L_0x013d
        L_0x018e:
            r6 = -1
            goto L_0x0128
        L_0x0190:
            if (r8 <= r6) goto L_0x01b9
            java.util.Iterator r3 = X.C36391kE.A10(r19)
        L_0x0196:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r2 = r3.next()
            X.5rp r2 = (X.C120635rp) r2
            int r1 = r2.A01
            if (r6 > r1) goto L_0x01af
            int r0 = r6 + r5
            if (r1 >= r0) goto L_0x01af
            int r1 = r1 - r6
            int r1 = r1 + r8
        L_0x01ac:
            r2.A01 = r1
            goto L_0x0196
        L_0x01af:
            int r0 = r6 + 1
            if (r0 > r1) goto L_0x0196
            if (r1 >= r8) goto L_0x0196
            int r1 = r1 - r5
            goto L_0x01ac
        L_0x01b7:
            int r10 = r10 + 1
        L_0x01b9:
            int r9 = r9 + 1
            java.util.HashMap r1 = r12.A02
            int r0 = r7.A01
            java.lang.Object r0 = X.C90484aE.A0j(r1, r0)
            X.5rp r0 = (X.C120635rp) r0
            if (r0 == 0) goto L_0x01cc
            int r0 = r0.A00
        L_0x01c9:
            int r8 = r8 + r0
            goto L_0x00a7
        L_0x01cc:
            int r0 = r7.A02
            goto L_0x01c9
        L_0x01cf:
            X.6WG r4 = r14.A0b
            X.AnonymousClass6WG.A02(r4)
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x01ed
            X.6QL r3 = r14.A0C
            int r2 = r3.A00
            int r1 = r4.A03
            X.6fF r0 = r4.A09
            X.6QL r0 = r0.A0C
            int r0 = r0.A01
            int r2 = r2 - r0
            int r1 = r1 + r2
            r4.A03 = r1
            r3.A09()
        L_0x01ed:
            int r3 = r14.A04
        L_0x01ef:
            X.6QL r1 = r14.A0C
            int r0 = r1.A04
            if (r0 > 0) goto L_0x0213
            int r2 = r1.A01
            int r0 = r1.A00
            if (r2 == r0) goto L_0x0213
            r14.A08()
            X.6QL r0 = r14.A0C
            int r1 = r0.A01()
            X.6WG r0 = r14.A0b
            r0.A05(r3, r1)
            java.util.List r1 = r14.A0c
            X.6QL r0 = r14.A0C
            int r0 = r0.A01
            X.AnonymousClass6XJ.A05(r1, r2, r0)
            goto L_0x01ef
        L_0x0213:
            boolean r2 = r14.A0L
            if (r2 == 0) goto L_0x039b
            if (r22 == 0) goto L_0x027d
            X.5nd r1 = r14.A0I
            X.6Ek r12 = r1.A01
            int r0 = r12.A02
            if (r0 == 0) goto L_0x026f
            X.6Ek r11 = r1.A00
            X.6EM[] r1 = r12.A06
            int r0 = r0 + -1
            r12.A02 = r0
            r15 = r1[r0]
            X.AnonymousClass00C.A0B(r15)
            X.6EM[] r1 = r12.A06
            int r0 = r12.A02
            r7 = 0
            r1[r0] = r7
            r11.A05(r15)
            int r6 = r12.A01
            r10 = r6
            int r5 = r11.A01
            int r9 = r15.A01
            r13 = 0
            r4 = 0
        L_0x0241:
            if (r4 >= r9) goto L_0x0254
            int r5 = r5 + -1
            int r6 = r6 + -1
            java.lang.Object[] r3 = r11.A07
            java.lang.Object[] r1 = r12.A07
            r0 = r1[r6]
            r3[r5] = r0
            r1[r6] = r7
            int r4 = r4 + 1
            goto L_0x0241
        L_0x0254:
            int r8 = r12.A00
            r7 = r8
            int r6 = r11.A00
            int r5 = r15.A00
            r4 = 0
        L_0x025c:
            if (r4 >= r5) goto L_0x0276
            int r6 = r6 + -1
            int r8 = r8 + -1
            int[] r3 = r11.A05
            int[] r1 = r12.A05
            r0 = r1[r8]
            r3[r6] = r0
            r1[r8] = r13
            int r4 = r4 + 1
            goto L_0x025c
        L_0x026f:
            java.lang.String r0 = "Cannot end node insertion, there are no pending operations that can be realized."
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x0276:
            int r10 = r10 - r9
            r12.A01 = r10
            int r7 = r7 - r5
            r12.A00 = r7
            r13 = 1
        L_0x027d:
            X.6QL r4 = r14.A0C
            int r0 = r4.A04
            if (r0 <= 0) goto L_0x0394
            int r0 = r0 + -1
            r4.A04 = r0
            X.6YK r3 = r14.A0E
            int r1 = r3.A08
            r3.A0M()
            int r0 = r4.A04
            if (r0 > 0) goto L_0x03e6
            int r4 = -2 - r1
            r3.A0N()
            r3.A0L()
            X.606 r6 = r14.A0T
            X.5nd r5 = r14.A0I
            X.6Ek r0 = r5.A00
            int r0 = r0.A02
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            X.6WG r0 = r14.A0b
            X.72c r1 = r14.A0D
            X.AnonymousClass6WG.A00(r0)
            X.AnonymousClass6WG.A01(r0)
            X.5h1 r0 = r0.A05
            X.6Ek r8 = r0.A00
            if (r3 == 0) goto L_0x02e7
            X.4gz r9 = X.C93694gz.A00
            r8.A05(r9)
            r7 = 0
            X.AnonymousClass6G3.A01(r8, r6, r7)
            r0 = 1
            X.AnonymousClass6G3.A01(r8, r1, r0)
            int r1 = r8.A03
            int r3 = r9.A00
            int r0 = X.C90464aC.A07(r3)
            if (r1 != r0) goto L_0x0314
            int r1 = r8.A04
            int r0 = r9.A01
            int r0 = X.C90464aC.A07(r0)
            if (r1 != r0) goto L_0x0314
        L_0x02d7:
            r14.A0L = r7
            X.72c r0 = r14.A0Y
            int r0 = r0.A00
            if (r0 == 0) goto L_0x03e6
            r14.A0C(r4, r7)
            r14.A0D(r4, r13)
            goto L_0x03e6
        L_0x02e7:
            X.4h0 r9 = X.C93704h0.A00
            r8.A05(r9)
            r7 = 0
            X.AnonymousClass6G3.A01(r8, r6, r7)
            r0 = 1
            X.AnonymousClass6G3.A01(r8, r1, r0)
            r0 = 2
            X.AnonymousClass6G3.A01(r8, r5, r0)
            int r1 = r8.A03
            int r3 = r9.A00
            int r0 = X.C90464aC.A07(r3)
            if (r1 != r0) goto L_0x0354
            int r1 = r8.A04
            int r0 = r9.A01
            int r0 = X.C90464aC.A07(r0)
            if (r1 != r0) goto L_0x0354
            X.5nd r0 = new X.5nd
            r0.<init>()
            r14.A0I = r0
            goto L_0x02d7
        L_0x0314:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
            r6 = 0
        L_0x031a:
            java.lang.String r5 = ", "
            if (r1 >= r3) goto L_0x0330
            int r0 = X.C128976Ek.A00(r8, r1)
            if (r0 == 0) goto L_0x032d
            if (r6 <= 0) goto L_0x0329
            r2.append(r5)
        L_0x0329:
            int r6 = X.AnonymousClass6EM.A00(r9, r2, r1, r6)
        L_0x032d:
            int r1 = r1 + 1
            goto L_0x031a
        L_0x0330:
            java.lang.String r4 = X.C36381kD.A0y(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            int r2 = r9.A01
            r1 = 0
        L_0x033b:
            if (r7 >= r2) goto L_0x034f
            int r0 = X.C128976Ek.A01(r8, r7)
            if (r0 == 0) goto L_0x034c
            if (r6 <= 0) goto L_0x0348
            r3.append(r5)
        L_0x0348:
            int r1 = X.AnonymousClass6EM.A01(r9, r3, r7, r1)
        L_0x034c:
            int r7 = r7 + 1
            goto L_0x033b
        L_0x034f:
            java.lang.IllegalStateException r0 = X.C90464aC.A0Q(r3, r9, r4, r6, r1)
            throw r0
        L_0x0354:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
            r6 = 0
        L_0x035a:
            java.lang.String r5 = ", "
            if (r1 >= r3) goto L_0x0370
            int r0 = X.C128976Ek.A00(r8, r1)
            if (r0 == 0) goto L_0x036d
            if (r6 <= 0) goto L_0x0369
            r2.append(r5)
        L_0x0369:
            int r6 = X.AnonymousClass6EM.A00(r9, r2, r1, r6)
        L_0x036d:
            int r1 = r1 + 1
            goto L_0x035a
        L_0x0370:
            java.lang.String r4 = X.C36381kD.A0y(r2)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            int r2 = r9.A01
            r1 = 0
        L_0x037b:
            if (r7 >= r2) goto L_0x038f
            int r0 = X.C128976Ek.A01(r8, r7)
            if (r0 == 0) goto L_0x038c
            if (r6 <= 0) goto L_0x0388
            r3.append(r5)
        L_0x0388:
            int r1 = X.AnonymousClass6EM.A01(r9, r3, r7, r1)
        L_0x038c:
            int r7 = r7 + 1
            goto L_0x037b
        L_0x038f:
            java.lang.IllegalStateException r0 = X.C90464aC.A0Q(r3, r9, r4, r6, r1)
            throw r0
        L_0x0394:
            java.lang.String r0 = "Unbalanced begin/end empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x039b:
            if (r22 == 0) goto L_0x03a2
            X.6WG r0 = r14.A0b
            r0.A04()
        L_0x03a2:
            X.6WG r3 = r14.A0b
            X.6fF r0 = r3.A09
            X.6QL r0 = r0.A0C
            int r5 = r0.A05
            X.61S r4 = r3.A0A
            r1 = -1
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x03b7
            int[] r1 = r4.A01
            int r0 = r0 + -1
            r1 = r1[r0]
        L_0x03b7:
            if (r1 > r5) goto L_0x0413
            if (r1 != r5) goto L_0x03ce
            r0 = 0
            X.AnonymousClass6WG.A03(r3, r0)
            int r0 = r4.A00
            int r0 = r0 + -1
            r4.A00 = r0
            X.5h1 r0 = r3.A05
            X.6Ek r1 = r0.A00
            X.4go r0 = X.C93584go.A00
            r1.A04(r0)
        L_0x03ce:
            X.6QL r0 = r14.A0C
            int r1 = r0.A05
            int r0 = r14.A00(r1)
            if (r13 == r0) goto L_0x03db
            r14.A0D(r1, r13)
        L_0x03db:
            if (r22 == 0) goto L_0x03de
            r13 = 1
        L_0x03de:
            X.6QL r0 = r14.A0C
            r0.A08()
            X.AnonymousClass6WG.A02(r3)
        L_0x03e6:
            X.5h0 r0 = r14.A0a
            java.util.ArrayList r1 = r0.A00
            int r0 = X.C90504aG.A0C(r1)
            java.lang.Object r1 = r1.remove(r0)
            X.64B r1 = (X.AnonymousClass64B) r1
            if (r1 == 0) goto L_0x03fe
            if (r2 != 0) goto L_0x03fe
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x03fe:
            r14.A09 = r1
            X.61S r0 = r14.A08
            int r0 = X.AnonymousClass61S.A00(r0)
            int r0 = r0 + r13
            r14.A04 = r0
            X.61S r0 = r14.A07
            int r0 = X.AnonymousClass61S.A00(r0)
            int r0 = r0 + r13
            r14.A03 = r0
            return
        L_0x0413:
            java.lang.String r0 = "Missed recording an endGroup"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.A0M(X.6fF, boolean):void");
    }

    public static void A0N(Object obj) {
        A0M((C136916fF) obj, false);
    }

    private final void A0O(boolean z, Object obj) {
        if (z) {
            AnonymousClass6QL r2 = this.A0C;
            if (r2.A04 > 0) {
                return;
            }
            if (AnonymousClass6QR.A03(r2.A09, r2.A01)) {
                r2.A0A();
                return;
            }
            throw AnonymousClass001.A08("Expected a node group");
        }
        if (!(obj == null || this.A0C.A03() == obj)) {
            AnonymousClass6WG r0 = this.A0b;
            int i = 0;
            AnonymousClass6WG.A03(r0, false);
            C128976Ek r9 = r0.A05.A00;
            C93764h6 r8 = C93764h6.A00;
            r9.A05(r8);
            AnonymousClass6G3.A01(r9, obj, 0);
            int i2 = r9.A03;
            int i3 = r8.A00;
            if (i3 != 0) {
                i = -1 >>> (32 - i3);
            }
            if (!(i2 == i && r9.A04 == C90464aC.A07(r8.A01))) {
                StringBuilder A0u = AnonymousClass000.A0u();
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    if (C128976Ek.A00(r9, i5) != 0) {
                        if (i4 > 0) {
                            A0u.append(", ");
                        }
                        i4 = AnonymousClass6EM.A00(r8, A0u, i5, i4);
                    }
                }
                String A0y = C36381kD.A0y(A0u);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                int i6 = r8.A01;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    if (C128976Ek.A01(r9, i8) != 0) {
                        if (i4 > 0) {
                            A0u2.append(", ");
                        }
                        i7 = AnonymousClass6EM.A01(r8, A0u2, i8, i7);
                    }
                }
                throw C90464aC.A0Q(A0u2, r8, A0y, i4, i7);
            }
        }
        this.A0C.A0A();
    }

    public final C136976fO A0P() {
        C114305h0 r1 = this.A0Z;
        if (this.A00 != 0) {
            return null;
        }
        ArrayList arrayList = r1.A00;
        if (C36411kG.A1a(arrayList)) {
            return (C136976fO) arrayList.get(C90504aG.A0C(arrayList));
        }
        return null;
    }

    public final Object A0Q() {
        if (!this.A0L) {
            Object A042 = this.A0C.A04();
            if (!this.A0P || (A042 instanceof C17480rU)) {
                return A042;
            }
        } else if (!(!this.A0N)) {
            throw AnonymousClass6XJ.A01("A call to createNode(), emitNode() or useNode() expected");
        }
        return C129736Ig.A00;
    }

    public final void A0R(Object obj) {
        if (this.A0L) {
            AnonymousClass6YK r5 = this.A0E;
            if (r5.A06 > 0) {
                AnonymousClass6YK.A0B(r5, 1, r5.A08);
            }
            Object[] objArr = r5.A0H;
            int i = r5.A02 + 1;
            r5.A02 = i;
            int i2 = r5.A0B;
            if (i <= r5.A03) {
                int i3 = i - 1;
                if (i3 >= i2) {
                    i3 += r5.A09;
                }
                objArr[i3] = obj;
                return;
            }
            throw AnonymousClass6XJ.A01("Writing to an invalid slot");
        }
        AnonymousClass6QL r0 = this.A0C;
        AnonymousClass6WG r1 = this.A0b;
        AnonymousClass6WG.A03(r1, true);
        C128976Ek r9 = r1.A05.A00;
        C93814hB r8 = C93814hB.A00;
        r9.A05(r8);
        AnonymousClass6G3.A01(r9, obj, 0);
        AnonymousClass6G3.A00(r9, 0, (r0.A02 - AnonymousClass6QR.A02(r0.A09, r0.A05)) - 1);
        int i4 = r9.A03;
        int i5 = r8.A00;
        if (i4 != C90464aC.A07(i5) || r9.A04 != C90464aC.A07(r8.A01)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (C128976Ek.A00(r9, i7) != 0) {
                    if (i6 > 0) {
                        A0u.append(", ");
                    }
                    i6 = AnonymousClass6EM.A00(r8, A0u, i7, i6);
                }
            }
            String A0y = C36381kD.A0y(A0u);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            int i8 = r8.A01;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                if (C128976Ek.A01(r9, i10) != 0) {
                    if (i6 > 0) {
                        A0u2.append(", ");
                    }
                    i9 = AnonymousClass6EM.A01(r8, A0u2, i10, i9);
                }
            }
            throw C90464aC.A0Q(A0u2, r8, A0y, i6, i9);
        }
    }

    public void B1A(Object obj, C009003v r12) {
        if (this.A0L) {
            C128976Ek r9 = this.A0I.A00;
            C93774h7 r8 = C93774h7.A00;
            r9.A05(r8);
            AnonymousClass6G3.A01(r9, obj, 0);
            AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            C07710Yz.A03(r12, 2);
            AnonymousClass6G3.A01(r9, r12, 1);
            int i = r9.A03;
            int i2 = r8.A00;
            if (i != C90464aC.A07(i2) || r9.A04 != C90464aC.A07(r8.A01)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (C128976Ek.A00(r9, i4) != 0) {
                        if (i3 > 0) {
                            A0u.append(", ");
                        }
                        i3 = AnonymousClass6EM.A00(r8, A0u, i4, i3);
                    }
                }
                String A0y = C36381kD.A0y(A0u);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                int i5 = r8.A01;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    if (C128976Ek.A01(r9, i7) != 0) {
                        if (i3 > 0) {
                            A0u2.append(", ");
                        }
                        i6 = AnonymousClass6EM.A01(r8, A0u2, i7, i6);
                    }
                }
                throw C90464aC.A0Q(A0u2, r8, A0y, i3, i6);
            }
            return;
        }
        AnonymousClass6WG r0 = this.A0b;
        AnonymousClass6WG.A00(r0);
        C128976Ek r92 = r0.A05.A00;
        C93774h7 r82 = C93774h7.A00;
        r92.A05(r82);
        AnonymousClass6G3.A01(r92, obj, 0);
        AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        C07710Yz.A03(r12, 2);
        AnonymousClass6G3.A01(r92, r12, 1);
        int i8 = r92.A03;
        int i9 = r82.A00;
        if (i8 != C90464aC.A07(i9) || r92.A04 != C90464aC.A07(r82.A01)) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                if (C128976Ek.A00(r92, i11) != 0) {
                    if (i10 > 0) {
                        A0u3.append(", ");
                    }
                    i10 = AnonymousClass6EM.A00(r82, A0u3, i11, i10);
                }
            }
            String A0y2 = C36381kD.A0y(A0u3);
            StringBuilder A0u4 = AnonymousClass000.A0u();
            int i12 = r82.A01;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                if (C128976Ek.A01(r92, i14) != 0) {
                    if (i10 > 0) {
                        A0u4.append(", ");
                    }
                    i13 = AnonymousClass6EM.A01(r82, A0u4, i14, i13);
                }
            }
            throw C90464aC.A0Q(A0u4, r82, A0y2, i10, i13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        if (r13.A04 != X.C90464aC.A07(r12.A01)) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B4n(X.AnonymousClass00S r17) {
        /*
            r16 = this;
            r3 = r16
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x0141
            r0 = 0
            r3.A0N = r0
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x013a
            X.61S r0 = r3.A08
            int[] r1 = r0.A01
            int r0 = r0.A00
            int r0 = r0 + -1
            r1 = r1[r0]
            X.6YK r2 = r3.A0E
            int r0 = r2.A08
            X.606 r0 = r2.A0I(r0)
            int r2 = r3.A03
            int r2 = r2 + 1
            r3.A03 = r2
            X.5nd r11 = r3.A0I
            X.6Ek r13 = r11.A00
            X.4h9 r12 = X.C93794h9.A00
            r13.A05(r12)
            r4 = 0
            r2 = r17
            X.AnonymousClass6G3.A01(r13, r2, r4)
            X.AnonymousClass6G3.A00(r13, r4, r1)
            r2 = 1
            X.AnonymousClass6G3.A01(r13, r0, r2)
            int r5 = r13.A03
            int r3 = r12.A00
            int r2 = X.C90464aC.A07(r3)
            if (r5 != r2) goto L_0x0050
            int r6 = r13.A04
            int r2 = r12.A01
            int r5 = X.C90464aC.A07(r2)
            r2 = 1
            if (r6 == r5) goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            java.lang.String r10 = ")."
            java.lang.String r9 = " object arguments ("
            java.lang.String r8 = ") and "
            java.lang.String r7 = " int arguments ("
            java.lang.String r6 = ". Not all arguments were provided. Missing "
            java.lang.String r15 = "Error while pushing "
            java.lang.String r14 = ", "
            if (r2 != 0) goto L_0x00bc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
        L_0x0066:
            if (r1 >= r3) goto L_0x007a
            int r0 = X.C128976Ek.A00(r13, r1)
            if (r0 == 0) goto L_0x0077
            if (r4 <= 0) goto L_0x0073
            r2.append(r14)
        L_0x0073:
            int r4 = X.AnonymousClass6EM.A00(r12, r2, r1, r4)
        L_0x0077:
            int r1 = r1 + 1
            goto L_0x0066
        L_0x007a:
            java.lang.String r11 = X.C36381kD.A0y(r2)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            int r3 = r12.A01
            r2 = 0
            r1 = 0
        L_0x0086:
            if (r1 >= r3) goto L_0x009a
            int r0 = X.C128976Ek.A01(r13, r1)
            if (r0 == 0) goto L_0x0097
            if (r4 <= 0) goto L_0x0093
            r5.append(r14)
        L_0x0093:
            int r2 = X.AnonymousClass6EM.A01(r12, r5, r1, r2)
        L_0x0097:
            int r1 = r1 + 1
            goto L_0x0086
        L_0x009a:
            java.lang.String r1 = X.C36381kD.A0y(r5)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r15)
            r0.append(r12)
            r0.append(r6)
            r0.append(r4)
            X.AnonymousClass000.A1D(r7, r11, r8, r0)
            r0.append(r2)
            r0.append(r9)
            r0.append(r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r10, r0)
            throw r0
        L_0x00bc:
            X.6Ek r13 = r11.A01
            X.4hA r12 = X.C93804hA.A00
            r13.A05(r12)
            r11 = 0
            X.AnonymousClass6G3.A00(r13, r4, r1)
            X.AnonymousClass6G3.A01(r13, r0, r4)
            int r1 = r13.A03
            int r3 = r12.A00
            int r0 = X.C90464aC.A07(r3)
            if (r1 != r0) goto L_0x00df
            int r1 = r13.A04
            int r0 = r12.A01
            int r0 = X.C90464aC.A07(r0)
            if (r1 != r0) goto L_0x00df
            return
        L_0x00df:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
        L_0x00e4:
            if (r1 >= r3) goto L_0x00f8
            int r0 = X.C128976Ek.A00(r13, r1)
            if (r0 == 0) goto L_0x00f5
            if (r11 <= 0) goto L_0x00f1
            r2.append(r14)
        L_0x00f1:
            int r11 = X.AnonymousClass6EM.A00(r12, r2, r1, r11)
        L_0x00f5:
            int r1 = r1 + 1
            goto L_0x00e4
        L_0x00f8:
            java.lang.String r5 = X.C36381kD.A0y(r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            int r3 = r12.A01
            r2 = 0
            r1 = 0
        L_0x0104:
            if (r1 >= r3) goto L_0x0118
            int r0 = X.C128976Ek.A01(r13, r1)
            if (r0 == 0) goto L_0x0115
            if (r11 <= 0) goto L_0x0111
            r4.append(r14)
        L_0x0111:
            int r2 = X.AnonymousClass6EM.A01(r12, r4, r1, r2)
        L_0x0115:
            int r1 = r1 + 1
            goto L_0x0104
        L_0x0118:
            java.lang.String r1 = X.C36381kD.A0y(r4)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r15)
            r0.append(r12)
            r0.append(r6)
            r0.append(r11)
            X.AnonymousClass000.A1D(r7, r5, r8, r0)
            r0.append(r2)
            r0.append(r9)
            r0.append(r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r10, r0)
            throw r0
        L_0x013a:
            java.lang.String r0 = "createNode() can only be called when inserting"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x0141:
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected was not expected"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.B4n(X.00S):void");
    }

    public void B55(boolean z) {
        if (this.A03 != 0) {
            throw AnonymousClass6XJ.A01("No nodes can be emitted before calling dactivateToEndGroup");
        } else if (this.A0L) {
        } else {
            if (!z) {
                A09();
                return;
            }
            AnonymousClass6QL r0 = this.A0C;
            int i = r0.A01;
            int i2 = r0.A00;
            AnonymousClass6WG r1 = this.A0b;
            AnonymousClass6WG.A03(r1, false);
            r1.A05.A00.A04(C93574gn.A00);
            AnonymousClass6XJ.A05(this.A0c, i, i2);
            this.A0C.A09();
        }
    }

    public C136976fO B6Z() {
        C136976fO r3;
        AnonymousClass606 A022;
        ArrayList arrayList = this.A0Z.A00;
        C136976fO r19 = null;
        if (C36411kG.A1a(arrayList)) {
            r3 = (C136976fO) arrayList.remove(C90504aG.A0C(arrayList));
        } else {
            r3 = null;
        }
        if (r3 != null) {
            int i = r3.A01 & -9;
            r3.A01 = i;
            int i2 = this.A01;
            AnonymousClass0G9 r11 = r3.A02;
            if (r11 != null && (i & 16) == 0) {
                int[] iArr = r11.A02;
                long[] jArr = r11.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    if (i4 != 8) {
                                        break;
                                    }
                                } else if ((j & 255) >= 128 || iArr[(i3 << 3) + i5] == i2) {
                                    j >>= 8;
                                    i5++;
                                } else {
                                    C154917Ub r5 = new C154917Ub(r11, r3, i2);
                                    AnonymousClass6WG r0 = this.A0b;
                                    C161477my r1 = this.A0W;
                                    C128976Ek r9 = r0.A05.A00;
                                    C93674gx r8 = C93674gx.A00;
                                    r9.A05(r8);
                                    AnonymousClass6G3.A01(r9, r5, 0);
                                    AnonymousClass6G3.A01(r9, r1, 1);
                                    int i6 = r9.A03;
                                    int i7 = r8.A00;
                                    if (i6 != C90464aC.A07(i7) || r9.A04 != C90464aC.A07(r8.A01)) {
                                        StringBuilder A0u = AnonymousClass000.A0u();
                                        int i8 = 0;
                                        for (int i9 = 0; i9 < i7; i9++) {
                                            if (C128976Ek.A00(r9, i9) != 0) {
                                                if (i8 > 0) {
                                                    A0u.append(", ");
                                                }
                                                i8 = AnonymousClass6EM.A00(r8, A0u, i9, i8);
                                            }
                                        }
                                        String A0y = C36381kD.A0y(A0u);
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        int i10 = r8.A01;
                                        int i11 = 0;
                                        for (int i12 = 0; i12 < i10; i12++) {
                                            if (C128976Ek.A01(r9, i12) != 0) {
                                                if (i8 > 0) {
                                                    A0u2.append(", ");
                                                }
                                                i11 = AnonymousClass6EM.A01(r8, A0u2, i12, i11);
                                            }
                                        }
                                        throw C90464aC.A0Q(A0u2, r8, A0y, i8, i11);
                                    }
                                }
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            int i13 = r3.A01;
            if ((i13 & 16) == 0 && ((i13 & 1) != 0 || this.A0K)) {
                if (r3.A04 == null) {
                    if (this.A0L) {
                        AnonymousClass6YK r12 = this.A0E;
                        A022 = r12.A0I(r12.A08);
                    } else {
                        AnonymousClass6QL r13 = this.A0C;
                        A022 = r13.A02(r13.A05);
                    }
                    r3.A04 = A022;
                }
                r3.A01 &= -5;
                r19 = r3;
            }
        }
        A0M(this, false);
        return r19;
    }

    public void B6a() {
        if (this.A0P && this.A0C.A05 == this.A05) {
            this.A05 = -1;
            this.A0P = false;
        }
        A0M(this, false);
    }

    public boolean BHg() {
        C136976fO A0P2;
        if (this.A0L || this.A0P || this.A0O || (A0P2 = A0P()) == null || (A0P2.A01 & 8) != 0) {
            return false;
        }
        return true;
    }

    public void Bn4(AnonymousClass00S r11) {
        C128976Ek r9 = this.A0b.A05.A00;
        C93754h5 r8 = C93754h5.A00;
        r9.A05(r8);
        AnonymousClass6G3.A01(r9, r11, 0);
        int i = r9.A03;
        int i2 = r8.A00;
        if (i != C90464aC.A07(i2) || r9.A04 != C90464aC.A07(r8.A01)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (C128976Ek.A00(r9, i4) != 0) {
                    if (i3 > 0) {
                        A0u.append(", ");
                    }
                    i3 = AnonymousClass6EM.A00(r8, A0u, i4, i3);
                }
            }
            String A0y = C36381kD.A0y(A0u);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            int i5 = r8.A01;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                if (C128976Ek.A01(r9, i7) != 0) {
                    if (i3 > 0) {
                        A0u2.append(", ");
                    }
                    i6 = AnonymousClass6EM.A01(r8, A0u2, i7, i6);
                }
            }
            throw C90464aC.A0Q(A0u2, r8, A0y, i3, i6);
        }
    }

    public Object BnZ() {
        if (!this.A0L) {
            Object A042 = this.A0C.A04();
            if (!this.A0P || (A042 instanceof C17480rU)) {
                if (A042 instanceof C114295gz) {
                    return ((C114295gz) A042).A00;
                }
                return A042;
            }
        } else if (!(!this.A0N)) {
            throw AnonymousClass6XJ.A01("A call to createNode(), emitNode() or useNode() expected");
        }
        return C129736Ig.A00;
    }

    public void BuE() {
        if (this.A03 == 0) {
            C136976fO A0P2 = A0P();
            if (A0P2 != null) {
                A0P2.A01 |= 16;
            }
            if (this.A0c.isEmpty()) {
                A09();
            } else {
                A07();
            }
        } else {
            throw AnonymousClass6XJ.A01("No nodes can be emitted before calling skipAndEndGroup");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = r5.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Buo(int r6, java.lang.Object r7) {
        /*
            r5 = this;
            r3 = 207(0xcf, float:2.9E-43)
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x002d
            X.6QL r4 = r5.A0C
            int r2 = r4.A01
            int r0 = r4.A00
            if (r2 >= r0) goto L_0x002d
            int[] r1 = r4.A09
            int r0 = r2 * 5
            r0 = r1[r0]
            if (r0 != r3) goto L_0x002d
            java.lang.Object r0 = r4.A03()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r7)
            if (r0 != 0) goto L_0x002d
            int r0 = r5.A05
            if (r0 >= 0) goto L_0x002d
            X.6QL r0 = r5.A0C
            int r0 = r0.A01
            r5.A05 = r0
            r0 = 1
            r5.A0P = r0
        L_0x002d:
            r1 = 0
            r0 = 0
            A0K(r5, r1, r7, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916fF.Buo(int, java.lang.Object):void");
    }

    public void Bwv(Object obj) {
        if (obj instanceof C159847k1) {
            if (this.A0L) {
                C128976Ek r9 = this.A0b.A05.A00;
                C93734h3 r8 = C93734h3.A00;
                r9.A05(r8);
                AnonymousClass6G3.A01(r9, obj, 0);
                int i = r9.A03;
                int i2 = r8.A00;
                if (!(i == C90464aC.A07(i2) && r9.A04 == C90464aC.A07(r8.A01))) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (C128976Ek.A00(r9, i4) != 0) {
                            if (i3 > 0) {
                                A0u.append(", ");
                            }
                            i3 = AnonymousClass6EM.A00(r8, A0u, i4, i3);
                        }
                    }
                    String A0y = C36381kD.A0y(A0u);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    int i5 = r8.A01;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (C128976Ek.A01(r9, i7) != 0) {
                            if (i3 > 0) {
                                A0u2.append(", ");
                            }
                            i6 = AnonymousClass6EM.A01(r8, A0u2, i7, i6);
                        }
                    }
                    throw C90464aC.A0Q(A0u2, r8, A0y, i3, i6);
                }
            }
            this.A0d.add(obj);
            obj = new C114295gz((C159847k1) obj);
        }
        A0R(obj);
    }

    public void BxD() {
        Object obj;
        if (this.A0N) {
            this.A0N = false;
            if (!this.A0L) {
                AnonymousClass6QL r1 = this.A0C;
                int i = r1.A05;
                int[] iArr = r1.A09;
                if (AnonymousClass6QR.A03(iArr, i)) {
                    obj = r1.A0A[iArr[(i * 5) + 4]];
                } else {
                    obj = null;
                }
                AnonymousClass6WG r12 = this.A0b;
                r12.A04.A00.add(obj);
                if (this.A0P && (obj instanceof C159837k0)) {
                    AnonymousClass6WG.A00(r12);
                    r12.A05.A00.A04(C93644gu.A00);
                    return;
                }
                return;
            }
            throw AnonymousClass6XJ.A01("useNode() called while inserting");
        }
        throw AnonymousClass6XJ.A01("A call to createNode(), emitNode() or useNode() expected was not expected");
    }

    /* JADX INFO: finally extract failed */
    public C136916fF(C157567dk r4, C129136Fi r5, C161477my r6, C1496372c r7, C114315h1 r8, C114315h1 r9, Set set) {
        this.A0U = r4;
        this.A0V = r5;
        this.A0Y = r7;
        this.A0d = set;
        this.A0F = r8;
        this.A0H = r9;
        this.A0W = r6;
        AnonymousClass6QL A012 = r7.A01();
        A012.A07();
        this.A0C = A012;
        C1496372c r0 = new C1496372c();
        this.A0D = r0;
        AnonymousClass6YK A022 = r0.A02();
        A022.A0L();
        this.A0E = A022;
        this.A0b = new AnonymousClass6WG(this, this.A0F);
        AnonymousClass6QL A013 = this.A0D.A01();
        try {
            AnonymousClass606 A023 = A013.A02(0);
            A013.A07();
            this.A0T = A023;
            this.A0I = new C118285nd();
            this.A0f = new AnonymousClass61S();
        } catch (Throwable th) {
            A013.A07();
            throw th;
        }
    }

    private final void A0D(int i, int i2) {
        int A002 = A00(i);
        if (A002 != i2) {
            int i3 = i2 - A002;
            ArrayList arrayList = this.A0a.A00;
            int A0C2 = C90504aG.A0C(arrayList);
            while (i != -1) {
                int A003 = A00(i) + i3;
                A0C(i, A003);
                int i4 = A0C2;
                while (true) {
                    if (-1 < i4) {
                        AnonymousClass64B r0 = (AnonymousClass64B) arrayList.get(i4);
                        if (r0 != null && r0.A00(i, A003)) {
                            A0C2 = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                AnonymousClass6QL r02 = this.A0C;
                if (i < 0) {
                    i = r02.A05;
                } else {
                    int[] iArr = r02.A09;
                    if (!AnonymousClass6QR.A03(iArr, i)) {
                        i = iArr[(i * 5) + 2];
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0F(C161337ma r1, C136916fF r2, AnonymousClass00S r3) {
        r1.Bup();
        if (r2.A0L) {
            r1.B4n(r3);
        } else {
            r1.BxD();
        }
    }

    public static final void A0H(C136916fF r2) {
        A0I(r2);
        r2.A0a.A00.clear();
        r2.A08.A00 = 0;
        r2.A07.A00 = 0;
        r2.A0e.A00 = 0;
        r2.A0X.A00 = 0;
        r2.A0J = null;
        AnonymousClass6QL r1 = r2.A0C;
        if (!r1.A06) {
            r1.A07();
        }
        AnonymousClass6YK r12 = r2.A0E;
        if (!r12.A0F) {
            r12.A0L();
        }
        C118285nd r13 = r2.A0I;
        r13.A01.A02();
        r13.A00.A02();
        r2.A06();
        r2.A02 = 0;
        r2.A00 = 0;
        r2.A0N = false;
        r2.A0L = false;
        r2.A0P = false;
        r2.A0M = false;
        r2.A05 = -1;
    }

    public boolean B2d(int i) {
        Object A0Q2 = A0Q();
        if ((A0Q2 instanceof Integer) && i == AnonymousClass000.A0I(A0Q2)) {
            return false;
        }
        A0R(Integer.valueOf(i));
        return true;
    }

    public boolean B2e(long j) {
        Object A0Q2 = A0Q();
        if ((A0Q2 instanceof Long) && j == C36431kI.A09(A0Q2)) {
            return false;
        }
        A0R(Long.valueOf(j));
        return true;
    }

    public boolean B2f(Object obj) {
        if (AnonymousClass00C.A0J(A0Q(), obj)) {
            return false;
        }
        A0R(obj);
        return true;
    }

    public boolean B2g(boolean z) {
        Object A0Q2 = A0Q();
        if ((A0Q2 instanceof Boolean) && z == AnonymousClass000.A1X(A0Q2)) {
            return false;
        }
        A0R(Boolean.valueOf(z));
        return true;
    }

    public boolean B2h(Object obj) {
        if (A0Q() == obj) {
            return false;
        }
        A0R(obj);
        return true;
    }

    public boolean BAx() {
        C136976fO A0P2;
        if (!BHg() || this.A0O || ((A0P2 = A0P()) != null && (A0P2.A01 & 4) != 0)) {
            return true;
        }
        return false;
    }
}
