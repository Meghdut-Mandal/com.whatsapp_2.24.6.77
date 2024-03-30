package X;

import android.os.SystemClock;

/* renamed from: X.6Ea  reason: invalid class name and case insensitive filesystem */
public class C128896Ea {
    public long A00;
    public boolean A01;
    public long A02;

    public void A00() {
        if (this.A01) {
            this.A00 += SystemClock.elapsedRealtime() - this.A02;
            this.A02 = 0;
            this.A01 = false;
        }
    }

    public void A01() {
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = false;
    }

    public String toString() {
        return String.valueOf(this.A00);
    }

    public void A02() {
        this.A02 = SystemClock.elapsedRealtime();
        this.A01 = true;
    }
}
