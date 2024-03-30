package X;

import android.app.ActivityManager;
import android.os.Looper;

/* renamed from: X.6ye  reason: invalid class name and case insensitive filesystem */
public final class C148306ye implements AnonymousClass4TY {
    public static final C148306ye A00 = new C148306ye();

    public void B5q(C21820zr r4) {
        AnonymousClass00C.A0D(r4, 0);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        r4.A00(1, "process_priority", C36441kJ.A0y(runningAppProcessInfo.importance));
    }

    public String BDe() {
        return "process_priority";
    }

    public final void A00(C21430zE r3, int i) {
        r3.markerAnnotate(i, "thread_priority", Thread.currentThread().getPriority());
        r3.markerAnnotate(i, "thread_ui", C36361kB.A1a(Looper.getMainLooper(), Looper.myLooper()));
        r3.BPD(this, i);
    }
}
