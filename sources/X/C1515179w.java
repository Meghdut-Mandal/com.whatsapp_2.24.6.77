package X;

import androidx.compose.foundation.HoverableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {116}, m = "emitExit", n = {"this"}, s = {"L$0"})
/* renamed from: X.79w  reason: invalid class name and case insensitive filesystem */
public final class C1515179w extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HoverableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1515179w(HoverableNode hoverableNode, C023509x r2) {
        super(r2);
        this.this$0 = hoverableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0G(this);
    }
}
