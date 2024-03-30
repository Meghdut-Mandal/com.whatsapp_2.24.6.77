package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.3ZH  reason: invalid class name */
public class AnonymousClass3ZH implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup A00;

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A00;
        C36351kA.A1C(viewGroup, this);
        Drawable background = viewGroup.getBackground();
        if (background instanceof C36991ld) {
            C36991ld.A00(((C36991ld) background).A01, viewGroup);
        }
    }

    public AnonymousClass3ZH(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
