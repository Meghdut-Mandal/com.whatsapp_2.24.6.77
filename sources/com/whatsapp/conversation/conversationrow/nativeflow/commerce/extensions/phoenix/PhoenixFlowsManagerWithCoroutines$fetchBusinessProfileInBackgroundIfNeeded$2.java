package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1KK;
import X.AnonymousClass6E7;
import X.C009003v;
import X.C023509x;
import X.C165067sp;
import X.C207109uZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C023509x r4) {
        super(2, r4);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$extensionsContextParams = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(this.$extensionsContextParams, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C207109uZ A07 = this.this$0.A03.A07(this.$extensionsContextParams.A02);
            if (A07 == null || !A07.A0Z) {
                PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines = this.this$0;
                AnonymousClass1KK r5 = phoenixFlowsManagerWithCoroutines.A03;
                AnonymousClass6E7 r4 = this.$extensionsContextParams;
                r5.A0E(new C165067sp(phoenixFlowsManagerWithCoroutines, r4, 1), r4.A02, (String) null);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
