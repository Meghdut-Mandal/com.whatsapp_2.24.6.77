package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1B6;
import X.AnonymousClass68B;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C124575yQ;
import X.C23991Aq;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$getStickerPackWithStickers$2", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$getStickerPackWithStickers$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C124575yQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(C124575yQ r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass68B r3 = (AnonymousClass68B) C007103b.A0M(AnonymousClass1B6.A00(this.this$0.A03, 2));
            if (r3 == null) {
                return null;
            }
            C124575yQ r2 = this.this$0;
            C23991Aq r1 = r2.A04;
            String str = r3.A0F;
            AnonymousClass00C.A08(str);
            ArrayList A02 = r1.A02(str);
            r2.A00.A05(A02);
            r3.A05 = A02;
            return r3;
        }
        throw AnonymousClass000.A0e();
    }
}
