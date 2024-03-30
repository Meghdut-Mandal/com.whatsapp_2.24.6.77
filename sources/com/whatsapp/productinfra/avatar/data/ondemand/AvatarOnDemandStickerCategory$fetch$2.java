package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C23871Ae;
import X.C36321k7;
import X.C90524aI;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory$fetch$2", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickerCategory$fetch$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickerCategory$fetch$2(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C023509x r3) {
        super(2, r3);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarOnDemandStickerCategory$fetch$2 avatarOnDemandStickerCategory$fetch$2 = new AvatarOnDemandStickerCategory$fetch$2(this.this$0, r4);
        avatarOnDemandStickerCategory$fetch$2.L$0 = obj;
        return avatarOnDemandStickerCategory$fetch$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                obj2 = Boolean.valueOf(this.this$0.A03.B3E(AnonymousClass0AJ.A00));
            } catch (Throwable th) {
                obj2 = C90524aI.A0t(th);
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = this.this$0;
            Throwable A00 = AnonymousClass0AK.A00(obj2);
            if (A00 != null && !(A00 instanceof CancellationException)) {
                C23871Ae r3 = avatarOnDemandStickerCategory.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("unable to send rendez-vous signal for category (");
                r3.A02(3, "category_fetch_failed", C36321k7.A0E(A00.getMessage(), A0u));
            }
            return new AnonymousClass0AK(obj2);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickerCategory$fetch$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
