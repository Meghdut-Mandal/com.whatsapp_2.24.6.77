package X;

import com.whatsapp.search.AISearchTypeAheadSuggestionsProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {41}, m = "getSuggestions", n = {}, s = {})
/* renamed from: X.79u  reason: invalid class name and case insensitive filesystem */
public final class C1514979u extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AISearchTypeAheadSuggestionsProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1514979u(AISearchTypeAheadSuggestionsProvider aISearchTypeAheadSuggestionsProvider, C023509x r2) {
        super(r2);
        this.this$0 = aISearchTypeAheadSuggestionsProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, this);
    }
}
