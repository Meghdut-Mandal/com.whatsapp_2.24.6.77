package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0}, l = {546, 549}, m = "processDragStop", n = {"this", "$this$processDragStop", "event"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.7Ag  reason: invalid class name and case insensitive filesystem */
public final class C151617Ag extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151617Ag(AbstractDraggableNode abstractDraggableNode, C023509x r2) {
        super(r2);
        this.this$0 = abstractDraggableNode;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractDraggableNode.A01(this.this$0, (C93404gV) null, this, (AnonymousClass040) null);
    }
}
