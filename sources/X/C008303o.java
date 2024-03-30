package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.03o  reason: invalid class name and case insensitive filesystem */
public class C008303o {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef;

    static {
        Class<C008303o> cls = C008303o.class;
        Class<Object> cls2 = Object.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (X.AnonymousClass0A8.A00(r4, r0, ((X.C06430To) r2).A00, r3) == false) goto L_0x0001;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C008303o A00(X.C008303o r8) {
        /*
            r7 = 0
        L_0x0001:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A01
            java.lang.Object r5 = r6.get(r8)
            X.03o r5 = (X.C008303o) r5
            r0 = r5
        L_0x000a:
            r4 = r7
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A00
            java.lang.Object r2 = r3.get(r0)
            if (r2 != r8) goto L_0x001c
            if (r5 == r0) goto L_0x004d
            boolean r1 = X.AnonymousClass0A8.A00(r8, r5, r0, r6)
            if (r1 != 0) goto L_0x004d
            goto L_0x0001
        L_0x001c:
            boolean r1 = r8.A04()
            if (r1 == 0) goto L_0x0023
            return r7
        L_0x0023:
            if (r2 == r7) goto L_0x004d
            boolean r1 = r2 instanceof X.AnonymousClass0A7
            if (r1 == 0) goto L_0x002f
            X.0A7 r2 = (X.AnonymousClass0A7) r2
            r2.A00(r0)
            goto L_0x0001
        L_0x002f:
            boolean r1 = r2 instanceof X.C06430To
            if (r1 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0041
            X.0To r2 = (X.C06430To) r2
            X.03o r1 = r2.A00
            boolean r0 = X.AnonymousClass0A8.A00(r4, r0, r1, r3)
            if (r0 == 0) goto L_0x0001
            r0 = r4
            goto L_0x000a
        L_0x0041:
            java.lang.Object r0 = r6.get(r0)
            X.03o r0 = (X.C008303o) r0
            goto L_0x000b
        L_0x0048:
            X.03o r2 = (X.C008303o) r2
            r4 = r0
            r0 = r2
            goto L_0x000b
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008303o.A00(X.03o):X.03o");
    }

    public static final void A01(C008303o r3, C008303o r4) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        do {
            obj = atomicReferenceFieldUpdater.get(r4);
            if (r3.A02() != r4) {
                return;
            }
        } while (!AnonymousClass0A8.A00(r4, obj, r3, atomicReferenceFieldUpdater));
        if (r3.A04()) {
            A00(r4);
        }
    }

    public final Object A02() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AnonymousClass0A7)) {
                return obj;
            }
            ((AnonymousClass0A7) obj).A00(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new C14900mN(this));
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final C008303o A03() {
        C06430To r0;
        Object A022 = A02();
        if ((A022 instanceof C06430To) && (r0 = (C06430To) A022) != null) {
            return r0.A00;
        }
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C008303o) A022;
    }

    public boolean A04() {
        return A02() instanceof C06430To;
    }
}
