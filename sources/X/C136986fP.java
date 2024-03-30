package X;

import android.os.Trace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6fP  reason: invalid class name and case insensitive filesystem */
public final class C136986fP implements C158797iF, C161477my, C161467mx {
    public C132146Si A00;
    public C009003v A01;
    public boolean A02;
    public boolean A03;
    public final C157567dk A04;
    public final C136916fF A05;
    public final C129136Fi A06;
    public final AnonymousClass6G1 A07;
    public final C1496372c A08;
    public final C114315h1 A09;
    public final AnonymousClass68K A0A;
    public final AnonymousClass68K A0B;
    public final Object A0C = C36441kJ.A11();
    public final HashSet A0D;
    public final HashSet A0E;
    public final AtomicReference A0F = new AtomicReference((Object) null);
    public final C114315h1 A0G;
    public final AnonymousClass68K A0H;

    public C136986fP(C157567dk r12, C129136Fi r13) {
        C129136Fi r5 = r13;
        this.A06 = r13;
        this.A04 = r12;
        HashSet A16 = C36441kJ.A16();
        this.A0D = A16;
        C1496372c r7 = new C1496372c();
        this.A08 = r7;
        this.A0B = new AnonymousClass68K();
        this.A0E = C36441kJ.A16();
        this.A0A = new AnonymousClass68K();
        C114315h1 r8 = new C114315h1();
        this.A09 = r8;
        C114315h1 r9 = new C114315h1();
        this.A0G = r9;
        this.A0H = new AnonymousClass68K();
        this.A00 = new C132146Si(16);
        this.A07 = new AnonymousClass6G1((AnonymousClass7bN) null, (C05250Oz) null, 3, false);
        C136916fF r3 = new C136916fF(r12, r5, this, r7, r8, r9, A16);
        if (r13 instanceof C93534gi) {
            AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            ((C93534gi) r5).A03.add(r3);
        }
        this.A05 = r3;
        this.A01 = C113535fh.A00;
    }

    private final HashSet A00(Object obj, HashSet hashSet, boolean z) {
        Integer num;
        Integer num2;
        HashSet hashSet2 = hashSet;
        Object obj2 = obj;
        Object A022 = this.A0B.A00.A02(obj2);
        if (A022 != null) {
            if (A022 instanceof AnonymousClass0GB) {
                C06670Uo r2 = (C06670Uo) A022;
                Object[] objArr = r2.A03;
                long[] jArr = r2.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    C136976fO r22 = (C136976fO) objArr[(i << 3) + i3];
                                    if (!this.A0H.A02(obj2, r22)) {
                                        C158797iF r0 = r22.A05;
                                        if (r0 != null) {
                                            num2 = r0.BKq(r22, obj2);
                                        } else {
                                            num2 = C023109s.A00;
                                        }
                                        if (num2 != C023109s.A00) {
                                            if (r22.A03 == null || z) {
                                                if (hashSet2 == null) {
                                                    hashSet2 = C36441kJ.A16();
                                                }
                                                hashSet2.add(r22);
                                            } else {
                                                this.A0E.add(r22);
                                            }
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                C136976fO r23 = (C136976fO) A022;
                if (!this.A0H.A02(obj2, r23)) {
                    C158797iF r02 = r23.A05;
                    if (r02 != null) {
                        num = r02.BKq(r23, obj2);
                    } else {
                        num = C023109s.A00;
                    }
                    if (num != C023109s.A00) {
                        if (r23.A03 == null || z) {
                            if (hashSet == null) {
                                hashSet2 = C36441kJ.A16();
                            }
                            hashSet2.add(r23);
                            return hashSet2;
                        }
                        this.A0E.add(r23);
                    }
                }
            }
        }
        return hashSet2;
    }

    private final void A01() {
        int i;
        int i2;
        int i3;
        AnonymousClass0GA r10 = this.A0A.A00;
        long[] jArr = r10.A02;
        long[] jArr2 = jArr;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr2[i4];
                char c = 7;
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int A062 = C90484aE.A06(i4, length);
                    int i5 = 0;
                    while (true) {
                        i = A062;
                        if (i5 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i6 = (i4 << 3) + i5;
                            Object obj = r10.A04[i6];
                            if (obj instanceof AnonymousClass0GB) {
                                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                AnonymousClass0GB r7 = (AnonymousClass0GB) obj;
                                Object[] objArr = r7.A03;
                                long[] jArr3 = r7.A02;
                                long[] jArr4 = jArr3;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j2 = jArr4[i7];
                                        if ((((~j2) << c) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                            int A063 = C90484aE.A06(i7, length2);
                                            int i8 = 0;
                                            while (true) {
                                                i3 = A063;
                                                if (i8 >= i3) {
                                                    break;
                                                }
                                                if ((j2 & 255) < 128) {
                                                    int i9 = (i7 << 3) + i8;
                                                    if (!this.A0B.A00.A03(objArr[i9])) {
                                                        r7.A05(i9);
                                                    }
                                                }
                                                j2 >>= 8;
                                                i8++;
                                            }
                                            if (i3 != 8) {
                                                break;
                                            }
                                        }
                                        if (i7 == length2) {
                                            break;
                                        }
                                        i7++;
                                        c = 7;
                                    }
                                }
                                i2 = r7.A01;
                            } else {
                                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                i2 = this.A0B.A00.A03(obj);
                            }
                            if (i2 == 0) {
                                r10.A06(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                        c = 7;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        HashSet hashSet = this.A0E;
        if (C36411kG.A1a(hashSet)) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C136976fO) it.next()).A03 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void A02(C136986fP r1) {
        HashSet hashSet = r1.A0D;
        if (!hashSet.isEmpty()) {
            new C136996fQ(hashSet).A00();
        }
    }

    public static final void A03(C136986fP r2) {
        r2.A0F.set((Object) null);
        r2.A09.A00.A02();
        r2.A0G.A00.A02();
        r2.A0D.clear();
    }

    public static final void A04(C136986fP r5) {
        AtomicReference atomicReference = r5.A0F;
        Object obj = C112295df.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (andSet.equals(obj)) {
            throw AnonymousClass6XJ.A01("pending composition has not been applied");
        } else if (andSet instanceof Set) {
            r5.A08((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set A082 : (Set[]) andSet) {
                r5.A08(A082, true);
            }
        } else {
            throw AnonymousClass6XJ.A01(AnonymousClass000.A0l(atomicReference, "corrupt pendingModifications drain: ", AnonymousClass000.A0u()));
        }
    }

    public static final void A05(C136986fP r5) {
        AtomicReference atomicReference = r5.A0F;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (AnonymousClass00C.A0J(andSet, C112295df.A00)) {
            return;
        }
        if (andSet instanceof Set) {
            r5.A08((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set A082 : (Set[]) andSet) {
                r5.A08(A082, false);
            }
        } else if (andSet == null) {
            throw AnonymousClass6XJ.A01("calling recordModificationsOf and applyChanges concurrently is not supported");
        } else {
            throw AnonymousClass6XJ.A01(AnonymousClass000.A0l(atomicReference, "corrupt pendingModifications drain: ", AnonymousClass000.A0u()));
        }
    }

    private final void A06(C114315h1 r29) {
        AnonymousClass6YK A022;
        int i;
        AnonymousClass606 r0;
        AnonymousClass606 r02;
        C136996fQ r11 = new C136996fQ(this.A0D);
        try {
            C128976Ek r3 = r29.A00;
            if (r3.A02 != 0) {
                Trace.beginSection("Compose:applyChanges");
                try {
                    C157567dk r2 = this.A04;
                    A022 = this.A08.A02();
                    r3.A03(r2, r11, A022);
                    A022.A0L();
                    C161327mZ r03 = ((C137846gp) ((C136896fD) r2).A01).A09;
                    if (r03 != null) {
                        r03.BWU();
                    }
                    Trace.endSection();
                    r11.A01();
                    List list = r11.A03;
                    if (C36401kF.A1a(list)) {
                        Trace.beginSection("Compose:sideeffects");
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((AnonymousClass00S) list.get(i2)).invoke();
                        }
                        list.clear();
                        Trace.endSection();
                    }
                    if (this.A03) {
                        Trace.beginSection("Compose:unobserve");
                        this.A03 = false;
                        AnonymousClass0GA r10 = this.A0B.A00;
                        long[] jArr = r10.A02;
                        long[] jArr2 = jArr;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr2[i3];
                                if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                    int A062 = C90484aE.A06(i3, length);
                                    int i4 = 0;
                                    while (true) {
                                        i = A062;
                                        if (i4 >= i) {
                                            break;
                                        }
                                        if ((j & 255) < 128) {
                                            int i5 = (i3 << 3) + i4;
                                            Object obj = r10.A04[i5];
                                            if (obj instanceof AnonymousClass0GB) {
                                                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                                AnonymousClass0GB r7 = (AnonymousClass0GB) obj;
                                                Object[] objArr = r7.A03;
                                                long[] jArr3 = r7.A02;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i6 = 0;
                                                    while (true) {
                                                        long j2 = jArr3[i6];
                                                        if ((AnonymousClass000.A0Q(j2) & -9187201950435737472L) != -9187201950435737472L) {
                                                            int A063 = C90484aE.A06(i6, length2);
                                                            for (int i7 = 0; i7 < A063; i7++) {
                                                                if ((j2 & 255) < 128) {
                                                                    int i8 = (i6 << 3) + i7;
                                                                    C136976fO r15 = (C136976fO) objArr[i8];
                                                                    if (r15.A05 == null || (r02 = r15.A04) == null || r02.A00 == Integer.MIN_VALUE) {
                                                                        r7.A05(i8);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (A063 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i6 == length2) {
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                }
                                                if (r7.A01 != 0) {
                                                }
                                            } else {
                                                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                C136976fO r72 = (C136976fO) obj;
                                                if (!(r72.A05 == null || (r0 = r72.A04) == null || r0.A00 == Integer.MIN_VALUE)) {
                                                }
                                            }
                                            r10.A06(i5);
                                        }
                                        j >>= 8;
                                        i4++;
                                    }
                                    if (i != 8) {
                                        break;
                                    }
                                }
                                if (i3 == length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                        A01();
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    th = th;
                    Trace.endSection();
                    throw th;
                }
            }
            if (this.A0G.A00.A02 == 0) {
                r11.A00();
            }
        } catch (Throwable th2) {
            if (this.A0G.A00.A02 == 0) {
                r11.A00();
            }
            throw th2;
        }
    }

    private final void A07(Object obj) {
        Integer num;
        Integer num2;
        Object A022 = this.A0B.A00.A02(obj);
        if (A022 == null) {
            return;
        }
        if (A022 instanceof AnonymousClass0GB) {
            C06670Uo r2 = (C06670Uo) A022;
            Object[] objArr = r2.A03;
            long[] jArr = r2.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                C136976fO r22 = (C136976fO) objArr[(i << 3) + i3];
                                C158797iF r0 = r22.A05;
                                if (r0 != null) {
                                    num2 = r0.BKq(r22, obj);
                                } else {
                                    num2 = C023109s.A00;
                                }
                                if (num2 == C023109s.A0G) {
                                    this.A0H.A01(obj, r22);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C136976fO r23 = (C136976fO) A022;
            C158797iF r02 = r23.A05;
            if (r02 != null) {
                num = r02.BKq(r23, obj);
            } else {
                num = C023109s.A00;
            }
            if (num == C023109s.A0G) {
                this.A0H.A01(obj, r23);
            }
        }
    }

    private final void A08(Set set, boolean z) {
        HashSet hashSet;
        int i;
        int i2;
        Set set2 = set;
        Object obj = null;
        char c = 7;
        long j = -9187201950435737472L;
        boolean z2 = z;
        if (set2 instanceof C1506876f) {
            C1506876f r1 = (C1506876f) set2;
            Object[] objArr = r1.A01;
            int size = r1.size();
            hashSet = null;
            int i3 = 0;
            while (i3 < size) {
                Object A0d = C90524aI.A0d(objArr, i3);
                if (A0d instanceof C136976fO) {
                    C136976fO r12 = (C136976fO) A0d;
                    C158797iF r0 = r12.A05;
                    if (r0 != null) {
                        r0.BKq(r12, obj);
                    }
                } else {
                    hashSet = A00(A0d, hashSet, z2);
                    Object A022 = this.A0A.A00.A02(A0d);
                    if (A022 != null) {
                        if (A022 instanceof AnonymousClass0GB) {
                            C06670Uo r13 = (C06670Uo) A022;
                            Object[] objArr2 = r13.A03;
                            long[] jArr = r13.A02;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j2 = jArr[i4];
                                    if ((((~j2) << 7) & j2 & j) != j) {
                                        int A062 = C90484aE.A06(i4, length);
                                        for (int i5 = 0; i5 < A062; i5++) {
                                            if ((j2 & 255) < 128) {
                                                hashSet = A00(objArr2[(i4 << 3) + i5], hashSet, z2);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (A062 != 8) {
                                            break;
                                        }
                                    }
                                    if (i4 == length) {
                                        break;
                                    }
                                    i4++;
                                    j = -9187201950435737472L;
                                }
                            }
                        } else {
                            hashSet = A00(A022, hashSet, z2);
                        }
                    }
                }
                i3++;
                obj = null;
                j = -9187201950435737472L;
            }
        } else {
            hashSet = null;
            for (Object next : set2) {
                if (next instanceof C136976fO) {
                    C136976fO r2 = (C136976fO) next;
                    C158797iF r02 = r2.A05;
                    if (r02 != null) {
                        r02.BKq(r2, (Object) null);
                    }
                } else {
                    hashSet = A00(next, hashSet, z2);
                    Object A023 = this.A0A.A00.A02(next);
                    if (A023 != null) {
                        if (A023 instanceof AnonymousClass0GB) {
                            C06670Uo r14 = (C06670Uo) A023;
                            Object[] objArr3 = r14.A03;
                            long[] jArr2 = r14.A02;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j3 = jArr2[i6];
                                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                        int A063 = C90484aE.A06(i6, length2);
                                        for (int i7 = 0; i7 < A063; i7++) {
                                            if ((j3 & 255) < 128) {
                                                hashSet = A00(objArr3[(i6 << 3) + i7], hashSet, z2);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (A063 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length2) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        } else {
                            hashSet = A00(A023, hashSet, z2);
                        }
                    }
                }
            }
        }
        if (z) {
            HashSet hashSet2 = this.A0E;
            if (C36411kG.A1a(hashSet2)) {
                AnonymousClass0GA r9 = this.A0B.A00;
                long[] jArr3 = r9.A02;
                long[] jArr4 = jArr3;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j4 = jArr4[i8];
                        if ((((~j4) << c) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int A064 = C90484aE.A06(i8, length3);
                            int i9 = 0;
                            while (true) {
                                i = A064;
                                if (i9 >= i) {
                                    break;
                                }
                                if ((j4 & 255) < 128) {
                                    int i10 = (i8 << 3) + i9;
                                    Object obj2 = r9.A04[i10];
                                    if (obj2 instanceof AnonymousClass0GB) {
                                        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                        AnonymousClass0GB r5 = (AnonymousClass0GB) obj2;
                                        Object[] objArr4 = r5.A03;
                                        long[] jArr5 = r5.A02;
                                        long[] jArr6 = jArr5;
                                        int length4 = jArr5.length - 2;
                                        if (length4 >= 0) {
                                            int i11 = 0;
                                            while (true) {
                                                long j5 = jArr6[i11];
                                                if ((AnonymousClass000.A0Q(j5) & -9187201950435737472L) != -9187201950435737472L) {
                                                    int A065 = C90484aE.A06(i11, length4);
                                                    int i12 = 0;
                                                    while (true) {
                                                        i2 = A065;
                                                        if (i12 >= i2) {
                                                            break;
                                                        }
                                                        if ((j5 & 255) < 128) {
                                                            int i13 = (i11 << 3) + i12;
                                                            Object obj3 = objArr4[i13];
                                                            if (hashSet2.contains(obj3) || (hashSet != null && hashSet.contains(obj3))) {
                                                                r5.A05(i13);
                                                            }
                                                        }
                                                        j5 >>= 8;
                                                        i12++;
                                                    }
                                                    if (i2 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i11 == length4) {
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                        if (r5.A01 != 0) {
                                        }
                                    } else {
                                        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        if (!hashSet2.contains(obj2)) {
                                            if (hashSet != null) {
                                                if (!hashSet.contains(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                    r9.A06(i10);
                                }
                                j4 >>= 8;
                                i9++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                        c = 7;
                    }
                }
                hashSet2.clear();
                A01();
            }
        }
        if (hashSet != null) {
            AnonymousClass0GA r22 = this.A0B.A00;
            long[] jArr7 = r22.A02;
            long[] jArr8 = jArr7;
            int length5 = jArr7.length - 2;
            if (length5 >= 0) {
                int i14 = 0;
                while (true) {
                    long j6 = jArr8[i14];
                    if ((AnonymousClass000.A0Q(j6) & -9187201950435737472L) != -9187201950435737472L) {
                        int A066 = C90484aE.A06(i14, length5);
                        for (int i15 = 0; i15 < A066; i15++) {
                            if ((j6 & 255) < 128) {
                                int i16 = (i14 << 3) + i15;
                                Object obj4 = r22.A04[i16];
                                if (obj4 instanceof AnonymousClass0GB) {
                                    AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                    AnonymousClass0GB r10 = (AnonymousClass0GB) obj4;
                                    Object[] objArr5 = r10.A03;
                                    long[] jArr9 = r10.A02;
                                    int length6 = jArr9.length - 2;
                                    if (length6 >= 0) {
                                        int i17 = 0;
                                        while (true) {
                                            long j7 = jArr9[i17];
                                            if ((AnonymousClass000.A0Q(j7) & -9187201950435737472L) != -9187201950435737472L) {
                                                int A067 = C90484aE.A06(i17, length6);
                                                for (int i18 = 0; i18 < A067; i18++) {
                                                    if ((j7 & 255) < 128) {
                                                        int i19 = (i17 << 3) + i18;
                                                        if (hashSet.contains(objArr5[i19])) {
                                                            r10.A05(i19);
                                                        }
                                                    }
                                                    j7 >>= 8;
                                                }
                                                if (A067 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i17 == length6) {
                                                break;
                                            }
                                            i17++;
                                        }
                                    }
                                    if (r10.A01 != 0) {
                                    }
                                } else {
                                    AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                    if (!hashSet.contains(obj4)) {
                                    }
                                }
                                r22.A06(i16);
                            }
                            j6 >>= 8;
                        }
                        if (A066 != 8) {
                            break;
                        }
                    }
                    if (i14 == length5) {
                        break;
                    }
                    i14++;
                }
            }
            A01();
        }
    }

    public void B1G() {
        synchronized (this.A0C) {
            try {
                A06(this.A09);
                A05(this);
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    public void B1J() {
        synchronized (this.A0C) {
            try {
                C114315h1 r1 = this.A0G;
                if (r1.A00.A02 != 0) {
                    A06(r1);
                }
            } catch (Exception e) {
                A03(this);
                throw e;
            } catch (Throwable th) {
                A02(this);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (X.AnonymousClass00C.A0J(r1.get(r0), r4) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ca, code lost:
        r8.A06.A08(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d1, code lost:
        if (r3.A0M == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d5, code lost:
        return X.C023109s.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d8, code lost:
        return X.C023109s.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer BKq(X.C136976fO r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r1 = r9.A01
            r0 = r1 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r1 | 4
            r9.A01 = r0
        L_0x000e:
            X.606 r4 = r9.A04
            if (r4 == 0) goto L_0x003b
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.C36381kD.A1U(r3, r1)
            if (r0 == 0) goto L_0x003b
            X.72c r0 = r8.A08
            if (r3 == r1) goto L_0x004b
            r2 = 1
            java.util.ArrayList r1 = r0.A04
            int r0 = r0.A00
            int r0 = X.AnonymousClass6QR.A01(r1, r3, r0)
            if (r0 < 0) goto L_0x004b
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r4)
            if (r0 == 0) goto L_0x004b
        L_0x0035:
            if (r2 != 0) goto L_0x003e
            java.lang.Object r0 = r8.A0C
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x003b:
            java.lang.Integer r0 = X.C023109s.A00
            return r0
        L_0x003e:
            X.03v r0 = r9.A06
            boolean r0 = X.AnonymousClass000.A1V(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Object r4 = r8.A0C
            monitor-enter(r4)
            r6 = 0
            goto L_0x004d
        L_0x004b:
            r2 = 0
            goto L_0x0035
        L_0x004d:
            X.6fF r3 = r8.A05     // Catch:{ all -> 0x00d9 }
            boolean r0 = r3.A0M     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0099
            X.606 r2 = r9.A04     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x0099
            X.6QL r1 = r3.A0C     // Catch:{ all -> 0x00d9 }
            X.72c r0 = r1.A08     // Catch:{ all -> 0x00d9 }
            int r7 = r0.A00(r2)     // Catch:{ all -> 0x00d9 }
            boolean r0 = r3.A0M     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x0099
            int r0 = r1.A01     // Catch:{ all -> 0x00d9 }
            if (r7 < r0) goto L_0x0099
            java.util.List r5 = r3.A0c     // Catch:{ all -> 0x00d9 }
            int r0 = X.AnonymousClass6XJ.A00(r5, r7)     // Catch:{ all -> 0x00d9 }
            r2 = 0
            if (r0 >= 0) goto L_0x0086
            int r0 = r0 + 1
            int r1 = -r0
            if (r10 == 0) goto L_0x007d
            X.76f r2 = new X.76f     // Catch:{ all -> 0x00d9 }
            r2.<init>()     // Catch:{ all -> 0x00d9 }
            r2.add(r10)     // Catch:{ all -> 0x00d9 }
        L_0x007d:
            X.5rq r0 = new X.5rq     // Catch:{ all -> 0x00d9 }
            r0.<init>(r9, r2, r7)     // Catch:{ all -> 0x00d9 }
            r5.add(r1, r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x009b
        L_0x0086:
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00d9 }
            X.5rq r0 = (X.C120645rq) r0     // Catch:{ all -> 0x00d9 }
            if (r10 != 0) goto L_0x0091
            r0.A00 = r6     // Catch:{ all -> 0x00d9 }
            goto L_0x009b
        L_0x0091:
            X.76f r0 = r0.A00     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x009b
            r0.add(r10)     // Catch:{ all -> 0x00d9 }
            goto L_0x009b
        L_0x0099:
            r0 = 0
            goto L_0x009c
        L_0x009b:
            r0 = 1
        L_0x009c:
            if (r0 == 0) goto L_0x00a2
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ all -> 0x00d9 }
            monitor-exit(r4)
            return r0
        L_0x00a2:
            if (r10 != 0) goto L_0x00aa
            X.6Si r0 = r8.A00     // Catch:{ all -> 0x00d9 }
            r0.A01(r9, r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x00c9
        L_0x00aa:
            X.6Si r2 = r8.A00     // Catch:{ all -> 0x00d9 }
            int r1 = X.C132146Si.A00(r2, r9)     // Catch:{ all -> 0x00d9 }
            if (r1 < 0) goto L_0x00be
            java.lang.Object[] r0 = r2.A02     // Catch:{ all -> 0x00d9 }
            r0 = r0[r1]     // Catch:{ all -> 0x00d9 }
            X.76f r0 = (X.C1506876f) r0     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00c9
            r0.add(r10)     // Catch:{ all -> 0x00d9 }
            goto L_0x00c9
        L_0x00be:
            X.76f r0 = new X.76f     // Catch:{ all -> 0x00d9 }
            r0.<init>()     // Catch:{ all -> 0x00d9 }
            r0.add(r10)     // Catch:{ all -> 0x00d9 }
            r2.A01(r9, r0)     // Catch:{ all -> 0x00d9 }
        L_0x00c9:
            monitor-exit(r4)
            X.6Fi r0 = r8.A06
            r0.A08(r8)
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x00d6
            java.lang.Integer r0 = X.C023109s.A0C
            return r0
        L_0x00d6:
            java.lang.Integer r0 = X.C023109s.A01
            return r0
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136986fP.BKq(X.6fO, java.lang.Object):java.lang.Integer");
    }

    public void Bn3(Object obj) {
        C136976fO A0P;
        C136916fF r1 = this.A05;
        if (r1.A00 <= 0 && (A0P = r1.A0P()) != null) {
            int i = A0P.A01 | 1;
            A0P.A01 = i;
            Object obj2 = obj;
            if ((i & 32) == 0) {
                AnonymousClass0G9 r8 = A0P.A02;
                if (r8 == null) {
                    r8 = new AnonymousClass0G9(6);
                    A0P.A02 = r8;
                }
                int i2 = A0P.A00;
                int i3 = -1;
                int A012 = AnonymousClass0G9.A01(r8, obj2);
                if (A012 < 0) {
                    A012 = ~A012;
                } else {
                    i3 = r8.A02[A012];
                }
                r8.A04[A012] = obj;
                r8.A02[A012] = i2;
                if (i3 == A0P.A00) {
                    return;
                }
                if (obj2 instanceof C161537n4) {
                    AnonymousClass0GA r12 = A0P.A03;
                    if (r12 == null) {
                        r12 = new AnonymousClass0GA(6);
                        A0P.A03 = r12;
                    }
                    r12.A08(obj2, ((C161537n4) obj2).BAf().A04);
                }
            }
            if (obj2 instanceof C137226fn) {
                ((C137226fn) obj2).A02(1);
            }
            this.A0B.A01(obj2, A0P);
            if (obj2 instanceof C161537n4) {
                AnonymousClass68K r11 = this.A0A;
                r11.A00(obj2);
                C06700Us r0 = ((C161537n4) obj2).BAf().A03;
                Object[] objArr = r0.A04;
                long[] jArr = r0.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    C159857k2 r13 = (C159857k2) objArr[(i4 << 3) + i6];
                                    if (r13 instanceof C137226fn) {
                                        ((C137226fn) r13).A02(1);
                                    }
                                    r11.A01(r13, obj2);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                return;
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void Bn5(Object obj) {
        synchronized (this.A0C) {
            Object obj2 = obj;
            A07(obj2);
            Object A022 = this.A0A.A00.A02(obj2);
            if (A022 != null) {
                if (A022 instanceof AnonymousClass0GB) {
                    AnonymousClass0GB r1 = (AnonymousClass0GB) A022;
                    Object[] objArr = r1.A03;
                    long[] jArr = r1.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        A07((C161537n4) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    A07((C161537n4) A022);
                }
            }
        }
    }

    public void Bqa(C009003v r2) {
        if (!this.A02) {
            this.A01 = r2;
            this.A06.A0B(this, r2);
            return;
        }
        throw AnonymousClass001.A09("The composition is disposed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((true ^ r7.A0D.isEmpty()) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r7 = this;
            java.lang.Object r2 = r7.A0C
            monitor-enter(r2)
            X.6fF r4 = r7.A05     // Catch:{ all -> 0x00d9 }
            boolean r0 = r4.A0M     // Catch:{ all -> 0x00d9 }
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cd
            boolean r0 = r7.A02     // Catch:{ all -> 0x00d9 }
            if (r0 != 0) goto L_0x00c6
            r7.A02 = r3     // Catch:{ all -> 0x00d9 }
            X.03v r0 = X.C113535fh.A01     // Catch:{ all -> 0x00d9 }
            r7.A01 = r0     // Catch:{ all -> 0x00d9 }
            X.5h1 r0 = r4.A0G     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x001d
            r7.A06(r0)     // Catch:{ all -> 0x00d9 }
        L_0x001d:
            X.72c r6 = r7.A08     // Catch:{ all -> 0x00d9 }
            int r0 = r6.A00     // Catch:{ all -> 0x00d9 }
            r1 = 1
            if (r0 > 0) goto L_0x002e
            r1 = 0
            java.util.HashSet r0 = r7.A0D     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d9 }
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0060
        L_0x002e:
            java.util.HashSet r0 = r7.A0D     // Catch:{ all -> 0x00d9 }
            X.6fQ r5 = new X.6fQ     // Catch:{ all -> 0x00d9 }
            r5.<init>(r0)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x005d
            X.7dk r3 = r7.A04     // Catch:{ all -> 0x00d9 }
            X.6YK r1 = r6.A02()     // Catch:{ all -> 0x00d9 }
            X.AnonymousClass6XJ.A03(r5, r1)     // Catch:{ all -> 0x00d4 }
            r1.A0L()     // Catch:{ all -> 0x00d9 }
            X.6fD r3 = (X.C136896fD) r3     // Catch:{ all -> 0x00d9 }
            java.util.List r0 = r3.A02     // Catch:{ all -> 0x00d9 }
            r0.clear()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x00d9 }
            r3.A00 = r0     // Catch:{ all -> 0x00d9 }
            X.6gp r0 = (X.C137846gp) r0     // Catch:{ all -> 0x00d9 }
            r0.A0M()     // Catch:{ all -> 0x00d9 }
            X.7mZ r0 = r0.A09     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x005a
            r0.BWU()     // Catch:{ all -> 0x00d9 }
        L_0x005a:
            r5.A01()     // Catch:{ all -> 0x00d9 }
        L_0x005d:
            r5.A00()     // Catch:{ all -> 0x00d9 }
        L_0x0060:
            java.lang.String r0 = "Compose:Composer.dispose"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00d9 }
            X.6Fi r5 = r4.A0V     // Catch:{ all -> 0x00c1 }
            boolean r0 = r5 instanceof X.C93534gi     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0095
            X.4gi r5 = (X.C93534gi) r5     // Catch:{ all -> 0x00c1 }
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x008c
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0075:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00c1 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"
            X.AnonymousClass00C.A0E(r4, r0)     // Catch:{ all -> 0x00c1 }
            X.72c r0 = r4.A0Y     // Catch:{ all -> 0x00c1 }
            r1.remove(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x0075
        L_0x008c:
            java.util.Set r0 = r5.A03     // Catch:{ all -> 0x00c1 }
            java.util.Collection r0 = X.C07710Yz.A00(r0)     // Catch:{ all -> 0x00c1 }
            r0.remove(r4)     // Catch:{ all -> 0x00c1 }
        L_0x0095:
            X.5h0 r0 = r4.A0Z     // Catch:{ all -> 0x00c1 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x00c1 }
            r0.clear()     // Catch:{ all -> 0x00c1 }
            java.util.List r0 = r4.A0c     // Catch:{ all -> 0x00c1 }
            r0.clear()     // Catch:{ all -> 0x00c1 }
            X.5h1 r0 = r4.A0F     // Catch:{ all -> 0x00c1 }
            X.6Ek r0 = r0.A00     // Catch:{ all -> 0x00c1 }
            r0.A02()     // Catch:{ all -> 0x00c1 }
            r0 = 0
            r4.A0J = r0     // Catch:{ all -> 0x00c1 }
            X.7dk r1 = r4.A0U     // Catch:{ all -> 0x00c1 }
            X.6fD r1 = (X.C136896fD) r1     // Catch:{ all -> 0x00c1 }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x00c1 }
            r0.clear()     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00c1 }
            r1.A00 = r0     // Catch:{ all -> 0x00c1 }
            X.6gp r0 = (X.C137846gp) r0     // Catch:{ all -> 0x00c1 }
            r0.A0M()     // Catch:{ all -> 0x00c1 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00d9 }
            goto L_0x00c6
        L_0x00c1:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00d9 }
            goto L_0x00d8
        L_0x00c6:
            monitor-exit(r2)
            X.6Fi r0 = r7.A06
            r0.A0A(r7)
            return
        L_0x00cd:
            java.lang.String r0 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.A0L()     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136986fP.dispose():void");
    }
}
