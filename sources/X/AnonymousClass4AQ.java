package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4AQ  reason: invalid class name */
public final class AnonymousClass4AQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3FA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AQ(AnonymousClass3FA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View rootView = this.this$0.A06.getRootView();
        AnonymousClass00C.A0E(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        return new AnonymousClass36N(this.this$0.A05, (ViewGroup) rootView);
    }
}
