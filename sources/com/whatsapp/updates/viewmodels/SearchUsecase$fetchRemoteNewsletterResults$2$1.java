package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C07330Xf;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1", f = "SearchUsecase.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
public final class SearchUsecase$fetchRemoteNewsletterResults$2$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ SearchUsecase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUsecase$fetchRemoteNewsletterResults$2$1(SearchUsecase searchUsecase, C023509x r3) {
        super(2, r3);
        this.this$0 = searchUsecase;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new SearchUsecase$fetchRemoteNewsletterResults$2$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SearchUsecase$fetchRemoteNewsletterResults$2$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            if (C07330Xf.A00(this, 300) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
