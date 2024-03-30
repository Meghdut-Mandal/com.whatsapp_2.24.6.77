package X;

import android.system.Os;
import android.system.OsConstants;

/* renamed from: X.98e  reason: invalid class name and case insensitive filesystem */
public abstract class C1903898e {
    public static final long A00;

    static {
        long j = 100;
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf > 0) {
            j = sysconf;
        }
        A00 = j;
    }
}
