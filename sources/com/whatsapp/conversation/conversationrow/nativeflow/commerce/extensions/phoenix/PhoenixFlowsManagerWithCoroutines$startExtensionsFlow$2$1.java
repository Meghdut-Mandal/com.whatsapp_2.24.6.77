package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass691;
import X.AnonymousClass6E7;
import X.AnonymousClass6EW;
import X.AnonymousClass70B;
import X.AnonymousClass7hO;
import X.C009003v;
import X.C023509x;
import X.C153587Ox;
import X.C153597Oy;
import X.C159657ji;
import X.C36371kC;
import com.whatsapp.R;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public final /* synthetic */ String $it;
    public final /* synthetic */ AnonymousClass691 $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, AnonymousClass7hO r4, C159657ji r5, AnonymousClass691 r6, String str, String str2, Map map, C023509x r10) {
        super(2, r10);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$it = str;
        this.$phoenixSessionConfig = r6;
        this.$extensionsContextParams = r2;
        this.$pslData = str2;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = r4;
        this.$flowTerminationCallback = r5;
    }

    public final C023509x create(Object obj, C023509x r12) {
        PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
        String str = this.$it;
        AnonymousClass691 r5 = this.$phoenixSessionConfig;
        return new PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1(this.$extensionsContextParams, phoenixFlowsManagerWithCoroutines, this.$flowReadyCallback, this.$flowTerminationCallback, r5, str, this.$pslData, this.$stateMachineInputParams, r12);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass6EW A02 = this.this$0.A0M.A02(this.$it);
            String A0v = C36371kC.A0v(this.this$0.A0A, R.string.f12nameremoved);
            String A0v2 = C36371kC.A0v(this.this$0.A0A, R.string.f12nameremoved);
            String A0v3 = C36371kC.A0v(this.this$0.A0A, R.string.f12nameremoved);
            PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
            AnonymousClass691 r8 = this.$phoenixSessionConfig;
            AnonymousClass6E7 r4 = this.$extensionsContextParams;
            String str = this.$pslData;
            Map map = this.$stateMachineInputParams;
            AnonymousClass7hO r6 = this.$flowReadyCallback;
            C159657ji r7 = this.$flowTerminationCallback;
            A02.A02(new AnonymousClass70B(A0v, A0v2, A0v3, new C153587Ox(r4, phoenixFlowsManagerWithCoroutines, r6, r7, r8, str, map), new C153597Oy(r4, phoenixFlowsManagerWithCoroutines, r6, r7, r8, str, map)));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$startExtensionsFlow$2$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
