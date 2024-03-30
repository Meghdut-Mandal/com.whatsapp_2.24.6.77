package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6E7;
import X.AnonymousClass7hO;
import X.C009003v;
import X.C023509x;
import X.C159657ji;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1", f = "PhoenixFlowsManagerWithCoroutines.kt", i = {}, l = {283, 294, 302}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public int label;
    public final /* synthetic */ PhoenixFlowsManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1(AnonymousClass6E7 r2, PhoenixFlowsManagerWithCoroutines phoenixFlowsManagerWithCoroutines, AnonymousClass7hO r4, C159657ji r5, C023509x r6) {
        super(2, r6);
        this.this$0 = phoenixFlowsManagerWithCoroutines;
        this.$flowTerminationCallback = r5;
        this.$extensionsContextParams = r2;
        this.$flowReadyCallback = r4;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1(this.$extensionsContextParams, this.this$0, this.$flowReadyCallback, this.$flowTerminationCallback, r8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.6Di} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r15 = r16
            int r4 = r15.label
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L_0x001a
            if (r4 == r0) goto L_0x0016
            if (r4 == r1) goto L_0x0016
            if (r4 == r2) goto L_0x0016
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0016:
            X.AnonymousClass0AN.A00(r17)
            goto L_0x0042
        L_0x001a:
            X.AnonymousClass0AN.A00(r17)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.0yC r5 = r4.A0K
            r4 = 5333(0x14d5, float:7.473E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x0045
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.0yC r5 = r4.A0K
            r4 = 1319(0x527, float:1.848E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x0045
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r3 = r15.this$0
            X.7ji r2 = r15.$flowTerminationCallback
            X.6E7 r0 = r15.$extensionsContextParams
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "extensions-features-disabled"
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A08(r3, r2, r0, r1)
        L_0x0042:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0045:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r15.this$0
            X.6E7 r4 = r15.$extensionsContextParams
            int r4 = r4.hashCode()
            r5.A00 = r4
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.56y r6 = r4.A0H
            int r5 = r4.A00
            java.lang.String r4 = "phoenixExtensionFlow"
            r6.A01(r5, r4)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.56y r5 = r4.A0H
            int r10 = r4.A00
            X.6E7 r4 = r15.$extensionsContextParams
            java.lang.String r7 = r4.A08
            java.lang.String r8 = r4.A09
            com.whatsapp.jid.UserJid r6 = r4.A02
            java.lang.String r9 = r4.A05
            r5.A06(r6, r7, r8, r9, r10)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.56y r7 = r4.A0H
            int r6 = r4.A00
            X.6E7 r4 = r15.$extensionsContextParams
            boolean r4 = r4.A0C
            java.lang.String r5 = "is_resumed"
            r7.A04(r6, r5, r4)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.0wo r4 = r4.A09
            long r13 = X.C19970wo.A00(r4)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r12 = r15.this$0
            X.6E7 r6 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r4 = r6.A02
            java.lang.String r7 = r6.A05
            X.1KW r6 = r12.A0B
            java.lang.String r4 = r4.user
            long r10 = r6.A00(r4, r7)
            r8 = 0
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x00a7
            X.0yC r6 = r12.A0K
            r4 = 2892(0xb4c, float:4.053E-42)
            long r8 = X.C36441kJ.A0B(r6, r4)
            r6 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 * r6
            long r8 = r8 + r10
        L_0x00a7:
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            if (r6 >= 0) goto L_0x00d8
            X.7ji r1 = r15.$flowTerminationCallback
            X.6E7 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            java.lang.String r11 = "extensions-banned-id-error"
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A08(r4, r1, r11, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r1 = r15.this$0
            X.6OE r2 = r1.A07
            X.6E7 r0 = r15.$extensionsContextParams
            java.lang.String r8 = r0.A05
            com.whatsapp.jid.UserJid r5 = r0.A02
            java.lang.String r9 = r0.A08
            java.lang.String r10 = r0.A09
            r12 = 0
            X.185 r3 = r1.A05
            X.6NP r4 = r1.A0C
            boolean r0 = r0.A0C
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = "galaxy_message"
            r2.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0042
        L_0x00d8:
            X.1Kf r7 = r4.A0I
            X.6E7 r4 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r6 = r4.A02
            r12 = 0
            java.lang.String r4 = "user_interaction"
            int r11 = r7.A0B(r6, r4)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.1Kf r6 = r4.A0I
            X.6E7 r4 = r15.$extensionsContextParams
            java.lang.String r8 = r4.A08
            java.lang.String r9 = r4.A09
            com.whatsapp.jid.UserJid r7 = r4.A02
            java.lang.String r10 = r4.A05
            r6.A06(r7, r8, r9, r10, r11)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r15.this$0
            X.1Kg r8 = r4.A0D
            java.lang.Integer r7 = X.C90524aI.A0a(r11)
            X.6E7 r4 = r15.$extensionsContextParams
            com.whatsapp.jid.UserJid r6 = r4.A02
            java.lang.String r4 = r4.A05
            X.5tN r6 = r8.A05(r6, r7, r4)
            if (r6 == 0) goto L_0x012c
            java.util.List r4 = r6.A02
            X.6E7 r9 = r15.$extensionsContextParams
            java.util.Iterator r10 = r4.iterator()
        L_0x0112:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x012a
            java.lang.Object r8 = r10.next()
            r4 = r8
            X.6Di r4 = (X.C128716Di) r4
            java.lang.String r7 = r4.A03
            java.lang.String r4 = r9.A05
            boolean r4 = X.AnonymousClass00C.A0J(r7, r4)
            if (r4 == 0) goto L_0x0112
            r12 = r8
        L_0x012a:
            X.6Di r12 = (X.C128716Di) r12
        L_0x012c:
            r4 = 0
            if (r12 == 0) goto L_0x01d7
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.56y r7 = r2.A0H
            java.lang.String r9 = r12.A00
            int r2 = r2.A00
            r7.A09(r9, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.1KT r7 = r2.A0G
            java.lang.String r2 = r12.A03
            int r2 = r2.hashCode()
            r7.A09(r9, r2)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.1KT r8 = r2.A0G
            X.6E7 r2 = r15.$extensionsContextParams
            boolean r7 = r2.A0C
            java.lang.String r2 = r2.A05
            int r2 = r2.hashCode()
            r8.A04(r2, r5, r7)
            java.lang.String r2 = "DRAFT"
            boolean r2 = X.AnonymousClass00C.A0J(r9, r2)
            if (r2 != 0) goto L_0x01ac
            X.6E7 r2 = r15.$extensionsContextParams
            java.lang.String r4 = r2.A06
            java.lang.String r2 = r2.A04
            boolean r2 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A0A(r4, r2)
            if (r2 != 0) goto L_0x017b
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.1KT r4 = r2.A0G
            X.6E7 r2 = r15.$extensionsContextParams
            java.lang.String r2 = r2.A05
            int r2 = r2.hashCode()
            r4.A0G(r0, r2)
        L_0x017b:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.1Kf r5 = r2.A0I
            java.lang.Integer r4 = X.C90524aI.A0a(r11)
            java.lang.Short r2 = new java.lang.Short
            r2.<init>(r1)
            r5.A0D(r4, r2)
            X.6E7 r4 = r15.$extensionsContextParams
            java.lang.String r1 = r12.A02
            r4.A00 = r1
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r2 = r15.this$0
            X.7ji r1 = r15.$flowTerminationCallback
            boolean r1 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A09(r4, r2, r12, r6, r1)
            if (r1 != 0) goto L_0x0042
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r11 = r15.this$0
            X.6E7 r10 = r15.$extensionsContextParams
            X.7hO r13 = r15.$flowReadyCallback
            X.7ji r14 = r15.$flowTerminationCallback
            r15.label = r0
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A01(r10, r11, r12, r13, r14, r15)
        L_0x01a9:
            if (r0 != r3) goto L_0x0042
            return r3
        L_0x01ac:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r15.this$0
            X.1KT r2 = r0.A0G
            X.6E7 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r0 = r0.hashCode()
            r2.A0G(r4, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r15.this$0
            X.1Kf r2 = r0.A0I
            java.lang.String r0 = "draft"
            r2.A0C(r11, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r15.this$0
            X.6E7 r4 = r15.$extensionsContextParams
            X.7hO r2 = r15.$flowReadyCallback
            X.7ji r0 = r15.$flowTerminationCallback
            r15.label = r1
            r6 = r2
            r7 = r0
            r8 = r15
            r9 = r11
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A02(r4, r5, r6, r7, r8, r9)
            goto L_0x01a9
        L_0x01d7:
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r15.this$0
            X.1KT r1 = r0.A0G
            X.6E7 r0 = r15.$extensionsContextParams
            java.lang.String r0 = r0.A05
            int r0 = r0.hashCode()
            r1.A0G(r4, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r0 = r15.this$0
            X.1Kf r1 = r0.A0I
            java.lang.String r0 = "unknown_extension"
            r1.A0C(r11, r0)
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r5 = r15.this$0
            X.6E7 r4 = r15.$extensionsContextParams
            X.7hO r1 = r15.$flowReadyCallback
            X.7ji r0 = r15.$flowTerminationCallback
            r15.label = r2
            r6 = r1
            r7 = r0
            r8 = r15
            r9 = r11
            java.lang.Object r0 = com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines.A03(r4, r5, r6, r7, r8, r9)
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
