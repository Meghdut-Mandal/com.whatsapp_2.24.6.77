package X;

import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {0}, l = {691}, m = "endPreviousLoggingSession", n = {"$this$endPreviousLoggingSession_u24lambda_u2422"}, s = {"L$1"})
/* renamed from: X.7Ad  reason: invalid class name and case insensitive filesystem */
public final class C151587Ad extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151587Ad(SearchFunStickersViewModel searchFunStickersViewModel, C023509x r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A06(this.this$0, this, 0);
    }
}
