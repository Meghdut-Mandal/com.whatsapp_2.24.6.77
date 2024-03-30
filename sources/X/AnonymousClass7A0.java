package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 1}, l = {820, 822}, m = "onDragStopped-sF-c-tU", n = {"this", "this"}, s = {"L$0", "L$0"})
/* renamed from: X.7A0  reason: invalid class name */
public final class AnonymousClass7A0 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7A0(ScrollingLogic scrollingLogic, C023509x r2) {
        super(r2);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A03(this, 0);
    }
}
