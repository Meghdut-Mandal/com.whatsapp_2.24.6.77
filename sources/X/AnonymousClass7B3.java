package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {322, 347, 349}, m = "forceFetchMetadataAndCheckBusiness", n = {"this", "extensionsContextParams", "flowReadyCallback", "flowTerminationCallback", "instanceKey", "this", "extensionsContextParams"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1"})
/* renamed from: X.7B3  reason: invalid class name */
public final class AnonymousClass7B3 extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7B3(PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C023509x r2) {
        super(r2);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PhoenixFlowsManagerWithCoroutines.A03((AnonymousClass6E7) null, this.this$0, (AnonymousClass7hO) null, (C159657ji) null, this, 0);
    }
}