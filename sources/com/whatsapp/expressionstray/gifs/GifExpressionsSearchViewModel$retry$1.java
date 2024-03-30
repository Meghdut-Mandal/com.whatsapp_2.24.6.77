package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C07350Xh;
import X.C13010j1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$retry$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$retry$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GifExpressionsSearchViewModel$retry$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GifExpressionsSearchViewModel$retry$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C13010j1 r0 = new C13010j1((C007403e) null, this.this$0.A06.A01);
            this.label = 1;
            obj = C07350Xh.A01(this, r0);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        String str = (String) obj;
        if (str != null) {
            this.this$0.A0S(str);
        }
        return AnonymousClass0AJ.A00;
    }
}
