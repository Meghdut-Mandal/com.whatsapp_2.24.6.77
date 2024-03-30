package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1K2  reason: invalid class name */
public final class AnonymousClass1K2 {
    public static int A00 = -1;

    public static int A00(C21060yb r6) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int A01 = AnonymousClass1K0.A01();
        if (A01 >= 1) {
            int i3 = 2008;
            if (A01 != 1) {
                i3 = 2012;
                if (A01 <= 3) {
                    i3 = 2011;
                }
            }
            arrayList.add(Integer.valueOf(i3));
        }
        long A002 = (long) AnonymousClass1K0.A00();
        if (A002 != -1) {
            if (A002 <= 528000) {
                i2 = 2008;
            } else if (A002 <= 620000) {
                i2 = 2009;
            } else if (A002 <= 1020000) {
                i2 = 2010;
            } else if (A002 <= 1220000) {
                i2 = 2011;
            } else if (A002 <= 1520000) {
                i2 = 2012;
            } else {
                i2 = 2014;
                if (A002 <= 2020000) {
                    i2 = 2013;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        long A02 = AnonymousClass1K0.A02(r6);
        if (A02 > 0) {
            if (A02 <= 201326592) {
                i = 2008;
            } else if (A02 <= 304087040) {
                i = 2009;
            } else if (A02 <= 536870912) {
                i = 2010;
            } else if (A02 <= 1073741824) {
                i = 2011;
            } else if (A02 <= 1610612736) {
                i = 2012;
            } else {
                i = 2014;
                if (A02 <= 2147483648L) {
                    i = 2013;
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        int size = arrayList.size() & 1;
        int size2 = arrayList.size() / 2;
        if (size == 1) {
            return ((Number) arrayList.get(size2)).intValue();
        }
        int i4 = size2 - 1;
        return ((Number) arrayList.get(i4)).intValue() + ((((Number) arrayList.get(i4 + 1)).intValue() - ((Number) arrayList.get(i4)).intValue()) / 2);
    }

    public static int A01(C21060yb r5, C19890wg r6) {
        int i = A00;
        if (i != -1) {
            return i;
        }
        synchronized (AnonymousClass1K2.class) {
            SharedPreferences A002 = r6.A00(C19430v1.A0A);
            int i2 = A002.getInt("year_class_cached_value_pref", -1);
            if (i2 == -1) {
                int A003 = A00(r5);
                A002.edit().putInt("year_class_cached_value_pref", A003).apply();
                A00 = A003;
                return A003;
            }
            A00 = i2;
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (X.AnonymousClass1K0.A00() < 1800000) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C21060yb r8, X.C19890wg r9) {
        /*
            java.lang.String r0 = X.C19430v1.A0A
            android.content.SharedPreferences r4 = r9.A00(r0)
            java.lang.String r3 = "year_class_cached_value_2016_pref"
            r1 = -1
            int r0 = r4.getInt(r3, r1)
            if (r0 != r1) goto L_0x0088
            long r6 = X.AnonymousClass1K0.A02(r8)
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            int r5 = A00(r8)
        L_0x001d:
            android.content.SharedPreferences$Editor r0 = r4.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r5)
            r0.apply()
            return r5
        L_0x0029:
            r1 = 805306368(0x30000000, double:3.97874211E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
            int r1 = X.AnonymousClass1K0.A01()
            r0 = 1
            r5 = 2010(0x7da, float:2.817E-42)
            if (r1 > r0) goto L_0x001d
            r5 = 2009(0x7d9, float:2.815E-42)
            goto L_0x001d
        L_0x003c:
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            r5 = 2012(0x7dc, float:2.82E-42)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            int r1 = X.AnonymousClass1K0.A00()
            r0 = 1300000(0x13d620, float:1.821688E-39)
            if (r1 >= r0) goto L_0x001d
            r5 = 2011(0x7db, float:2.818E-42)
            goto L_0x001d
        L_0x0051:
            r1 = 1610612736(0x60000000, double:7.957484216E-315)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0062
            int r1 = X.AnonymousClass1K0.A00()
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r1 >= r0) goto L_0x0085
            goto L_0x001d
        L_0x0062:
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            r1 = 3221225472(0xc0000000, double:1.591496843E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            r5 = 2014(0x7de, float:2.822E-42)
            goto L_0x001d
        L_0x0077:
            r1 = 5368709120(0x140000000, double:2.6524947387E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r5 = 2016(0x7e0, float:2.825E-42)
            if (r0 > 0) goto L_0x001d
            r5 = 2015(0x7df, float:2.824E-42)
            goto L_0x001d
        L_0x0085:
            r5 = 2013(0x7dd, float:2.821E-42)
            goto L_0x001d
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K2.A02(X.0yb, X.0wg):int");
    }
}
