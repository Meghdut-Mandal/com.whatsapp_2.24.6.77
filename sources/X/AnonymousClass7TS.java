package X;

import com.whatsapp.search.AISearchTypeAheadSuggestionsProvider;
import com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1;

/* renamed from: X.7TS  reason: invalid class name */
public final class AnonymousClass7TS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AISearchTypeAheadSuggestionsProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TS(AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider) {
        super(1);
        this.this$0 = aISearchTypeAheadSuggestionsProvider;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider = this.this$0;
        C36361kB.A1I(str);
        if (str.length() == 0) {
            aISearchTypeAheadSuggestionsProvider.A00.A0C(C023409w.A00);
        } else {
            C36331k8.A1T(new AISearchTypeAheadSuggestionsProvider$initSearch$1(aISearchTypeAheadSuggestionsProvider, str, (C023509x) null), aISearchTypeAheadSuggestionsProvider.A02);
        }
        return AnonymousClass0AJ.A00;
    }
}
