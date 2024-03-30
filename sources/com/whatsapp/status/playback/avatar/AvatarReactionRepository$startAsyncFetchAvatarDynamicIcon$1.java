package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6SF;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1", f = "AvatarReactionRepository.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C023509x r4) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(this.this$0, this.$listener, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            File A01 = AnonymousClass6SF.A01(this.this$0.A03, "meta-avatar-tab-icon");
            if (A01 != null) {
                AvatarReactionRepository avatarReactionRepository = this.this$0;
                WeakReference weakReference = this.$listener;
                avatarReactionRepository.A00 = A01;
                C005502l r2 = avatarReactionRepository.A05;
                AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 = new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(A01, weakReference, (C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, r2, avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
