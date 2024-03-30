package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C123875xE;
import X.C135066c4;
import X.C146796wB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentStickerShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$addRecentStickerShape$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ C123875xE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$addRecentStickerShape$1(C123875xE r2, C135066c4 r3, C023509x r4) {
        super(2, r4);
        this.$sticker = r3;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsShapeCreator$addRecentStickerShape$1(this.this$0, this.$sticker, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C135066c4 r3 = this.$sticker;
            C123875xE r2 = this.this$0;
            r2.A02.A0C(new C146796wB(r3, r2.A03));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsShapeCreator$addRecentStickerShape$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
