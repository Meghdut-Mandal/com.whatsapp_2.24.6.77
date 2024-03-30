package X;

import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper", f = "CreateSubGroupSuggestionProtocolHelper.kt", i = {0, 0, 0, 0, 0}, l = {128}, m = "sendNewGroupSuggestion", n = {"this", "parentJid", "subject", "description", "request"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: X.AdM  reason: case insensitive filesystem */
public final class C21943AdM extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreateSubGroupSuggestionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21943AdM(CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = createSubGroupSuggestionProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass3QC) null, (AnonymousClass147) null, (String) null, (String) null, this);
    }
}
