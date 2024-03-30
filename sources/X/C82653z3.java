package X;

import com.whatsapp.updates.viewmodels.SearchUsecase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.SearchUsecase", f = "SearchUsecase.kt", i = {}, l = {238}, m = "fetchRemoteNewsletterResults", n = {}, s = {})
/* renamed from: X.3z3  reason: invalid class name and case insensitive filesystem */
public final class C82653z3 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchUsecase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82653z3(SearchUsecase searchUsecase, C023509x r2) {
        super(r2);
        this.this$0 = searchUsecase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchUsecase.A00(this.this$0, this);
    }
}
