package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.4dy  reason: invalid class name and case insensitive filesystem */
public final class C92434dy extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        boolean z = C92324da.A0H;
        Outline A03 = ((C92324da) view).A09.A03();
        AnonymousClass00C.A0B(A03);
        outline.set(A03);
    }
}
