package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3XU;
import X.AnonymousClass551;
import X.AnonymousClass55O;
import X.AnonymousClass63V;
import X.AnonymousClass6O1;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$onGifSelected$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$onGifSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3XU $result;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$onGifSelected$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, AnonymousClass3XU r3, C023509x r4) {
        super(2, r4);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$result = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GifExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05J r2 = this.this$0.A09;
            AnonymousClass551 r0 = new AnonymousClass551(this.$result);
            this.label = 1;
            if (r2.B6N(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass63V r1 = this.this$0.A05;
        AnonymousClass55O r02 = AnonymousClass55O.A00;
        r1.A00(r02, r02, 7);
        AnonymousClass6O1.A00(this.this$0.A04, 22, 6);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$onGifSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
