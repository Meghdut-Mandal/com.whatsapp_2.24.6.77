package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1C2;
import X.AnonymousClass690;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C90484aE;
import com.whatsapp.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ AnonymousClass1C2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(C135066c4 r2, AnonymousClass1C2 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$sticker = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(this.$sticker, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C135066c4 A00;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1C2 r2 = this.this$0;
            String str = this.$sticker.A06;
            if (str != null && (A00 = r2.A04.A00(str)) != null) {
                return A00;
            }
            C135066c4 r3 = this.$sticker;
            String str2 = r3.A06;
            if (str2 != null) {
                AnonymousClass1C2 r5 = this.this$0;
                File A002 = r5.A03.A00(new AnonymousClass690(str2), r3.A0O);
                String str3 = r3.A0A;
                if (str3 == null || !C90484aE.A1W(str3) || !AnonymousClass00C.A0J(A002.getAbsolutePath(), str3)) {
                    if (r3.A0K) {
                        String str4 = r3.A0E;
                        if (str4 == null) {
                            return null;
                        }
                        File A04 = r5.A00.A04(str4, r3.A0D);
                        if (A04.exists()) {
                            r3.A0A = A04.getAbsolutePath();
                            return r3;
                        }
                    } else {
                        Log.w("AvatarStickerOnDemandInstaller/cached sticker not found, downloading image");
                        this.label = 1;
                        obj = AnonymousClass0A2.A00(this, r5.A05, new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(r5, str2, (C023509x) null));
                        if (obj == r4) {
                            return r4;
                        }
                    }
                }
            }
            Log.w("AvatarStickerOnDemandInstaller/cached sticker found, moving to permanent storage");
            AnonymousClass1C2.A00(this.$sticker, this.this$0);
            return this.$sticker;
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
