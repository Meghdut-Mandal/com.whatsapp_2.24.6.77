package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.4AT  reason: invalid class name */
public final class AnonymousClass4AT extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass36N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AT(AnonymousClass36N r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0.A01.getContext());
        frameLayout.setOnTouchListener(this.this$0.A00);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }
}
