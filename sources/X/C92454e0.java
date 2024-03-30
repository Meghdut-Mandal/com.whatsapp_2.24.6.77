package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.4e0  reason: invalid class name and case insensitive filesystem */
public final class C92454e0 extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C140456lc A01;

    public void getOutline(View view, Outline outline) {
        C36331k8.A1I(view, outline);
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            C140456lc r2 = this.A01;
            background.getOutline(outline);
            outline.setAlpha(r2.A0S(65, 1.0f));
        }
    }

    public C92454e0(C140456lc r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
