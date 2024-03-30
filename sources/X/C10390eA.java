package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0eA  reason: invalid class name and case insensitive filesystem */
public final class C10390eA implements C16840qB {
    public final boolean A00;
    public final C06190Sq A01;
    public final WeakReference A02;

    public final void Bep(AnonymousClass0L0 r5) {
        C10300e1 r3 = (C10300e1) this.A02.get();
        if (r3 != null) {
            boolean z = false;
            if (Looper.myLooper() == r3.A0D.A07.A05) {
                z = true;
            }
            AnonymousClass006.A08(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = r3.A0G;
            lock.lock();
            try {
                if (C10300e1.A07(r3, 0)) {
                    if (r5.A01 != 0) {
                        C10300e1.A01(r5, this.A01, r3, this.A00);
                    }
                    if (C10300e1.A06(r3)) {
                        C10300e1.A04(r3);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C10390eA(C06190Sq r2, C10300e1 r3, boolean z) {
        this.A02 = AnonymousClass001.A0F(r3);
        this.A01 = r2;
        this.A00 = z;
    }
}
