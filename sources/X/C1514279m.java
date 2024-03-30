package X;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {701}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
/* renamed from: X.79m  reason: invalid class name and case insensitive filesystem */
public final class C1514279m extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C1514279m(C023509x r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.A00((C161887nd) null, this);
    }
}
