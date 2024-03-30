package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.6dM  reason: invalid class name and case insensitive filesystem */
public class C135846dM implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewTreeObserver A00;
    public final /* synthetic */ AnonymousClass5ND A01;
    public final /* synthetic */ boolean A02;

    public C135846dM(ViewTreeObserver viewTreeObserver, AnonymousClass5ND r2, boolean z) {
        this.A01 = r2;
        this.A00 = viewTreeObserver;
        this.A02 = z;
    }

    public void onGlobalLayout() {
        int A0A;
        int A0B;
        int A0A2;
        int A0B2;
        this.A00.removeOnGlobalLayoutListener(this);
        AnonymousClass5ND r2 = this.A01;
        r2.A0E();
        boolean z = this.A02;
        if (r2 instanceof AnonymousClass5NC) {
            AnonymousClass5NC r22 = (AnonymousClass5NC) r2;
            View view = r22.A0C;
            if (view != null) {
                int i = r22.A07;
                int width = view.getWidth();
                if (i == 2) {
                    A0A2 = (r22.getRightOfDraggableArea() - width) + AnonymousClass5ND.A07(r22, width);
                    A0B2 = r22.A0C(view.getHeight());
                    if (A0A2 >= 0 && A0B2 >= 0) {
                        r22.A06 = true;
                        r22.A0P = true;
                    } else {
                        return;
                    }
                } else {
                    A0A2 = r22.A0A(width);
                    A0B2 = r22.A0B(view.getHeight());
                    if (!(!AnonymousClass5NC.A06(r22))) {
                        return;
                    }
                }
                r22.A0I(A0A2, A0B2);
                return;
            }
            return;
        }
        View view2 = r2.A0C;
        if (view2 == null) {
            return;
        }
        if (r2.A0N) {
            view2.setPivotX((float) (view2.getMeasuredWidth() / 2));
            View view3 = r2.A0C;
            view3.setPivotY((float) (view3.getMeasuredHeight() / 2));
            if (z) {
                A0A = r2.A0A;
                A0B = r2.A0B;
            } else {
                A0A = r2.A0A(r2.A0C.getWidth());
                A0B = r2.A0B(r2.A0C.getHeight());
            }
            r2.A0I(A0A, A0B);
            r2.A0N = false;
        } else if (!r2.A0O) {
            r2.A0I(r2.A0A(view2.getWidth()), r2.A0B(r2.A0C.getHeight()));
        }
    }
}
