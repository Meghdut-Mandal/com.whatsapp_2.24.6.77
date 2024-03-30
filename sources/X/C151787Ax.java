package X;

import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {0, 0}, l = {518}, m = "getStickerFromUrl", n = {"this", "url"}, s = {"L$0", "L$1"})
/* renamed from: X.7Ax  reason: invalid class name and case insensitive filesystem */
public final class C151787Ax extends AnonymousClass0A0 {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151787Ax(SearchFunStickersViewModel searchFunStickersViewModel, C023509x r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A04(this.this$0, (String) null, this);
    }
}
