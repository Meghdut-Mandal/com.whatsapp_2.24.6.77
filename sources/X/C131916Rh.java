package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.6Rh  reason: invalid class name and case insensitive filesystem */
public abstract class C131916Rh {
    public static volatile boolean A00;
    public static volatile boolean A01;

    public static void A01(String str, String str2, Object... objArr) {
        if (A00) {
            Log.w(str, String.format(str2, objArr));
        } else if (!A01) {
            Log.d(str, String.format(str2, objArr));
        }
    }

    public static String A00(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String lastPathSegment;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!z2 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (uri != null && "127.0.0.1".equals(uri.getHost())) {
                uri = Uri.parse(uri.getQueryParameter("remote-uri"));
            }
            if (str == null && z) {
                str = Integer.toHexString(uri.hashCode());
            }
            A0u.append(str2);
            if (z3 && !z5) {
                A0u.append("_t");
            }
            A0u.append(".");
            A0u.append(str);
            A0u.append(".");
            if (!z4 || uri.getLastPathSegment() == null) {
                lastPathSegment = uri.getLastPathSegment();
            } else {
                lastPathSegment = uri.getLastPathSegment().substring(uri.getLastPathSegment().lastIndexOf(47) + 1);
            }
            A0u.append(lastPathSegment);
        } else {
            A0u.append(str2);
            if (z3 && !z5) {
                A0u.append("_t");
            }
            A0u.append(".");
            A0u.append(str);
        }
        return A0u.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0027 A[LOOP:0: B:5:0x0027->B:8:0x0031, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.util.TreeMap r4, int r5, long r6, long r8) {
        /*
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r4.floorKey(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.get(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 < r5) goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0 = 0
            java.util.NavigableMap r0 = r4.subMap(r3, r0, r1, r2)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0015
            int r0 = X.C36341k9.A0A(r1)
            if (r0 < r5) goto L_0x0027
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131916Rh.A02(java.util.TreeMap, int, long, long):void");
    }
}
