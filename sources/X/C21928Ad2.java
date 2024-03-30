package X;

import com.whatsapp.registration.passkeys.PasskeyFacade;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade", f = "PasskeyFacade.kt", i = {0}, l = {184}, m = "checkPasskeyExists", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ad2  reason: case insensitive filesystem */
public final class C21928Ad2 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21928Ad2(PasskeyFacade passkeyFacade, C023509x r2) {
        super(r2);
        this.this$0 = passkeyFacade;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
