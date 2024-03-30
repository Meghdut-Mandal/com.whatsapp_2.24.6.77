package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.7u0  reason: invalid class name and case insensitive filesystem */
public final class C165697u0 extends ContentObserver {
    public final /* synthetic */ C200909iS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C165697u0(C200909iS r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public final void onChange(boolean z) {
        C200909iS r3 = this.A00;
        synchronized (r3.A03) {
            r3.A06 = null;
        }
        synchronized (r3.A04) {
            Iterator it = r3.A05.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("zzk");
            }
        }
    }
}
