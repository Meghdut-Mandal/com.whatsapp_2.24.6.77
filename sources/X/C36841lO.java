package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.1lO  reason: invalid class name and case insensitive filesystem */
public class C36841lO extends Drawable {
    public final /* synthetic */ AnonymousClass2IR A00;

    public void draw(Canvas canvas) {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onLevelChange(int i) {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        return true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C36841lO(AnonymousClass2IR r1) {
        this.A00 = r1;
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }
}
