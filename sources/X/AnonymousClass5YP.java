package X;

import android.view.View;
import java.util.Iterator;

/* renamed from: X.5YP  reason: invalid class name */
public abstract class AnonymousClass5YP {
    public static final void A00(C98134qw r5) {
        AnonymousClass00C.A0D(r5, 0);
        Iterator it = new C18660tW(r5, 0).iterator();
        while (it.hasNext()) {
            View A0K = C36431kI.A0K(it);
            if (A0K.isLayoutRequested()) {
                AnonymousClass000.A16(A0K, A0K.getHeight(), 1073741824, View.MeasureSpec.makeMeasureSpec(A0K.getWidth(), 1073741824));
                A0K.layout(A0K.getLeft(), A0K.getTop(), A0K.getRight(), A0K.getBottom());
            }
            if (A0K instanceof C98134qw) {
                A00((C98134qw) A0K);
            }
        }
    }
}
