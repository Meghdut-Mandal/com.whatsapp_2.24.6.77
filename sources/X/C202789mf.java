package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: X.9mf  reason: invalid class name and case insensitive filesystem */
public abstract class C202789mf {
    public static final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6.isConnected() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9WR A01(android.net.ConnectivityManager r7) {
        /*
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            android.net.NetworkInfo r6 = r7.getActiveNetworkInfo()
            r5 = 1
            if (r6 == 0) goto L_0x0012
            boolean r0 = r6.isConnected()
            r4 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 23
            if (r1 < r0) goto L_0x0034
            android.net.Network r0 = X.AnonymousClass93U.A00(r7)     // Catch:{ SecurityException -> 0x0029 }
            android.net.NetworkCapabilities r0 = A00(r7, r0)     // Catch:{ SecurityException -> 0x0029 }
            if (r0 == 0) goto L_0x0034
            boolean r3 = A04(r0)     // Catch:{ SecurityException -> 0x0029 }
            goto L_0x0034
        L_0x0029:
            r2 = move-exception
            X.AnonymousClass6VD.A00()
            java.lang.String r1 = A00
            java.lang.String r0 = "Unable to validate active network"
            android.util.Log.e(r1, r0, r2)
        L_0x0034:
            boolean r1 = A03(r7)
            if (r6 == 0) goto L_0x0046
            boolean r0 = r6.isRoaming()
            if (r0 != 0) goto L_0x0046
        L_0x0040:
            X.9WR r0 = new X.9WR
            r0.<init>(r4, r3, r1, r5)
            return r0
        L_0x0046:
            r5 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202789mf.A01(android.net.ConnectivityManager):X.9WR");
    }

    static {
        String A01 = AnonymousClass6VD.A01("NetworkStateTracker");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }

    public static final AnonymousClass9YC A02(Context context, AnonymousClass7eB r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1684080m(context, r3);
        }
        return new C1683880k(context, r3);
    }

    public static final boolean A04(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(16);
    }

    public static final NetworkCapabilities A00(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static boolean A03(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
