package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;

/* renamed from: X.3Z3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Z3 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass28f A01;

    public /* synthetic */ AnonymousClass3Z3(AnonymousClass28f r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass28f r8 = this.A01;
        Toast A012 = r8.A07.A01(C36381kD.A0t(view, this.A00));
        int[] A1O = C36441kJ.A1O();
        Rect A06 = AnonymousClass001.A06();
        view.getLocationOnScreen(A1O);
        view.getWindowVisibleDisplayFrame(A06);
        int A04 = C36431kI.A04(view, A1O[1]) - A06.top;
        int i = A1O[0];
        if (C36351kA.A1Y(r8.A0D)) {
            Point point = new Point();
            C36321k7.A0K(r8.A05, point);
            if (A012.getView() != null) {
                A012.getView().measure(point.x, point.y);
                i -= A012.getView().getMeasuredWidth();
            }
        } else {
            i += view.getWidth();
        }
        A012.setGravity(51, i, A04);
        A012.show();
        return true;
    }
}
