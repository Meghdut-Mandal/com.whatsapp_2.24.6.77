package X;

/* renamed from: X.5G4  reason: invalid class name */
public abstract class AnonymousClass5G4 extends AnonymousClass5G6 {
    public AnonymousClass66U A00;
    public final AnonymousClass60Z A01;

    public void B1S(String str) {
        AnonymousClass00C.A0D(str, 0);
        super.B1S(str);
        this.A00 = this.A01.A00(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass6PH r6, java.lang.String r7, java.util.Map r8) {
        /*
            r5 = this;
            X.5Te r4 = X.C108355Te.ERROR
            java.lang.String r0 = r4.key
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r0 = "fcsLoadingEventManager"
            r3 = 0
            if (r1 != 0) goto L_0x001e
            if (r6 != 0) goto L_0x001e
            X.66U r1 = r5.A00
            if (r1 != 0) goto L_0x0018
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0018:
            java.lang.String r0 = "onLoadingCompletion"
            r1.A01(r3, r0, r7, r3)
            return
        L_0x001e:
            X.66U r2 = r5.A00
            if (r2 != 0) goto L_0x0027
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0027:
            java.lang.String r0 = r4.key
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0034
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
        L_0x0034:
            java.lang.String r0 = "onLoadingFailure"
            r2.A01(r6, r0, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5G4.A0A(X.6PH, java.lang.String, java.util.Map):void");
    }

    public AnonymousClass5G4(C116145k1 r1, AnonymousClass60Z r2, C105705Fs r3) {
        super(r1, r3);
        this.A01 = r2;
    }
}
