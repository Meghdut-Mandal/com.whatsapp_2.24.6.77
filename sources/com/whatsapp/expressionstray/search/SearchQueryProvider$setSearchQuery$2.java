package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C119585q6;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.SearchQueryProvider$setSearchQuery$2", f = "SearchQueryProvider.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
public final class SearchQueryProvider$setSearchQuery$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ C119585q6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchQueryProvider$setSearchQuery$2(C119585q6 r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$query = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new SearchQueryProvider$setSearchQuery$2(this.this$0, this.$query, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05L r1 = this.this$0.A01;
            String str = this.$query;
            this.label = 1;
            if (r1.B6N(str, this) == r3) {
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
        return ((SearchQueryProvider$setSearchQuery$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
