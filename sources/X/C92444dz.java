package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.4dz  reason: invalid class name and case insensitive filesystem */
public class C92444dz extends ViewOutlineProvider {
    public final /* synthetic */ C92354df A00;

    public C92444dz(C92354df r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        C92354df r2 = this.A00;
        outline.setAlpha(((float) r2.A0K) / 255.0f);
        Rect A06 = AnonymousClass001.A06();
        r2.A0X.roundOut(A06);
        outline.setRoundRect(A06, (float) r2.A0J);
    }
}
