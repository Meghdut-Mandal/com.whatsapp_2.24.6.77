package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.4e2  reason: invalid class name and case insensitive filesystem */
public class C92474e2 extends ViewOutlineProvider {
    public int A00;
    public boolean A01;

    public void getOutline(View view, Outline outline) {
        Outline outline2 = outline;
        if (this.A01) {
            outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A00);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
