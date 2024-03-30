package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1C2;
import X.AnonymousClass690;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C110515an;
import X.C24241Br;
import X.C36411kG;
import com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ AnonymousClass1C2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(AnonymousClass1C2 r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C24241Br r5 = this.this$0.A01;
            List list = (List) C110515an.A00(r5.A09, new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(r5, C36411kG.A15(new AnonymousClass690(this.$stableId)), (C023509x) null, false));
            if (list == null || list.isEmpty()) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't find ondemand sticker matching given stableId");
                if (list == null) {
                    return null;
                }
            }
            return C007103b.A0M(list);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
