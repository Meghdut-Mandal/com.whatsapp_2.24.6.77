package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {30}, m = "fetch-IoAF18A", n = {}, s = {})
/* renamed from: X.79t  reason: invalid class name */
public final class AnonymousClass79t extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79t(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C023509x r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00(this);
        if (A00 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A00);
        }
        return A00;
    }
}
