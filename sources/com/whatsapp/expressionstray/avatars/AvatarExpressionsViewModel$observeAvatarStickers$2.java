package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C17980sO;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$2", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarStickers$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$2(AvatarExpressionsViewModel avatarExpressionsViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C17980sO r1 = this.this$0.A0E;
            AnonymousClass0AJ r0 = AnonymousClass0AJ.A00;
            r1.B3E(r0);
            return r0;
        }
        throw AnonymousClass000.A0e();
    }
}
