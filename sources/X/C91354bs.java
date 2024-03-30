package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.4bs  reason: invalid class name and case insensitive filesystem */
public final class C91354bs extends InsetDrawable {
    public C91354bs(Drawable drawable) {
        super(drawable, 0);
    }

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        super.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        AnonymousClass00C.A0D(rect, 0);
        return super.getPadding(rect);
    }
}
