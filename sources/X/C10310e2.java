package X;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0e2  reason: invalid class name and case insensitive filesystem */
public final class C10310e2 implements C17230qw {
    public final /* synthetic */ C10330e4 A00;

    public /* synthetic */ C10310e2(C10330e4 r1) {
        this.A00 = r1;
    }

    public final void Bxr(int i, boolean z) {
        AnonymousClass0L0 r0;
        C10330e4 r2 = this.A00;
        Lock lock = r2.A0B;
        lock.lock();
        try {
            if (r2.A04 || (r0 = r2.A03) == null || r0.A01 != 0) {
                r2.A04 = false;
                r2.A07.Bxr(i, false);
                r2.A03 = null;
                r2.A02 = null;
            } else {
                r2.A04 = true;
                r2.A09.onConnectionSuspended(i);
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
            r0.A02 = r3;
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
            Bundle bundle2 = r2.A01;
            if (bundle2 == null) {
                r2.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            r2.A02 = AnonymousClass0L0.A04;
            C10330e4.A02(r2);
        } finally {
            lock.unlock();
        }
    }
}
