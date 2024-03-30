package X;

import android.os.PowerManager;

/* renamed from: X.1BN  reason: invalid class name */
public class AnonymousClass1BN {
    public final C21060yb A00;
    public volatile Boolean A01;

    public boolean A00() {
        boolean isPowerSaveMode;
        if (this.A01 == null) {
            PowerManager A0G = this.A00.A0G();
            if (A0G == null) {
                isPowerSaveMode = true;
            } else {
                isPowerSaveMode = A0G.isPowerSaveMode();
            }
            this.A01 = Boolean.valueOf(isPowerSaveMode);
        }
        return this.A01.booleanValue();
    }

    public AnonymousClass1BN(C21060yb r1) {
        this.A00 = r1;
    }
}
