package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.1mO  reason: invalid class name and case insensitive filesystem */
public class C37451mO extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C70803fk A00;

    public C37451mO(C70803fk r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C70803fk r5 = this.A00;
        if (TextUtils.isEmpty(r5.A4B.getText()) && Math.abs(f) < Math.abs(f2) && f2 < 0.0f) {
            AnonymousClass2K5 r4 = r5.A2q.A03;
            AnonymousClass3T1 A0S = r5.A2x.A0S();
            if (A0S != null) {
                AnonymousClass3AC r1 = r5.A2R;
                AnonymousClass00C.A0D(motionEvent, 0);
                FrameLayout frameLayout = r1.A04;
                AnonymousClass00T r12 = r1.A06;
                frameLayout.getGlobalVisibleRect((Rect) r12.getValue());
                if (((Rect) r12.getValue()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && r4.A01(A0S)) {
                    r4.A02(r5, A0S);
                    return true;
                }
            }
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
