package com.whatsapp.avatar.init;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1XW;
import X.AnonymousClass39Q;
import X.C009003v;
import X.C023509x;
import X.C142736pN;
import X.C36371kC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1", f = "AvatarAsyncInit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAsyncInit$checkHasAvatarUser$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C142736pN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAsyncInit$checkHasAvatarUser$1(C142736pN r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarAsyncInit$checkHasAvatarUser$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarAsyncInit$checkHasAvatarUser$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (((AnonymousClass1XW) ((AnonymousClass39Q) this.this$0.A03.get()).A04.get()).A00() != null) {
                return C36371kC.A0m();
            }
            return null;
        }
        throw AnonymousClass000.A0e();
    }
}
