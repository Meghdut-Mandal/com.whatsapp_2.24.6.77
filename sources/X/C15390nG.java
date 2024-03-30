package X;

/* renamed from: X.0nG  reason: invalid class name and case insensitive filesystem */
public final class C15390nG extends C13130jD {
    public final C009003v A00;
    public final C009003v A01;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.C023509x r6, X.C18000sQ r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C13850kY
            if (r0 == 0) goto L_0x003d
            r4 = r6
            X.0kY r4 = (X.C13850kY) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x004a
            java.lang.Object r7 = r4.L$0
            X.0r3 r7 = (X.C17300r3) r7
            X.AnonymousClass0AN.A00(r3)
        L_0x0024:
            boolean r0 = r7.BLP()
            if (r0 == 0) goto L_0x0043
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002d:
            X.AnonymousClass0AN.A00(r3)
            r4.L$0 = r7
            r4.label = r0
            X.03v r0 = r5.A00
            java.lang.Object r0 = r0.invoke(r7, r4)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x003d:
            X.0kY r4 = new X.0kY
            r4.<init>(r6, r5)
            goto L_0x0012
        L_0x0043:
            java.lang.String r0 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15390nG.A00(X.09x, X.0sQ):java.lang.Object");
    }

    public C13130jD A04(Integer num, C005102h r4, int i) {
        return new C15390nG(num, r4, this.A01, i);
    }

    public C15390nG(Integer num, C005102h r2, C009003v r3, int i) {
        super(num, r2, i);
        this.A00 = r3;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("block[");
        A0u.append(this.A00);
        A0u.append("] -> ");
        return AnonymousClass000.A0q(super.toString(), A0u);
    }
}
