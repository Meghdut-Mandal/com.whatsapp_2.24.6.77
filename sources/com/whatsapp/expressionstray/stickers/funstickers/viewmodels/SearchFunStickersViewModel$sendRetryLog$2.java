package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6NT;
import X.C009003v;
import X.C023509x;
import com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$sendRetryLog$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {632}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$sendRetryLog$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$sendRetryLog$2(SearchFunStickersViewModel searchFunStickersViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = searchFunStickersViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass6NT r3 = this.this$0.A0M;
            this.label = 1;
            if (r3.A05 != null && AnonymousClass0A2.A00(this, r3.A0C, new FunStickersFetchLogger$logRetry$2(r3, (C023509x) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
