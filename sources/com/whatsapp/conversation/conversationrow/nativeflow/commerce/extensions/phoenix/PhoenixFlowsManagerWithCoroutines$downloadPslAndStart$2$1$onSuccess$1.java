package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6E7;
import X.AnonymousClass7hO;
import X.C009003v;
import X.C023509x;
import X.C128716Di;
import X.C159657ji;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {592, 601}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C128716Di $extensionIdLink;
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, C128716Di r4, AnonymousClass7hO r5, C159657ji r6, C023509x r7) {
        super(2, r7);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$extensionsContextParams = r2;
        this.$extensionIdLink = r4;
        this.$flowReadyCallback = r5;
        this.$flowTerminationCallback = r6;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1(this.$extensionsContextParams, this.this$0, this.$extensionIdLink, this.$flowReadyCallback, this.$flowTerminationCallback, r9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r11.label
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x002a
            if (r0 != r4) goto L_0x0064
            X.AnonymousClass0AN.A00(r12)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r12)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r11.this$0
            X.1Kk r2 = r0.A0E
            X.6E7 r0 = r11.$extensionsContextParams
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            r11.label = r5
            java.lang.Object r12 = r2.A01(r1, r11, r0)
            if (r12 != r3) goto L_0x002d
            return r3
        L_0x002a:
            X.AnonymousClass0AN.A00(r12)
        L_0x002d:
            X.011 r12 = (X.AnonymousClass011) r12
            java.lang.Object r0 = r12.first
            boolean r6 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r10 = r12.second
            java.lang.String r10 = (java.lang.String) r10
            r5 = 3
            if (r6 == 0) goto L_0x003d
            r5 = 2
        L_0x003d:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r11.this$0
            X.1Kp r2 = r0.A0J
            X.6E7 r0 = r11.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r1 = r0.hashCode()
            short r0 = (short) r5
            r2.A05(r1, r0)
            if (r6 == 0) goto L_0x000f
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r6 = r11.this$0
            X.6E7 r5 = r11.$extensionsContextParams
            if (r10 == 0) goto L_0x0069
            X.6Di r7 = r11.$extensionIdLink
            X.7hO r8 = r11.$flowReadyCallback
            X.7ji r9 = r11.$flowTerminationCallback
            r11.label = r4
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A00(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0069:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$downloadPslAndStart$2$1$onSuccess$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
