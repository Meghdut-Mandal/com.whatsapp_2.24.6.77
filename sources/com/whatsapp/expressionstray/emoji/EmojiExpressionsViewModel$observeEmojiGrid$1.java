package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$observeEmojiGrid$1", f = "EmojiExpressionsViewModel.kt", i = {0, 1, 1}, l = {113, 128, 136}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "qplInstanceKey"}, s = {"L$0", "L$0", "L$1"})
public final class EmojiExpressionsViewModel$observeEmojiGrid$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojiGrid$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = emojiExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        EmojiExpressionsViewModel$observeEmojiGrid$1 emojiExpressionsViewModel$observeEmojiGrid$1 = new EmojiExpressionsViewModel$observeEmojiGrid$1(this.this$0, r4);
        emojiExpressionsViewModel$observeEmojiGrid$1.L$0 = obj;
        return emojiExpressionsViewModel$observeEmojiGrid$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 3
            r8 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x002a
            if (r0 == r8) goto L_0x0079
            if (r0 != r7) goto L_0x00a6
            X.AnonymousClass0AN.A00(r10)
        L_0x0013:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0016:
            X.AnonymousClass0AN.A00(r10)
            java.lang.Object r4 = r9.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.55d r0 = X.C1033855d.A00
            r9.L$0 = r4
            r9.label = r1
            java.lang.Object r0 = r4.B6N(r0, r9)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x002a:
            java.lang.Object r4 = r9.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r10)
        L_0x0031:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r9.this$0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0A
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x0077
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r9.this$0
            X.66o r1 = r0.A07
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02
            int r2 = r0.getAndIncrement()
            X.0zE r1 = r1.A01
            r0 = 694884634(0x296b191a, float:5.2202254E-14)
            r1.markerStart(r0, r2)
            java.lang.Integer r1 = X.C90524aI.A0a(r2)
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r9.this$0
            int r3 = r1.intValue()
            X.66o r2 = r0.A07
            java.lang.String r0 = "emoji_data_loading_start"
            r2.A00(r3, r0, r5)
        L_0x005f:
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r9.this$0
            X.6Lh r3 = r0.A05
            r9.L$0 = r4
            r9.L$1 = r1
            r9.label = r8
            X.02l r2 = r3.A07
            com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2 r0 = new com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2
            r0.<init>(r3, r1, r5)
            java.lang.Object r10 = X.AnonymousClass0A2.A00(r9, r2, r0)
            if (r10 != r6) goto L_0x0084
            return r6
        L_0x0077:
            r1 = r5
            goto L_0x005f
        L_0x0079:
            java.lang.Object r1 = r9.L$1
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r4 = r9.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r10)
        L_0x0084:
            boolean r0 = r10 instanceof X.C1033755c
            if (r0 == 0) goto L_0x00ab
            if (r10 == 0) goto L_0x00ab
            if (r1 == 0) goto L_0x0099
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = r9.this$0
            X.66o r2 = r0.A07
            int r1 = r1.intValue()
            java.lang.String r0 = "emoji_data_loading_end"
            r2.A00(r1, r0, r5)
        L_0x0099:
            r9.L$0 = r5
            r9.L$1 = r5
            r9.label = r7
            java.lang.Object r0 = r4.B6N(r10, r9)
            if (r0 != r6) goto L_0x0013
            return r6
        L_0x00a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00ab:
            java.lang.String r0 = "Null or loading result received."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$observeEmojiGrid$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$observeEmojiGrid$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
