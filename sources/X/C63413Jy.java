package X;

import android.os.SystemClock;

/* renamed from: X.3Jy  reason: invalid class name and case insensitive filesystem */
public final class C63413Jy {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final C19970wo A04;

    public final long A00() {
        long j = this.A01;
        if (this.A03) {
            return j + (SystemClock.elapsedRealtime() - this.A02);
        }
        return j;
    }

    public final void A01() {
        if (!this.A03) {
            this.A02 = SystemClock.elapsedRealtime();
        }
        this.A03 = true;
    }

    public final void A02() {
        if (this.A03) {
            this.A01 += SystemClock.elapsedRealtime() - this.A02;
        }
        this.A03 = false;
    }

    public C63413Jy(C19970wo r1, long j) {
        this.A00 = j;
        this.A04 = r1;
    }
}
