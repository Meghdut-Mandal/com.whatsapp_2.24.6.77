package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.7Te  reason: invalid class name and case insensitive filesystem */
public final class C154697Te extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C157507de $$this$scroll;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154697Te(C157507de r2, ScrollingLogic scrollingLogic) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((C133206Xf) obj).A00;
        ScrollingLogic scrollingLogic = this.this$0;
        return new C133206Xf(C90474aD.A0B(scrollingLogic.A05 ? 1 : 0, scrollingLogic.A01(this.$$this$scroll, 2, C90474aD.A0B(scrollingLogic.A05 ? 1 : 0, j))));
    }
}
