package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6E7;
import X.AnonymousClass7hO;
import X.C009003v;
import X.C023509x;
import X.C128716Di;
import X.C145266tc;
import X.C159657ji;
import X.C26491Kj;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C128716Di $extensionIdLink;
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C128716Di r4, AnonymousClass7hO r5, C159657ji r6, C023509x r7) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$extensionsContextParams = r2;
        this.$extensionIdLink = r4;
        this.$flowReadyCallback = r5;
        this.$flowTerminationCallback = r6;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C26491Kj r2 = this.this$0.A0F;
            String str = this.$extensionsContextParams.A05;
            C128716Di r0 = this.$extensionIdLink;
            String str2 = r0.A05;
            if (str2 != null) {
                r2.A0G(new C145266tc(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback), str, str2, r0.A06, AnonymousClass00C.A0J(r0.A00, "DRAFT"), false);
                return AnonymousClass0AJ.A00;
            }
            throw C36381kD.A0k();
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
