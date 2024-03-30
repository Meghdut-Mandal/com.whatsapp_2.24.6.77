package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.7If  reason: invalid class name and case insensitive filesystem */
public final class C151847If extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C94804io this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151847If(C94804io r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ScrollingLogic scrollingLogic = this.this$0.A02;
        boolean z = false;
        if (scrollingLogic.A03.BN7() || C90474aD.A1U(scrollingLogic.A06) || scrollingLogic.A00.BLz()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
