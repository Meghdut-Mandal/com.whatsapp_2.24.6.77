package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.UUID;

/* renamed from: X.A0b  reason: case insensitive filesystem */
public final class C20944A0b implements B2G {
    public long A00;
    public C199519fS A01 = C199519fS.A05;
    public boolean A02;
    public long A03;
    public final B40 A04;

    public void A00() {
        if (this.A02) {
            A01(BG6());
            this.A02 = false;
        }
    }

    public void A01(long j) {
        this.A03 = j;
        if (this.A02) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public long BG6() {
        long j;
        long j2 = this.A03;
        if (!this.A02) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C199519fS r4 = this.A01;
        if (r4.A01 == 1.0f) {
            UUID uuid = AnonymousClass9B7.A04;
            j = Util.A04(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) r4.A02);
        }
        return j2 + j;
    }

    public C199519fS Brd(C199519fS r3) {
        if (this.A02) {
            A01(BG6());
        }
        this.A01 = r3;
        return r3;
    }

    public C20944A0b(B40 b40) {
        this.A04 = b40;
    }

    public C199519fS BFz() {
        return this.A01;
    }
}
