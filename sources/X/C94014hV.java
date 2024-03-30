package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.4hV  reason: invalid class name and case insensitive filesystem */
public final class C94014hV extends C137226fn implements C161537n4 {
    public C94074hb A00 = new C94074hb();
    public final C157587dm A01;
    public final AnonymousClass00S A02;

    public static final C94074hb A00(C94074hb r15, C94014hV r16, Snapshot snapshot, AnonymousClass00S r18, boolean z) {
        Throwable th;
        int i;
        Object[] objArr;
        C157587dm r0;
        C94014hV r5 = r16;
        Snapshot snapshot2 = snapshot;
        C94074hb r4 = r15;
        int i2 = 0;
        if (!r15.A03(r5, snapshot2)) {
            AnonymousClass0G9 r9 = new AnonymousClass0G9(6);
            C1269066c r2 = C129756Ii.A00;
            AnonymousClass6MD r12 = (AnonymousClass6MD) r2.A01();
            if (r12 == null) {
                r12 = new AnonymousClass6MD(0);
                r2.A02(r12);
            }
            int i3 = r12.A00;
            C1506776e A002 = C129756Ii.A00();
            int i4 = A002.A00;
            if (i4 > 0) {
                Object[] objArr2 = A002.A01;
                int i5 = 0;
                do {
                    ((C158787iE) objArr2[i5]).BuK(r5);
                    i5++;
                } while (i5 < i4);
            }
            try {
                r12.A00 = i3 + 1;
                Object A03 = AnonymousClass6VV.A03(r18, new AnonymousClass7V1(r9, r5, r12, i3));
                r12.A00 = i3;
                int i6 = A002.A00;
                if (i6 > 0) {
                    Object[] objArr3 = A002.A01;
                    int i7 = 0;
                    do {
                        ((C158787iE) objArr3[i7]).B5s(r5);
                        i7++;
                    } while (i7 < i6);
                }
                synchronized (AnonymousClass6YQ.A07) {
                    Snapshot A003 = AnonymousClass6YQ.A00();
                    Object obj = r15.A04;
                    if (obj == C94074hb.A05 || (r0 = r5.A01) == null || !r0.B6k(A03, obj)) {
                        C94074hb r02 = r5.A00;
                        AnonymousClass666 A05 = AnonymousClass6YQ.A05(r5, r02);
                        A05.A01(r02);
                        A05.A00 = A003.A04();
                        r4 = (C94074hb) A05;
                        r4.A03 = r9;
                        r4.A00 = r4.A02(r5, A003);
                        r4.A01 = snapshot2.A04();
                        r4.A02 = snapshot2.A05();
                        r4.A04 = A03;
                    } else {
                        r15.A03 = r9;
                        r15.A00 = r15.A02(r5, A003);
                        r15.A01 = snapshot2.A04();
                        r15.A02 = snapshot2.A05();
                    }
                }
                AnonymousClass6MD r03 = (AnonymousClass6MD) r2.A01();
                if (r03 != null && r03.A00 == 0) {
                    AnonymousClass6YQ.A00().A0E();
                }
            } catch (Throwable th2) {
                th = th2;
                i = A002.A00;
                if (i > 0) {
                    objArr = A002.A01;
                    do {
                        ((C158787iE) objArr[i2]).B5s(r5);
                        i2++;
                    } while (i2 < i);
                }
                throw th;
            }
        } else if (z) {
            C1506776e A004 = C129756Ii.A00();
            int i8 = A004.A00;
            if (i8 > 0) {
                Object[] objArr4 = A004.A01;
                int i9 = 0;
                do {
                    ((C158787iE) objArr4[i9]).BuK(r5);
                    i9++;
                } while (i9 < i8);
            }
            try {
                C06700Us r1 = r15.A03;
                C1269066c r04 = C129756Ii.A00;
                AnonymousClass6MD r122 = (AnonymousClass6MD) r04.A01();
                if (r122 == null) {
                    r122 = new AnonymousClass6MD(0);
                    r04.A02(r122);
                }
                int i10 = r122.A00;
                Object[] objArr5 = r1.A04;
                int[] iArr = r1.A02;
                long[] jArr = r1.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    while (true) {
                        long j = jArr[i2];
                        if ((AnonymousClass000.A0Q(j) & -9187201950435737472L) != -9187201950435737472L) {
                            int A06 = C90484aE.A06(i2, length);
                            for (int i11 = 0; i11 < A06; i11++) {
                                if ((j & 255) < 128) {
                                    int i12 = (i2 << 3) + i11;
                                    C159857k2 r14 = (C159857k2) objArr5[i12];
                                    r122.A00 = iArr[i12] + i10;
                                    C006302t A09 = snapshot2.A09();
                                    if (A09 != null) {
                                        A09.invoke(r14);
                                    }
                                }
                                j >>= 8;
                            }
                            if (A06 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                r122.A00 = i10;
                int i13 = A004.A00;
                if (i13 > 0) {
                    Object[] objArr6 = A004.A01;
                    int i14 = 0;
                    do {
                        ((C158787iE) objArr6[i14]).B5s(r5);
                        i14++;
                    } while (i14 < i13);
                    return r4;
                }
            } catch (Throwable th3) {
                th = th3;
                i = A004.A00;
                if (i > 0) {
                    objArr = A004.A01;
                    i2 = 0;
                    do {
                        ((C158787iE) objArr[i2]).B5s(r5);
                        i2++;
                    } while (i2 < i);
                }
                throw th;
            }
        }
        return r4;
    }

    public static C157587dm A01(Object obj) {
        C157587dm r0 = ((C94014hV) obj).A01;
        if (r0 != null) {
            return r0;
        }
        C137076fY r1 = C137076fY.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public C94074hb BAf() {
        return A00((C94074hb) AnonymousClass6YQ.A07(this.A00), this, AnonymousClass6YQ.A00(), this.A02, false);
    }

    public void BmD(AnonymousClass666 r2) {
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (C94074hb) r2;
    }

    public String toString() {
        String str;
        AnonymousClass6YQ.A07(this.A00);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DerivedState(value=");
        C94074hb r1 = (C94074hb) AnonymousClass6YQ.A07(this.A00);
        if (r1.A03(this, AnonymousClass6YQ.A00())) {
            str = String.valueOf(r1.A04);
        } else {
            str = "<Not calculated>";
        }
        A0u.append(str);
        return C90464aC.A0W(this, ")@", A0u);
    }

    public C94014hV(C157587dm r2, AnonymousClass00S r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass666 BBv() {
        return this.A00;
    }

    public Object getValue() {
        C006302t A09 = AnonymousClass6YQ.A00().A09();
        if (A09 != null) {
            A09.invoke(this);
        }
        return A00((C94074hb) AnonymousClass6YQ.A07(this.A00), this, AnonymousClass6YQ.A00(), this.A02, true).A04;
    }
}
