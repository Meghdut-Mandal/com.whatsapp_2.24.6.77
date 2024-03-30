package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1mt  reason: invalid class name and case insensitive filesystem */
public class C37591mt extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public C37591mt(float f) {
        this.A00 = f;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
