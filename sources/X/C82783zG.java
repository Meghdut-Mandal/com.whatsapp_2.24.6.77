package X;

import com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper", f = "GetSuggestedGroupsProtocolHelper.kt", i = {0, 0, 0, 2}, l = {41, 48, 55, 59, 92}, m = "sendIqWithCallback", n = {"parentGroupJid", "getLinkedGroupsParticipantCallback", "request", "getLinkedGroupsParticipantCallback"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* renamed from: X.3zG  reason: invalid class name and case insensitive filesystem */
public final class C82783zG extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSuggestedGroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82783zG(GetSuggestedGroupsProtocolHelper getSuggestedGroupsProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = getSuggestedGroupsProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C194519Qb) null, (AnonymousClass147) null, (AnonymousClass147) null, this);
    }
}
