package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.0De  reason: invalid class name and case insensitive filesystem */
public final class C03100De extends ContentObserver {
    public C03100De() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        AnonymousClass0WD.A08.set(true);
    }
}
