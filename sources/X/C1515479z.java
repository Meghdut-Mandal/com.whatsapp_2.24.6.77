package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {831}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
/* renamed from: X.79z  reason: invalid class name and case insensitive filesystem */
public final class C1515479z extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1515479z(ScrollingLogic scrollingLogic, C023509x r2) {
        super(r2);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(this, 0);
    }
}
