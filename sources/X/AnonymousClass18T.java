package X;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;

/* renamed from: X.18T  reason: invalid class name */
public class AnonymousClass18T {
    public long A00;
    public final C21060yb A01;
    public final C19970wo A02;

    public AnonymousClass18T(C21060yb r1, C19970wo r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public Long A00() {
        ActivityManager A04;
        if (SystemClock.uptimeMillis() - this.A00 > 300000 && (A04 = this.A01.A04()) != null) {
            Debug.MemoryInfo[] processMemoryInfo = A04.getProcessMemoryInfo(new int[]{Process.myPid()});
            this.A00 = SystemClock.uptimeMillis();
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                return Long.valueOf((long) processMemoryInfo[0].getTotalPrivateDirty());
            }
        }
        return null;
    }
}
