package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;

/* renamed from: X.6GQ  reason: invalid class name */
public abstract class AnonymousClass6GQ {
    public static final void A00(C1271967i r3, C140456lc r4, List list) {
        String obj;
        View A0V;
        AnonymousClass00C.A0D(list, 2);
        if (Build.VERSION.SDK_INT >= 22 && C36401kF.A1a(list)) {
            for (Object next : list) {
                if (next == null) {
                    obj = null;
                } else if (next instanceof String) {
                    obj = (String) next;
                } else {
                    obj = next.toString();
                }
                C140456lc A0C = C140456lc.A0C(r4, obj);
                if (A0C != null && (A0V = A0C.A0V(r3)) != null) {
                    A0V.setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(C1271967i r2, C140456lc r3, List list) {
        AnonymousClass00C.A0D(list, 2);
        if (Build.VERSION.SDK_INT >= 22 && C36401kF.A1a(list)) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).post(new C1497972u(r2, r3, list));
                return;
            }
            throw C36381kD.A0l();
        }
    }
}
