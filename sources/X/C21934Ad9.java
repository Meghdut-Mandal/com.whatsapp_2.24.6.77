package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput;
import com.whatsapp.suggestions.networking.SuggestedContactsFetcher;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.networking.SuggestedContactsFetcher", f = "SuggestedContactsFetcher.kt", i = {}, l = {35}, m = "fetch", n = {}, s = {})
/* renamed from: X.Ad9  reason: case insensitive filesystem */
public final class C21934Ad9 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuggestedContactsFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21934Ad9(SuggestedContactsFetcher suggestedContactsFetcher, C023509x r2) {
        super(r2);
        this.this$0 = suggestedContactsFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((XWA2GrowthSuggestedContactsInput) null, this);
    }
}
