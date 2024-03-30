package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1C2;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C23871Ae;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ AnonymousClass1C2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(AnonymousClass1C2 r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1C2 r4 = this.this$0;
            String str2 = this.$stableId;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A05, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str2, (C023509x) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C135066c4 r8 = (C135066c4) obj;
        if (r8 == null) {
            return null;
        }
        String str3 = r8.A0H;
        AnonymousClass1C2 r1 = this.this$0;
        if (str3 == null) {
            str = "fetch_on_demand_avatar_returned_with_empty_url";
        } else {
            r1.A03.A01(r8);
            if (r8.A0A == null) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't download ondemand sticker image");
            } else {
                AnonymousClass1C2.A00(r8, r1);
                if (r8.A0A != null) {
                    return r8;
                }
            }
            r1 = this.this$0;
            str = "fetch_on_demand_avatar_returned_with_empty_filepath";
        }
        C23871Ae r2 = r1.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("stableId=");
        r2.A02(1, str, AnonymousClass000.A0q(r8.A06, A0u));
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
