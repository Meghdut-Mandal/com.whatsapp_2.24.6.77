package X;

/* renamed from: X.0mC  reason: invalid class name and case insensitive filesystem */
public final class C14790mC extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C14050ks $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14790mC(C14050ks r2) {
        super(2);
        this.$this_checkContext = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r2 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r3 = X.AnonymousClass000.A0I(r5)
            X.02i r6 = (X.C005202i) r6
            X.02p r1 = r6.getKey()
            X.0ks r0 = r4.$this_checkContext
            X.02h r0 = r0.collectContext
            X.02i r2 = r0.get(r1)
            X.03x r0 = X.C007403e.A00
            if (r1 == r0) goto L_0x001f
            if (r6 == r2) goto L_0x0034
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x001a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x001f:
            X.03e r6 = (X.C007403e) r6
        L_0x0021:
            if (r6 != 0) goto L_0x0029
            r6 = 0
        L_0x0024:
            if (r6 != r2) goto L_0x0037
            if (r2 != 0) goto L_0x0034
            goto L_0x001a
        L_0x0029:
            if (r6 == r2) goto L_0x0024
            boolean r0 = r6 instanceof X.C15540nV
            if (r0 == 0) goto L_0x0024
            X.03e r6 = r6.BF2()
            goto L_0x0021
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0037:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", expected child of "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14790mC.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
