package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* renamed from: X.7UU  reason: invalid class name */
public final class AnonymousClass7UU extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $source;
    public final /* synthetic */ C157507de $this_dispatchScroll;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UU(C157507de r2, ScrollingLogic scrollingLogic, int i) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        long A0B;
        float A01;
        long j2;
        NestedScrollNode nestedScrollNode;
        NestedScrollNode nestedScrollNode2;
        long j3 = ((C133206Xf) obj).A00;
        NestedScrollDispatcher nestedScrollDispatcher = this.this$0.A04;
        int i = this.$source;
        C161807nV r1 = nestedScrollDispatcher.A00;
        if (r1 == null || (nestedScrollNode2 = (NestedScrollNode) r1.BAY(C112385do.A00)) == null) {
            j = C133206Xf.A03;
        } else {
            j = nestedScrollNode2.BdF(j3, i);
        }
        long A02 = C133206Xf.A02(j3, j);
        ScrollingLogic scrollingLogic = this.this$0;
        AnonymousClass5RU r9 = scrollingLogic.A02;
        AnonymousClass5RU r8 = AnonymousClass5RU.Horizontal;
        if (r9 == r8) {
            A0B = C90464aC.A0B(C133206Xf.A00(A02), 0.0f);
        } else {
            A0B = C90464aC.A0B(0.0f, C133206Xf.A01(A02));
        }
        long A0B2 = C90474aD.A0B(scrollingLogic.A05 ? 1 : 0, A0B);
        if (r9 == r8) {
            A01 = C133206Xf.A00(A0B2);
        } else {
            A01 = C133206Xf.A01(A0B2);
        }
        long A0B3 = C90474aD.A0B(scrollingLogic.A05 ? 1 : 0, scrollingLogic.A00(this.$this_dispatchScroll.BpR(A01)));
        long A022 = C133206Xf.A02(A02, A0B3);
        NestedScrollDispatcher nestedScrollDispatcher2 = this.this$0.A04;
        int i2 = this.$source;
        C161807nV r3 = nestedScrollDispatcher2.A00;
        if (r3 == null || (nestedScrollNode = (NestedScrollNode) r3.BAY(C112385do.A00)) == null) {
            j2 = C133206Xf.A03;
        } else {
            j2 = nestedScrollNode.Bd5(i2, A0B3, A022);
        }
        return new C133206Xf(C133206Xf.A03(C133206Xf.A03(j, A0B3), j2));
    }
}
