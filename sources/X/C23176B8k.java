package X;

import java.util.Comparator;

/* renamed from: X.B8k  reason: case insensitive filesystem */
public class C23176B8k implements Comparator {
    public Object A00;
    public final int A01;

    public C23176B8k(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        return r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        return X.AnonymousClass000.A0I(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ int compare(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0053;
                case 2: goto L_0x0060;
                case 3: goto L_0x0071;
                case 4: goto L_0x007e;
                case 5: goto L_0x0088;
                case 6: goto L_0x0097;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.9un r10 = (X.C207249un) r10
            X.9un r11 = (X.C207249un) r11
            X.8bF r0 = r10.A08
            X.8bB r0 = (X.C175858bB) r0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x001d
            long r5 = r0.A06
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            r3 = r5
        L_0x001d:
            X.8bF r0 = r11.A08
            X.8bB r0 = (X.C175858bB) r0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0031
            long r7 = r0.A06
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r5 = r7
        L_0x0031:
            int r1 = java.lang.Long.compare(r3, r5)
        L_0x0035:
            return r1
        L_0x0036:
            X.00I r10 = (X.AnonymousClass00I) r10
            X.00I r11 = (X.AnonymousClass00I) r11
            java.lang.Object r0 = r10.A01
            float r2 = X.C36441kJ.A03(r0)
            java.lang.Object r0 = r11.A01
            float r1 = X.C36441kJ.A03(r0)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            r1 = 1
            return r1
        L_0x004c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0035
            r1 = -1
            return r1
        L_0x0053:
            java.lang.Object r0 = r9.A00
            X.9dS r0 = (X.C198379dS) r0
            int r1 = r0.A00(r11)
            int r0 = r0.A00(r10)
            goto L_0x0086
        L_0x0060:
            java.io.File r10 = (java.io.File) r10
            java.io.File r11 = (java.io.File) r11
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = r11.getName()
            int r1 = r1.compareTo(r0)
            return r1
        L_0x0071:
            X.9l7 r10 = (X.C202149l7) r10
            X.9l7 r11 = (X.C202149l7) r11
            boolean r0 = r10.A08
            r1 = r0 ^ 1
            boolean r0 = r11.A08
            r0 = r0 ^ 1
            goto L_0x0086
        L_0x007e:
            X.9l7 r10 = (X.C202149l7) r10
            X.9l7 r11 = (X.C202149l7) r11
            boolean r1 = r10.A08
            boolean r0 = r11.A08
        L_0x0086:
            int r1 = r1 - r0
            return r1
        L_0x0088:
            java.lang.Object r1 = r9.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.Aoe r1 = (X.C22553Aoe) r1
            java.lang.Object r0 = r1.invoke(r10, r11)
            goto L_0x00a5
        L_0x0097:
            java.lang.Object r1 = r9.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.Aof r1 = (X.C22554Aof) r1
            java.lang.Object r0 = r1.invoke(r10, r11)
        L_0x00a5:
            int r1 = X.AnonymousClass000.A0I(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23176B8k.compare(java.lang.Object, java.lang.Object):int");
    }
}
