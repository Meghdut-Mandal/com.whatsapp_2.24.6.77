package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.4dT  reason: invalid class name and case insensitive filesystem */
public class C92304dT extends View {
    public final Drawable A00;

    public C92304dT(Context context, C1271967i r4, int i, int i2) {
        super(context);
        AnonymousClass6GU.A01(context, r4);
        this.A00 = new C91124bV(i, (float) i2);
        setLayerType(2, (Paint) null);
        setAlpha(0.08f);
        setBackground(this.A00);
    }

    public void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    public void setIsSwirlAnimating(boolean z) {
    }
}
