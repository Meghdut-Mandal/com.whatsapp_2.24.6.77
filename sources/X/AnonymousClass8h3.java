package X;

import java.util.Map;

/* renamed from: X.8h3  reason: invalid class name */
public final class AnonymousClass8h3 extends C194679Qr {
    public Map A00;
    public final AnonymousClass1K9 A01;
    public final AnonymousClass61B A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final C198479dd A07;
    public final String A08;
    public final Map A09;
    public final Map A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r1 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C194419Pp r6, X.AnonymousClass8h3 r7, X.AnonymousClass6PH r8, java.util.Map r9, java.util.Map r10) {
        /*
            if (r8 == 0) goto L_0x002e
            java.lang.String r1 = r8.A02
            X.9dd r0 = r7.A07
            if (r0 == 0) goto L_0x000e
            java.lang.String r5 = r0.A00(r1)
            if (r5 != 0) goto L_0x0030
        L_0x000e:
            X.9oP r2 = r6.A00
            X.9XM r1 = r2.A06
            if (r1 == 0) goto L_0x002a
            X.9S8 r0 = r2.A01
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "flowManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001f:
            java.util.Stack r0 = r0.A03
            java.lang.Object r0 = X.C165607th.A0n(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.A01(r0)
        L_0x002a:
            X.C203619oP.A06(r2, r8, r10)
            return
        L_0x002e:
            java.lang.String r5 = r7.A00
        L_0x0030:
            if (r9 != 0) goto L_0x0036
            X.00f r9 = X.C000400e.A0D()
        L_0x0036:
            java.util.Map r0 = r7.A09
            java.util.Map r4 = X.C201769kM.A02(r9, r0)
            java.lang.String r3 = r7.A08
            if (r10 != 0) goto L_0x0044
            X.00f r10 = X.C000400e.A0D()
        L_0x0044:
            java.util.Map r0 = r7.A0A
            X.9I7 r2 = new X.9I7
            r2.<init>(r10)
            if (r0 == 0) goto L_0x0058
            java.lang.Object r1 = X.C201769kM.A00(r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r1 != 0) goto L_0x005a
        L_0x0058:
            java.util.Map r1 = r2.A01
        L_0x005a:
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = X.C201769kM.A01(r3, r4, r1)
            r6.A00(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8h3.A00(X.9Pp, X.8h3, X.6PH, java.util.Map, java.util.Map):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8h3(AnonymousClass1K9 r2, C198479dd r3, AnonymousClass61B r4, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        super(str, str2);
        C36321k7.A11(r4, r2, str);
        AnonymousClass00C.A0D(str4, 10);
        C36341k9.A1G(str5, str6);
        this.A02 = r4;
        this.A01 = r2;
        this.A09 = map;
        this.A06 = map2;
        this.A0A = map3;
        this.A08 = str3;
        this.A07 = r3;
        this.A04 = str4;
        this.A05 = str5;
        this.A03 = str6;
    }
}
