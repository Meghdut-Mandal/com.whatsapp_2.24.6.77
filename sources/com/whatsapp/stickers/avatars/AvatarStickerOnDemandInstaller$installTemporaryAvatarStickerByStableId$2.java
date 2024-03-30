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
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ AnonymousClass1C2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(AnonymousClass1C2 r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1C2 r4 = this.this$0;
            String str = this.$stableId;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A05, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C135066c4 r7 = (C135066c4) obj;
        if (r7 != null) {
            this.this$0.A03.A01(r7);
        }
        return r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
