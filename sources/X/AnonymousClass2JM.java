package X;

/* renamed from: X.2JM  reason: invalid class name */
public final class AnonymousClass2JM extends C70763fg {
    public final C19970wo A00;
    public final C220412q A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008f A[EDGE_INSN: B:54:0x008f->B:32:0x008f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BtJ(java.util.Collection r8) {
        /*
            r7 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r8, r4)
            X.3T1 r0 = X.C36421kH.A0S(r8)
            X.3Qa r0 = r0.A1J
            X.11F r1 = r0.A00
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00b5
            X.12q r0 = r7.A01
            X.3Qp r1 = r0.A09(r1, r4)
            boolean r0 = r1 instanceof X.C44072La
            if (r0 == 0) goto L_0x008e
            X.2La r1 = (X.C44072La) r1
            r6 = 1
            if (r1 == 0) goto L_0x008e
            boolean r0 = r1.A0L()
            if (r0 != r6) goto L_0x008e
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r8.iterator()
        L_0x002d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.AnonymousClass00C.A0D(r0, r4)
            boolean r0 = X.C66013Ui.A0b(r0)
            if (r0 == 0) goto L_0x002d
            r3.add(r1)
            goto L_0x002d
        L_0x0047:
            int r5 = r3.size()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r8.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.AnonymousClass00C.A0D(r0, r4)
            int r0 = r0.A0D
            if (r0 != 0) goto L_0x0053
            r3.add(r1)
            goto L_0x0053
        L_0x006b:
            int r0 = r3.size()
            if (r5 > 0) goto L_0x00ad
            if (r0 > 0) goto L_0x00ad
            java.util.Iterator r3 = r8.iterator()
        L_0x0077:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            boolean r0 = r1.A1P
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1 instanceof X.AnonymousClass2c7
            if (r0 == 0) goto L_0x0077
        L_0x008c:
            if (r2 == 0) goto L_0x008f
        L_0x008e:
            return r4
        L_0x008f:
            X.0wo r3 = r7.A00
            java.util.Iterator r2 = r8.iterator()
        L_0x0095:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            boolean r0 = X.C65903Tx.A05(r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x00b5
            return r4
        L_0x00ad:
            int r0 = r8.size()
            if (r5 == r0) goto L_0x00b4
            r6 = 0
        L_0x00b4:
            return r6
        L_0x00b5:
            boolean r0 = super.BtJ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JM.BtJ(java.util.Collection):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JM(C19970wo r1, C220412q r2, AnonymousClass3O0 r3) {
        super(r3);
        C36321k7.A11(r3, r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
