package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1mr  reason: invalid class name and case insensitive filesystem */
public class C37571mr extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int min = Math.min(width, height);
        int i = (width - min) / 2;
        int i2 = (height - min) / 2;
        outline.setOval(i, i2, i + min, min + i2);
    }
}
