package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2pb  reason: invalid class name and case insensitive filesystem */
public enum C52542pb {
    A03("EIGHT_HOURS", TimeUnit.HOURS.toMillis(8)),
    A04("ONE_WEEK", TimeUnit.DAYS.toMillis(7)),
    A02("ALWAYS", -1);
    
    public final long durationInMillis;
    public final int id;

    /* access modifiers changed from: public */
    static {
        C52542pb[] r1;
        A00 = C000900k.A00(r1);
    }

    /* access modifiers changed from: public */
    C52542pb(String str, long j) {
        this.id = r2;
        this.durationInMillis = j;
    }
}
