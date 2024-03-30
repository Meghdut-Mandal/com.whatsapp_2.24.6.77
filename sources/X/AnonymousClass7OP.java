package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7OP  reason: invalid class name */
public final class AnonymousClass7OP extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C157597dn $intervalContentState;
    public final /* synthetic */ C118255na $scope;
    public final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OP(C118255na r2, LazyListState lazyListState, C157597dn r4) {
        super(0);
        this.$intervalContentState = r4;
        this.$state = lazyListState;
        this.$scope = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C136786ez r4 = (C136786ez) this.$intervalContentState.getValue();
        C136816f2 r3 = new C136816f2(r4, (C15020mZ) this.$state.A0G.A02.A01.getValue());
        return new C136776ey(this.$scope, r4, this.$state, r3);
    }
}
