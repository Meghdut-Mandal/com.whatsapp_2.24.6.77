package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0D2  reason: invalid class name */
public class AnonymousClass0D2 extends ViewGroup.MarginLayoutParams {
    public AnonymousClass0D3 A00;
    public boolean A01 = true;
    public boolean A02 = false;
    public final Rect A03 = new Rect();

    public int A01() {
        AnonymousClass0D3 r2 = this.A00;
        int i = r2.A05;
        if (i == -1) {
            return r2.A04;
        }
        return i;
    }

    public AnonymousClass0D2(int i, int i2) {
        super(i, i2);
    }

    public static Rect A00(View view) {
        return ((AnonymousClass0D2) view.getLayoutParams()).A03;
    }

    public AnonymousClass0D2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass0D2(AnonymousClass0D2 r2) {
        super(r2);
    }

    public AnonymousClass0D2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass0D2(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
