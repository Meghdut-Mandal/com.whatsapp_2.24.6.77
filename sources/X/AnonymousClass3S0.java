package X;

import java.util.regex.Pattern;

/* renamed from: X.3S0  reason: invalid class name */
public class AnonymousClass3S0 {
    public static final AnonymousClass005 A03 = new C18910u1((Object) null, C81933xs.A00);
    public static final AnonymousClass005 A04 = new C18910u1((Object) null, C81953xu.A00);
    public static final AnonymousClass005 A05 = new C18910u1((Object) null, C81943xt.A00);
    public final AnonymousClass3U8 A00;
    public final AnonymousClass17X A01;
    public final AnonymousClass1VC A02;

    public boolean A00(AnonymousClass141 r3) {
        if (this.A02.A00.A04(C21100yf.A1F) == 20) {
            return true;
        }
        String A052 = AnonymousClass3U8.A05(C36351kA.A0j(r3));
        if (A052 == null) {
            return false;
        }
        return C36361kB.A1Z(A052, (Pattern) A03.get());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass11F r5) {
        /*
            r4 = this;
            X.1VC r0 = r4.A02
            X.0yf r1 = r0.A00
            X.0yh r0 = X.C21100yf.A1F
            int r1 = r1.A04(r0)
            r0 = 20
            boolean r0 = X.C36381kD.A1U(r1, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0066
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 == 0) goto L_0x0053
            X.147 r1 = X.C65533Sl.A02(r5)
            X.17X r0 = r4.A01
            X.17r r0 = r0.A07
            X.6X6 r0 = r0.A0C(r1)
            java.util.Map r0 = r0.A08
            java.util.Set r0 = r0.keySet()
            X.0y7 r0 = X.C20760y7.copyOf((java.util.Collection) r0)
            X.14x r2 = r0.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            X.11F r0 = X.C36401kF.A0a(r2)
            java.lang.String r1 = X.AnonymousClass3U8.A05(r0)
            if (r1 == 0) goto L_0x0051
            X.005 r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C36361kB.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0033
        L_0x0051:
            r0 = 0
            return r0
        L_0x0053:
            java.lang.String r1 = X.AnonymousClass3U8.A05(r5)
            if (r1 == 0) goto L_0x0051
            X.005 r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C36361kB.A1Z(r1, r0)
            return r0
        L_0x0066:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3S0.A01(X.11F):boolean");
    }

    public AnonymousClass3S0(AnonymousClass3U8 r1, AnonymousClass17X r2, AnonymousClass1VC r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
