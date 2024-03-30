package X;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A0w  reason: case insensitive filesystem */
public class C20963A0w implements C22866AxL {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    public /* bridge */ /* synthetic */ Object get() {
        int i;
        int min = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else if (min < 67108864) {
            i = 6291456;
        } else {
            i = min / 4;
        }
        return new AnonymousClass9N3(A01, i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public C20963A0w(ActivityManager activityManager) {
        this.A00 = activityManager;
    }
}
