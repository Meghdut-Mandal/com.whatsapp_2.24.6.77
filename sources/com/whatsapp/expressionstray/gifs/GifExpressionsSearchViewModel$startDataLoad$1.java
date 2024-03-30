package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$startDataLoad$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$startDataLoad$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$startDataLoad$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        GifExpressionsSearchViewModel$startDataLoad$1 gifExpressionsSearchViewModel$startDataLoad$1 = new GifExpressionsSearchViewModel$startDataLoad$1(this.this$0, r4);
        gifExpressionsSearchViewModel$startDataLoad$1.L$0 = obj;
        return gifExpressionsSearchViewModel$startDataLoad$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A0S((String) this.L$0);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$startDataLoad$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
