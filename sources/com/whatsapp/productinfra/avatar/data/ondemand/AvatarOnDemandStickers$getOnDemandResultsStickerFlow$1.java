package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C111375cB;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1", f = "AvatarOnDemandStickers.kt", i = {0, 1, 1}, l = {221, 225, 230}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "stickerLocations"}, s = {"L$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ C111375cB $searchType;
    public final /* synthetic */ List $stableIds;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(C111375cB r2, AvatarOnDemandStickers avatarOnDemandStickers, List list, C023509x r5, int i) {
        super(2, r5);
        this.this$0 = avatarOnDemandStickers;
        this.$stableIds = list;
        this.$qplInstanceKey = i;
        this.$searchType = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1 avatarOnDemandStickers$getOnDemandResultsStickerFlow$1 = new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType, this.this$0, this.$stableIds, r8, this.$qplInstanceKey);
        avatarOnDemandStickers$getOnDemandResultsStickerFlow$1.L$0 = obj;
        return avatarOnDemandStickers$getOnDemandResultsStickerFlow$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r12 == r2) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r8 = r11
            int r0 = r11.label
            r3 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x0036
            if (r0 == r7) goto L_0x0094
            if (r0 != r3) goto L_0x00b3
            X.AnonymousClass0AN.A00(r12)
        L_0x0013:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0016:
            X.AnonymousClass0AN.A00(r12)
            java.lang.Object r9 = r11.L$0
            X.05G r9 = (X.AnonymousClass05G) r9
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.1Bn r6 = r0.A03
            java.util.List r5 = r11.$stableIds
            r11.L$0 = r9
            r11.label = r1
            X.02l r4 = r6.A07
            r1 = 0
            com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 r0 = new com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2
            r0.<init>(r6, r5, r1)
            java.lang.Object r12 = X.AnonymousClass0A2.A00(r11, r4, r0)
            if (r12 != r2) goto L_0x003d
        L_0x0035:
            return r2
        L_0x0036:
            java.lang.Object r9 = r11.L$0
            X.05G r9 = (X.AnonymousClass05G) r9
            X.AnonymousClass0AN.A00(r12)
        L_0x003d:
            java.util.List r12 = (java.util.List) r12
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.1HC r4 = r0.A01
            int r1 = r11.$qplInstanceKey
            java.lang.String r0 = "stickers_located"
            r4.A01(r1, r0)
            X.5cB r5 = r11.$searchType
            r11.L$0 = r9
            r11.L$1 = r12
            r11.label = r7
            java.util.ArrayList r4 = X.C36321k7.A0J(r12)
            java.util.Iterator r6 = r12.iterator()
        L_0x005a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r6.next()
            X.5cD r1 = (X.C111395cD) r1
            boolean r0 = r1 instanceof X.AnonymousClass5IO
            if (r0 == 0) goto L_0x0077
            X.5IO r1 = (X.AnonymousClass5IO) r1
            X.6c4 r0 = r1.A00
            X.5IM r1 = new X.5IM
            r1.<init>(r0)
        L_0x0073:
            r4.add(r1)
            goto L_0x005a
        L_0x0077:
            boolean r0 = r1 instanceof X.AnonymousClass5IP
            if (r0 == 0) goto L_0x00b8
            X.5IP r1 = (X.AnonymousClass5IP) r1
            X.690 r0 = r1.A00
            java.lang.String r0 = r0.A00
            X.5IL r1 = new X.5IL
            r1.<init>(r0)
            goto L_0x0073
        L_0x0087:
            X.5IK r0 = new X.5IK
            r0.<init>(r5, r4)
            java.lang.Object r0 = r9.B6N(r0, r11)
            if (r0 == r2) goto L_0x0035
            r7 = r12
            goto L_0x009f
        L_0x0094:
            java.lang.Object r7 = r11.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r9 = r11.L$0
            X.05G r9 = (X.AnonymousClass05G) r9
            X.AnonymousClass0AN.A00(r12)
        L_0x009f:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r6 = r11.this$0
            X.5cB r5 = r11.$searchType
            int r10 = r11.$qplInstanceKey
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.label = r3
            java.lang.Object r0 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L_0x0013
            return r2
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00b8:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
