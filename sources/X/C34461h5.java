package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1h5  reason: invalid class name and case insensitive filesystem */
public abstract class C34461h5 extends C02910Cj {
    public final Rect A00 = new Rect();
    public final Drawable A01;

    public boolean A06(int i, int i2) {
        int i3;
        if (((C35991ja) this).A00 == 0) {
            i3 = 7;
            if (i2 == -1) {
                if (i == 9) {
                    return false;
                }
                return true;
            }
        } else if (i != 7) {
            return false;
        } else {
            i3 = 12;
            if (i2 == 3) {
                return true;
            }
        }
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public C34461h5(Drawable drawable) {
        this.A01 = drawable;
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r11, RecyclerView recyclerView) {
        int width;
        int i;
        View childAt;
        canvas.save();
        if (recyclerView.A0R) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            if (i2 == childCount - 1) {
                childAt = null;
            } else {
                childAt = recyclerView.getChildAt(i2 + 1);
            }
            if (A06(recyclerView.A0G.getItemViewType(RecyclerView.A00(childAt2)), recyclerView.A0G.getItemViewType(RecyclerView.A00(childAt)))) {
                Rect rect = this.A00;
                RecyclerView.A0B(childAt2, rect);
                int round = rect.bottom + Math.round(childAt2.getTranslationY());
                Drawable drawable = this.A01;
                drawable.setBounds(i, round - drawable.getIntrinsicHeight(), width, round);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r7, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        if (A06(recyclerView.A0G.getItemViewType(A002), recyclerView.A0G.getItemViewType(A002 + 1))) {
            rect.set(0, 0, 0, this.A01.getIntrinsicHeight());
        } else {
            rect.setEmpty();
        }
    }
}
