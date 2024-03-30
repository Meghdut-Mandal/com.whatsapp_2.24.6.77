package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4nE  reason: invalid class name and case insensitive filesystem */
public class C96374nE extends C02910Cj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;

    public static int A00(View view, RecyclerView recyclerView) {
        if (view != null) {
            int A002 = RecyclerView.A00(view);
            C168017zZ r4 = (C168017zZ) recyclerView.A0G;
            if (!(r4 == null || A002 == -1 || A002 == r4.A01.size() - 1)) {
                int i = A002 + 1;
                int itemViewType = r4.getItemViewType(A002);
                if (i > 0 && i < r4.A01.size() && r4.getItemViewType(i) == 0) {
                    return 1;
                }
                if (itemViewType == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r15, RecyclerView recyclerView) {
        int i;
        RecyclerView recyclerView2 = recyclerView;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            int A002 = A00(childAt, recyclerView2);
            if (A002 != 0) {
                int bottom = childAt.getBottom() + AnonymousClass000.A0a(childAt).bottomMargin;
                if (A002 != 1) {
                    i = this.A00;
                } else {
                    i = this.A01;
                }
                int i3 = i + bottom;
                int A06 = C36441kJ.A06(recyclerView2.getResources(), R.dimen.f7nameremoved, recyclerView2.getPaddingLeft());
                int A0B = AnonymousClass000.A0B(recyclerView2);
                if (A002 == 2) {
                    Paint paint = this.A03;
                    paint.setColor(this.A02);
                    canvas.drawRect((float) A06, (float) bottom, (float) A0B, (float) i3, paint);
                }
            }
        }
    }

    public C96374nE(int i, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i;
        Paint A0K = C36441kJ.A0K();
        this.A03 = A0K;
        A0K.setAntiAlias(true);
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r5, RecyclerView recyclerView) {
        int i;
        int A002 = A00(view, recyclerView);
        if (A002 != 0) {
            if (A002 != 1) {
                i = this.A00;
            } else {
                i = this.A01;
            }
            rect.bottom = i;
        }
    }
}
