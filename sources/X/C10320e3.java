package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e3  reason: invalid class name and case insensitive filesystem */
public final class C10320e3 implements C17230qw {
    public final /* synthetic */ C10330e4 A00;

    public /* synthetic */ C10320e3(C10330e4 r1) {
        this.A00 = r1;
    }

    public final void Bxr(int i, boolean z) {
        C10330e4 r2 = this.A00;
        Lock lock = r2.A0B;
        lock.lock();
        try {
            if (r2.A04) {
                r2.A04 = false;
                r2.A07.Bxr(i, false);
                r2.A03 = null;
                r2.A02 = null;
            } else {
                r2.A04 = true;
                r2.A08.onConnectionSuspended(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public final void Bxl(AnonymousClass0L0 r3) {
        C10330e4 r0 = this.A00;
        Lock lock = r0.A0B;
        lock.lock();
        try {
            r0.A03 = r3;
            C10330e4.A02(r0);
        } finally {
            lock.unlock();
        }
    }

    public final void Bxo(Bundle bundle) {
        C10330e4 r2 = this.A00;
        Lock lock = r2.A0B;
        lock.lock();
        try {
            r2.A03 = AnonymousClass0L0.A04;
            C10330e4.A02(r2);
        } finally {
            lock.unlock();
        }
    }
}
