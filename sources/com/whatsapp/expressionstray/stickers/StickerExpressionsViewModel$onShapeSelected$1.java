package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass552;
import X.AnonymousClass6AC;
import X.C009003v;
import X.C023509x;
import X.C129196Ft;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onShapeSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {965}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onShapeSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass6AC $shape;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onShapeSelected$1(Context context, StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass6AC r4, C023509x r5) {
        super(2, r5);
        this.$shape = r4;
        this.$context = context;
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerExpressionsViewModel$onShapeSelected$1(this.$context, this.this$0, this.$shape, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C129196Ft B4v = this.$shape.A00.B4v(this.$context, this.this$0.A0D, false);
            AnonymousClass05J r1 = this.this$0.A0f;
            AnonymousClass00C.A0B(B4v);
            AnonymousClass552 r0 = new AnonymousClass552(B4v);
            this.label = 1;
            if (r1.B6N(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$onShapeSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
