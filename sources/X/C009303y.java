package X;

import java.io.Serializable;

/* renamed from: X.03y  reason: invalid class name and case insensitive filesystem */
public final class C009303y implements C005102h, Serializable {
    public final C005202i element;
    public final C005102h left;

    public C009303y(C005202i r2, C005102h r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.left = r3;
        this.element = r2;
    }

    private final Object writeReplace() {
        int i = 2;
        C009303y r1 = this;
        while (true) {
            C005102h r12 = r1.left;
            if (!(r12 instanceof C009303y) || (r1 = (C009303y) r12) == null) {
                C005102h[] r3 = new C005102h[i];
                C10790fE r2 = new C10790fE();
                fold(AnonymousClass0AJ.A00, new C14800mD(r2, r3));
            } else {
                i++;
            }
        }
        C005102h[] r32 = new C005102h[i];
        C10790fE r22 = new C10790fE();
        fold(AnonymousClass0AJ.A00, new C14800mD(r22, r32));
        if (r22.element == i) {
            return new C10840fJ(r32);
        }
        throw new IllegalStateException("Check failed.");
    }

    public Object fold(Object obj, C009003v r4) {
        AnonymousClass00C.A0D(r4, 1);
        return r4.invoke(this.left.fold(obj, r4), this.element);
    }

    public C005202i get(C005902p r3) {
        AnonymousClass00C.A0D(r3, 0);
        C009303y r1 = this;
        while (true) {
            C005202i r0 = r1.element.get(r3);
            if (r0 != null) {
                return r0;
            }
            C005102h r12 = r1.left;
            if (!(r12 instanceof C009303y)) {
                return r12.get(r3);
            }
            r1 = (C009303y) r12;
        }
    }

    public C005102h minusKey(C005902p r4) {
        C005102h r1;
        AnonymousClass00C.A0D(r4, 0);
        if (this.element.get(r4) != null) {
            return this.left;
        }
        C005102h minusKey = this.left.minusKey(r4);
        if (minusKey == this.left) {
            r1 = this;
        } else if (minusKey == C008903u.A00) {
            r1 = this.element;
        } else {
            r1 = new C009303y(this.element, minusKey);
        }
        return r1;
    }

    public C005102h plus(C005102h r3) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3 != C008903u.A00) {
            return (C005102h) r3.fold(this, C009103w.A00);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[LOOP:2: B:16:0x0029->B:20:0x003f, LOOP_START, PHI: r1 
      PHI: (r1v4 X.03y) = (r1v3 X.03y), (r1v7 X.03y) binds: [B:15:0x0027, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0057
            boolean r0 = r6 instanceof X.C009303y
            if (r0 == 0) goto L_0x0059
            X.03y r6 = (X.C009303y) r6
            r4 = 2
            r1 = r6
        L_0x000a:
            X.02h r1 = r1.left
            boolean r0 = r1 instanceof X.C009303y
            if (r0 == 0) goto L_0x0017
            X.03y r1 = (X.C009303y) r1
            if (r1 == 0) goto L_0x0017
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0017:
            r1 = r5
            r3 = 2
            r2 = r5
        L_0x001a:
            X.02h r2 = r2.left
            boolean r0 = r2 instanceof X.C009303y
            if (r0 == 0) goto L_0x0027
            X.03y r2 = (X.C009303y) r2
            if (r2 == 0) goto L_0x0027
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0027:
            if (r4 != r3) goto L_0x0059
        L_0x0029:
            X.02i r2 = r1.element
            X.02p r0 = r2.getKey()
            X.02i r0 = r6.get(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x0059
            X.02h r1 = r1.left
            boolean r0 = r1 instanceof X.C009303y
            if (r0 == 0) goto L_0x0042
            X.03y r1 = (X.C009303y) r1
            goto L_0x0029
        L_0x0042:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            X.AnonymousClass00C.A0E(r1, r0)
            X.02i r1 = (X.C005202i) r1
            X.02p r0 = r1.getKey()
            X.02i r0 = r6.get(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            return r0
        L_0x0059:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009303y.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append((String) fold("", C14830mG.A00));
        sb.append(']');
        return sb.toString();
    }
}
