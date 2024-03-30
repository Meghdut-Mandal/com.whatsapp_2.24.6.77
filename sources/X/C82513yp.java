package X;

import com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper", f = "GetSubgroupsProtocolHelper.kt", i = {}, l = {79}, m = "sendGetSubgroupsRequest-BWLJW6A", n = {}, s = {})
/* renamed from: X.3yp  reason: invalid class name and case insensitive filesystem */
public final class C82513yp extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82513yp(GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = getSubgroupsProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00((AnonymousClass147) null, (AnonymousClass147) null, (String) null, this);
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A00);
        }
        return A00;
    }
}
