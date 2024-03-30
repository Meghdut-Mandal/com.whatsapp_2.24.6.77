package com.whatsapp.expressionstray.social;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019508h;
import X.C023509x;
import X.C124215xm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$1", f = "SocialStickersDataFlow.kt", i = {1, 1}, l = {96, 98, 109, 111}, m = "invokeSuspend", n = {"$this$combineTransform", "chatFbId"}, s = {"L$0", "L$1"})
public final class SocialStickersDataFlow$observeSocialStickers$1 extends AnonymousClass0A1 implements C019508h {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ C124215xm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$1(C124215xm r2, C023509x r3) {
        super(4, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        SocialStickersDataFlow$observeSocialStickers$1 socialStickersDataFlow$observeSocialStickers$1 = new SocialStickersDataFlow$observeSocialStickers$1(this.this$0, (C023509x) obj4);
        socialStickersDataFlow$observeSocialStickers$1.L$0 = obj;
        socialStickersDataFlow$observeSocialStickers$1.L$1 = obj2;
        socialStickersDataFlow$observeSocialStickers$1.L$2 = obj3;
        return socialStickersDataFlow$observeSocialStickers$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r7 = 4
            r6 = 3
            r9 = 2
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 == r3) goto L_0x008b
            if (r0 == r9) goto L_0x0050
            if (r0 == r6) goto L_0x008b
            if (r0 == r7) goto L_0x008b
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0018:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r4 = r10.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            java.lang.Object r2 = r10.L$1
            java.lang.Object r0 = r10.L$2
            if (r2 == 0) goto L_0x0047
            boolean r0 = r0 instanceof X.C106125Il
            if (r0 != 0) goto L_0x0047
            X.5xm r0 = r10.this$0
            X.1Bv r0 = r0.A04
            java.util.Set r0 = r0.A00()
            int r1 = r0.size()
            X.55l r0 = new X.55l
            r0.<init>(r1)
            r10.L$0 = r4
            r10.L$1 = r2
            r10.label = r9
            java.lang.Object r0 = r4.B6N(r0, r10)
            if (r0 != r8) goto L_0x0059
            return r8
        L_0x0047:
            X.55n r1 = X.C1034655n.A00
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r3
            goto L_0x007b
        L_0x0050:
            java.lang.Object r2 = r10.L$1
            java.lang.Object r4 = r10.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r11)
        L_0x0059:
            X.5xm r0 = r10.this$0
            X.1Br r3 = r0.A01
            java.util.List r2 = X.C36371kC.A11(r2)
            X.02l r1 = r3.A09
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1
            r0.<init>(r3, r5, r2, r5)
            java.lang.Object r0 = X.C110515an.A00(r1, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0082
            X.55m r1 = new X.55m
            r1.<init>(r0)
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r6
        L_0x007b:
            java.lang.Object r0 = r4.B6N(r1, r10)
            if (r0 != r8) goto L_0x008e
            return r8
        L_0x0082:
            X.55n r1 = X.C1034655n.A00
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r7
            goto L_0x007b
        L_0x008b:
            X.AnonymousClass0AN.A00(r11)
        L_0x008e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
