package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019408g;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {0}, l = {220, 193}, m = "invokeSuspend", n = {"searchQuery"}, s = {"L$1"})
public final class AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C023509x r3) {
        super(3, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(this.this$0, (C023509x) obj3);
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x004e
            if (r0 != r6) goto L_0x0088
            X.AnonymousClass0AN.A00(r9)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0034
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0034
            r0 = 500(0x1f4, double:2.47E-321)
            r8.L$0 = r4
            r8.L$1 = r7
            r8.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r8, r0)
            if (r0 != r5) goto L_0x0059
            return r5
        L_0x0034:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r7 = r8.this$0
            int r2 = r7.A00
            r1 = 7
            X.6Lt r0 = r7.A03
            if (r2 != r1) goto L_0x0046
            X.05H r1 = r0.A0C
            r0 = 1
            X.7rt r3 = new X.7rt
            r3.<init>(r7, r1, r0)
            goto L_0x007a
        L_0x0046:
            X.05H r0 = r0.A0B
            X.7rt r3 = new X.7rt
            r3.<init>(r7, r0, r6)
            goto L_0x007a
        L_0x004e:
            java.lang.Object r7 = r8.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r9)
        L_0x0059:
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r3 = r8.this$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r3.A06
            X.5IH r1 = new X.5IH
            r1.<init>(r7)
            r0 = 0
            X.0nA r0 = r2.A02(r1, r0)
            r2 = 0
            X.7rr r1 = new X.7rr
            r1.<init>(r3, r0, r7, r2)
            X.02l r0 = r3.A0F
            X.05H r1 = X.AnonymousClass0R1.A00(r0, r1)
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = r8.this$0
            X.7rt r3 = new X.7rt
            r3.<init>(r0, r1, r2)
        L_0x007a:
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.label = r6
            java.lang.Object r0 = X.C06820Vf.A00(r8, r3, r4)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
