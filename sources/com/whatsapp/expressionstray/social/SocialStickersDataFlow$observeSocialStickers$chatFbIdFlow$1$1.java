package com.whatsapp.expressionstray.social;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass11F;
import X.C009003v;
import X.C023509x;
import X.C124215xm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1", f = "SocialStickersDataFlow.kt", i = {0, 1, 2, 2}, l = {53, 55, 59, 78, 80}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "fbId"}, s = {"L$0", "L$0", "L$0", "L$1"})
public final class SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ String $ownFbId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C124215xm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(C124215xm r2, AnonymousClass11F r3, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$chatJid = r3;
        this.$ownFbId = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1 = new SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(this.this$0, this.$chatJid, this.$ownFbId, r6);
        socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1.L$0 = obj;
        return socialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (r0 != r4) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r2 = r10.label
            r7 = 5
            r6 = 4
            r9 = 3
            r1 = 2
            r0 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0025
            if (r2 == r0) goto L_0x0037
            if (r2 == r1) goto L_0x0058
            if (r2 == r9) goto L_0x001b
            if (r2 == r6) goto L_0x00c3
            if (r2 == r7) goto L_0x00c3
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001b:
            java.lang.Object r9 = r10.L$1
            java.lang.Object r8 = r10.L$0
            X.05G r8 = (X.AnonymousClass05G) r8
            X.AnonymousClass0AN.A00(r11)
            goto L_0x0077
        L_0x0025:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r8 = r10.L$0
            X.05G r8 = (X.AnonymousClass05G) r8
            r10.L$0 = r8
            r10.label = r0
            java.lang.Object r0 = r8.B6N(r5, r10)
            if (r0 != r4) goto L_0x003e
            return r4
        L_0x0037:
            java.lang.Object r8 = r10.L$0
            X.05G r8 = (X.AnonymousClass05G) r8
            X.AnonymousClass0AN.A00(r11)
        L_0x003e:
            X.5xm r0 = r10.this$0
            X.5r0 r3 = r0.A03
            X.11F r2 = r10.$chatJid
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r10.L$0 = r8
            r10.label = r1
            X.02l r1 = r3.A01
            com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2 r0 = new com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2
            r0.<init>(r2, r3, r5)
            java.lang.Object r11 = X.AnonymousClass0A2.A00(r10, r1, r0)
            if (r11 != r4) goto L_0x005f
            return r4
        L_0x0058:
            java.lang.Object r8 = r10.L$0
            X.05G r8 = (X.AnonymousClass05G) r8
            X.AnonymousClass0AN.A00(r11)
        L_0x005f:
            X.5cF r11 = (X.C111415cF) r11
            boolean r0 = r11 instanceof X.C106085Ih
            if (r0 == 0) goto L_0x00ba
            r0 = r11
            X.5Ih r0 = (X.C106085Ih) r0
            java.lang.String r0 = r0.A00
            r10.L$0 = r8
            r10.L$1 = r11
            r10.label = r9
            java.lang.Object r0 = r8.B6N(r0, r10)
            if (r0 == r4) goto L_0x00b9
            r9 = r11
        L_0x0077:
            X.5xm r0 = r10.this$0
            X.5mp r0 = r0.A02
            X.0sR r0 = r0.A00
            X.0nH r3 = X.C06810Ve.A01(r0)
            java.lang.String r1 = r10.$ownFbId
            r0 = 1
            X.7rr r2 = new X.7rr
            r2.<init>(r3, r9, r1, r0)
            r0 = 2
            X.7rs r1 = new X.7rs
            r1.<init>(r2, r0)
            com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$3 r0 = new com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$3
            r0.<init>(r5)
            X.0tH r3 = new X.0tH
            r3.<init>((X.C009003v) r0, (X.AnonymousClass05H) r1, (int) r7)
            X.5xm r2 = r10.this$0
            X.11F r1 = r10.$chatJid
            com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$4 r0 = new com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1$4
            r0.<init>(r1, r5, r8)
            X.0tH r1 = new X.0tH
            r1.<init>((X.C009003v) r0, (X.AnonymousClass05H) r3, (int) r7)
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r6
            X.0j8 r0 = X.C13080j8.A00
            java.lang.Object r0 = r1.B36(r10, r0)
            if (r0 == r4) goto L_0x00b9
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x00b7:
            if (r0 != r4) goto L_0x00c6
        L_0x00b9:
            return r4
        L_0x00ba:
            r10.L$0 = r5
            r10.label = r7
            java.lang.Object r0 = r8.B6N(r5, r10)
            goto L_0x00b7
        L_0x00c3:
            X.AnonymousClass0AN.A00(r11)
        L_0x00c6:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
