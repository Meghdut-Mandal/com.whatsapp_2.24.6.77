package com.whatsapp.funstickers.logging;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logMediaDownloaded$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logMediaDownloaded$2(AnonymousClass6NT r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FunStickersFetchLogger$logMediaDownloaded$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logMediaDownloaded$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r5 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r4.A0A.A0E(7186) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x0077
            X.AnonymousClass0AN.A00(r8)
            X.58H r6 = new X.58H
            r6.<init>()
            X.6NT r5 = r7.this$0
            X.AnonymousClass6NT.A00(r6, r5)
            long r3 = r5.A00
            long r1 = r5.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            X.0yC r1 = r5.A0A
            r0 = 7186(0x1c12, float:1.007E-41)
            boolean r1 = r1.A0E(r0)
            r5 = 1
            r0 = 7
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            r5 = 0
            r0 = 6
        L_0x0027:
            java.lang.Integer r0 = X.C90524aI.A0a(r0)
            r6.A01 = r0
            X.6NT r0 = r7.this$0
            X.0yW r0 = r0.A0B
            r0.Bly(r6)
            X.6NT r4 = r7.this$0
            java.lang.Long r0 = r4.A06
            if (r0 == 0) goto L_0x006a
            long r0 = r0.longValue()
            X.58I r3 = r4.A02
            if (r3 == 0) goto L_0x006a
            long r1 = X.C90514aH.A0J(r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            if (r5 == 0) goto L_0x0067
            r3.A03 = r0
        L_0x004f:
            X.6NT r2 = r7.this$0
            X.58I r1 = r2.A02
            if (r1 == 0) goto L_0x005a
            X.0yW r0 = r2.A0B
            r0.Bly(r1)
        L_0x005a:
            r0 = 0
            r2.A06 = r0
            if (r5 == 0) goto L_0x0064
            X.6NT r0 = r7.this$0
            X.AnonymousClass6NT.A01(r0)
        L_0x0064:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0067:
            r3.A02 = r0
            goto L_0x006c
        L_0x006a:
            if (r5 != 0) goto L_0x004f
        L_0x006c:
            X.0yC r1 = r4.A0A
            r0 = 7186(0x1c12, float:1.007E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0064
            goto L_0x004f
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
