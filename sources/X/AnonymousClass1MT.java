package X;

import android.content.SharedPreferences;

/* renamed from: X.1MT  reason: invalid class name */
public class AnonymousClass1MT {
    public final AnonymousClass1MU A00 = new AnonymousClass1MU();
    public final C21100yf A01;
    public final C19970wo A02;
    public final C19420v0 A03;

    public synchronized void A00() {
        this.A00.A01++;
    }

    public synchronized void A01() {
        AnonymousClass1MU r3 = this.A00;
        r3.A00 = 0;
        r3.A02 = 0;
        r3.A01 = 0;
    }

    public boolean A02() {
        C19420v0 r3 = this.A03;
        boolean contains = ((SharedPreferences) r3.A00.get()).contains("c2dm_reg_id");
        if (this.A01.A09(C21100yf.A0w) || !contains || r3.A0H() >= 3) {
            return false;
        }
        return true;
    }

    public AnonymousClass1MT(C21100yf r2, C19970wo r3, C19420v0 r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
