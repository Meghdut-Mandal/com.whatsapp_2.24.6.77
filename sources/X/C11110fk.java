package X;

import android.view.View;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public class C11110fk implements Runnable {
    public final /* synthetic */ C09470cQ A00;

    public C11110fk(C09470cQ r1) {
        this.A00 = r1;
    }

    public void run() {
        C09470cQ r1 = this.A00;
        View view = r1.A06;
        if (view != null && view.getWindowToken() != null) {
            r1.Btc();
        }
    }
}
