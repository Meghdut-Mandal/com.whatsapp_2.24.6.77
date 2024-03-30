package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.1la  reason: invalid class name and case insensitive filesystem */
public class C36961la extends InsetDrawable {
    public int A00 = -1;
    public final Drawable A01;
    public final boolean A02;

    public C36961la(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.A01 = drawable;
        this.A02 = z;
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect bounds = getBounds();
        int i3 = this.A00;
        if (i3 >= 0) {
            int width = (i3 - bounds.width()) / 2;
            boolean z = this.A02;
            Drawable drawable = this.A01;
            int i4 = bounds.left;
            if (z) {
                i = bounds.top;
                i2 = bounds.right;
                width *= 2;
            } else {
                i4 -= width;
                i = bounds.top;
                i2 = bounds.right;
            }
            drawable.setBounds(i4, i, i2 + width, bounds.bottom);
            drawable.draw(canvas);
            return;
        }
        this.A01.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        super.draw(canvas);
    }
}
