package X;

import android.app.Activity;

/* renamed from: X.0fs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C11190fs implements Runnable {
    public final /* synthetic */ Activity A00;

    public /* synthetic */ C11190fs(Activity activity) {
        this.A00 = activity;
    }

    public final void run() {
        Activity activity = this.A00;
        if (!activity.isFinishing() && !AnonymousClass0W9.A00(activity)) {
            activity.recreate();
        }
    }
}
