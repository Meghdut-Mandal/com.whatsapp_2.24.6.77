package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass58I;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$assignServerDurations$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$assignServerDurations$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Long $llmDuration;
    public final /* synthetic */ Long $stickerGenDuration;
    public int label;
    public final /* synthetic */ AnonymousClass6NT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$assignServerDurations$2(AnonymousClass6NT r2, Long l, Long l2, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$llmDuration = l;
        this.$stickerGenDuration = l2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new FunStickersFetchLogger$assignServerDurations$2(this.this$0, this.$llmDuration, this.$stickerGenDuration, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass58I r2 = this.this$0.A02;
            if (r2 == null) {
                return null;
            }
            Long l = this.$llmDuration;
            Long l2 = this.$stickerGenDuration;
            r2.A05 = l;
            r2.A06 = l2;
            return r2;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickersFetchLogger$assignServerDurations$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
