package X;

import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.9Xx  reason: invalid class name and case insensitive filesystem */
public final class C196149Xx {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C22858AxA A08;
    public final Timeline A09;
    public final C209329zp A0A;
    public final B40 A0B;

    public synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public void A00() {
        C200319h9.A02(!this.A07);
        this.A07 = true;
        C209329zp r2 = this.A0A;
        synchronized (r2) {
            if (r2.A0N) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A03(false);
            } else {
                AnonymousClass9QI.A00(r2.A0g, this, 14);
            }
        }
    }

    public void A01(int i) {
        C200319h9.A02(!this.A07);
        this.A01 = i;
    }

    public void A02(Object obj) {
        C200319h9.A02(!this.A07);
        this.A04 = obj;
    }

    public C196149Xx(Looper looper, C209329zp r4, C22858AxA axA, Timeline timeline, B40 b40, int i) {
        this.A0A = r4;
        this.A08 = axA;
        this.A09 = timeline;
        this.A03 = looper;
        this.A0B = b40;
        this.A00 = i;
    }
}
