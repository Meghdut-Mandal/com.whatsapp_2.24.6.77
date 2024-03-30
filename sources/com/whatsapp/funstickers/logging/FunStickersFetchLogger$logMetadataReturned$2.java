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
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMetadataReturned$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logMetadataReturned$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ long $numberOfAnimatedOptions;
    public final /* synthetic */ long $numberOfOptions;
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logMetadataReturned$2(AnonymousClass6NT r2, C023509x r3, long j, long j2) {
        super(2, r3);
        this.this$0 = r2;
        this.$numberOfOptions = j;
        this.$numberOfAnimatedOptions = j2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new FunStickersFetchLogger$logMetadataReturned$2(this.this$0, r9, this.$numberOfOptions, this.$numberOfAnimatedOptions);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass58H r6 = new AnonymousClass58H();
            AnonymousClass6NT r3 = this.this$0;
            AnonymousClass6NT.A00(r6, r3);
            r6.A01 = C90524aI.A0a(5);
            long j = this.$numberOfOptions;
            r6.A04 = new Long(j);
            r3.A01 = j;
            r3.A00 = 0;
            if (r3.A0A.A0E(7186)) {
                long j2 = this.$numberOfAnimatedOptions;
                r6.A03 = new Long(j2);
                AnonymousClass58I r1 = this.this$0.A02;
                if (r1 != null) {
                    r1.A00 = Boolean.valueOf(AnonymousClass000.A1R((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1))));
                }
            }
            this.this$0.A0B.Bly(r6);
            AnonymousClass6NT r4 = this.this$0;
            Long l = r4.A06;
            if (l != null) {
                long longValue = l.longValue();
                AnonymousClass58I r32 = r4.A02;
                if (r32 != null) {
                    r32.A04 = new Long(C90514aH.A0J(longValue));
                }
            }
            r4.A06 = new Long(SystemClock.elapsedRealtime());
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$logMetadataReturned$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
