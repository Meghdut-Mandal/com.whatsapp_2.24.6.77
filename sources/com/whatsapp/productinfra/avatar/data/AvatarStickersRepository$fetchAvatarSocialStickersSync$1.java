package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C24241Br;
import X.C90524aI;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarSocialStickersSync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ List $socialStickerUserIds;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarSocialStickersSync$1(C24241Br r2, Integer num, List list, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$qplInstanceKey = num;
        this.$socialStickerUserIds = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarStickersRepository$fetchAvatarSocialStickersSync$1(this.this$0, this.$qplInstanceKey, this.$socialStickerUserIds, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.this$0.A00.A01()) {
                C24241Br r3 = this.this$0;
                Integer num = this.$qplInstanceKey;
                Set A00 = r3.A03.A00();
                Integer A0a = C90524aI.A0a(2);
                List list = this.$socialStickerUserIds;
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, r3.A09, new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(r3, num, A0a, list, A00, (C023509x) null, false));
                if (obj == r1) {
                    return r1;
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
        AnonymousClass68B r11 = (AnonymousClass68B) obj;
        if (r11 != null) {
            return r11.A05;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarSocialStickersSync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
