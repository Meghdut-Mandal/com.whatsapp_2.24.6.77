package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.02z  reason: invalid class name and case insensitive filesystem */
public abstract class C006902z {
    public static AnonymousClass032 A00 = AnonymousClass032.A00;
    public static final int A01;
    public static final int A02;
    public static final long A03 = TimeUnit.SECONDS.toNanos(AnonymousClass030.A00("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
    public static final long A04 = AnonymousClass030.A00("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final String A05;
    public static final AnonymousClass033 A06 = new AnonymousClass033(1);
    public static final AnonymousClass033 A07 = new AnonymousClass033(0);

    static {
        String str = "DefaultDispatcher";
        try {
            String property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
            if (property != null) {
                str = property;
            }
        } catch (SecurityException unused) {
        }
        A05 = str;
        int i = AnonymousClass031.A00;
        if (i < 2) {
            i = 2;
        }
        long j = (long) 1;
        A01 = (int) AnonymousClass030.A00("kotlinx.coroutines.scheduler.core.pool.size", (long) i, j, (long) Integer.MAX_VALUE);
        long j2 = (long) 2097150;
        A02 = (int) AnonymousClass030.A00("kotlinx.coroutines.scheduler.max.pool.size", j2, j, j2);
    }
}
