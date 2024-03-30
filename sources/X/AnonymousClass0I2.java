package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0I2  reason: invalid class name */
public class AnonymousClass0I2 extends C02910Cj {
    public static final int[] A02 = {16843284};
    public Drawable A00;
    public final Rect A01 = AnonymousClass001.A06();

    public void A05(Rect rect, View view, AnonymousClass0C4 r5, RecyclerView recyclerView) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    public AnonymousClass0I2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A02);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A00 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    public void A03(Canvas canvas, AnonymousClass0C4 r9, RecyclerView recyclerView) {
        int width;
        int i;
        if (recyclerView.getLayoutManager() != null && this.A00 != null) {
            canvas.save();
            if (recyclerView.A0R) {
                i = recyclerView.getPaddingLeft();
                width = AnonymousClass000.A0B(recyclerView);
                canvas.clipRect(i, recyclerView.getPaddingTop(), width, AnonymousClass000.A0A(recyclerView));
            } else {
                width = recyclerView.getWidth();
                i = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                Rect rect = this.A01;
                RecyclerView.A0B(childAt, rect);
                int round = rect.bottom + Math.round(childAt.getTranslationY());
                this.A00.setBounds(i, round - this.A00.getIntrinsicHeight(), width, round);
                this.A00.draw(canvas);
            }
            canvas.restore();
        }
    }
}
