package X;

import java.util.regex.Pattern;

/* renamed from: X.6Ri  reason: invalid class name and case insensitive filesystem */
public abstract class C131926Ri {
    public static final Pattern A00 = Pattern.compile("[#0,.-]+");
    public static final String A01;

    public static String A01(C122465ut r3, C130766Mi r4, C130766Mi r5, C130766Mi r6, C130766Mi r7, String str, String str2, String str3, String str4) {
        String replaceFirst;
        String str5;
        if (r3.A03) {
            replaceFirst = r3.A01;
            str5 = A00.matcher(r3.A02).replaceFirst(str4);
        } else {
            replaceFirst = A00.matcher(r3.A01).replaceFirst(str4);
            str5 = r3.A02;
        }
        if (!replaceFirst.isEmpty() && r7.A00(replaceFirst.codePointBefore(replaceFirst.length())) && r6.A00(str3.codePointAt(0))) {
            replaceFirst = C36321k7.A0D(replaceFirst, str2);
        }
        if (!str5.isEmpty() && r5.A00(str5.codePointAt(0)) && r4.A00(str3.codePointBefore(str3.length()))) {
            str5 = C36321k7.A0D(str, str5);
        }
        return C90464aC.A0e(replaceFirst, str3, str5);
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("¤");
        A0u.append(C19430v1.A09);
        A01 = AnonymousClass000.A0q("#,##0.00", A0u);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C1261062o A00(X.C18820ts r2, boolean r3) {
        /*
            java.util.Locale r0 = X.C36401kF.A0x(r2)
            java.lang.String r1 = X.C26621Kw.A01(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 1632: goto L_0x0040;
                case 1776: goto L_0x0036;
                case 2406: goto L_0x002c;
                case 2534: goto L_0x0022;
                default: goto L_0x000f;
            }
        L_0x000f:
            r1 = 5
        L_0x0010:
            java.lang.String r1 = r2.A0A(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = A01
        L_0x001c:
            X.62o r0 = new X.62o
            r0.<init>(r1, r3)
            return r0
        L_0x0022:
            java.lang.String r0 = "০"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 3
            goto L_0x0010
        L_0x002c:
            java.lang.String r0 = "०"
            boolean r0 = r1.equals(r0)
            r1 = 4
            if (r0 != 0) goto L_0x0010
            goto L_0x000f
        L_0x0036:
            java.lang.String r0 = "۰"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 2
            goto L_0x0010
        L_0x0040:
            java.lang.String r0 = "٠"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131926Ri.A00(X.0ts, boolean):X.62o");
    }
}
