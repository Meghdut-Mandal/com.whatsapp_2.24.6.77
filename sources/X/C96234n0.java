package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4n0  reason: invalid class name and case insensitive filesystem */
public class C96234n0 extends C02910Cj {
    public final /* synthetic */ C142466ov A00;

    public C96234n0(C142466ov r1) {
        this.A00 = r1;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r11, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        C142466ov r6 = this.A00;
        int i = paddingLeft + ((int) r6.A01);
        int width = (recyclerView.getWidth() - ((int) r6.A02)) - recyclerView.getPaddingRight();
        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
            View childAt = recyclerView.getChildAt(i2);
            AnonymousClass0D2 r1 = (AnonymousClass0D2) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + r1.bottomMargin;
            int intrinsicHeight = r6.A06.getIntrinsicHeight() + bottom;
            if (r1.A01() == 0 && r6.A0P == null) {
                r6.A06.setBounds(0, bottom, recyclerView.getWidth(), intrinsicHeight);
            } else {
                r6.A06.setBounds(i, bottom, width, intrinsicHeight);
            }
            r6.A06.draw(canvas);
        }
    }
}
