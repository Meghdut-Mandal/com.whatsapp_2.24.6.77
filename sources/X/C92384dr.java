package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4dr  reason: invalid class name and case insensitive filesystem */
public class C92384dr extends ViewGroup {
    public boolean A00;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void A00(View view, C161047m3 r3, long j) {
        Canvas canvas = C112335dj.A00;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        super.drawChild(((C137386g3) r3).A00, view, j);
    }

    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }

    public C92384dr(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, C36371kC.A0m());
    }

    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            AnonymousClass00C.A0E(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((C92324da) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            } else {
                i++;
            }
        }
    }
}
