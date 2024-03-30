package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.0Dp  reason: invalid class name and case insensitive filesystem */
public class C03210Dp extends Drawable {
    public final ActionBarContainer A00;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A03) {
            Drawable drawable = actionBarContainer.A01;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A00;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.A02;
        if (drawable3 != null && actionBarContainer.A04) {
            drawable3.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A03) {
            drawable = actionBarContainer.A01;
        } else {
            drawable = actionBarContainer.A00;
        }
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public C03210Dp(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }
}
