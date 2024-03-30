package X;

/* renamed from: X.0nS  reason: invalid class name and case insensitive filesystem */
public final class C15510nS extends C15540nV {
    public final ThreadLocal A00;
    public volatile boolean threadLocalIsSet;

    public final void A11(Object obj, C005102h r4) {
        this.threadLocalIsSet = true;
        this.A00.set(new AnonymousClass011(r4, obj));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15510nS(X.C023509x r3, X.C005102h r4) {
        /*
            r2 = this;
            X.0iN r1 = X.C12610iN.A00
            X.02i r0 = r4.get(r1)
            if (r0 != 0) goto L_0x0030
            X.02h r0 = r4.plus(r1)
        L_0x000c:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.A00 = r0
            X.02h r1 = r3.getContext()
            X.02s r0 = X.C005402k.A00
            X.02i r0 = r1.get(r0)
            boolean r0 = r0 instanceof X.C005502l
            if (r0 != 0) goto L_0x002f
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass0AF.A00(r0, r4)
            X.AnonymousClass0AF.A01(r0, r4)
            r2.A11(r0, r4)
        L_0x002f:
            return
        L_0x0030:
            r0 = r4
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15510nS.<init>(X.09x, X.02h):void");
    }

    public void A0y(Object obj) {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.A00;
            AnonymousClass011 r0 = (AnonymousClass011) threadLocal.get();
            if (r0 != null) {
                AnonymousClass0AF.A01(r0.second, (C005102h) r0.first);
            }
            threadLocal.remove();
        }
        C023509x r1 = this.A00;
        if (obj instanceof AnonymousClass0AT) {
            obj = AnonymousClass00C.A02(((AnonymousClass0AT) obj).A00);
        }
        C005102h context = r1.getContext();
        C15510nS r3 = null;
        Object A002 = AnonymousClass0AF.A00(r3, context);
        if (A002 != AnonymousClass0AF.A01) {
            r3 = AnonymousClass0A3.A02(A002, r1, context);
        }
        try {
            r1.resumeWith(obj);
        } finally {
            if (r3 == null || r3.A12()) {
                AnonymousClass0AF.A01(A002, context);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A00.get() != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A12() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto L_0x000d
            java.lang.ThreadLocal r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.ThreadLocal r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15510nS.A12():boolean");
    }
}
