package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass690;
import X.C005502l;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C36361kB;
import X.C39581sm;
import X.C47462eo;
import X.C47472ep;
import X.C55442ud;
import X.C62253Fk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1", f = "AvatarReactionRepository.kt", i = {1}, l = {118, 125}, m = "invokeSuspend", n = {"avatarReaction"}, s = {"L$0"})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $index;
    public final /* synthetic */ WeakReference $listener;
    public final /* synthetic */ String $stableId;
    public Object L$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            return new AnonymousClass1(r6, avatarReactionRepository, weakReference, r8, i2);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                ArrayList A0q = C36361kB.A0q(avatarReactionRepository.A01);
                A0q.set(i2, r6);
                AvatarReactionRepository avatarReactionRepository = avatarReactionRepository;
                WeakReference weakReference = weakReference;
                List A0Y = C007103b.A0Y(A0q);
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
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(AvatarReactionRepository avatarReactionRepository, String str, WeakReference weakReference, C023509x r5, int i) {
        super(2, r5);
        this.this$0 = avatarReactionRepository;
        this.$stableId = str;
        this.$index = i;
        this.$listener = weakReference;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(this.this$0, this.$stableId, this.$listener, r8, this.$index);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass690 r0;
        final C55442ud r6;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C39581sm r62 = this.this$0.A02;
            String str = this.$stableId;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r62.A02, new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(r62, str, (C023509x) null));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            AnonymousClass0AN.A00(obj);
            return obj2;
        } else {
            throw AnonymousClass000.A0e();
        }
        C135066c4 r12 = (C135066c4) obj;
        String str2 = this.$stableId;
        if (r12 != null) {
            r6 = new C47472ep(r0, r12);
        } else {
            r0 = new AnonymousClass690(str2);
            r6 = new C47462eo(r0);
        }
        final AvatarReactionRepository avatarReactionRepository = this.this$0;
        C005502l r02 = avatarReactionRepository.A05;
        final int i2 = this.$index;
        final WeakReference weakReference = this.$listener;
        AnonymousClass1 r5 = new AnonymousClass1((C023509x) null);
        this.L$0 = r6;
        this.label = 2;
        if (AnonymousClass0A2.A00(this, r02, r5) != r3) {
            return r6;
        }
        return r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
