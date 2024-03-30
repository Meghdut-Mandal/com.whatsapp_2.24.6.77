package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers", f = "AvatarOnDemandStickers.kt", i = {0, 0, 1, 1, 1, 1, 2, 2}, l = {301, 317, 355}, m = "fetchAndEmitRemoteStickers", n = {"this", "qplInstanceKey", "this", "$this$fetchAndEmitRemoteStickers", "searchType", "qplInstanceKey", "this", "qplInstanceKey"}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"})
/* renamed from: X.7Az  reason: invalid class name and case insensitive filesystem */
public final class C151807Az extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151807Az(AvatarOnDemandStickers avatarOnDemandStickers, C023509x r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickers;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarOnDemandStickers.A00((C111375cB) null, this.this$0, (List) null, this, (AnonymousClass05G) null, 0);
    }
}
