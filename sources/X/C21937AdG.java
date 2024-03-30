package X;

import com.whatsapp.registration.passkeys.PasskeyFacade;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyFacade", f = "PasskeyFacade.kt", i = {0, 0, 1, 1, 2, 3}, l = {239, 258, 274, 322}, m = "maybeCreatePasskeyWithoutEducationScreen", n = {"this", "activity", "this", "activity", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* renamed from: X.AdG  reason: case insensitive filesystem */
public final class C21937AdG extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21937AdG(PasskeyFacade passkeyFacade, C023509x r2) {
        super(r2);
        this.this$0 = passkeyFacade;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass01L) null, this);
    }
}
