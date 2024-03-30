package X;

import android.view.ViewParent;

/* renamed from: X.0fi  reason: invalid class name and case insensitive filesystem */
public class C11090fi implements Runnable {
    public final /* synthetic */ C09150bu A00;

    public C11090fi(C09150bu r1) {
        this.A00 = r1;
    }

    public void run() {
        ViewParent parent = this.A00.A07.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
