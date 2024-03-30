package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedList;

/* renamed from: X.1On  reason: invalid class name and case insensitive filesystem */
public class C27521On {
    public static final int[] A01 = {0, 0, 0, 2000, 5000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, 40000, 80000, 160000};
    public LinkedList A00;

    public synchronized long A00() {
        LinkedList linkedList = this.A00;
        int size = linkedList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) linkedList.get(size)).longValue();
            long j = (long) A01[Math.min(size + 1, 9)];
            if (j > elapsedRealtime) {
                if (size > 0) {
                    return (((Long) linkedList.get(size)).longValue() + j) - SystemClock.elapsedRealtime();
                }
            }
        }
        return 0;
    }

    public C27521On() {
        synchronized (this) {
            this.A00 = new LinkedList();
        }
    }
}
