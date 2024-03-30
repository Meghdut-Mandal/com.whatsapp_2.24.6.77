package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5HW;
import X.C009003v;
import X.C023509x;
import X.C105985Hx;
import X.C111345c8;
import X.C24241Br;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1", f = "AvatarStickersRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C111345c8 $error;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1(C24241Br r2, C111345c8 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$error = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1(this.this$0, this.$error, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A01.A00(((C105985Hx) ((AnonymousClass5HW) this.$error).A00).newRevision);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
