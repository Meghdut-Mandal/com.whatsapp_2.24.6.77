package com.whatsapp.funstickers.logging;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logSearchStarted$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logSearchStarted$2(AnonymousClass6NT r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FunStickersFetchLogger$logSearchStarted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logSearchStarted$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (X.C110935bT.A00(r3.A08, r1, r2) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0056
            X.AnonymousClass0AN.A00(r7)
            X.58H r2 = new X.58H
            r2.<init>()
            X.6NT r1 = r6.this$0
            X.AnonymousClass6NT.A00(r2, r1)
            r0 = 4
            java.lang.Integer r0 = X.C90524aI.A0a(r0)
            r2.A01 = r0
            X.0yW r0 = r1.A0B
            r0.Bly(r2)
            X.6NT r5 = r6.this$0
            X.58I r4 = new X.58I
            r4.<init>()
            X.6NT r3 = r6.this$0
            java.lang.Long r0 = r3.A04
            r4.A07 = r0
            X.1UA r0 = r3.A09
            X.6P0 r2 = X.C113245fE.A00
            X.6OQ r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x003d
            X.0wo r0 = r3.A08
            boolean r1 = X.C110935bT.A00(r0, r1, r2)
            r0 = 0
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            r5.A02 = r4
            X.6NT r3 = r6.this$0
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r3.A06 = r0
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
