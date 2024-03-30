package X;

import android.content.Intent;
import android.os.SystemClock;

/* renamed from: X.3M9  reason: invalid class name */
public abstract class AnonymousClass3M9 {
    public static void A01(Intent intent, String str) {
        if (!intent.hasExtra("perf_start_time_ns")) {
            intent.putExtra("perf_start_time_ns", SystemClock.elapsedRealtimeNanos());
        }
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }

    public static void A02(Intent intent, String str) {
        if (!intent.hasExtra("perf_origin")) {
            intent.putExtra("perf_origin", str);
        }
    }

    public static void A00(Intent intent, Object obj) {
        A01(intent, obj.getClass().getSimpleName());
    }
}
