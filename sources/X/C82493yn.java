package X;

import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.protocol.SetGroupDescriptionProtocolHelper", f = "SetGroupDescriptionProtocolHelper.kt", i = {}, l = {78}, m = "sendSetSubgroupDescription-BWLJW6A", n = {}, s = {})
/* renamed from: X.3yn  reason: invalid class name and case insensitive filesystem */
public final class C82493yn extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82493yn(SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = setGroupDescriptionProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00((AnonymousClass147) null, (String) null, (String) null, this);
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A00);
        }
        return A00;
    }
}
