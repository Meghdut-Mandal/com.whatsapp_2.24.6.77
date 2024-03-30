package X;

import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0zG  reason: invalid class name and case insensitive filesystem */
public class C21450zG {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AtomicLong A02 = new AtomicLong(-1);

    public long A00() {
        long mostSignificantBits;
        AtomicLong atomicLong = this.A02;
        long j = atomicLong.get();
        if (j == -1) {
            AnonymousClass005 r6 = this.A00;
            j = ((SharedPreferences) ((C19420v0) r6.get()).A00.get()).getLong("qpl_id", -1);
            if (j != -1) {
                atomicLong.set(j);
            } else {
                synchronized (C21450zG.class) {
                    if (atomicLong.get() != -1) {
                        mostSignificantBits = atomicLong.get();
                    } else {
                        mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
                        atomicLong.set(mostSignificantBits);
                        C19420v0.A00((C19420v0) r6.get()).putLong("qpl_id", mostSignificantBits).apply();
                    }
                }
                return mostSignificantBits;
            }
        }
        return j;
    }

    public C21450zG(AnonymousClass005 r4, AnonymousClass005 r5) {
        this.A00 = r4;
        this.A01 = r5;
    }
}
