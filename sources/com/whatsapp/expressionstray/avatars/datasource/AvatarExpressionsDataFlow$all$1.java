package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C130616Lt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1", f = "AvatarExpressionsDataFlow.kt", i = {0}, l = {104, 106, 110}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class AvatarExpressionsDataFlow$all$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$1(C130616Lt r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarExpressionsDataFlow$all$1 avatarExpressionsDataFlow$all$1 = new AvatarExpressionsDataFlow$all$1(this.this$0, r4);
        avatarExpressionsDataFlow$all$1.L$0 = obj;
        return avatarExpressionsDataFlow$all$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 0
            r5 = 3
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r8) goto L_0x003e
            if (r0 == r4) goto L_0x0067
            if (r0 == r5) goto L_0x0067
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0015:
            X.AnonymousClass0AN.A00(r10)
            java.lang.Object r3 = r9.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.6Lt r2 = r9.this$0
            X.5Ao r0 = r2.A04
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0058
            com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1 r0 = new com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1
            r0.<init>(r2, r7)
            X.0nG r1 = X.AnonymousClass0R0.A00(r0)
            X.02l r0 = r2.A09
            X.05H r0 = X.AnonymousClass0R1.A00(r0, r1)
            r9.L$0 = r3
            r9.label = r8
            java.lang.Object r10 = X.C07350Xh.A02(r9, r0)
            if (r10 != r6) goto L_0x0045
            return r6
        L_0x003e:
            java.lang.Object r3 = r9.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r10)
        L_0x0045:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x004f
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x0058
        L_0x004f:
            java.lang.Boolean r0 = X.C36381kD.A0j()
            r9.L$0 = r7
            r9.label = r4
            goto L_0x0060
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r9.L$0 = r7
            r9.label = r5
        L_0x0060:
            java.lang.Object r0 = r3.B6N(r0, r9)
            if (r0 != r6) goto L_0x006a
            return r6
        L_0x0067:
            X.AnonymousClass0AN.A00(r10)
        L_0x006a:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$all$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
