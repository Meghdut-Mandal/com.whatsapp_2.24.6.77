package X;

/* renamed from: X.0tF  reason: invalid class name and case insensitive filesystem */
public class C18490tF implements AnonymousClass05G {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C18490tF(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B6N(java.lang.Object r9, X.C023509x r10) {
        /*
            r8 = this;
            int r0 = r8.A03
            if (r0 == 0) goto L_0x0037
            r1 = r8
            boolean r0 = r10 instanceof X.C13940kh
            if (r0 == 0) goto L_0x002d
            r6 = r10
            X.0kh r6 = (X.C13940kh) r6
            int r3 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x002d
            int r3 = r3 - r2
            r6.label = r3
        L_0x0017:
            java.lang.Object r7 = r6.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x008a
            if (r0 == r3) goto L_0x0033
            if (r0 == r4) goto L_0x00b3
            if (r0 == r5) goto L_0x0033
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002d:
            X.0kh r6 = new X.0kh
            r6.<init>(r8, r10)
            goto L_0x0017
        L_0x0033:
            X.AnonymousClass0AN.A00(r7)
            goto L_0x0057
        L_0x0037:
            boolean r0 = r10 instanceof X.C13740kN
            if (r0 == 0) goto L_0x00d4
            r7 = r10
            X.0kN r7 = (X.C13740kN) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r7.label = r2
        L_0x0049:
            java.lang.Object r1 = r7.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r6) goto L_0x00db
            X.AnonymousClass0AN.A00(r1)
        L_0x0057:
            X.0AJ r2 = X.AnonymousClass0AJ.A00
            return r2
        L_0x005a:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r5 = r8.A02
            X.0iy r5 = (X.C12980iy) r5
            X.02t r0 = r5.A00
            java.lang.Object r4 = r0.invoke(r9)
            java.lang.Object r3 = r8.A01
            X.0fG r3 = (X.C10810fG) r3
            java.lang.Object r1 = r3.element
            X.035 r0 = X.C05980Rv.A01
            if (r1 == r0) goto L_0x007d
            X.03v r0 = r5.A01
            java.lang.Object r0 = r0.invoke(r1, r4)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0057
        L_0x007d:
            r3.element = r4
            java.lang.Object r0 = r8.A00
            X.05G r0 = (X.AnonymousClass05G) r0
            r7.label = r6
            java.lang.Object r0 = r0.B6N(r9, r7)
            goto L_0x009f
        L_0x008a:
            X.AnonymousClass0AN.A00(r7)
            java.lang.Object r0 = r8.A00
            X.0fC r0 = (X.C10770fC) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r8.A02
            X.05G r1 = (X.AnonymousClass05G) r1
            r6.label = r3
        L_0x009b:
            java.lang.Object r0 = r1.B6N(r9, r6)
        L_0x009f:
            if (r0 != r2) goto L_0x0057
            return r2
        L_0x00a2:
            java.lang.Object r0 = r8.A01
            X.03v r0 = (X.C009003v) r0
            r6.L$0 = r8
            r6.L$1 = r9
            r6.label = r4
            java.lang.Object r7 = r0.invoke(r9, r6)
            if (r7 != r2) goto L_0x00bc
            return r2
        L_0x00b3:
            java.lang.Object r9 = r6.L$1
            java.lang.Object r1 = r6.L$0
            X.0tF r1 = (X.C18490tF) r1
            X.AnonymousClass0AN.A00(r7)
        L_0x00bc:
            boolean r0 = X.AnonymousClass000.A1X(r7)
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = r1.A00
            X.0fC r0 = (X.C10770fC) r0
            r0.element = r3
            java.lang.Object r1 = r1.A02
            X.05G r1 = (X.AnonymousClass05G) r1
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r5
            goto L_0x009b
        L_0x00d4:
            X.0kN r7 = new X.0kN
            r7.<init>(r8, r10)
            goto L_0x0049
        L_0x00db:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18490tF.B6N(java.lang.Object, X.09x):java.lang.Object");
    }
}
