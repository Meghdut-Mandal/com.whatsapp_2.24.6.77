package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0mr  reason: invalid class name and case insensitive filesystem */
public class C15200mr extends C15210ms implements AnonymousClass0AQ {
    public static final AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C15200mr.class, Object.class, "state");
    public Object A00;
    public Object A01 = AnonymousClass0S5.A01;
    public List A02 = new ArrayList(2);
    public int A03 = -1;
    public final C005102h A04;
    public volatile Object state = AnonymousClass0S5.A05;

    public static final int A00(Object obj, Object obj2, C15200mr r7) {
        Object A0T;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
            Object obj3 = atomicReferenceFieldUpdater.get(r7);
            if (!(obj3 instanceof AnonymousClass0AP)) {
                if (!AnonymousClass00C.A0J(obj3, AnonymousClass0S5.A04) && !(obj3 instanceof AnonymousClass0UB)) {
                    if (AnonymousClass00C.A0J(obj3, AnonymousClass0S5.A03)) {
                        break;
                    }
                    if (AnonymousClass00C.A0J(obj3, AnonymousClass0S5.A05)) {
                        A0T = Collections.singletonList(obj);
                        AnonymousClass00C.A08(A0T);
                    } else if (obj3 instanceof List) {
                        A0T = C007103b.A0T(obj, (Collection) obj3);
                    } else {
                        throw AnonymousClass000.A0f(obj3, "Unexpected state: ", AnonymousClass000.A0u());
                    }
                    if (AnonymousClass0A8.A00(r7, obj3, A0T, atomicReferenceFieldUpdater)) {
                        return 1;
                    }
                } else {
                    return 3;
                }
            } else {
                AnonymousClass0UB A032 = r7.A03(obj);
                if (A032 != null && AnonymousClass0A8.A00(r7, obj3, A032, atomicReferenceFieldUpdater)) {
                    AnonymousClass0AP r2 = (AnonymousClass0AP) obj3;
                    r7.A01 = obj2;
                    Object BwD = r2.BwD(AnonymousClass0AJ.A00, (Object) null, (C006302t) null);
                    if (BwD == null) {
                        r7.A01 = null;
                    } else {
                        r2.B3G(BwD);
                        return 0;
                    }
                }
            }
        }
        return 2;
    }

    public static final Object A01(C023509x r5, C15200mr r6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        Object obj = atomicReferenceFieldUpdater.get(r6);
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        AnonymousClass0UB r4 = (AnonymousClass0UB) obj;
        Object obj2 = r6.A01;
        List<AnonymousClass0UB> list = r6.A02;
        if (list != null) {
            for (AnonymousClass0UB r0 : list) {
                if (r0 != r4) {
                    r0.A00();
                }
            }
            atomicReferenceFieldUpdater.set(r6, AnonymousClass0S5.A04);
            r6.A01 = AnonymousClass0S5.A01;
            r6.A02 = null;
        }
        C019408g r1 = r4.A05;
        Object obj3 = r4.A03;
        Object obj4 = r4.A04;
        Object BKt = r1.BKt(obj3, obj4, obj2);
        Object obj5 = r4.A02;
        if (obj4 == AnonymousClass0S5.A02) {
            AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((C006302t) obj5).invoke(r5);
        }
        AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((C009003v) obj5).invoke(BKt, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C023509x r8, X.C15200mr r9) {
        /*
            boolean r0 = r8 instanceof X.C13900kd
            if (r0 == 0) goto L_0x009c
            r4 = r8
            X.0kd r4 = (X.C13900kd) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 == r8) goto L_0x0089
            if (r0 != r3) goto L_0x00a3
            X.AnonymousClass0AN.A00(r1)
        L_0x0023:
            return r1
        L_0x0024:
            X.AnonymousClass0AN.A00(r1)
            r4.L$0 = r9
            r4.label = r8
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0AR.A02
            X.09x r0 = X.AnonymousClass0AA.A01(r4)
            X.0AR r6 = new X.0AR
            r6.<init>(r8, r0)
            r6.A0J()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = A05
        L_0x003b:
            java.lang.Object r2 = r7.get(r9)
            X.035 r1 = X.AnonymousClass0S5.A05
            if (r2 != r1) goto L_0x0053
            boolean r0 = X.AnonymousClass0A8.A00(r9, r2, r6, r7)
            if (r0 == 0) goto L_0x003b
            r6.BL1(r9)
        L_0x004c:
            java.lang.Object r0 = r6.A0G()
            if (r0 != r5) goto L_0x0090
            return r5
        L_0x0053:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x007e
            boolean r0 = X.AnonymousClass0A8.A00(r9, r2, r1, r7)
            if (r0 == 0) goto L_0x003b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0063:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r2.next()
            X.0UB r1 = r9.A03(r0)
            X.AnonymousClass00C.A0B(r1)
            r0 = 0
            r1.A01 = r0
            r0 = -1
            r1.A00 = r0
            r9.A06(r1, r8)
            goto L_0x0063
        L_0x007e:
            boolean r0 = r2 instanceof X.AnonymousClass0UB
            if (r0 == 0) goto L_0x00a8
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            r0 = 0
            r6.Bol(r0, r1)
            goto L_0x004c
        L_0x0089:
            java.lang.Object r9 = r4.L$0
            X.0mr r9 = (X.C15200mr) r9
            X.AnonymousClass0AN.A00(r1)
        L_0x0090:
            r0 = 0
            r4.L$0 = r0
            r4.label = r3
            java.lang.Object r1 = A01(r4, r9)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x009c:
            X.0kd r4 = new X.0kd
            r4.<init>(r8, r9)
            goto L_0x0012
        L_0x00a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected state: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15200mr.A02(X.09x, X.0mr):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.0UB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.0UB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.0UB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.0UB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.0UB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass0UB A03(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A02
            r3 = 0
            if (r0 == 0) goto L_0x0032
            java.util.Iterator r2 = r0.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0UB r0 = (X.AnonymousClass0UB) r0
            java.lang.Object r0 = r0.A03
            if (r0 != r5) goto L_0x0009
            r3 = r1
        L_0x001b:
            X.0UB r3 = (X.AnonymousClass0UB) r3
            if (r3 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Clause with object "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15200mr.A03(java.lang.Object):X.0UB");
    }

    public void A04(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AnonymousClass0S5.A04) {
                return;
            }
        } while (!AnonymousClass0A8.A00(this, obj, AnonymousClass0S5.A03, atomicReferenceFieldUpdater));
        List<AnonymousClass0UB> list = this.A02;
        if (list != null) {
            for (AnonymousClass0UB A002 : list) {
                A002.A00();
            }
            this.A01 = AnonymousClass0S5.A01;
            this.A02 = null;
        }
    }

    public void A05(C009003v r8, AnonymousClass0T6 r9) {
        A06(new AnonymousClass0UB(r9.A00, (Object) null, r8, r9.A02, r9.A01, this), false);
    }

    public final void A06(AnonymousClass0UB r5, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof AnonymousClass0UB)) {
            if (!z) {
                Object obj = r5.A03;
                List<AnonymousClass0UB> list = this.A02;
                AnonymousClass00C.A0B(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (AnonymousClass0UB r0 : list) {
                        if (r0.A03 == obj) {
                            throw AnonymousClass000.A0f(obj, "Cannot use select clauses on the same object: ", AnonymousClass000.A0u());
                        }
                    }
                }
            }
            r5.A06.BKt(r5.A03, this, r5.A04);
            if (this.A01 == AnonymousClass0S5.A01) {
                if (!z) {
                    List list2 = this.A02;
                    AnonymousClass00C.A0B(list2);
                    list2.add(r5);
                }
                r5.A01 = this.A00;
                r5.A00 = this.A03;
                this.A00 = null;
                this.A03 = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, r5);
        }
    }

    public void BL2(C15460nN r1, int i) {
        this.A00 = r1;
        this.A03 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A04((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15200mr(C005102h r3) {
        this.A04 = r3;
    }
}
