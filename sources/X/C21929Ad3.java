package X;

import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyServerApiImpl", f = "PasskeyServerApiImpl.kt", i = {0}, l = {95}, m = "finishRegister", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ad3  reason: case insensitive filesystem */
public final class C21929Ad3 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21929Ad3(PasskeyServerApiImpl passkeyServerApiImpl, C023509x r2) {
        super(r2);
        this.this$0 = passkeyServerApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((String) null, this);
    }
}
