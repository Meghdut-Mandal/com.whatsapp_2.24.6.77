package X;

import android.view.View;
import java.util.List;

/* renamed from: X.72u  reason: invalid class name and case insensitive filesystem */
public final class C1497972u implements Runnable {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ List A02;

    public C1497972u(C1271967i r1, C140456lc r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String obj;
        int i = -1;
        for (Object next : this.A02) {
            C140456lc r1 = this.A01;
            if (next == null) {
                obj = null;
            } else if (next instanceof String) {
                obj = (String) next;
            } else {
                obj = next.toString();
            }
            C140456lc A0C = C140456lc.A0C(r1, obj);
            if (A0C == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Component with server id: ");
                A0u.append(next);
                AnonymousClass6RS.A00(this.A00, "AccessibilityUtils", AnonymousClass000.A0q(" not found in hierarchy.", A0u), (Throwable) null);
            } else {
                View A0V = A0C.A0V(this.A00);
                if (A0V != null) {
                    A0V.setFocusable(true);
                    if (A0V.getId() == -1) {
                        A0V.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A0V.setAccessibilityTraversalAfter(i);
                    }
                    i = A0V.getId();
                }
            }
        }
    }
}
