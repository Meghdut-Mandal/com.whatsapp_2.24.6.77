package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.0Dg  reason: invalid class name and case insensitive filesystem */
public final class C03120Dg extends ContentObserver {
    public final /* synthetic */ C07100Wi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03120Dg(C07100Wi r2) {
        super((Handler) null);
        this.A00 = r2;
    }

    public final void onChange(boolean z) {
        C07100Wi r2 = this.A00;
        synchronized (r2.A03) {
            r2.A06 = null;
            AnonymousClass0Y9.A06.incrementAndGet();
        }
        synchronized (r2) {
            Iterator it = r2.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0A("zza");
            }
        }
    }
}
