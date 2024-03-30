package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1AP;
import X.AnonymousClass1C2;
import X.C009003v;
import X.C023509x;
import X.C110515an;
import X.C39581sm;
import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionImageLoader$loadAvatarReactionStickerImage$2", f = "AvatarReactionImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionImageLoader$loadAvatarReactionStickerImage$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C39581sm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(C39581sm r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1AP r0 = this.this$0.A00;
            String str = this.$stableId;
            if (str == null || (A00 = r0.A0K.A00(str)) == null) {
                AnonymousClass1C2 r4 = this.this$0.A01;
                String str2 = this.$stableId;
                AnonymousClass00C.A0D(str2, 0);
                A00 = C110515an.A00(r4.A05, new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1(r4, str2, (C023509x) null));
                if (A00 == null) {
                    return null;
                }
            }
            return A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionImageLoader$loadAvatarReactionStickerImage$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
