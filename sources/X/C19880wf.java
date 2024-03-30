package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

/* renamed from: X.0wf  reason: invalid class name and case insensitive filesystem */
public class C19880wf {
    public final Handler A00;
    public final HandlerThread A01;
    public final SparseArray A02 = new SparseArray();
    public final C19770wU A03;
    public volatile boolean A04;

    public void A00(Runnable runnable, int i, boolean z) {
        C19930wk r4;
        if (!this.A04) {
            synchronized (this) {
                SparseArray sparseArray = this.A02;
                r4 = (C19930wk) sparseArray.get(i);
                if (r4 == null) {
                    r4 = new C19930wk(this.A03, true);
                    sparseArray.put(i, r4);
                }
            }
            if (z) {
                this.A00.postDelayed(new C35761jD(r4, runnable, 10), 100);
            } else {
                r4.execute(runnable);
            }
        }
    }

    public C19880wf(C19770wU r4) {
        this.A03 = r4;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
