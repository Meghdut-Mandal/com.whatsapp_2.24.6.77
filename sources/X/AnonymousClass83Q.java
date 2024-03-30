package X;

import android.os.SystemClock;

/* renamed from: X.83Q  reason: invalid class name */
public class AnonymousClass83Q extends C21780zn {
    public /* bridge */ /* synthetic */ AnonymousClass103 A01() {
        return new AnonymousClass83M();
    }

    public /* bridge */ /* synthetic */ boolean A02(AnonymousClass103 r3) {
        AnonymousClass83M r32 = (AnonymousClass83M) r3;
        if (r32 != null) {
            r32.realtimeMs = SystemClock.elapsedRealtime();
            r32.uptimeMs = SystemClock.uptimeMillis();
            return true;
        }
        throw AnonymousClass001.A08("Null value passed to getSnapshot!");
    }
}
