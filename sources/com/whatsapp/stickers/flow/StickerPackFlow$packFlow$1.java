package com.whatsapp.stickers.flow;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1", f = "StickerPackFlow.kt", i = {0, 1, 1}, l = {67, 93, 233}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow", "stickerPack"}, s = {"L$0", "L$0", "L$3"})
public final class StickerPackFlow$packFlow$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1(StickerPackFlow stickerPackFlow, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C023509x create(Object obj, C023509x r4) {
        StickerPackFlow$packFlow$1 stickerPackFlow$packFlow$1 = new StickerPackFlow$packFlow$1(this.this$0, r4);
        stickerPackFlow$packFlow$1.L$0 = obj;
        return stickerPackFlow$packFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 3
            r2 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 == r8) goto L_0x0031
            if (r0 == r2) goto L_0x0077
            if (r0 != r6) goto L_0x00e4
            X.AnonymousClass0AN.A00(r13)
        L_0x0013:
            X.0AJ r5 = X.AnonymousClass0AJ.A00
            return r5
        L_0x0016:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r3 = r12.L$0
            X.0sQ r3 = (X.C18000sQ) r3
            com.whatsapp.stickers.flow.StickerPackFlow r7 = r12.this$0
            X.02l r1 = r7.A0D
            com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1
            r0.<init>(r7, r4)
            r12.L$0 = r3
            r12.label = r8
            java.lang.Object r13 = X.AnonymousClass0A2.A00(r12, r1, r0)
            if (r13 != r5) goto L_0x0038
            return r5
        L_0x0031:
            java.lang.Object r3 = r12.L$0
            X.0sQ r3 = (X.C18000sQ) r3
            X.AnonymousClass0AN.A00(r13)
        L_0x0038:
            java.util.List r13 = (java.util.List) r13
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            X.5Kb r0 = new X.5Kb
            r0.<init>(r13)
            com.whatsapp.stickers.flow.StickerPackFlow.A01(r0, r1, r3)
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r12.this$0
            X.0yC r1 = r0.A01
            r0 = 6548(0x1994, float:9.176E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00bf
            com.whatsapp.stickers.flow.StickerPackFlow r8 = r12.this$0
            java.util.Iterator r9 = r13.iterator()
        L_0x0056:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r9.next()
            X.65y r0 = (X.C1268665y) r0
            X.68B r10 = r0.A00()
            r12.L$0 = r3
            r12.L$1 = r8
            r12.L$2 = r9
            r12.L$3 = r10
            r12.label = r2
            java.lang.Object r13 = r8.A02(r10, r12)
            if (r13 != r5) goto L_0x008a
            return r5
        L_0x0077:
            java.lang.Object r10 = r12.L$3
            X.68B r10 = (X.AnonymousClass68B) r10
            java.lang.Object r9 = r12.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r8 = r12.L$1
            com.whatsapp.stickers.flow.StickerPackFlow r8 = (com.whatsapp.stickers.flow.StickerPackFlow) r8
            java.lang.Object r3 = r12.L$0
            X.0sQ r3 = (X.C18000sQ) r3
            X.AnonymousClass0AN.A00(r13)
        L_0x008a:
            X.5Kb r0 = r8.A00
            java.util.List r0 = r0.A00
            java.util.ArrayList r7 = X.C36321k7.A0J(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0096:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r2 = r11.next()
            X.65y r2 = (X.C1268665y) r2
            X.68B r0 = r2.A00()
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = r10.A0F
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00b1
            r2 = r13
        L_0x00b1:
            r7.add(r2)
            goto L_0x0096
        L_0x00b5:
            X.5Kb r0 = new X.5Kb
            r0.<init>(r7)
            com.whatsapp.stickers.flow.StickerPackFlow.A01(r0, r8, r3)
            r2 = 2
            goto L_0x0056
        L_0x00bf:
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            r0 = 1
            X.7pL r2 = new X.7pL
            r2.<init>(r1, r3, r0)
            X.1BB r0 = r1.A04
            r0.registerObserver(r2)
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            X.7OA r0 = new X.7OA
            r0.<init>(r2, r1)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.L$2 = r4
            r12.L$3 = r4
            r12.label = r6
            java.lang.Object r0 = X.C05770Qz.A00(r12, r0, r3)
            if (r0 != r5) goto L_0x0013
            return r5
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
