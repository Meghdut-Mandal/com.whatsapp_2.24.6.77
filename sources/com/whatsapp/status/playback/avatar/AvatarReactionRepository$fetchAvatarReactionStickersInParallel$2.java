package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C62253Fk;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $finalAvatarReactionList;
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, List list, C023509x r5) {
        super(2, r5);
        this.this$0 = avatarReactionRepository;
        this.$finalAvatarReactionList = list;
        this.$listener = weakReference;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(this.this$0, this.$listener, this.$finalAvatarReactionList, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            List list = this.$finalAvatarReactionList;
            WeakReference weakReference = this.$listener;
            List A0Y = C007103b.A0Y(list);
            C62253Fk r0 = (C62253Fk) weakReference.get();
            if (r0 != null) {
                r0.A01(A0Y);
            }
            avatarReactionRepository.A01 = A0Y;
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
