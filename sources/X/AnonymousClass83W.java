package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Process;

/* renamed from: X.83W  reason: invalid class name */
public class AnonymousClass83W extends C199189eq {
    public static final int A05 = Process.myUid();
    public BroadcastReceiver A00 = new C23131B6m(this, 4);
    public int A01;
    public boolean A02 = true;
    public final ConnectivityManager A03;
    public final long[] A04 = new long[8];

    public synchronized void A04() {
        int i = A05;
        long uidTxBytes = TrafficStats.getUidTxBytes(i);
        long uidRxBytes = TrafficStats.getUidRxBytes(i);
        if (uidRxBytes == -1 || uidTxBytes == -1) {
            this.A02 = false;
        } else {
            char c = 2;
            if (this.A01 == 1) {
                c = 0;
            }
            long[] jArr = this.A04;
            long j = jArr[3] + jArr[1];
            long j2 = jArr[2] + jArr[0];
            char c2 = c | 1;
            jArr[c2] = jArr[c2] + (uidTxBytes - j);
            char c3 = 0 | c;
            jArr[c3] = jArr[c3] + (uidRxBytes - j2);
        }
    }

    public AnonymousClass83W(Context context) {
        int type;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A03 = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        this.A01 = type;
        C26981Mg.A01(this.A00, context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), true);
        A04();
    }
}
