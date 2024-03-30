package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.9oy  reason: invalid class name and case insensitive filesystem */
public abstract class C203849oy {
    public static final AnonymousClass9TG A00;
    public static final AnonymousClass9TG A01;
    public static final AnonymousClass9TG A02 = new AnonymousClass9TG();
    public static final Class A03;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ all -> 0x003d }] */
    static {
        /*
            java.lang.String r0 = "com.google.protobuf.GeneratedMessageV3"
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
            X.9TG r0 = (X.AnonymousClass9TG) r0     // Catch:{ all -> 0x001a }
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
            X.9TG r0 = (X.AnonymousClass9TG) r0     // Catch:{ all -> 0x003d }
            r5 = r0
        L_0x003d:
            A01 = r5
            X.9TG r0 = new X.9TG
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203849oy.<clinit>():void");
    }

    public static Object A0A(C22900AyC ayC, AnonymousClass9TG r8, Object obj, Object obj2, List list, int i) {
        if (ayC != null) {
            if (list instanceof RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int A06 = C36351kA.A06(list, i3);
                    if (ayC.BM0(A06)) {
                        if (i3 != i2) {
                            list.set(i2, Integer.valueOf(A06));
                        }
                        i2++;
                    } else {
                        if (obj2 == null) {
                            obj2 = r8.A00(obj);
                        }
                        ((C202229lJ) obj2).A02(i << 3, Long.valueOf((long) A06));
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                    return obj2;
                }
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int A0A = C36341k9.A0A(it);
                    if (!ayC.BM0(A0A)) {
                        if (obj2 == null) {
                            obj2 = r8.A00(obj);
                        }
                        ((C202229lJ) obj2).A02(i << 3, Long.valueOf((long) A0A));
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static void A0B(AnonymousClass9TV r3, List list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                CodedOutputStream codedOutputStream = r3.A00;
                C1897895p.A07(codedOutputStream, i);
                codedOutputStream.A0H((C21674AUx) list.get(i2));
            }
        }
    }

    public static void A0C(AnonymousClass9TV r5, List list, int i) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof B6Z) {
                B6Z b6z = (B6Z) list;
                while (i2 < list.size()) {
                    Object BGR = b6z.BGR(i2);
                    boolean z = BGR instanceof String;
                    CodedOutputStream codedOutputStream = r5.A00;
                    if (z) {
                        C1897895p.A07(codedOutputStream, i);
                        codedOutputStream.A0K((String) BGR);
                    } else {
                        C1897895p.A07(codedOutputStream, i);
                        codedOutputStream.A0H((C21674AUx) BGR);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = r5.A00;
                String A0s = C36401kF.A0s(list, i2);
                C1897895p.A07(codedOutputStream2, i);
                codedOutputStream2.A0K(A0s);
                i2++;
            }
        }
    }

    public static void A0D(AnonymousClass9TV r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3++;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A06(AnonymousClass000.A1X(list.get(i2)) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r4.A00.A0E(i, AnonymousClass000.A1X(list.get(i2)));
                i2++;
            }
        }
    }

    public static void A0E(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(C165577te.A0D(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, C165577te.A0D(list, i2));
                i2++;
            }
        }
    }

    public static void A0F(AnonymousClass9TV r5, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = CodedOutputStream.A01;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A08(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        codedOutputStream.A08(A062);
                    } else {
                        codedOutputStream.A0G((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r5.A00.A0A(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0G(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A09(i, C36351kA.A06(list, i2));
                i2++;
            }
        }
    }

    public static void A0H(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0I(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(Float.floatToRawIntBits(C165577te.A01(list, i2)));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A09(i, Float.floatToRawIntBits(C165577te.A01(list, i2)));
                i2++;
            }
        }
    }

    public static void A0J(AnonymousClass9TV r5, List list, int i, boolean z) {
        int i2;
        if (list != null && !list.isEmpty()) {
            int i3 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int A06 = C36351kA.A06(list, i5);
                    if (A06 >= 0) {
                        boolean z2 = CodedOutputStream.A01;
                        i2 = C165567td.A00(A06);
                    } else {
                        i2 = 10;
                    }
                    i4 += i2;
                }
                codedOutputStream.A08(i4);
                while (i3 < list.size()) {
                    int A062 = C36351kA.A06(list, i3);
                    if (A062 >= 0) {
                        codedOutputStream.A08(A062);
                    } else {
                        codedOutputStream.A0G((long) A062);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                r5.A00.A0A(i, C36351kA.A06(list, i3));
                i3++;
            }
        }
    }

    public static void A0K(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(C165567td.A08(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0D(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0L(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 4;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A07(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A09(i, C36351kA.A06(list, i2));
                i2++;
            }
        }
    }

    public static void A0M(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4);
                    i3 += 8;
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0F(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0C(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0N(AnonymousClass9TV r4, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r4.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C1897895p.A06(C36351kA.A06(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    int A06 = C36351kA.A06(list, i2);
                    codedOutputStream.A08((A06 >> 31) ^ (A06 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = r4.A00;
                int A062 = C36351kA.A06(list, i2);
                codedOutputStream2.A0B(i, (A062 >> 31) ^ (A062 << 1));
                i2++;
            }
        }
    }

    public static void A0O(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(C165567td.A07(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(C165567td.A07(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0D(i, C165567td.A07(list, i2));
                i2++;
            }
        }
    }

    public static void A0P(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int A06 = C36351kA.A06(list, i4);
                    boolean z2 = CodedOutputStream.A01;
                    i3 += C165567td.A00(A06);
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A08(C36351kA.A06(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0B(i, C36351kA.A06(list, i2));
                i2++;
            }
        }
    }

    public static void A0Q(AnonymousClass9TV r5, List list, int i, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                CodedOutputStream codedOutputStream = r5.A00;
                C1897895p.A07(codedOutputStream, i);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.A01(C165567td.A08(list, i4));
                }
                codedOutputStream.A08(i3);
                while (i2 < list.size()) {
                    codedOutputStream.A0G(C165567td.A08(list, i2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                r5.A00.A0D(i, C165567td.A08(list, i2));
                i2++;
            }
        }
    }

    public static void A0R(Object obj, Object obj2) {
        C170918Hz r9 = (C170918Hz) obj;
        C202229lJ r6 = r9.unknownFields;
        C202229lJ r7 = ((C170918Hz) obj2).unknownFields;
        C202229lJ r1 = C202229lJ.A04;
        if (!r1.equals(r7)) {
            if (r1.equals(r6)) {
                int i = r6.count + r7.count;
                int[] copyOf = Arrays.copyOf(r6.A02, i);
                System.arraycopy(r7.A02, 0, copyOf, r6.count, r7.count);
                Object[] copyOf2 = Arrays.copyOf(r6.A03, i);
                System.arraycopy(r7.A03, 0, copyOf2, r6.count, r7.count);
                r6 = new C202229lJ(i, copyOf, copyOf2, true);
            } else if (!r7.equals(r1)) {
                if (r6.A01) {
                    int i2 = r6.count + r7.count;
                    C202229lJ.A00(r6, i2);
                    System.arraycopy(r7.A02, 0, r6.A02, r6.count, r7.count);
                    System.arraycopy(r7.A03, 0, r6.A03, r6.count, r7.count);
                    r6.count = i2;
                } else {
                    throw AnonymousClass001.A0D();
                }
            }
        }
        r9.unknownFields = r6;
    }

    public static int A00(C23073B3d b3d, List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = C1897895p.A05(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int A0k = ((C21070A7h) ((B63) list.get(i2))).A0k(b3d);
            boolean z = CodedOutputStream.A01;
            A05 += C165567td.A00(A0k) + A0k;
        }
        return A05;
    }

    public static int A01(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r5 = (AnonymousClass8I0) list;
            i = 0;
            while (i4 < size) {
                AnonymousClass8I0.A00(r5, i4);
                int i5 = r5.A01[i4];
                boolean z = CodedOutputStream.A01;
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
                boolean z2 = CodedOutputStream.A01;
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

    public static int A02(List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r5 = (AnonymousClass8I0) list;
            i = 0;
            while (i4 < size) {
                AnonymousClass8I0.A00(r5, i4);
                int i5 = r5.A01[i4];
                boolean z = CodedOutputStream.A01;
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
                boolean z2 = CodedOutputStream.A01;
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

    public static int A03(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A01(C165567td.A08(list, i2));
        }
        return i;
    }

    public static int A04(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r4 = (AnonymousClass8I0) list;
            i = 0;
            while (i2 < size) {
                AnonymousClass8I0.A00(r4, i2);
                i += C1897895p.A06(r4.A01[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1897895p.A06(C36351kA.A06(list, i2));
                i2++;
            }
        }
        return i;
    }

    public static int A05(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A01(C165567td.A07(list, i2));
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
        if (list instanceof AnonymousClass8I0) {
            AnonymousClass8I0 r5 = (AnonymousClass8I0) list;
            i = 0;
            while (i2 < size) {
                AnonymousClass8I0.A00(r5, i2);
                int i3 = r5.A01[i2];
                boolean z = CodedOutputStream.A01;
                i += C165567td.A00(i3);
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int A06 = C36351kA.A06(list, i2);
                boolean z2 = CodedOutputStream.A01;
                i4 = i + C165567td.A00(A06);
                i2++;
            }
        }
        return i;
    }

    public static int A07(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += CodedOutputStream.A01(C165567td.A08(list, i2));
        }
        return i;
    }

    public static int A08(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A05 = size * C1897895p.A05(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int A022 = ((C21674AUx) list.get(i2)).A02();
            boolean z = CodedOutputStream.A01;
            A05 += C165567td.A00(A022) + A022;
        }
        return A05;
    }

    public static int A09(List list, int i) {
        int A022;
        int A023;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int A05 = C1897895p.A05(i) * size;
        if (list instanceof B6Z) {
            B6Z b6z = (B6Z) list;
            while (i2 < size) {
                Object BGR = b6z.BGR(i2);
                if (BGR instanceof C21674AUx) {
                    int A024 = ((C21674AUx) BGR).A02();
                    boolean z = CodedOutputStream.A01;
                    A023 = C165567td.A00(A024) + A024;
                } else {
                    A023 = CodedOutputStream.A02((String) BGR);
                }
                A05 += A023;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof C21674AUx) {
                    int A025 = ((C21674AUx) obj).A02();
                    boolean z2 = CodedOutputStream.A01;
                    A022 = C165567td.A00(A025) + A025;
                } else {
                    A022 = CodedOutputStream.A02((String) obj);
                }
                A05 += A022;
                i2++;
            }
        }
        return A05;
    }
}
