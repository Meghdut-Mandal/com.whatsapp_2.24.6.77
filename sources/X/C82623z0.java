package X;

import com.whatsapp.profile.UsernameViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.UsernameViewModel", f = "UsernameViewModel.kt", i = {0}, l = {175}, m = "ensureMinimumLoadingTime", n = {"this"}, s = {"L$0"})
/* renamed from: X.3z0  reason: invalid class name and case insensitive filesystem */
public final class C82623z0 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UsernameViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82623z0(UsernameViewModel usernameViewModel, C023509x r2) {
        super(r2);
        this.this$0 = usernameViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UsernameViewModel.A01(this.this$0, this);
    }
}
