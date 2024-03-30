package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nF  reason: invalid class name and case insensitive filesystem */
public class C96384nF extends C02910Cj {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final C96154ms A03;

    private boolean A00(View view) {
        int i;
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            C96154ms r1 = this.A03;
            if (A002 != -1) {
                C1512578v r2 = r1.A0O;
                if (Integer.valueOf(r2.A00(A002)) != null && (i = A002 + 1) > 0 && i < r2.size()) {
                    int A003 = r2.A00(i);
                    if (Integer.valueOf(A003) == null) {
                        return false;
                    }
                    if (A003 == 22 || A003 == 23 || A003 == 100) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r16, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        int childCount = recyclerView2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            if (A00(childAt)) {
                int bottom = childAt.getBottom() + AnonymousClass000.A0a(childAt).bottomMargin;
                int left = recyclerView2.getLeft();
                int width = recyclerView2.getWidth();
                Paint paint = this.A02;
                paint.setColor(this.A00);
                canvas.drawRect((float) left, (float) bottom, (float) width, (float) (this.A01 + bottom), paint);
            }
        }
    }

    public C96384nF(C96154ms r3, int i, int i2) {
        this.A03 = r3;
        this.A01 = i2;
        this.A00 = i;
        Paint A0K = C36441kJ.A0K();
        this.A02 = A0K;
        A0K.setAntiAlias(true);
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r4, RecyclerView recyclerView) {
        if (A00(view)) {
            rect.bottom = this.A01;
        }
    }
}
