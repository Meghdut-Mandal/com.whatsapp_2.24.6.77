package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.4bt  reason: invalid class name and case insensitive filesystem */
public abstract class C91364bt extends InsetDrawable {
    public boolean A00;

    public C91364bt(Drawable drawable, boolean z) {
        super(drawable, 0);
        this.A00 = z;
    }

    public void draw(Canvas canvas) {
        if (!this.A00) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    public static C100744vb A00(Context context, C18820ts r2, int i) {
        return new C100744vb(AnonymousClass00E.A00(context, i), r2);
    }

    public boolean getPadding(Rect rect) {
        boolean padding = super.getPadding(rect);
        if (this.A00) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        return padding;
    }
}
