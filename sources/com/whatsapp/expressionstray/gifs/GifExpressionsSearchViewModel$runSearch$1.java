package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass67Z;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import X.C158277gf;
import X.C36401kF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$runSearch$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$runSearch$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $searchQuery;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$runSearch$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$searchQuery = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GifExpressionsSearchViewModel$runSearch$1(this.this$0, this.$searchQuery, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass67Z A02;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 500) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel = this.this$0;
        String str = this.$searchQuery;
        C001700s r32 = gifExpressionsSearchViewModel.A03;
        AnonymousClass67Z r2 = (AnonymousClass67Z) r32.A04();
        if (r2 != null) {
            C158277gf r1 = gifExpressionsSearchViewModel.A08;
            AnonymousClass00C.A0D(r1, 0);
            r2.A03.remove(r1);
        }
        if (str == null || str.length() == 0) {
            A02 = gifExpressionsSearchViewModel.A07.A02();
        } else {
            A02 = gifExpressionsSearchViewModel.A07.A06(str, false);
        }
        C158277gf r12 = gifExpressionsSearchViewModel.A08;
        AnonymousClass00C.A0D(r12, 0);
        A02.A03.add(r12);
        if (C36401kF.A1a(A02.A04)) {
            r12.BfP(A02);
        }
        r32.A0D(A02);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$runSearch$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
