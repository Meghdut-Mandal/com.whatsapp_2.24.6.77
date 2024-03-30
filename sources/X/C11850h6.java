package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.0h6  reason: invalid class name and case insensitive filesystem */
public class C11850h6 implements Runnable {
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public C11850h6(View view, SwipeDismissBehavior swipeDismissBehavior, boolean z) {
        this.A02 = swipeDismissBehavior;
        this.A00 = view;
        this.A01 = z;
    }

    public void run() {
        C17120ql r1;
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        AnonymousClass0Z5 r12 = swipeDismissBehavior.A03;
        if (r12 != null && r12.A0I(true)) {
            C011504z.A07(this.A00, this);
        } else if (this.A01 && (r1 = swipeDismissBehavior.A04) != null) {
            r1.BVs(this.A00);
        }
    }
}
