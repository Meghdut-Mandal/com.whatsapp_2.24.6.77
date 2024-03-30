package X;

import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase", f = "FetchAvatarEffectUseCase.kt", i = {0, 0, 0, 1, 1, 1}, l = {21, 25}, m = "invoke", n = {"this", "productSessionId", "callback", "productSessionId", "callback", "arEffect"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* renamed from: X.7Ak  reason: invalid class name and case insensitive filesystem */
public final class C151657Ak extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FetchAvatarEffectUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151657Ak(FetchAvatarEffectUseCase fetchAvatarEffectUseCase, C023509x r2) {
        super(r2);
        this.this$0 = fetchAvatarEffectUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((C116895lN) null, (String) null, this);
    }
}
