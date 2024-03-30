package X;

/* renamed from: X.7OY  reason: invalid class name */
public final class AnonymousClass7OY extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ C132826Vk $flowTerminationCallback;
    public final /* synthetic */ AnonymousClass54F this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OY(C132826Vk r2, AnonymousClass54F r3, AnonymousClass6E7 r4) {
        super(0);
        this.this$0 = r3;
        this.$extensionsContextParams = r4;
        this.$flowTerminationCallback = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.6Di} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.6Di} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r22 = this;
            r2 = r22
            X.54F r0 = r2.this$0
            X.0yC r1 = r0.A06
            r0 = 5764(0x1684, float:8.077E-42)
            boolean r1 = r1.A0E(r0)
            X.54F r0 = r2.this$0
            if (r1 == 0) goto L_0x0029
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines r4 = r0.A01
            X.6E7 r3 = r2.$extensionsContextParams
            r5 = 0
            X.6Vk r6 = r2.$flowTerminationCallback
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.040 r0 = r4.A0Q
            com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1 r2 = new com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixFlowsManagerWithCoroutines$startExtensionFlow$1
            r7 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            X.C36331k8.A1T(r2, r0)
        L_0x0026:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0029:
            X.6Xv r6 = r0.A00
            X.6E7 r5 = r2.$extensionsContextParams
            r18 = 0
            X.6Vk r4 = r2.$flowTerminationCallback
            r10 = 0
            X.AnonymousClass00C.A0D(r5, r10)
            X.0yC r1 = r6.A0L
            r0 = 5333(0x14d5, float:7.473E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x004f
            r0 = 1319(0x527, float:1.848E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "extensions-features-disabled"
            X.C133316Xv.A05(r6, r4, r0, r1)
            goto L_0x0026
        L_0x004f:
            int r2 = r5.hashCode()
            r6.A00 = r2
            X.56y r11 = r6.A0I
            java.lang.String r0 = "phoenixExtensionFlow"
            r11.A01(r2, r0)
            int r7 = r6.A00
            java.lang.String r0 = r5.A08
            r21 = r0
            java.lang.String r0 = r5.A09
            r20 = r0
            com.whatsapp.jid.UserJid r3 = r5.A02
            java.lang.String r2 = r5.A05
            r12 = r3
            r13 = r21
            r14 = r0
            r15 = r2
            r16 = r7
            r11.A06(r12, r13, r14, r15, r16)
            int r0 = r6.A00
            boolean r13 = r5.A0C
            java.lang.String r12 = "is_resumed"
            r11.A04(r0, r12, r13)
            X.0wo r0 = r6.A0A
            long r16 = X.C19970wo.A00(r0)
            X.1KW r7 = r6.A0C
            java.lang.String r0 = r3.user
            long r14 = r7.A00(r0, r2)
            r7 = 0
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            r0 = 2892(0xb4c, float:4.053E-42)
            long r7 = X.C36441kJ.A0B(r1, r0)
            r0 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 * r0
            long r7 = r7 + r14
        L_0x009c:
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            java.lang.String r5 = "extensions-banned-id-error"
            X.C133316Xv.A05(r6, r4, r5, r2)
            X.6OE r4 = r6.A08
            X.185 r1 = r6.A06
            X.6NP r0 = r6.A0E
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            java.lang.String r13 = "galaxy_message"
            r15 = r21
            r16 = r20
            r17 = r5
            r8 = r4
            r9 = r1
            r10 = r0
            r11 = r3
            r14 = r2
            r8.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0026
        L_0x00c1:
            X.1Kf r9 = r6.A0J
            r1 = 0
            java.lang.String r0 = "user_interaction"
            int r8 = r9.A0B(r3, r0)
            r14 = r9
            r15 = r3
            r16 = r21
            r17 = r20
            r18 = r2
            r19 = r8
            r14.A06(r15, r16, r17, r18, r19)
            X.1Kg r0 = r6.A0F
            r17 = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            X.5tN r14 = r0.A05(r3, r7, r2)
            if (r14 == 0) goto L_0x015e
            java.util.List r0 = r14.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x00eb:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r15 = r16.next()
            r0 = r15
            X.6Di r0 = (X.C128716Di) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)
            if (r0 == 0) goto L_0x00eb
            r1 = r15
        L_0x0101:
            X.6Di r1 = (X.C128716Di) r1
            if (r1 == 0) goto L_0x015e
            java.lang.String r15 = r1.A00
            int r0 = r6.A00
            r11.A09(r15, r0)
            X.1KT r11 = r6.A0H
            java.lang.String r0 = r1.A03
            int r0 = r0.hashCode()
            r11.A09(r15, r0)
            int r0 = r2.hashCode()
            r11.A04(r0, r12, r13)
            java.lang.String r12 = "DRAFT"
            boolean r12 = X.AnonymousClass00C.A0J(r15, r12)
            if (r12 != 0) goto L_0x014b
            java.lang.String r3 = r5.A06
            java.lang.String r2 = r5.A04
            boolean r2 = X.C133316Xv.A07(r3, r2)
            if (r2 != 0) goto L_0x0134
            r2 = 1
            r11.A0G(r2, r0)
        L_0x0134:
            r0 = 2
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r9.A0D(r7, r0)
            java.lang.String r0 = r1.A02
            r5.A00 = r0
            boolean r0 = X.C133316Xv.A06(r6, r5, r1, r14, r4)
            if (r0 != 0) goto L_0x0026
            X.C133316Xv.A02(r6, r5, r1, r4)
            goto L_0x0026
        L_0x014b:
            r11.A0G(r10, r0)
            java.lang.String r0 = "draft"
            r9.A0C(r8, r0)
            r14 = 1
            X.7sH r9 = new X.7sH
            r10 = r6
            r11 = r5
            r12 = r4
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0176
        L_0x015e:
            X.1KT r1 = r6.A0H
            int r0 = r2.hashCode()
            r1.A0G(r10, r0)
            java.lang.String r0 = "unknown_extension"
            r9.A0C(r8, r0)
            X.7sH r9 = new X.7sH
            r14 = 0
            r10 = r6
            r11 = r5
            r12 = r4
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0176:
            r15 = 0
            r8 = r17
            r10 = r3
            r11 = r7
            r12 = r21
            r13 = r20
            r14 = r2
            r8.A07(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7OY.invoke():java.lang.Object");
    }
}
