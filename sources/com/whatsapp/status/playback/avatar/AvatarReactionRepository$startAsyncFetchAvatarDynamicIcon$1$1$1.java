package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C62253Fk;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ File $it;
    public final /* synthetic */ WeakReference $listener;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(File file, WeakReference weakReference, C023509x r4) {
        super(2, r4);
        this.$listener = weakReference;
        this.$it = file;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(this.$it, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C62253Fk r1 = (C62253Fk) this.$listener.get();
            if (r1 != null) {
                r1.A00(this.$it);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
