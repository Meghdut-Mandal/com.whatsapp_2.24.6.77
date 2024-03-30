package com.whatsapp.status.playback.avatar;

import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2", f = "AvatarReactionRepository.kt", i = {}, l = {73, 76}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncAvatarReactionFetch$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass040 $avatarReactionScope;
    public final /* synthetic */ boolean $isAnimatedAvatars;
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncAvatarReactionFetch$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C023509x r4, AnonymousClass040 r5, boolean z) {
        super(2, r4);
        this.this$0 = avatarReactionRepository;
        this.$avatarReactionScope = r5;
        this.$isAnimatedAvatars = z;
        this.$listener = weakReference;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new AvatarReactionRepository$startAsyncAvatarReactionFetch$2(this.this$0, this.$listener, r8, this.$avatarReactionScope, this.$isAnimatedAvatars);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r4) goto L_0x0026
            if (r0 != r5) goto L_0x0043
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r3 = r7.this$0
            X.040 r2 = r7.$avatarReactionScope
            boolean r1 = r7.$isAnimatedAvatars
            java.lang.ref.WeakReference r0 = r7.$listener
            r7.label = r4
            java.lang.Object r8 = r3.A00(r0, r7, r2, r1)
            if (r8 != r6) goto L_0x0029
            return r6
        L_0x0026:
            X.AnonymousClass0AN.A00(r8)
        L_0x0029:
            boolean r0 = X.AnonymousClass000.A1X(r8)
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7.$isAnimatedAvatars
            if (r0 == 0) goto L_0x000f
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r3 = r7.this$0
            X.040 r2 = r7.$avatarReactionScope
            r1 = 0
            java.lang.ref.WeakReference r0 = r7.$listener
            r7.label = r5
            java.lang.Object r0 = r3.A00(r0, r7, r2, r1)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$startAsyncAvatarReactionFetch$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
