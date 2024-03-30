package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass56V;
import X.AnonymousClass56Z;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C36401kF;
import X.C90484aE;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$handleCacheForStartScreen$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$handleCacheForStartScreen$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $jid;
    public Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$handleCacheForStartScreen$1$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$jid = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SearchFunStickersViewModel$handleCacheForStartScreen$1$1(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        SearchFunStickersViewModel searchFunStickersViewModel;
        AnonymousClass56V r3;
        String str;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            searchFunStickersViewModel = this.this$0;
            String str2 = this.$jid;
            this.L$0 = searchFunStickersViewModel;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, searchFunStickersViewModel.A0Q, new SearchFunStickersViewModel$getCachedData$2(searchFunStickersViewModel, str2, (C023509x) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            searchFunStickersViewModel = (SearchFunStickersViewModel) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        List list = (List) obj;
        if (list != null && C36401kF.A1a(list)) {
            Object A0N = C007103b.A0N(list);
            if (!(!(A0N instanceof AnonymousClass56V) || (r3 = (AnonymousClass56V) A0N) == null || (str = r3.A01.A03) == null)) {
                searchFunStickersViewModel.A0A.A0D(new AnonymousClass56Z(str, list, true));
                if (C90484aE.A1T(searchFunStickersViewModel)) {
                    searchFunStickersViewModel.A00 = r3.A00;
                    searchFunStickersViewModel.A09.A0D(SearchFunStickersViewModel.A08(searchFunStickersViewModel, list));
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$handleCacheForStartScreen$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
