package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C24241Br;
import com.whatsapp.util.Log;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarStickerPackSync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackSync$1(C24241Br r2, Integer num, Integer num2, Set set, C023509x r6, boolean z) {
        super(2, r6);
        this.this$0 = r2;
        this.$qplInstanceKey = num;
        this.$stableIds = set;
        this.$defaultPack = z;
        this.$stickerPackDownloadOrigin = num2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new AvatarStickersRepository$fetchAvatarStickerPackSync$1(this.this$0, this.$qplInstanceKey, this.$stickerPackDownloadOrigin, this.$stableIds, r9, this.$defaultPack);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.this$0.A00.A01()) {
                C24241Br r4 = this.this$0;
                Integer num = this.$qplInstanceKey;
                Set set = this.$stableIds;
                boolean z = this.$defaultPack;
                Integer num2 = this.$stickerPackDownloadOrigin;
                C023409w r7 = C023409w.A00;
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, r4.A09, new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(r4, num, num2, r7, set, (C023509x) null, z));
                if (obj == r2) {
                    return r2;
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackSync/user has no avatar");
                C24241Br.A01(this.this$0, "fetch_avatar_sticker_pack_failed_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarStickerPackSync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
