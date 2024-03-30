package com.whatsapp.expressions.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C121575tM;
import X.C134626bL;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressions.mediacomposer.ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2", f = "ShapeStickerLayoutDataProvider.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C134626bL $shapeStickerLayoutData;
    public int label;
    public final /* synthetic */ C121575tM this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2(C134626bL r2, C121575tM r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$shapeStickerLayoutData = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2(this.$shapeStickerLayoutData, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05L r1 = this.this$0.A02;
            C134626bL r0 = this.$shapeStickerLayoutData;
            this.label = 1;
            if (r1.B6N(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataAsync$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
