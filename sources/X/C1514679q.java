package X;

import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase", f = "FetchAvatarEffectUseCase.kt", i = {}, l = {45}, m = "loadEffect", n = {}, s = {})
/* renamed from: X.79q  reason: invalid class name and case insensitive filesystem */
public final class C1514679q extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FetchAvatarEffectUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1514679q(FetchAvatarEffectUseCase fetchAvatarEffectUseCase, C023509x r2) {
        super(r2);
        this.this$0 = fetchAvatarEffectUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FetchAvatarEffectUseCase.A00(this.this$0, (AnonymousClass6CC) null, (String) null, this);
    }
}
