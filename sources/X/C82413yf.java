package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {92}, m = "sendGetGroupInfoRequest-yxL6bBk", n = {}, s = {})
/* renamed from: X.3yf  reason: invalid class name and case insensitive filesystem */
public final class C82413yf extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82413yf(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = getGroupInfoProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = GetGroupInfoProtocolHelper.A00(this.this$0, (AnonymousClass147) null, (String) null, (String) null, this, 0);
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A00);
        }
        return A00;
    }
}
