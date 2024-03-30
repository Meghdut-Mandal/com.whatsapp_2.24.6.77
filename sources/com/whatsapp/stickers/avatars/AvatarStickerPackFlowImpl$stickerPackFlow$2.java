package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1BA;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C106105Ij;
import X.C106115Ik;
import X.C106125Il;
import X.C124575yQ;
import X.C36441kJ;
import X.C90484aE;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$2", f = "AvatarStickerPackFlowImpl.kt", i = {0}, l = {103, 109, 111, 114}, m = "invokeSuspend", n = {"$this$onSubscription"}, s = {"L$0"})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C124575yQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$2(C124575yQ r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarStickerPackFlowImpl$stickerPackFlow$2 avatarStickerPackFlowImpl$stickerPackFlow$2 = new AvatarStickerPackFlowImpl$stickerPackFlow$2(this.this$0, r4);
        avatarStickerPackFlowImpl$stickerPackFlow$2.L$0 = obj;
        return avatarStickerPackFlowImpl$stickerPackFlow$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05G r5;
        Object r1;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r5 = (AnonymousClass05G) this.L$0;
            C124575yQ r3 = this.this$0;
            this.L$0 = r5;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A05, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r3, (C023509x) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            r5 = (AnonymousClass05G) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else if (i == 2 || i == 3 || i == 4) {
            AnonymousClass0AN.A00(obj);
            return AnonymousClass0AJ.A00;
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass68B r10 = (AnonymousClass68B) obj;
        if (r10 != null) {
            AnonymousClass1BA r0 = this.this$0.A02;
            String str = r10.A0F;
            if (r0.A01.containsKey(str)) {
                r1 = new C106115Ik(C90484aE.A0B(C36441kJ.A10(str, new HashMap(this.this$0.A02.A01))));
                this.L$0 = null;
                this.label = 2;
            } else {
                r1 = new C106105Ij(r10);
                this.L$0 = null;
                this.label = 3;
            }
        } else {
            r1 = new C106125Il("onSubscription pack was null");
            this.L$0 = null;
            this.label = 4;
        }
        if (r5.B6N(r1, this) == r4) {
            return r4;
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
