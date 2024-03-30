package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass7O9;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C124575yQ;
import X.C162907pL;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C124575yQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$1(C124575yQ r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarStickerPackFlowImpl$stickerPackFlow$1 avatarStickerPackFlowImpl$stickerPackFlow$1 = new AvatarStickerPackFlowImpl$stickerPackFlow$1(this.this$0, r4);
        avatarStickerPackFlowImpl$stickerPackFlow$1.L$0 = obj;
        return avatarStickerPackFlowImpl$stickerPackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r3 = (C18000sQ) this.L$0;
            C124575yQ r1 = this.this$0;
            C162907pL r2 = new C162907pL(r1, r3, 0);
            r1.A01.registerObserver(r2);
            AnonymousClass7O9 r0 = new AnonymousClass7O9(r2, this.this$0);
            this.label = 1;
            if (C05770Qz.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerPackFlowImpl$stickerPackFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
