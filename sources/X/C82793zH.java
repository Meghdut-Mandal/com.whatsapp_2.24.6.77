package X;

import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository", f = "AvatarReactionRepository.kt", i = {0, 0, 0}, l = {134, 150}, m = "fetchAvatarReactionStickersInParallel", n = {"this", "listener", "isAnimatedAvatarsEnabled"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: X.3zH  reason: invalid class name and case insensitive filesystem */
public final class C82793zH extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82793zH(AvatarReactionRepository avatarReactionRepository, C023509x r2) {
        super(r2);
        this.this$0 = avatarReactionRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((WeakReference) null, this, (AnonymousClass040) null, false);
    }
}
