package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {84}, m = "sendGetGroupInfoRequest-BWLJW6A", n = {}, s = {})
/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
public final class C82403ye extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82403ye(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = getGroupInfoProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A01 = this.this$0.A01((AnonymousClass147) null, (String) null, this, 0);
        if (A01 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A01);
        }
        return A01;
    }
}
