package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6BN;
import X.AnonymousClass6BT;
import X.C009003v;
import X.C009403z;
import X.C023509x;
import X.C07330Xf;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1", f = "SearchFunStickersViewModel.kt", i = {0}, l = {192}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SearchFunStickersViewModel$rollingPrompt$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$rollingPrompt$1(SearchFunStickersViewModel searchFunStickersViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = searchFunStickersViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        SearchFunStickersViewModel$rollingPrompt$1 searchFunStickersViewModel$rollingPrompt$1 = new SearchFunStickersViewModel$rollingPrompt$1(this.this$0, r4);
        searchFunStickersViewModel$rollingPrompt$1.L$0 = obj;
        return searchFunStickersViewModel$rollingPrompt$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass040 r2;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r2 = (AnonymousClass040) this.L$0;
            this.L$0 = r2;
            this.label = 1;
            if (C07330Xf.A00(this, 7000) == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass040) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (C009403z.A04(r2) && !this.this$0.A0U()) {
            SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            int i2 = searchFunStickersViewModel.A01;
            List list = searchFunStickersViewModel.A0P;
            int size = (i2 + 1) % list.size();
            searchFunStickersViewModel.A01 = size;
            int i3 = ((AnonymousClass6BT) list.get(size)).A01;
            SearchFunStickersViewModel searchFunStickersViewModel2 = this.this$0;
            searchFunStickersViewModel2.A0B.A0D(new AnonymousClass6BN(i2, searchFunStickersViewModel2.A01, i3));
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$rollingPrompt$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
