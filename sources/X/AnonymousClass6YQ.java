package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6YQ  reason: invalid class name */
public abstract class AnonymousClass6YQ {
    public static int A00;
    public static C1496472d A01;
    public static List A02;
    public static List A03;
    public static AnonymousClass79W A04 = new AnonymousClass79W();
    public static final C1269066c A05 = new C1269066c();
    public static final C130346Ks A06 = new C130346Ks();
    public static final Object A07 = C36441kJ.A11();
    public static final AtomicReference A08;
    public static final C006302t A09 = AnonymousClass7WM.A00;
    public static final Snapshot A0A;
    public static final C120665rs A0B = new C120665rs();

    public static final Snapshot A01(Snapshot snapshot, C006302t r4, boolean z) {
        C93904hK r1;
        Snapshot snapshot2 = snapshot;
        C006302t r2 = r4;
        if (snapshot instanceof C93904hK) {
            r1 = (C93904hK) snapshot2;
        } else if (snapshot != null) {
            return new C93894hJ(snapshot, r4, z);
        } else {
            r1 = null;
        }
        return new C93864hG(r1, r2, (C006302t) null, false, z);
    }

    public static final AnonymousClass666 A04(C1496472d r4, AnonymousClass666 r5, int i) {
        AnonymousClass666 r2 = null;
        while (r5 != null) {
            int i2 = r5.A00;
            if (i2 != 0 && i2 <= i && !r4.A05(i2) && (r2 == null || r2.A00 < r5.A00)) {
                r2 = r5;
            }
            r5 = r5.A01;
        }
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    static {
        C1496472d r3 = C1496472d.A04;
        A01 = r3;
        A00 = 1;
        C023409w r0 = C023409w.A00;
        A02 = r0;
        A03 = r0;
        A00 = 2;
        C93854hF r1 = new C93854hF(r3, 1);
        Snapshot.A03(r1);
        AtomicReference atomicReference = new AtomicReference(r1);
        A08 = atomicReference;
        A0A = (Snapshot) atomicReference.get();
    }

    public static final Snapshot A00() {
        Snapshot snapshot = (Snapshot) A05.A01();
        if (snapshot == null) {
            return (Snapshot) A08.get();
        }
        return snapshot;
    }

    public static final Object A08(Snapshot snapshot, C006302t r7) {
        Object invoke = r7.invoke(A01.A01(snapshot.A04()));
        synchronized (A07) {
            int i = A00;
            A00 = i + 1;
            C1496472d A012 = A01.A01(snapshot.A04());
            A01 = A012;
            A08.set(new C93854hF(A012, i));
            snapshot.A0B();
            A01 = A01.A02(i);
        }
        return invoke;
    }

    public static final Object A09(C006302t r9) {
        Object obj;
        C1506876f A0L;
        Object A082;
        AnonymousClass00C.A0E(A0A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        Object obj2 = A07;
        synchronized (obj2) {
            obj = A08.get();
            A0L = ((C93854hF) obj).A0L();
            if (A0L != null) {
                A04.addAndGet(1);
            }
            A082 = A08((Snapshot) obj, r9);
        }
        if (A0L != null) {
            try {
                List list = A02;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C009003v) list.get(i)).invoke(A0L, obj);
                }
            } finally {
                A04.addAndGet(-1);
            }
        }
        synchronized (obj2) {
            A0C();
            if (A0L != null) {
                Object[] objArr = A0L.A01;
                int size2 = A0L.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    A0G((C159857k2) C90524aI.A0d(objArr, i2));
                }
            }
        }
        return A082;
    }

    public static final C006302t A0B(C006302t r1, C006302t r2, boolean z) {
        if (!z) {
            r2 = null;
        }
        if (r1 == null) {
            return r2;
        }
        if (r2 == null || r1.equals(r2)) {
            return r1;
        }
        return new C154797To(r1, r2);
    }

    public static final void A0C() {
        Object obj;
        C120665rs r6 = A0B;
        int i = r6.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C1511678m r1 = r6.A02[i3];
            if (!(r1 == null || (obj = r1.get()) == null || (!A0H((C159857k2) obj)))) {
                if (i2 != i3) {
                    r6.A02[i2] = r1;
                    int[] iArr = r6.A01;
                    iArr[i2] = iArr[i3];
                }
                i2++;
            }
        }
        for (int i4 = i2; i4 < i; i4++) {
            r6.A02[i4] = null;
            r6.A01[i4] = 0;
        }
        if (i2 != i) {
            r6.A00 = i2;
        }
    }

    public static final void A0D(int i) {
        C130346Ks r8 = A06;
        int[] iArr = r8.A02;
        int i2 = iArr[i];
        int i3 = r8.A01 - 1;
        C130346Ks.A00(r8, i2, i3);
        r8.A01 = i3;
        int i4 = i2;
        int[] iArr2 = r8.A04;
        int i5 = iArr2[i2];
        while (i4 > 0) {
            int i6 = ((i4 + 1) >> 1) - 1;
            if (iArr2[i6] <= i5) {
                break;
            }
            C130346Ks.A00(r8, i6, i4);
            i4 = i6;
        }
        int i7 = i3 >> 1;
        while (i2 < i7) {
            int i8 = (i2 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < i3 && iArr2[i8] < iArr2[i9]) {
                if (iArr2[i8] >= iArr2[i2]) {
                    break;
                }
                C130346Ks.A00(r8, i8, i2);
                i2 = i8;
            } else if (iArr2[i9] >= iArr2[i2]) {
                break;
            } else {
                C130346Ks.A00(r8, i9, i2);
                i2 = i9;
            }
        }
        iArr[i] = r8.A00;
        r8.A00 = i;
    }

    public static final void A0E(Snapshot snapshot) {
        Object obj;
        int i;
        C93904hK r5;
        if (!A01.A05(snapshot.A04())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Snapshot is not open: id=");
            A0u.append(snapshot.A04());
            A0u.append(", disposed=");
            A0u.append(snapshot.A02);
            A0u.append(", applied=");
            if (!(snapshot instanceof C93904hK) || (r5 = (C93904hK) snapshot) == null) {
                obj = "read-only";
            } else {
                obj = Boolean.valueOf(r5.A03);
            }
            A0u.append(obj);
            A0u.append(", lowestPin=");
            synchronized (A07) {
                C130346Ks r2 = A06;
                i = -1;
                if (r2.A01 > 0) {
                    i = r2.A04[0];
                }
            }
            throw AnonymousClass001.A09(C36381kD.A10(A0u, i));
        }
    }

    public static final AnonymousClass666 A02(Snapshot snapshot, C159857k2 r5, AnonymousClass666 r6) {
        AnonymousClass666 A052;
        if (snapshot.A0K()) {
            snapshot.A0J(r5);
        }
        AnonymousClass666 A022 = Snapshot.A02(snapshot, r6);
        if (A022 == null) {
            throw AnonymousClass001.A09("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        } else if (A022.A00 == snapshot.A04()) {
            return A022;
        } else {
            synchronized (A07) {
                A052 = A05(r5, A022);
                A052.A01(A022);
                A052.A00 = snapshot.A04();
            }
            AnonymousClass666 r3 = A052;
            snapshot.A0J(r5);
            return r3;
        }
    }

    public static final AnonymousClass666 A03(Snapshot snapshot, C159857k2 r4, AnonymousClass666 r5, AnonymousClass666 r6) {
        AnonymousClass666 A052;
        if (snapshot.A0K()) {
            snapshot.A0J(r4);
        }
        int A042 = snapshot.A04();
        if (r6.A00 == A042) {
            return r6;
        }
        synchronized (A07) {
            A052 = A05(r4, r5);
        }
        A052.A00 = A042;
        snapshot.A0J(r4);
        return A052;
    }

    public static final AnonymousClass666 A05(C159857k2 r5, AnonymousClass666 r6) {
        AnonymousClass666 BBv = r5.BBv();
        C130346Ks r2 = A06;
        int i = A00;
        if (r2.A01 > 0) {
            i = r2.A04[0];
        }
        int i2 = i - 1;
        C1496472d r1 = C1496472d.A04;
        AnonymousClass666 r22 = null;
        while (BBv != null) {
            if (BBv.A00 != 0) {
                int i3 = BBv.A00;
                if (i3 != 0 && i3 <= i2 && !r1.A05(i3)) {
                    if (r22 == null) {
                        r22 = BBv;
                    } else if (BBv.A00 >= r22.A00) {
                        BBv = r22;
                    }
                }
                BBv = BBv.A01;
            }
            BBv.A00 = Integer.MAX_VALUE;
            return BBv;
        }
        AnonymousClass666 A002 = r6.A00();
        A002.A00 = Integer.MAX_VALUE;
        A002.A01 = r5.BBv();
        r5.BmD(A002);
        return A002;
    }

    public static final AnonymousClass666 A06(C159857k2 r4, AnonymousClass666 r5) {
        Snapshot A002 = A00();
        C006302t A092 = A002.A09();
        if (A092 != null) {
            A092.invoke(r4);
        }
        AnonymousClass666 A022 = Snapshot.A02(A002, r5);
        if (A022 == null) {
            synchronized (A07) {
                Snapshot A003 = A00();
                AnonymousClass666 BBv = r4.BBv();
                AnonymousClass00C.A0E(BBv, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                A022 = Snapshot.A02(A003, BBv);
                if (A022 == null) {
                    throw AnonymousClass001.A09("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return A022;
    }

    public static final AnonymousClass666 A07(AnonymousClass666 r2) {
        AnonymousClass666 A022 = Snapshot.A02(A00(), r2);
        if (A022 == null) {
            synchronized (A07) {
                A022 = Snapshot.A02(A00(), r2);
            }
            if (A022 == null) {
                throw AnonymousClass001.A09("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
            }
        }
        return A022;
    }

    public static final HashMap A0A(C93904hK r11, C93904hK r12, C1496472d r13) {
        AnonymousClass666 A042;
        C1506876f A0L = r12.A0L();
        int A043 = r11.A04();
        if (A0L == null) {
            return null;
        }
        C1496472d A044 = r12.A08().A02(r12.A04()).A04(r12.A02);
        Object[] objArr = A0L.A01;
        int size = A0L.size();
        HashMap hashMap = null;
        for (int i = 0; i < size; i++) {
            C159857k2 r4 = (C159857k2) C90524aI.A0d(objArr, i);
            AnonymousClass666 BBv = r4.BBv();
            AnonymousClass666 A045 = A04(r13, BBv, A043);
            if (!(A045 == null || (A042 = A04(A044, BBv, A043)) == null || A045.equals(A042))) {
                AnonymousClass666 A022 = Snapshot.A02(r12, BBv);
                if (A022 != null) {
                    AnonymousClass666 BPp = r4.BPp(A042, A045, A022);
                    if (BPp == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = AnonymousClass001.A0J();
                    }
                    hashMap.put(A045, BPp);
                } else {
                    throw AnonymousClass001.A09("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                }
            }
        }
        return hashMap;
    }

    public static final void A0F(Snapshot snapshot, C159857k2 r2) {
        C006302t r0;
        snapshot.A0H(snapshot.A05() + 1);
        if (!(snapshot instanceof C93894hJ) && !(snapshot instanceof C93884hI) && !(snapshot instanceof C93874hH) && (r0 = ((C93904hK) snapshot).A08) != null) {
            r0.invoke(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        r0 = r8 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(X.C159857k2 r10) {
        /*
            boolean r0 = A0H(r10)
            if (r0 == 0) goto L_0x0062
            X.5rs r3 = A0B
            int r5 = r3.A00
            int r4 = java.lang.System.identityHashCode(r10)
            if (r5 <= 0) goto L_0x006a
            int r2 = r5 + -1
            r1 = 0
        L_0x0013:
            int r0 = r1 + 1
            if (r1 > r2) goto L_0x0068
            int r0 = r1 + r2
            int r8 = r0 >>> 1
            int[] r7 = r3.A01
            r0 = r7[r8]
            if (r0 >= r4) goto L_0x0024
            int r1 = r8 + 1
            goto L_0x0013
        L_0x0024:
            if (r0 <= r4) goto L_0x0029
            int r2 = r8 + -1
            goto L_0x0013
        L_0x0029:
            X.78m[] r6 = r3.A02
            r0 = r6[r8]
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r0.get()
        L_0x0033:
            if (r10 == r0) goto L_0x0060
            int r2 = r8 + -1
        L_0x0037:
            r1 = 0
            r0 = -1
            if (r0 >= r2) goto L_0x004e
            r0 = r7[r2]
            if (r0 != r4) goto L_0x004e
            r0 = r6[r2]
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r0.get()
        L_0x0047:
            if (r1 == r10) goto L_0x0062
            int r2 = r2 + -1
            goto L_0x0037
        L_0x004c:
            r0 = 0
            goto L_0x0033
        L_0x004e:
            int r8 = r8 + 1
            if (r8 >= r5) goto L_0x0065
            r0 = r7[r8]
            if (r0 != r4) goto L_0x0066
            r0 = r6[r8]
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r0.get()
        L_0x005e:
            if (r0 != r10) goto L_0x004e
        L_0x0060:
            if (r8 < 0) goto L_0x006b
        L_0x0062:
            return
        L_0x0063:
            r0 = r1
            goto L_0x005e
        L_0x0065:
            r8 = r5
        L_0x0066:
            int r0 = r8 + 1
        L_0x0068:
            int r8 = -r0
            goto L_0x0060
        L_0x006a:
            r8 = -1
        L_0x006b:
            int r0 = r8 + 1
            int r2 = -r0
            X.78m[] r9 = r3.A02
            int r0 = r9.length
            if (r5 != r0) goto L_0x00a7
            int r0 = r0 * 2
            X.78m[] r8 = new X.C1511678m[r0]
            int[] r7 = new int[r0]
            int r6 = r2 + 1
            X.AnonymousClass02Q.A05(r9, r6, r8, r2, r5)
            X.78m[] r1 = r3.A02
            r0 = 0
            X.AnonymousClass02Q.A05(r1, r0, r8, r0, r2)
            int[] r0 = r3.A01
            X.AnonymousClass02Q.A03(r6, r2, r5, r0, r7)
            int[] r1 = r3.A01
            r0 = 0
            X.AnonymousClass02Q.A03(r0, r0, r2, r1, r7)
            r3.A02 = r8
            r3.A01 = r7
        L_0x0093:
            X.78m[] r1 = r3.A02
            X.78m r0 = new X.78m
            r0.<init>(r10)
            r1[r2] = r0
            int[] r0 = r3.A01
            r0[r2] = r4
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            return
        L_0x00a7:
            int r1 = r2 + 1
            int r0 = r5 - r2
            java.lang.System.arraycopy(r9, r2, r9, r1, r0)
            int[] r0 = r3.A01
            X.AnonymousClass02Q.A03(r1, r2, r5, r0, r0)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YQ.A0G(X.7k2):void");
    }

    public static final boolean A0H(C159857k2 r10) {
        C130346Ks r1 = A06;
        int i = A00;
        if (r1.A01 > 0) {
            i = r1.A04[0];
        }
        AnonymousClass666 r6 = null;
        AnonymousClass666 r4 = null;
        int i2 = 0;
        for (AnonymousClass666 BBv = r10.BBv(); BBv != null; BBv = BBv.A01) {
            int i3 = BBv.A00;
            if (i3 != 0) {
                if (i3 >= i) {
                    i2++;
                } else if (r6 == null) {
                    i2++;
                    r6 = BBv;
                } else {
                    AnonymousClass666 r9 = BBv;
                    if (BBv.A00 < r6.A00) {
                        r9 = r6;
                        r6 = BBv;
                    }
                    if (r4 == null) {
                        r4 = r10.BBv();
                        AnonymousClass666 r2 = r4;
                        while (true) {
                            if (r4 != null) {
                                if (r4.A00 >= i) {
                                    break;
                                }
                                if (r2.A00 < r4.A00) {
                                    r2 = r4;
                                }
                                r4 = r4.A01;
                            } else {
                                r4 = r2;
                                break;
                            }
                        }
                    }
                    r6.A00 = 0;
                    r6.A01(r4);
                    r6 = r9;
                }
            }
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }
}
