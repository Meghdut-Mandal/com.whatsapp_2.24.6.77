package X;

import com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {}, l = {96}, m = "sendGetGroupProfilePicturesRequest-BWLJW6A", n = {}, s = {})
/* renamed from: X.Acw  reason: case insensitive filesystem */
public final class C21922Acw extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21922Acw(GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, C023509x r2) {
        super(r2);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C165597tg.A0i(this.this$0.A01((AnonymousClass147) null, (AnonymousClass147) null, (Map) null, this));
    }
}
