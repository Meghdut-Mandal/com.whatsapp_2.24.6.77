package X;

import android.os.Build;
import android.util.Log;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4pF  reason: invalid class name and case insensitive filesystem */
public final class C97394pF extends AnonymousClass6FP {
    public /* bridge */ /* synthetic */ C120745s0 A01() {
        if (this.A02 && Build.VERSION.SDK_INT >= 23 && this.A00.A09.A00()) {
            throw AnonymousClass001.A08("Cannot set backoff criteria on an idle mode job");
        } else if (!this.A00.A0H) {
            return new C97414pH(this);
        } else {
            throw AnonymousClass001.A08("PeriodicWorkRequests cannot be expedited");
        }
    }

    public C97394pF(Class cls, TimeUnit timeUnit, long j) {
        super(cls);
        AnonymousClass6QA r6 = this.A00;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            AnonymousClass6VD.A00();
            Log.w(AnonymousClass6QA.A0L, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        millis = millis < 900000 ? 900000 : millis;
        r6.A05(millis, millis);
    }

    public C97394pF(TimeUnit timeUnit, TimeUnit timeUnit2) {
        super(NtpSyncWorker.class);
        this.A00.A05(timeUnit.toMillis(43200000), timeUnit2.toMillis(21600000));
    }
}
