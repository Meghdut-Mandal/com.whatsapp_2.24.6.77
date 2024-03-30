package X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.7u1  reason: invalid class name and case insensitive filesystem */
public final class C165707u1 extends ContentObserver {
    public final /* synthetic */ C21019A3i A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C165707u1(C21019A3i a3i) {
        super((Handler) null);
        this.A00 = a3i;
    }

    public final void onChange(boolean z) {
        this.A00.A03.set(true);
    }
}
