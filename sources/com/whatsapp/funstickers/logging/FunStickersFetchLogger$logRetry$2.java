package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass58H;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import X.C90524aI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logRetry$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logRetry$2(AnonymousClass6NT r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new FunStickersFetchLogger$logRetry$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logRetry$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass58H r2 = new AnonymousClass58H();
            AnonymousClass6NT r1 = this.this$0;
            r2.A05 = r1.A05;
            r2.A02 = r1.A03;
            r2.A06 = r1.A07;
            r2.A01 = C90524aI.A0a(3);
            r2.A00 = C90524aI.A0a(11);
            r1.A0B.Bly(r2);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
