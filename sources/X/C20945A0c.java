package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;

/* renamed from: X.A0c  reason: case insensitive filesystem */
public final class C20945A0c implements B2G {
    public long A00;
    public boolean A01;
    public long A02;
    public C199519fS A03 = C199519fS.A05;
    public final B40 A04;

    public synchronized void A00() {
        if (this.A01) {
            A01(BG6());
            this.A01 = false;
        }
    }

    public synchronized void A01(long j) {
        this.A02 = j;
        if (this.A01) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public synchronized long BG6() {
        long j;
        long j2;
        j = this.A02;
        if (this.A01) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
            C199519fS r4 = this.A03;
            if (r4.A01 == 1.0f) {
                UUID uuid = AnonymousClass9B7.A04;
                j2 = Util.A04(elapsedRealtime);
            } else {
                j2 = elapsedRealtime * ((long) r4.A02);
            }
            j += j2;
        }
        return j;
    }

    public synchronized C199519fS Brd(C199519fS r3) {
        if (this.A01) {
            A01(BG6());
        }
        this.A03 = r3;
        return r3;
    }

    public C20945A0c(B40 b40) {
        this.A04 = b40;
    }

    public C199519fS BFz() {
        return this.A03;
    }
}
