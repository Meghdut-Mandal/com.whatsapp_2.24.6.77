package X;

import com.whatsapp.data.repository.MetaAISearchRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.repository.MetaAISearchRepository", f = "MetaAISearchRepository.kt", i = {0, 0}, l = {36}, m = "getTypeaheadSearchSuggestions", n = {"this", "query"}, s = {"L$0", "L$1"})
/* renamed from: X.7Ab  reason: invalid class name and case insensitive filesystem */
public final class C151567Ab extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAISearchRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151567Ab(MetaAISearchRepository metaAISearchRepository, C023509x r2) {
        super(r2);
        this.this$0 = metaAISearchRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, this);
    }
}
