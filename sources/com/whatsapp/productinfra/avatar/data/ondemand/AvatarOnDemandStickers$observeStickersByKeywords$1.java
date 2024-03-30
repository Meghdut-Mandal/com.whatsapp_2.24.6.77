package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C111375cB;
import X.C17980sO;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1", f = "AvatarOnDemandStickers.kt", i = {0, 0, 1, 2, 2, 3, 4, 4, 4, 5, 5}, l = {104, 106, 121, 123, 134, 143, 152}, m = "invokeSuspend", n = {"$this$flow", "qplInstanceKey", "qplInstanceKey", "$this$flow", "qplInstanceKey", "it", "$this$flow", "stableIds", "qplInstanceKey", "$this$flow", "stableIds"}, s = {"L$0", "I$0", "I$0", "L$0", "I$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$observeStickersByKeywords$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C17980sO $fetchStickersSignal;
    public final /* synthetic */ String[] $keywords;
    public final /* synthetic */ C111375cB $searchType;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersByKeywords$1(C111375cB r2, AvatarOnDemandStickers avatarOnDemandStickers, C023509x r4, C17980sO r5, String[] strArr) {
        super(2, r4);
        this.this$0 = avatarOnDemandStickers;
        this.$searchType = r2;
        this.$fetchStickersSignal = r5;
        this.$keywords = strArr;
    }

    public final C023509x create(Object obj, C023509x r8) {
        AvatarOnDemandStickers$observeStickersByKeywords$1 avatarOnDemandStickers$observeStickersByKeywords$1 = new AvatarOnDemandStickers$observeStickersByKeywords$1(this.$searchType, this.this$0, r8, this.$fetchStickersSignal, this.$keywords);
        avatarOnDemandStickers$observeStickersByKeywords$1.L$0 = obj;
        return avatarOnDemandStickers$observeStickersByKeywords$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r12 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r2 = r14.this$0;
        r14.L$0 = r2;
        r14.I$0 = r6;
        r14.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r1.B6N(r12, r14) != r7) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r14.this$0.A01.A01(r6, "sticker_search_initialized");
        r0 = r14.this$0;
        r2 = r14.$keywords;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8 = r0.A02;
        r14.L$0 = r1;
        r14.I$0 = r6;
        r14.label = 3;
        r12 = X.AnonymousClass0A2.A00(r14, r8.A00, new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2(r8, (X.C023509x) null, (java.lang.String[]) java.util.Arrays.copyOf(r2, r2.length)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r12 != r7) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        r12 = (java.util.List) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        r12 = X.C90524aI.A0t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r2 = r14.$searchType;
        r0 = r14.this$0;
        r3 = X.AnonymousClass0AK.A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r3 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r12 = (java.util.List) r12;
        r0.A01.A01(r6, "sticker_search_done");
        r5 = r14.$searchType;
        r4 = X.C36321k7.A0J(r12);
        r3 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if (r3.hasNext() != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        r4.add(new X.AnonymousClass5IL(((X.AnonymousClass690) r3.next()).A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ea, code lost:
        r2 = new X.AnonymousClass5IK(r5, r4);
        r14.L$0 = r1;
        r14.L$1 = r12;
        r14.I$0 = r6;
        r14.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fc, code lost:
        if (r1.B6N(r2, r14) == r7) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        r14.this$0.A01.A01(r6, "loading_stickers_emitted_to_ui");
        r0 = r14.$fetchStickersSignal;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        if (r0 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        r14.this$0.A01.A02(X.C52322pF.SUCCESS, r6);
        r2 = r14.$fetchStickersSignal;
        r14.L$0 = r1;
        r14.L$1 = r12;
        r14.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        if (r2.B1c(r14) != r7) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        r12 = r0;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        r10 = r14.this$0;
        r2 = X.C06830Vg.A00(new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(r14.$searchType, r10, r11, r12, (X.C023509x) null), r10.A04.A07);
        r14.L$0 = null;
        r14.L$1 = null;
        r14.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0157, code lost:
        if (X.C06820Vf.A00(r14, r2, r1) != r7) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0159, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015a, code lost:
        r11 = X.C90524aI.A0a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015f, code lost:
        r6 = new X.AnonymousClass5IJ(r2, r3);
        r14.L$0 = r0;
        r14.L$1 = r3;
        r14.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        if (r1.B6N(r6, r14) == r7) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0171, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017d, code lost:
        r2 = r0.A00;
        r1 = X.AnonymousClass000.A0u();
        r1.append("search failed (");
        r2.A02(3, "observe_stickers_failed", X.C36321k7.A0E(r3.getMessage(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        r2.A00.A02(3, "observe_stickers_failed", "search not initialized");
        r2.A01.A02(X.C52322pF.FAIL, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ad, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r12 = r15
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r14.label
            java.lang.String r5 = "observe_stickers_failed"
            r13 = 0
            r4 = 3
            switch(r0) {
                case 0: goto L_0x002b;
                case 1: goto L_0x0066;
                case 2: goto L_0x0194;
                case 3: goto L_0x0023;
                case 4: goto L_0x0172;
                case 5: goto L_0x00ff;
                case 6: goto L_0x0016;
                case 7: goto L_0x0011;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0011:
            X.AnonymousClass0AN.A00(r15)
            goto L_0x01ab
        L_0x0016:
            java.lang.Object r0 = r14.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r14.L$0
            X.05G r1 = (X.AnonymousClass05G) r1
            X.AnonymousClass0AN.A00(r15)
            goto L_0x0139
        L_0x0023:
            int r6 = r14.I$0
            java.lang.Object r1 = r14.L$0
            X.05G r1 = (X.AnonymousClass05G) r1
            goto L_0x00ab
        L_0x002b:
            X.AnonymousClass0AN.A00(r15)
            java.lang.Object r1 = r14.L$0
            X.05G r1 = (X.AnonymousClass05G) r1
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r0 = r0.A01
            int r6 = r0.A00()
            X.5cB r2 = r14.$searchType
            boolean r0 = r2 instanceof X.AnonymousClass5IH
            if (r0 == 0) goto L_0x005b
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r2 = r0.A01
            java.lang.String r0 = "sticker_search_started"
        L_0x0046:
            r2.A01(r6, r0)
        L_0x0049:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r3 = r14.this$0
            X.5cB r2 = r14.$searchType
            r14.L$0 = r1
            r14.I$0 = r6
            r0 = 1
            r14.label = r0
            java.lang.Object r12 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A01(r2, r3, r14, r6)
            if (r12 != r7) goto L_0x006f
            return r7
        L_0x005b:
            boolean r0 = r2 instanceof X.AnonymousClass5IG
            if (r0 == 0) goto L_0x0049
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r2 = r0.A01
            java.lang.String r0 = "sticker_category_requested"
            goto L_0x0046
        L_0x0066:
            int r6 = r14.I$0
            java.lang.Object r1 = r14.L$0
            X.05G r1 = (X.AnonymousClass05G) r1
            X.AnonymousClass0AN.A00(r15)
        L_0x006f:
            if (r12 == 0) goto L_0x0081
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r14.this$0
            r14.L$0 = r2
            r14.I$0 = r6
            r0 = 2
            r14.label = r0
            java.lang.Object r0 = r1.B6N(r12, r14)
            if (r0 != r7) goto L_0x019d
            return r7
        L_0x0081:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r2 = r0.A01
            java.lang.String r0 = "sticker_search_initialized"
            r2.A01(r6, r0)
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            java.lang.String[] r2 = r14.$keywords
            X.5Ao r8 = r0.A02     // Catch:{ all -> 0x00b1 }
            int r0 = r2.length     // Catch:{ all -> 0x00b1 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x00b1 }
            r14.L$0 = r1     // Catch:{ all -> 0x00b1 }
            r14.I$0 = r6     // Catch:{ all -> 0x00b1 }
            r14.label = r4     // Catch:{ all -> 0x00b1 }
            X.02l r2 = r8.A00     // Catch:{ all -> 0x00b1 }
            com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2 r0 = new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2     // Catch:{ all -> 0x00b1 }
            r0.<init>(r8, r13, r3)     // Catch:{ all -> 0x00b1 }
            java.lang.Object r12 = X.AnonymousClass0A2.A00(r14, r2, r0)     // Catch:{ all -> 0x00b1 }
            if (r12 != r7) goto L_0x00ae
            return r7
        L_0x00ab:
            X.AnonymousClass0AN.A00(r15)     // Catch:{ all -> 0x00b1 }
        L_0x00ae:
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x00b1 }
            goto L_0x00b6
        L_0x00b1:
            r0 = move-exception
            X.03N r12 = X.C90524aI.A0t(r0)
        L_0x00b6:
            X.5cB r2 = r14.$searchType
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            java.lang.Throwable r3 = X.AnonymousClass0AK.A00(r12)
            if (r3 != 0) goto L_0x015f
            java.util.List r12 = (java.util.List) r12
            X.1HC r2 = r0.A01
            java.lang.String r0 = "sticker_search_done"
            r2.A01(r6, r0)
            X.5cB r5 = r14.$searchType
            java.util.ArrayList r4 = X.C36321k7.A0J(r12)
            java.util.Iterator r3 = r12.iterator()
        L_0x00d3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r3.next()
            X.690 r0 = (X.AnonymousClass690) r0
            java.lang.String r2 = r0.A00
            X.5IL r0 = new X.5IL
            r0.<init>(r2)
            r4.add(r0)
            goto L_0x00d3
        L_0x00ea:
            X.5IK r2 = new X.5IK
            r2.<init>(r5, r4)
            r14.L$0 = r1
            r14.L$1 = r12
            r14.I$0 = r6
            r0 = 5
            r14.label = r0
            java.lang.Object r0 = r1.B6N(r2, r14)
            if (r0 != r7) goto L_0x010d
            return r7
        L_0x00ff:
            int r6 = r14.I$0
            java.lang.Object r0 = r14.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r14.L$0
            X.05G r1 = (X.AnonymousClass05G) r1
            X.AnonymousClass0AN.A00(r15)
            r12 = r0
        L_0x010d:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r2 = r0.A01
            java.lang.String r0 = "loading_stickers_emitted_to_ui"
            r2.A01(r6, r0)
            X.0sO r0 = r14.$fetchStickersSignal
            if (r0 == 0) goto L_0x015a
            boolean r0 = r0.BLQ()
            if (r0 != 0) goto L_0x015a
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r14.this$0
            X.1HC r2 = r0.A01
            X.2pF r0 = X.C52322pF.SUCCESS
            r2.A02(r0, r6)
            X.0sO r2 = r14.$fetchStickersSignal
            r14.L$0 = r1
            r14.L$1 = r12
            r0 = 6
            r14.label = r0
            java.lang.Object r0 = r2.B1c(r14)
            if (r0 == r7) goto L_0x0159
            r0 = r12
        L_0x0139:
            r12 = r0
            r11 = r13
        L_0x013b:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r10 = r14.this$0
            X.5cB r9 = r14.$searchType
            X.5yQ r0 = r10.A04
            X.05I r0 = r0.A07
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 r8 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1
            r8.<init>(r9, r10, r11, r12, r13)
            X.0nI r2 = X.C06830Vg.A00(r8, r0)
            r14.L$0 = r13
            r14.L$1 = r13
            r0 = 7
            r14.label = r0
            java.lang.Object r0 = X.C06820Vf.A00(r14, r2, r1)
            if (r0 != r7) goto L_0x01ab
        L_0x0159:
            return r7
        L_0x015a:
            java.lang.Integer r11 = X.C90524aI.A0a(r6)
            goto L_0x013b
        L_0x015f:
            X.5IJ r6 = new X.5IJ
            r6.<init>(r2, r3)
            r14.L$0 = r0
            r14.L$1 = r3
            r2 = 4
            r14.label = r2
            java.lang.Object r1 = r1.B6N(r6, r14)
            if (r1 != r7) goto L_0x017d
            return r7
        L_0x0172:
            java.lang.Object r3 = r14.L$1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r0 = r14.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r0
            X.AnonymousClass0AN.A00(r15)
        L_0x017d:
            X.1Ae r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "search failed ("
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.C36321k7.A0E(r0, r1)
            r2.A02(r4, r5, r0)
            goto L_0x01ab
        L_0x0194:
            int r6 = r14.I$0
            java.lang.Object r2 = r14.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r2
            X.AnonymousClass0AN.A00(r15)
        L_0x019d:
            X.1Ae r1 = r2.A00
            java.lang.String r0 = "search not initialized"
            r1.A02(r4, r5, r0)
            X.1HC r1 = r2.A01
            X.2pF r0 = X.C52322pF.FAIL
            r1.A02(r0, r6)
        L_0x01ab:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$observeStickersByKeywords$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
