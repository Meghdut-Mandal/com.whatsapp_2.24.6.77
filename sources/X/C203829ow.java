package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9ow  reason: invalid class name and case insensitive filesystem */
public abstract class C203829ow {
    public static final AnonymousClass95U A00;
    public static final AnonymousClass95U A01;
    public static final AnonymousClass95U A02 = new AnonymousClass95U();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003d }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0007 }
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            A03 = r0
            r5 = 0
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = X.C165587tf.A0d(r0)     // Catch:{ all -> 0x001a }
            X.95U r0 = (X.AnonymousClass95U) r0     // Catch:{ all -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r5
        L_0x001b:
            A00 = r0
            r4 = 1
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x003d
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x003d }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003d }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x003d }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x003d }
            X.AnonymousClass000.A1N(r0, r2, r4)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x003d }
            X.95U r0 = (X.AnonymousClass95U) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.95U r0 = new X.95U
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203829ow.<clinit>():void");
    }

    public static void A0C(B3O b3o, List list, int i) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (list instanceof B6X) {
                B6X b6x = (B6X) list;
                while (i2 < list.size()) {
                    Object ByU = b6x.ByU(i2);
                    boolean z = ByU instanceof String;
                    C170568Dy r0 = a44.A00;
                    if (z) {
                        r0.A08(i, (String) ByU);
                    } else {
                        r0.A0B((C21673AUw) ByU, i);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a44.A00.A08(i, C36401kF.A0s(list, i2));
                i2++;
            }
        }
    }

    public static void A0D(B3O b3o, List list, int i) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            for (int i2 = 0; i2 < list.size(); i2++) {
                a44.A00.A0B((C21673AUw) list.get(i2), i);
            }
        }
    }

    public static void A0E(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r3 = a44.A00;
                AnonymousClass95R.A06(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165577te.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r32 = a44.A00;
                long A0D = C165577te.A0D(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A0D);
                i2++;
            }
        }
    }

    public static void A0F(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r4 = a44.A00;
                AnonymousClass95R.A06(r4, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r4.A05(i3);
                while (i2 < list.size()) {
                    r4.A06(Float.floatToRawIntBits(C165577te.A01(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                int floatToRawIntBits = Float.floatToRawIntBits(C165577te.A01(list, i2));
                r2.A05((i << 3) | 5);
                r2.A06(floatToRawIntBits);
                i2++;
            }
        }
    }

    public static void A0G(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C170568Dy.A02(C165567td.A08(list, i4));
                }
                r5.A05(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r3 = a44.A00;
                long A08 = C165567td.A08(list, i2);
                r3.A05(i << 3);
                r3.A09(A08);
                i2++;
            }
        }
    }

    public static void A0H(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C170568Dy.A02(C165567td.A08(list, i4));
                }
                r5.A05(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r3 = a44.A00;
                long A08 = C165567td.A08(list, i2);
                r3.A05(i << 3);
                r3.A09(A08);
                i2++;
            }
        }
    }

    public static void A0I(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C170568Dy.A02(C165567td.A07(list, i4));
                }
                r5.A05(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A07(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r3 = a44.A00;
                long A07 = C165567td.A07(list, i2);
                r3.A05(i << 3);
                r3.A09(A07);
                i2++;
            }
        }
    }

    public static void A0J(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r3 = a44.A00;
                AnonymousClass95R.A06(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r32 = a44.A00;
                long A08 = C165567td.A08(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A08);
                i2++;
            }
        }
    }

    public static void A0K(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r3 = a44.A00;
                AnonymousClass95R.A06(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r32 = a44.A00;
                long A08 = C165567td.A08(list, i2);
                r32.A05((i << 3) | 1);
                r32.A0A(A08);
                i2++;
            }
        }
    }

    public static void A0L(B3O b3o, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i3 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = C170568Dy.A05;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r5.A05(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        r5.A05(A062);
                    } else {
                        r5.A09((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                a44.A00.A07(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0M(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A06 = C36351kA.A06(list, i4);
                    boolean z2 = C170568Dy.A05;
                    i3 += C165567td.A00(A06);
                }
                r5.A05(i3);
                while (i2 < list.size()) {
                    r5.A05(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                int A062 = C36351kA.A06(list, i2);
                r2.A05(i << 3);
                r2.A05(A062);
                i2++;
            }
        }
    }

    public static void A0N(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r4 = a44.A00;
                AnonymousClass95R.A06(r4, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 = AnonymousClass95R.A05(C36351kA.A06(list, i4), i3);
                }
                r4.A05(i3);
                while (i2 < list.size()) {
                    int A06 = C36351kA.A06(list, i2);
                    r4.A05((A06 >> 31) ^ (A06 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                int A062 = C36351kA.A06(list, i2);
                r2.A05(i << 3);
                r2.A05((A062 >> 31) ^ (A062 << 1));
                i2++;
            }
        }
    }

    public static void A0O(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r3 = a44.A00;
                AnonymousClass95R.A06(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A06(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                int A06 = C36351kA.A06(list, i2);
                r2.A05((i << 3) | 5);
                r2.A06(A06);
                i2++;
            }
        }
    }

    public static void A0P(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r3 = a44.A00;
                AnonymousClass95R.A06(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A05(i3);
                while (i2 < list.size()) {
                    r3.A06(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                int A06 = C36351kA.A06(list, i2);
                r2.A05((i << 3) | 5);
                r2.A06(A06);
                i2++;
            }
        }
    }

    public static void A0Q(B3O b3o, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i3 = 0;
            if (z) {
                C170568Dy r5 = a44.A00;
                AnonymousClass95R.A06(r5, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = C170568Dy.A05;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r5.A05(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        r5.A05(A062);
                    } else {
                        r5.A09((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                a44.A00.A07(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0R(B3O b3o, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            A44 a44 = (A44) b3o;
            int i2 = 0;
            if (z) {
                C170568Dy r4 = a44.A00;
                AnonymousClass95R.A06(r4, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                r4.A05(i3);
                while (i2 < list.size()) {
                    r4.A04(AnonymousClass000.A1X(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C170568Dy r2 = a44.A00;
                boolean A1X = AnonymousClass000.A1X(list.get(i2));
                r2.A05(i << 3);
                r2.A04(A1X ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    public static void A0S(Object obj, Object obj2) {
        AnonymousClass8EX r9 = (AnonymousClass8EX) obj;
        C201569jt r7 = r9.zzb;
        C201569jt r8 = ((AnonymousClass8EX) obj2).zzb;
        if (!r8.equals(C201569jt.A05)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            r7 = new C201569jt(i, copyOf, copyOf2, true);
        }
        r9.zzb = r7;
    }

    public static int A00(B3T b3t, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = AnonymousClass95R.A04(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int A002 = AnonymousClass8EX.A00(b3t, (C23119B5y) list.get(i2));
            boolean z = C170568Dy.A05;
            A04 += C165567td.A00(A002) + A002;
        }
        return A04;
    }

    public static int A01(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C170568Dy.A02(C165567td.A08(list, i2));
        }
        return i;
    }

    public static int A02(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C170568Dy.A02(C165567td.A08(list, i2));
        }
        return i;
    }

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C170568Dy.A02(C165567td.A07(list, i2));
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C170538Dv) {
            C170538Dv r5 = (C170538Dv) list;
            i = 0;
            while (i4 < size) {
                C170538Dv.A00(r5, i4);
                int i5 = r5.A01[i4];
                boolean z = C170568Dy.A05;
                if (i5 >= 0) {
                    i3 = C165567td.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A06 = C36351kA.A06(list, i4);
                boolean z2 = C170568Dy.A05;
                if (A06 >= 0) {
                    i2 = C165567td.A00(A06);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C170538Dv) {
            C170538Dv r5 = (C170538Dv) list;
            i = 0;
            while (i4 < size) {
                C170538Dv.A00(r5, i4);
                int i5 = r5.A01[i4];
                boolean z = C170568Dy.A05;
                if (i5 >= 0) {
                    i3 = C165567td.A00(i5);
                } else {
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            int i6 = 0;
            while (i4 < size) {
                int A06 = C36351kA.A06(list, i4);
                boolean z2 = C170568Dy.A05;
                if (A06 >= 0) {
                    i2 = C165567td.A00(A06);
                } else {
                    i2 = 10;
                }
                i6 = i + i2;
                i4++;
            }
        }
        return i;
    }

    public static int A06(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C170538Dv) {
            C170538Dv r5 = (C170538Dv) list;
            i = 0;
            while (i2 < size) {
                C170538Dv.A00(r5, i2);
                int i3 = r5.A01[i2];
                boolean z = C170568Dy.A05;
                i += C165567td.A00(i3);
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int A06 = C36351kA.A06(list, i2);
                boolean z2 = C170568Dy.A05;
                i4 = i + C165567td.A00(A06);
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C170538Dv) {
            C170538Dv r4 = (C170538Dv) list;
            i = 0;
            while (i2 < size) {
                C170538Dv.A00(r4, i2);
                i = AnonymousClass95R.A05(r4.A01[i2], i);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = AnonymousClass95R.A05(C36351kA.A06(list, i2), i);
                i2++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A08(java.util.List r5, int r6) {
        /*
            int r3 = r5.size()
            r2 = 0
            if (r3 != 0) goto L_0x0008
            return r2
        L_0x0008:
            int r4 = X.AnonymousClass95R.A04(r6)
            int r4 = r4 * r3
            boolean r0 = r5 instanceof X.B6X
            if (r0 == 0) goto L_0x003d
            X.B6X r5 = (X.B6X) r5
        L_0x0013:
            if (r2 >= r3) goto L_0x0067
            java.lang.Object r1 = r5.ByU(r2)
            boolean r0 = r1 instanceof X.C21673AUw
            if (r0 == 0) goto L_0x002e
            X.AUw r1 = (X.C21673AUw) r1
            int r1 = r1.A01()
        L_0x0023:
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x0013
        L_0x002e:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C196639aB.A00(r1)     // Catch:{ 92J -> 0x0035 }
            goto L_0x0023
        L_0x0035:
            java.nio.charset.Charset r0 = X.C197089b7.A00
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x0023
        L_0x003d:
            if (r2 >= r3) goto L_0x0067
            java.lang.Object r1 = r5.get(r2)
            boolean r0 = r1 instanceof X.C21673AUw
            if (r0 == 0) goto L_0x0058
            X.AUw r1 = (X.C21673AUw) r1
            int r1 = r1.A01()
        L_0x004d:
            boolean r0 = X.C170568Dy.A05
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0058:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = X.C196639aB.A00(r1)     // Catch:{ 92J -> 0x005f }
            goto L_0x004d
        L_0x005f:
            java.nio.charset.Charset r0 = X.C197089b7.A00
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            goto L_0x004d
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203829ow.A08(java.util.List, int):int");
    }

    public static int A09(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A04 = size * AnonymousClass95R.A04(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A012 = ((C21673AUw) list.get(i2)).A01();
            boolean z = C170568Dy.A05;
            A04 += C165567td.A00(A012) + A012;
        }
        return A04;
    }

    public static int A0A(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AnonymousClass95R.A04(i) + 4);
    }

    public static int A0B(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AnonymousClass95R.A04(i) + 8);
    }
}
