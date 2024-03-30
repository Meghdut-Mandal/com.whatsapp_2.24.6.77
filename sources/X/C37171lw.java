package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1lw  reason: invalid class name and case insensitive filesystem */
public class C37171lw extends ResultReceiver {
    public final WeakReference A00;
    public final WeakReference A01;

    public void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = (Runnable) this.A00.get();
        if (runnable != null) {
            runnable.run();
            Set set = (Set) this.A01.get();
            if (set != null) {
                set.remove(runnable);
            }
        }
    }

    public C37171lw(Handler handler, Runnable runnable, Set set) {
        super(handler);
        set.add(runnable);
        this.A00 = AnonymousClass001.A0F(runnable);
        this.A01 = AnonymousClass001.A0F(set);
    }
}
