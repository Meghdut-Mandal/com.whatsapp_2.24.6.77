package com.whatsapp.expressionstray;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1", f = "ExpressionsSearchViewModel.kt", i = {0, 1}, l = {302, 304}, m = "invokeSuspend", n = {"cleanedSticker", "cleanedSticker"}, s = {"L$0", "L$0"})
public final class ExpressionsSearchViewModel$onStickerSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C135066c4 $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onStickerSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, C135066c4 r3, Integer num, C023509x r5, int i) {
        super(2, r5);
        this.this$0 = expressionsSearchViewModel;
        this.$position = i;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new ExpressionsSearchViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r7) goto L_0x0057
            if (r0 != r4) goto L_0x006f
            java.lang.Object r6 = r8.L$0
            X.6c4 r6 = (X.C135066c4) r6
            X.AnonymousClass0AN.A00(r9)
        L_0x0013:
            boolean r1 = r6.A0L
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r8.this$0
            X.6O1 r2 = r0.A0A
            if (r1 == 0) goto L_0x0022
            r0 = 3
            X.AnonymousClass6O1.A00(r2, r0, r4)
        L_0x001f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0022:
            r1 = 9
            r0 = 32
            X.AnonymousClass6O1.A00(r2, r0, r1)
            goto L_0x001f
        L_0x002a:
            X.AnonymousClass0AN.A00(r9)
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r1 = r8.this$0
            r1.A06 = r7
            int r0 = r8.$position
            r1.A01 = r0
            X.1C2 r1 = r1.A0G
            X.6c4 r0 = r8.$sticker
            X.6c4 r6 = r1.A01(r0)
            if (r6 == 0) goto L_0x001f
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r8.this$0
            X.05J r3 = r0.A0J
            java.lang.Integer r2 = r8.$stickerSendOrigin
            int r1 = r8.$position
            X.555 r0 = new X.555
            r0.<init>(r6, r2, r1)
            r8.L$0 = r6
            r8.label = r7
            java.lang.Object r0 = r3.B6N(r0, r8)
            if (r0 != r5) goto L_0x005e
            return r5
        L_0x0057:
            java.lang.Object r6 = r8.L$0
            X.6c4 r6 = (X.C135066c4) r6
            X.AnonymousClass0AN.A00(r9)
        L_0x005e:
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r8.this$0
            X.05J r1 = r0.A0J
            X.556 r0 = X.AnonymousClass556.A00
            r8.L$0 = r6
            r8.label = r4
            java.lang.Object r0 = r1.B6N(r0, r8)
            if (r0 != r5) goto L_0x0013
            return r5
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onStickerSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
