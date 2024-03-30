package X;

import java.math.BigDecimal;

/* renamed from: X.8TC  reason: invalid class name */
public class AnonymousClass8TC extends C200269h0 {
    public static AnonymousClass8TC A01 = new AnonymousClass8TC((BigDecimal) null);
    public final BigDecimal A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = ((X.C200269h0) r5).A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0022
            boolean r0 = r5 instanceof X.AnonymousClass8TC
            r1 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r5 instanceof X.AnonymousClass8T8
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            X.9h0 r5 = (X.C200269h0) r5
            X.8TC r2 = r5.A03()
            X.8TC r0 = A01
            if (r2 == r0) goto L_0x000c
            java.math.BigDecimal r1 = r4.A00
            java.math.BigDecimal r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x0022
            r3 = 0
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8TC.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass8TC(CharSequence charSequence) {
        this.A00 = C165617ti.A0b(charSequence.toString());
    }

    public static int A00(C200269h0 r1, C200269h0 r2) {
        return r1.A03().A00.compareTo(r2.A03().A00);
    }

    public AnonymousClass8TC(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }
}
