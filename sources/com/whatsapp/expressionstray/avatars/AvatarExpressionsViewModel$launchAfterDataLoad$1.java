package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$launchAfterDataLoad$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {406, 407}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$launchAfterDataLoad$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $block;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$launchAfterDataLoad$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C023509x r3, C006302t r4) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
        this.$block = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarExpressionsViewModel$launchAfterDataLoad$1(this.this$0, r5, this.$block);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0022
            if (r0 != r2) goto L_0x0030
            X.AnonymousClass0AN.A00(r5)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r5)
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r4.this$0
            X.0sO r0 = r0.A0E
            r4.label = r1
            java.lang.Object r0 = r0.B1c(r4)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x0022:
            X.AnonymousClass0AN.A00(r5)
        L_0x0025:
            X.02t r0 = r4.$block
            r4.label = r2
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$launchAfterDataLoad$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$launchAfterDataLoad$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
