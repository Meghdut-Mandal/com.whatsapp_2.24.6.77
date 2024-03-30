package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines;
import java.util.Map;

/* renamed from: X.7Ox  reason: invalid class name and case insensitive filesystem */
public final class C153587Ox extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public final /* synthetic */ AnonymousClass691 $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153587Ox(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, AnonymousClass7hO r4, C159657ji r5, AnonymousClass691 r6, String str, Map map) {
        super(0);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$phoenixSessionConfig = r6;
        this.$extensionsContextParams = r2;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = r4;
        this.$flowTerminationCallback = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
        AnonymousClass691 r4 = this.$phoenixSessionConfig;
        PhoenixFlowsManagerWithCoroutines.A06(this.$extensionsContextParams, phoenixFlowsManagerWithCoroutines, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return AnonymousClass0AJ.A00;
    }
}
