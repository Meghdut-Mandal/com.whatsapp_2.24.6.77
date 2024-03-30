package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.0Df  reason: invalid class name and case insensitive filesystem */
public final class C03110Df extends ContentObserver {
    public C03110Df() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        AnonymousClass0Y9.A06.incrementAndGet();
    }
}
