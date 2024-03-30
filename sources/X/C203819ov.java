package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9ov  reason: invalid class name and case insensitive filesystem */
public abstract class C203819ov {
    public static final AnonymousClass95P A00;
    public static final AnonymousClass95P A01;
    public static final AnonymousClass95P A02 = new AnonymousClass95P();
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
            X.95P r0 = (X.AnonymousClass95P) r0     // Catch:{ all -> 0x001a }
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
            X.95P r0 = (X.AnonymousClass95P) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.95P r0 = new X.95P
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203819ov.<clinit>():void");
    }

    public static void A08(B3S b3s, C22890Axl axl, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            for (int i2 = 0; i2 < list.size(); i2++) {
                a3g.A00.A0C((C23118B5x) list.get(i2), b3s, i);
            }
        }
    }

    public static void A09(C22890Axl axl, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (list instanceof B6W) {
                B6W b6w = (B6W) list;
                while (i2 < list.size()) {
                    Object BGR = b6w.BGR(i2);
                    boolean z = BGR instanceof String;
                    AnonymousClass8D7 r0 = a3g.A00;
                    if (z) {
                        r0.A08(i, (String) BGR);
                    } else {
                        r0.A0B((AUv) BGR, i);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A08(i, C36401kF.A0s(list, i2));
                i2++;
            }
        }
    }

    public static void A0A(C22890Axl axl, List list, int i) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            for (int i2 = 0; i2 < list.size(); i2++) {
                a3g.A00.A0B((AUv) list.get(i2), i);
            }
        }
    }

    public static void A0B(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165577te.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A07(i, C165577te.A0D(list, i2));
                i2++;
            }
        }
    }

    public static void A0C(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(Float.floatToRawIntBits(C165577te.A01(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A06(i, Float.floatToRawIntBits(C165577te.A01(list, i2)));
                i2++;
            }
        }
    }

    public static void A0D(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass8D7.A01(C165567td.A08(list, i4));
                }
                r5.A03(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C194279Ox.A06(a3g.A00, i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0E(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass8D7.A01(C165567td.A08(list, i4));
                }
                r5.A03(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C194279Ox.A06(a3g.A00, i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AnonymousClass8D7.A01(C165567td.A07(list, i4));
                }
                r5.A03(i3);
                while (i2 < list.size()) {
                    r5.A09(C165567td.A07(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C194279Ox.A06(a3g.A00, i, C165567td.A07(list, i2));
                i2++;
            }
        }
    }

    public static void A0G(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A07(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A0A(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A07(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(C22890Axl axl, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i3 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = AnonymousClass8D7.A01;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r5.A03(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        r5.A03(A062);
                    } else {
                        r5.A09((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                a3g.A00.A05(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0J(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A06 = C36351kA.A06(list, i4);
                    boolean z2 = AnonymousClass8D7.A01;
                    i3 += C165567td.A00(A06);
                }
                r5.A03(i3);
                while (i2 < list.size()) {
                    r5.A03(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AnonymousClass8D7 r2 = a3g.A00;
                int A062 = C36351kA.A06(list, i2);
                r2.A03(i << 3);
                r2.A03(A062);
                i2++;
            }
        }
    }

    public static void A0K(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A06 = C36351kA.A06(list, i4);
                    int i5 = (A06 >> 31) ^ (A06 << 1);
                    boolean z2 = AnonymousClass8D7.A01;
                    i3 += C165567td.A00(i5);
                }
                r5.A03(i3);
                while (i2 < list.size()) {
                    int A062 = C36351kA.A06(list, i2);
                    r5.A03((A062 >> 31) ^ (A062 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C194279Ox.A05(a3g.A00, C36351kA.A06(list, i2), i);
                i2++;
            }
        }
    }

    public static void A0L(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A06(i, C36351kA.A06(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r3 = a3g.A00;
                C194279Ox.A04(r3, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                r3.A03(i3);
                while (i2 < list.size()) {
                    r3.A04(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                a3g.A00.A06(i, C36351kA.A06(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(C22890Axl axl, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i3 = 0;
            if (z) {
                AnonymousClass8D7 r5 = a3g.A00;
                C194279Ox.A04(r5, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = AnonymousClass8D7.A01;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                r5.A03(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        r5.A03(A062);
                    } else {
                        r5.A09((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                a3g.A00.A05(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0O(C22890Axl axl, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            C21017A3g a3g = (C21017A3g) axl;
            int i2 = 0;
            if (z) {
                AnonymousClass8D7 r4 = a3g.A00;
                C194279Ox.A04(r4, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                r4.A03(i3);
                while (i2 < list.size()) {
                    r4.A02(AnonymousClass000.A1X(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AnonymousClass8D7 r2 = a3g.A00;
                boolean A1X = AnonymousClass000.A1X(list.get(i2));
                r2.A03(i << 3);
                r2.A02(A1X ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    public static void A0P(Object obj, Object obj2) {
        AnonymousClass8DG r9 = (AnonymousClass8DG) obj;
        C201559js r7 = r9.zzjp;
        C201559js r8 = ((AnonymousClass8DG) obj2).zzjp;
        if (!r8.equals(C201559js.A05)) {
            int i = r7.A00 + r8.A00;
            int[] copyOf = Arrays.copyOf(r7.A03, i);
            System.arraycopy(r8.A03, 0, copyOf, r7.A00, r8.A00);
            Object[] copyOf2 = Arrays.copyOf(r7.A04, i);
            System.arraycopy(r8.A04, 0, copyOf2, r7.A00, r8.A00);
            r7 = new C201559js(i, copyOf, copyOf2, true);
        }
        r9.zzjp = r7;
    }

    public static int A00(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += AnonymousClass8D7.A01(C165567td.A08(list, i2));
        }
        return i;
    }

    public static int A01(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += AnonymousClass8D7.A01(C165567td.A08(list, i2));
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
            i += AnonymousClass8D7.A01(C165567td.A07(list, i2));
        }
        return i;
    }

    public static int A03(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A06 = C36351kA.A06(list, i3);
            boolean z = AnonymousClass8D7.A01;
            if (A06 >= 0) {
                i = C165567td.A00(A06);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int A06 = C36351kA.A06(list, i3);
            boolean z = AnonymousClass8D7.A01;
            if (A06 >= 0) {
                i = C165567td.A00(A06);
            } else {
                i = 10;
            }
            i2 += i;
        }
        return i2;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A06 = C36351kA.A06(list, i2);
            boolean z = AnonymousClass8D7.A01;
            i += C165567td.A00(A06);
        }
        return i;
    }

    public static int A06(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int A06 = C36351kA.A06(list, i2);
            int i3 = (A06 >> 31) ^ (A06 << 1);
            boolean z = AnonymousClass8D7.A01;
            i += C165567td.A00(i3);
        }
        return i;
    }

    public static int A07(List list, int i) {
        int length;
        int length2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A022 = C194279Ox.A02(i) * size;
        if (list instanceof B6W) {
            B6W b6w = (B6W) list;
            while (i2 < size) {
                Object BGR = b6w.BGR(i2);
                if (BGR instanceof AUv) {
                    length2 = ((AUv) BGR).A02();
                } else {
                    String str = (String) BGR;
                    try {
                        length2 = C201819kT.A00(str);
                    } catch (AnonymousClass92I unused) {
                        length2 = str.getBytes(C197079b6.A00).length;
                    }
                }
                A022 = C194279Ox.A03(length2, A022);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AUv) {
                    length = ((AUv) obj).A02();
                } else {
                    String str2 = (String) obj;
                    try {
                        length = C201819kT.A00(str2);
                    } catch (AnonymousClass92I unused2) {
                        length = str2.getBytes(C197079b6.A00).length;
                    }
                }
                A022 = C194279Ox.A03(length, A022);
                i2++;
            }
        }
        return A022;
    }
}
