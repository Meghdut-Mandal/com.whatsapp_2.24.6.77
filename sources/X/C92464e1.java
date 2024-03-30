package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.4e1  reason: invalid class name and case insensitive filesystem */
public class C92464e1 extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass680 A00;
    public final /* synthetic */ C92034d1 A01;

    public C92464e1(AnonymousClass680 r1, C92034d1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass680 r0 = this.A00;
        outline.setOval(0, 0, r0.A09, r0.A06);
    }
}
