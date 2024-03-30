package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass58H;
import X.AnonymousClass58I;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import X.C90514aH;
import X.C90524aI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logError$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logError$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ int $errorType;
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logError$2(AnonymousClass6NT r2, Integer num, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$errorType = i;
        this.$errorCode = num;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FunStickersFetchLogger$logError$2(this.this$0, this.$errorCode, r6, this.$errorType);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass58H r2 = new AnonymousClass58H();
            AnonymousClass6NT r1 = this.this$0;
            AnonymousClass6NT.A00(r2, r1);
            r2.A01 = C90524aI.A0a(3);
            r2.A00 = C90524aI.A0a(this.$errorType);
            Integer num = this.$errorCode;
            if (num != null) {
                r2.A07 = num.toString();
            }
            r1.A0B.Bly(r2);
            AnonymousClass6NT r4 = this.this$0;
            Long l = r4.A06;
            if (l != null) {
                long longValue = l.longValue();
                AnonymousClass58I r3 = r4.A02;
                if (r3 != null) {
                    r3.A04 = new Long(C90514aH.A0J(longValue));
                }
            }
            AnonymousClass58I r12 = r4.A02;
            if (r12 != null) {
                r4.A0B.Bly(r12);
            }
            r4.A06 = null;
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$logError$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
