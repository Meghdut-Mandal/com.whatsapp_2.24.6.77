package X;

import androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

/* renamed from: X.4io  reason: invalid class name and case insensitive filesystem */
public final class C94804io extends C94114hf {
    public final C93374gS A00;
    public final C136556eb A01;
    public final ScrollingLogic A02;
    public final NestedScrollDispatcher A03;
    public final AnonymousClass00S A04;
    public final C019408g A05;
    public final C161437mu A06;

    public C94804io(AnonymousClass5RU r10, ScrollingLogic scrollingLogic, C161437mu r12, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A02 = scrollingLogic;
        this.A03 = nestedScrollDispatcher;
        this.A06 = r12;
        A0F(new C94824iq(scrollingLogic));
        C136556eb r1 = new C136556eb(scrollingLogic);
        this.A01 = r1;
        C151847If r4 = new C151847If(this);
        this.A04 = r4;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this, (C023509x) null);
        this.A05 = scrollableGesturesNode$onDragStopped$1;
        C93374gS r0 = new C93374gS(r1, r10, r12, r4, ScrollableKt.A04, ScrollableKt.A05, scrollableGesturesNode$onDragStopped$1, z);
        A0F(r0);
        this.A00 = r0;
    }
}
