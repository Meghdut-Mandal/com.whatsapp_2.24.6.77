package X;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9mh  reason: invalid class name and case insensitive filesystem */
public abstract class C202809mh {
    public static final BigDecimal A00 = C165617ti.A0b("100");

    public static final String A00(C18820ts r2, long j) {
        AnonymousClass00C.A0D(r2, 1);
        String format = DateFormat.getDateInstance(2, C36401kF.A0x(r2)).format(Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
        AnonymousClass00C.A08(format);
        return format;
    }

    public static final BigDecimal A01(C206799tz r4, BigDecimal bigDecimal) {
        AnonymousClass00C.A0D(r4, 0);
        BigDecimal A0b = C165617ti.A0b(r4.A03);
        BigDecimal add = bigDecimal.multiply(A0b).add(bigDecimal.multiply(A0b).multiply(C165617ti.A0b(r4.A05).divide(A00)));
        AnonymousClass00C.A08(add);
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return r3.A0E(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C20810yC r3, java.lang.String r4) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r2 = 0
            if (r4 == 0) goto L_0x0022
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0022
            r0 = 2617(0xa39, float:3.667E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0022
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.C36431kI.A1D(r0, r4)
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0023;
                case 3008417: goto L_0x002e;
                case 3197625: goto L_0x0039;
                case 100023093: goto L_0x0044;
                default: goto L_0x0022;
            }
        L_0x0022:
            return r2
        L_0x0023:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2740(0xab4, float:3.84E-42)
            goto L_0x004e
        L_0x002e:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2741(0xab5, float:3.841E-42)
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2742(0xab6, float:3.842E-42)
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2739(0xab3, float:3.838E-42)
        L_0x004e:
            boolean r2 = r3.A0E(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202809mh.A02(X.0yC, java.lang.String):boolean");
    }

    public static final boolean A03(C20810yC r6, String str) {
        boolean A1a = C36341k9.A1a(str, r6);
        String A19 = C36431kI.A19(r6, 2944);
        if (A19.length() != 0) {
            for (String A07 : (String[]) C90494aF.A0i(A19, ",").toArray(new String[0])) {
                if (AnonymousClass098.A07(str, A07, false)) {
                    return A1a;
                }
            }
        }
        return false;
    }
}
