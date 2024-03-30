package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import java.util.Deque;

/* renamed from: X.9cg  reason: invalid class name and case insensitive filesystem */
public class C197969cg {
    public VideoBandwidthEstimate A00;
    public Deque A01 = C90524aI.A0l();
    public Deque A02 = C90524aI.A0l();
    public boolean A03;
    public final B40 A04;

    public C197969cg(B40 b40) {
        this.A04 = b40;
        this.A00 = new VideoBandwidthEstimate();
        this.A03 = false;
    }

    public static void A00(C197969cg r12) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Deque deque = r12.A01;
            if (deque.size() > 10 && elapsedRealtime - ((AnonymousClass9GW) deque.getFirst()).A00 > 20000) {
                deque.removeFirst();
                r12.A03 = true;
            }
        }
        while (true) {
            Deque deque2 = r12.A02;
            if (deque2.size() > 10 && elapsedRealtime - ((AnonymousClass9GW) deque2.getFirst()).A00 > 20000) {
                deque2.removeFirst();
                r12.A03 = true;
            } else {
                return;
            }
        }
    }
}
