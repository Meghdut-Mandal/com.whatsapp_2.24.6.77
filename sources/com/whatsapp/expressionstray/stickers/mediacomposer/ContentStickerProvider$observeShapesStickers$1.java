package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C122505ux;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1", f = "ContentStickerProvider.kt", i = {0, 1, 1, 1}, l = {65, 83}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "shapes", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1", "L$2"})
public final class ContentStickerProvider$observeShapesStickers$1 extends AnonymousClass0A1 implements C009003v {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C122505ux this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeShapesStickers$1(C122505ux r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        ContentStickerProvider$observeShapesStickers$1 contentStickerProvider$observeShapesStickers$1 = new ContentStickerProvider$observeShapesStickers$1(this.this$0, r4);
        contentStickerProvider$observeShapesStickers$1.L$0 = obj;
        return contentStickerProvider$observeShapesStickers$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r6) goto L_0x0041
            if (r0 != r7) goto L_0x0083
            int r10 = r12.I$1
            int r9 = r12.I$0
            java.lang.Object r5 = r12.L$3
            X.5ux r5 = (X.C122505ux) r5
            java.lang.Object r4 = r12.L$2
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r3 = r12.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r12.L$0
            X.05G r2 = (X.AnonymousClass05G) r2
            X.AnonymousClass0AN.A00(r13)
        L_0x0023:
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0055
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002a:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r2 = r12.L$0
            X.05G r2 = (X.AnonymousClass05G) r2
            X.56h r0 = new X.56h
            r0.<init>()
            r12.L$0 = r2
            r12.label = r6
            java.lang.Object r0 = r2.B6N(r0, r12)
            if (r0 != r8) goto L_0x0048
            return r8
        L_0x0041:
            java.lang.Object r2 = r12.L$0
            X.05G r2 = (X.AnonymousClass05G) r2
            X.AnonymousClass0AN.A00(r13)
        L_0x0048:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.7mX[] r4 = X.C129866It.A01
            X.AnonymousClass00C.A09(r4)
            X.5ux r5 = r12.this$0
            r10 = 6
            r9 = 0
        L_0x0055:
            r11 = r4[r9]
            X.7mX r11 = (X.C161307mX) r11
            android.content.Context r1 = r5.A00
            X.0ts r0 = r5.A02
            X.6Ft r1 = r11.B4v(r1, r0, r6)
            X.6AC r0 = new X.6AC
            r0.<init>(r11, r1)
            r3.add(r0)
            X.56i r0 = new X.56i
            r0.<init>(r3)
            r12.L$0 = r2
            r12.L$1 = r3
            r12.L$2 = r4
            r12.L$3 = r5
            r12.I$0 = r9
            r12.I$1 = r10
            r12.label = r7
            java.lang.Object r0 = r2.B6N(r0, r12)
            if (r0 != r8) goto L_0x0023
            return r8
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentStickerProvider$observeShapesStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
