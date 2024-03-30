package X;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ho  reason: invalid class name and case insensitive filesystem */
public final class C03750Ho extends C03760Hp implements C15910oD {
    public final Semaphore A00 = new Semaphore(0);
    public final Set A01;

    public final void A03() {
        this.A00.drainPermits();
        A09();
    }

    public final /* bridge */ /* synthetic */ Object A06() {
        int i = 0;
        for (AnonymousClass0XK A0B : this.A01) {
            if (A0B.A0B(this)) {
                i++;
            }
        }
        try {
            this.A00.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public C03750Ho(Context context, Set set) {
        super(context);
        this.A01 = set;
    }
}
