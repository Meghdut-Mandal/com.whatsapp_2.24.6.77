package X;

import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 0}, l = {934}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
/* renamed from: X.7AU  reason: invalid class name */
public final class AnonymousClass7AU extends AnonymousClass0A0 {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AU(ScrollableNestedScrollConnection scrollableNestedScrollConnection, C023509x r2) {
        super(r2);
        this.this$0 = scrollableNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.Bd2(this, 0, 0);
    }
}
