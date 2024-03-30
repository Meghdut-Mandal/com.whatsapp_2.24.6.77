package X;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9k4  reason: invalid class name and case insensitive filesystem */
public final class C201659k4 {
    public HashSet A00;
    public final C20810yC A01;
    public final C24601Db A02;
    public final AnonymousClass16T A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = (X.C175818b6) r4.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C175748az r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0018
            X.0yC r1 = r3.A01
            r0 = 5724(0x165c, float:8.021E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0018
            X.8bF r0 = r4.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201659k4.A05(X.8az):boolean");
    }

    public static boolean A00(C207249un r3, String str) {
        C175898bF r1 = r3.A08;
        if (!(r1 instanceof C175818b6)) {
            return false;
        }
        boolean equals = "p2m".equals(str);
        if ((!"OD_UNSECURED".equals(((C175818b6) r1).A0A)) || equals) {
            return false;
        }
        return true;
    }

    public AnonymousClass16X A02(String str, String str2, String str3) {
        BigDecimal A0b;
        AnonymousClass16U A012 = this.A03.A01("INR");
        if (!TextUtils.isEmpty(str)) {
            A0b = C165617ti.A0b(str);
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return ((AnonymousClass16W) A012).A00;
        } else {
            A0b = C165617ti.A0b(str3);
        }
        return new AnonymousClass16X(A0b, ((AnonymousClass16V) A012).A01);
    }

    public String A04(C207249un r4) {
        Object obj = r4.A09.A00;
        C18740tg.A06(obj);
        String str = (String) obj;
        if (A06(r4)) {
            return str.replaceAll("X{8}", "••");
        }
        return C203449o2.A04(str);
    }

    public boolean A06(C207249un r3) {
        C175898bF r1;
        if (r3 == null || (r1 = r3.A08) == null || !(r1 instanceof C175848bA)) {
            return false;
        }
        return A08(((C175818b6) r1).A0A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C207249un r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            X.8bF r1 = r6.A08
            boolean r0 = r1 instanceof X.C175818b6
            if (r0 == 0) goto L_0x0061
            X.8b6 r1 = (X.C175818b6) r1
            java.lang.String r0 = r1.A0A
            boolean r0 = r5.A08(r0)
            if (r0 == 0) goto L_0x0061
            java.util.HashSet r0 = r5.A00
            if (r0 != 0) goto L_0x0032
            X.0yC r1 = r5.A01
            r0 = 5210(0x145a, float:7.301E-42)
            java.lang.String r1 = r1.A09(r0)
            if (r1 != 0) goto L_0x005a
            java.lang.String r4 = "7409"
            java.lang.String r3 = "7408"
            java.lang.String r2 = "6211"
            java.lang.String r1 = "6012"
            java.lang.String r0 = "7407"
            java.lang.String[] r0 = new java.lang.String[]{r4, r3, r2, r1, r0}
        L_0x002c:
            java.util.HashSet r0 = X.C36421kH.A0g(r0)
            r5.A00 = r0
        L_0x0032:
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r1 = X.C023109s.A01
        L_0x003a:
            java.lang.Integer r0 = X.C023109s.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.Integer r0 = X.C023109s.A0C
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            return r0
        L_0x004d:
            if (r9 != 0) goto L_0x0055
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0057
        L_0x0055:
            if (r8 == 0) goto L_0x0061
        L_0x0057:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x003a
        L_0x005a:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            goto L_0x002c
        L_0x0061:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201659k4.A07(X.9un, java.lang.String, boolean, boolean):boolean");
    }

    public boolean A08(String str) {
        if (!this.A01.A0E(4638) || !"CREDIT".equals(str)) {
            return false;
        }
        return true;
    }

    public boolean A09(String str) {
        C20810yC r2 = this.A01;
        String A09 = r2.A09(7843);
        if (!r2.A0E(4638) || str == null || !A09.contains(str)) {
            return false;
        }
        return true;
    }

    public C201659k4(AnonymousClass16T r1, C20810yC r2, C24601Db r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r1;
    }

    public static boolean A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C175818b6 r0 = (C175818b6) C165607th.A0S(it).A08;
            if (r0 != null && r0.A0G) {
                return true;
            }
        }
        return false;
    }

    public String A03(C207249un r5) {
        String str;
        String A04 = A04(r5);
        String str2 = r5.A0B;
        boolean A06 = A06(r5);
        Object[] A1b = C36411kG.A1b(str2);
        A1b[1] = A04;
        if (A06) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        return String.format(str, A1b);
    }
}
