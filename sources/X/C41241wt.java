package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public final class C41241wt extends C02910Cj {
    public final int A00;
    public final int A01;
    public final Paint A02;

    public void A03(Canvas canvas, AnonymousClass0C4 r13, RecyclerView recyclerView) {
        Canvas canvas2 = canvas;
        C36321k7.A0w(canvas, recyclerView);
        Iterator A12 = C36381kD.A12(recyclerView);
        while (A12.hasNext()) {
            View A0K = C36431kI.A0K(A12);
            if (A00(A0K, recyclerView)) {
                canvas2.drawLine((float) (recyclerView.getLeft() + recyclerView.getPaddingLeft()), (float) (A0K.getTop() - this.A00), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), (float) A0K.getTop(), this.A02);
            }
        }
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A11(view, recyclerView, r6);
        if (A00(view, recyclerView)) {
            rect.set(0, this.A00 + this.A01, 0, 0);
        } else {
            super.A05(rect, view, r6, recyclerView);
        }
    }

    public static final boolean A00(View view, RecyclerView recyclerView) {
        Object obj;
        AnonymousClass0CZ r1 = recyclerView.A0G;
        if (r1 == null) {
            return false;
        }
        try {
            obj = Integer.valueOf(r1.getItemViewType(RecyclerView.A00(view)));
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        if (obj instanceof AnonymousClass03N) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number == null || number.intValue() != 2) {
            return false;
        }
        return true;
    }

    public C41241wt(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00 = dimensionPixelSize;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        Paint A0K = C36441kJ.A0K();
        C36381kD.A16(context, A0K, R.color.f6nameremoved);
        A0K.setStrokeWidth((float) dimensionPixelSize);
        this.A02 = A0K;
    }
}
