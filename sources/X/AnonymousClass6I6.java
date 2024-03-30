package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.6I6  reason: invalid class name */
public abstract class AnonymousClass6I6 {
    public static final Handler A00 = C36341k9.A0H();

    public static void A00(View view, C1271967i r8, C140456lc r9, C140456lc r10) {
        C122055uE r6 = (C122055uE) C133266Xn.A04(r8, r9);
        A00.removeCallbacks(r6.A03);
        if (!r6.A02) {
            C92094d7 r5 = new C92094d7(r8, r9, r10);
            Context context = r8.A00;
            GestureDetector gestureDetector = new GestureDetector(context, r5);
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, r5);
            int i = Build.VERSION.SDK_INT;
            scaleGestureDetector.setQuickScaleEnabled(false);
            if (i >= 23) {
                scaleGestureDetector.setStylusScaleEnabled(false);
            }
            r6.A01 = r5;
            r6.A00 = new C135756dD(gestureDetector, scaleGestureDetector, r5);
            r6.A02 = true;
        }
        C92094d7 r0 = r6.A01;
        if (r0 != null) {
            r0.A01 = view;
        }
        view.setOnTouchListener(r6.A00);
    }
}
