package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7Il  reason: invalid class name and case insensitive filesystem */
public final class C151907Il extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass7bG $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151907Il(AnonymousClass7bG r2) {
        super(0);
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LazyListState lazyListState = ((C136856f6) this.$state).A00;
        boolean A1U = C90474aD.A1U(lazyListState.A0M);
        AnonymousClass6SC r2 = lazyListState.A0G;
        float BCn = (float) (r2.A04.BCn() + (r2.A03.BCn() * 500));
        if (A1U) {
            BCn += (float) 100;
        }
        return Float.valueOf(BCn);
    }
}
