package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C122505ux;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1", f = "ContentStickerProvider.kt", i = {0, 1, 2}, l = {31, 50, 57}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
public final class ContentStickerProvider$observeContentStickers$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C122505ux this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeContentStickers$1(C122505ux r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        ContentStickerProvider$observeContentStickers$1 contentStickerProvider$observeContentStickers$1 = new ContentStickerProvider$observeContentStickers$1(this.this$0, r4);
        contentStickerProvider$observeContentStickers$1.L$0 = obj;
        return contentStickerProvider$observeContentStickers$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r7 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r5) goto L_0x002b
            if (r0 == r6) goto L_0x0064
            if (r0 == r7) goto L_0x002b
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0014:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r4 = r12.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.56e r0 = new X.56e
            r0.<init>()
            r12.L$0 = r4
            r12.label = r5
            java.lang.Object r0 = r4.B6N(r0, r12)
        L_0x0028:
            if (r0 != r8) goto L_0x0032
            return r8
        L_0x002b:
            java.lang.Object r4 = r12.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r13)
        L_0x0032:
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.7mX[] r10 = X.C129866It.A00
            X.AnonymousClass00C.A09(r10)
            X.5ux r9 = r12.this$0
            r3 = 0
        L_0x003e:
            r2 = r10[r3]
            android.content.Context r1 = r9.A00
            X.0ts r0 = r9.A02
            X.6Ft r1 = r2.B4v(r1, r0, r5)
            X.6AC r0 = new X.6AC
            r0.<init>(r2, r1)
            r11.add(r0)
            int r3 = r3 + 1
            if (r3 < r7) goto L_0x003e
            X.56f r0 = new X.56f
            r0.<init>(r11)
            r12.L$0 = r4
            r12.label = r6
            java.lang.Object r0 = r4.B6N(r0, r12)
            if (r0 != r8) goto L_0x006b
            return r8
        L_0x0064:
            java.lang.Object r4 = r12.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r13)
        L_0x006b:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 % r0
            long r0 = r0 - r2
            r12.L$0 = r4
            r12.label = r7
            java.lang.Object r0 = X.C07330Xf.A00(r12, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentStickerProvider$observeContentStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
