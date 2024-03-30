package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5La;
import X.C009003v;
import X.C023509x;
import X.C36341k9;
import X.C90524aI;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getCachedData$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$getCachedData$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $chatJid;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getCachedData$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$chatJid = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SearchFunStickersViewModel$getCachedData$2(this.this$0, this.$chatJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass5La r4 = this.this$0.A0H;
            String str = this.$chatJid;
            ArrayList A0l = C36341k9.A0l(str);
            Set<Object> A0r = C90524aI.A0r(str, r4.A00);
            if (A0r != null) {
                for (Object obj2 : A0r) {
                    Object obj3 = r4.A01.get(obj2);
                    if (obj3 != null) {
                        A0l.add(obj3);
                    }
                }
            }
            return A0l;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$getCachedData$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
