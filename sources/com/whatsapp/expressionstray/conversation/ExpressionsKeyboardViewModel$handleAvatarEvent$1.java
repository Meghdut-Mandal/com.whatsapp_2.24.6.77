package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C111405cE;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$handleAvatarEvent$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$handleAvatarEvent$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C111405cE $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$handleAvatarEvent$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C111405cE r3, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsKeyboardViewModel;
        this.$event = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsKeyboardViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r8.this$0.A0B.A0E(4890) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r0.contains(r2) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x005f
            if (r0 != r6) goto L_0x007b
            java.lang.Object r5 = r8.L$0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel) r5
            X.AnonymousClass0AN.A00(r9)
        L_0x0010:
            java.util.List r9 = (java.util.List) r9
            r5.A04 = r9
            X.5cE r1 = r8.$event
            boolean r0 = r1 instanceof X.AnonymousClass5IU
            if (r0 == 0) goto L_0x004e
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r8.this$0
            r0 = 0
            r1.A01 = r0
            X.5q5 r1 = r1.A02
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0049
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r0 = r0.A04
            X.55P r2 = X.AnonymousClass55P.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0049
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.0yC r1 = r0.A0B
            r0 = 4890(0x131a, float:6.852E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0049
        L_0x0041:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
        L_0x0043:
            r0.A0S(r2)
        L_0x0046:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0049:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.5q5 r2 = r0.A02
            goto L_0x0043
        L_0x004e:
            boolean r0 = r1 instanceof X.AnonymousClass5IT
            if (r0 == 0) goto L_0x0046
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r0 = r0.A04
            X.55M r2 = X.AnonymousClass55M.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0046
            goto L_0x0041
        L_0x005f:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = r8.this$0
            X.6PO r4 = r5.A08
            int r3 = r5.A00
            r8.L$0 = r5
            r8.label = r6
            X.02l r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r3, r6)
            java.lang.Object r9 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0010
            return r7
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$handleAvatarEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsKeyboardViewModel$handleAvatarEvent$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
