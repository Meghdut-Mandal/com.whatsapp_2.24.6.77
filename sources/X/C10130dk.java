package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0dk  reason: invalid class name and case insensitive filesystem */
public final class C10130dk implements C17610rh, C17620ri {
    public final /* synthetic */ C10300e1 A00;

    public /* synthetic */ C10130dk(C10300e1 r1) {
        this.A00 = r1;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        C10300e1 r2 = this.A00;
        AnonymousClass006.A01(r2.A0E);
        C17580re r1 = r2.A01;
        AnonymousClass006.A01(r1);
        r1.Bxt(new AnonymousClass0N1(r2));
    }

    public final void onConnectionFailed(AnonymousClass0L0 r4) {
        C10300e1 r2 = this.A00;
        Lock lock = r2.A0G;
        lock.lock();
        try {
            if (!r2.A02 || r4.A00()) {
                C10300e1.A02(r4, r2);
            } else {
                C10300e1.A03(r2);
                C10300e1.A04(r2);
            }
        } finally {
            lock.unlock();
        }
    }
}
