package X;

import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper", f = "CreateSubGroupSuggestionProtocolHelper.kt", i = {0, 0}, l = {248}, m = "sendExistingGroupSuggestion", n = {"this", "request"}, s = {"L$0", "L$1"})
/* renamed from: X.AdF  reason: case insensitive filesystem */
public final class C21936AdF extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreateSubGroupSuggestionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21936AdF(CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = createSubGroupSuggestionProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass147) null, (List) null, this);
    }
}
