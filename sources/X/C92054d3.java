package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4d3  reason: invalid class name and case insensitive filesystem */
public class C92054d3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass7fO A00;
    public final /* synthetic */ C96354nC A01;

    public C92054d3(AnonymousClass7fO r1, C96354nC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        AnonymousClass7fO r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        return r0.Bhm();
    }
}
