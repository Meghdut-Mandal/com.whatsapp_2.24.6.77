package X;

import com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase", f = "InitializeAvatarEffectUseCase.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {40, 44}, m = "invoke", n = {"this", "effectParam", "callback", "it", "this", "effectParam", "callback"}, s = {"L$0", "L$1", "L$2", "I$2", "L$0", "L$1", "L$2"})
/* renamed from: X.7B8  reason: invalid class name */
public final class AnonymousClass7B8 extends AnonymousClass0A0 {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeAvatarEffectUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7B8(InitializeAvatarEffectUseCase initializeAvatarEffectUseCase, C023509x r2) {
        super(r2);
        this.this$0 = initializeAvatarEffectUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C119345pf) null, (C128656Dc) null, this);
    }
}
