package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C119585q6;
import com.whatsapp.expressionstray.search.SearchQueryProvider$setSearchQuery$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onSearchTextChanged$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onSearchTextChanged$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onSearchTextChanged$1(ExpressionsSearchViewModel expressionsSearchViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsSearchViewModel;
        this.$searchText = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsSearchViewModel$onSearchTextChanged$1(this.this$0, this.$searchText, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C119585q6 r4 = this.this$0.A0C;
            String str = this.$searchText;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4.A00, new SearchQueryProvider$setSearchQuery$2(r4, str, (C023509x) null)) == r5) {
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
        return ((ExpressionsSearchViewModel$onSearchTextChanged$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
