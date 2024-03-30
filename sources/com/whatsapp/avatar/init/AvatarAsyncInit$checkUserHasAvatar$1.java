package com.whatsapp.avatar.init;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1BF;
import X.C009003v;
import X.C023509x;
import X.C142736pN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1", f = "AvatarAsyncInit.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAsyncInit$checkUserHasAvatar$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C142736pN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAsyncInit$checkUserHasAvatar$1(C142736pN r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new AvatarAsyncInit$checkUserHasAvatar$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarAsyncInit$checkUserHasAvatar$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.label = 1;
            obj = ((AnonymousClass1BF) this.this$0.A02.get()).A00(this, true);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (!AnonymousClass000.A1X(obj)) {
            return null;
        }
        return true;
    }
}
