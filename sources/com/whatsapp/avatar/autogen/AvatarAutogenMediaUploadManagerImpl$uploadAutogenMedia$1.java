package com.whatsapp.avatar.autogen;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C20190xA;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ File $file;
    public int label;
    public final /* synthetic */ C20190xA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(C20190xA r2, File file, C023509x r4, C006302t r5) {
        super(2, r4);
        this.this$0 = r2;
        this.$file = file;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(this.this$0, this.$file, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C20190xA r3 = this.this$0;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r3.A04, new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(r3, (C023509x) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$callback.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
