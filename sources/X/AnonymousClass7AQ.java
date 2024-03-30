package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers", f = "AvatarOnDemandStickers.kt", i = {0}, l = {380}, m = "initializeSearchIfRequired", n = {"searchType"}, s = {"L$0"})
/* renamed from: X.7AQ  reason: invalid class name */
public final class AnonymousClass7AQ extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AQ(AvatarOnDemandStickers avatarOnDemandStickers, C023509x r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickers;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AvatarOnDemandStickers.A01((C111375cB) null, this.this$0, this, 0);
    }
}
