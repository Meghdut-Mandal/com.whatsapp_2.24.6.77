package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onSearchStarted$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {355, 359, 361}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onSearchStarted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $preFilledQuery;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onSearchStarted$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsKeyboardViewModel;
        this.$preFilledQuery = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsKeyboardViewModel$onSearchStarted$1(this.this$0, this.$preFilledQuery, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 3
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r7) goto L_0x00a0
            if (r0 == r2) goto L_0x00a0
            if (r0 == r3) goto L_0x00a0
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0014:
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r10.this$0
            X.5q5 r1 = r0.A02
            X.55N r0 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0037
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = r10.this$0
            int r1 = r5.A00
            r0 = 7
            if (r1 == r0) goto L_0x0037
            X.05J r5 = r5.A0I
            X.55A r0 = X.AnonymousClass55A.A00
            r10.label = r7
        L_0x0030:
            java.lang.Object r0 = r5.B6N(r0, r10)
            if (r0 != r4) goto L_0x00a3
            return r4
        L_0x0037:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r6 = r10.this$0
            X.57q r5 = new X.57q
            r5.<init>()
            int r0 = r6.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            switch(r0) {
                case 2: goto L_0x0091;
                case 3: goto L_0x0097;
                case 4: goto L_0x0099;
                case 5: goto L_0x008f;
                default: goto L_0x004f;
            }
        L_0x004f:
            r0 = r7
        L_0x0050:
            r5.A00 = r0
            X.5q5 r1 = r6.A02
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0065
            X.55O r0 = X.AnonymousClass55O.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0088
            r9 = r7
        L_0x0065:
            r5.A01 = r9
            X.0wo r0 = r6.A06
            long r0 = X.C19970wo.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A02 = r0
            X.0yW r0 = r6.A0C
            r0.Bly(r5)
            java.lang.String r1 = r10.$preFilledQuery
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r10.this$0
            X.05J r5 = r0.A0I
            if (r1 == 0) goto L_0x009b
            X.553 r0 = new X.553
            r0.<init>(r1)
            r10.label = r2
            goto L_0x0030
        L_0x0088:
            X.55P r0 = X.AnonymousClass55P.A00
            X.AnonymousClass00C.A0J(r1, r0)
            r9 = r8
            goto L_0x0065
        L_0x008f:
            r0 = 5
            goto L_0x0092
        L_0x0091:
            r0 = 4
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0050
        L_0x0097:
            r0 = r9
            goto L_0x0050
        L_0x0099:
            r0 = r8
            goto L_0x0050
        L_0x009b:
            X.559 r0 = X.AnonymousClass559.A00
            r10.label = r3
            goto L_0x0030
        L_0x00a0:
            X.AnonymousClass0AN.A00(r11)
        L_0x00a3:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onSearchStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsKeyboardViewModel$onSearchStarted$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
