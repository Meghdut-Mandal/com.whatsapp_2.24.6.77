package X;

import com.whatsapp.registration.passkeys.PasskeyServerApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyServerApiImpl", f = "PasskeyServerApiImpl.kt", i = {0, 0}, l = {138}, m = "sendIq", n = {"iqId", "sendType"}, s = {"L$0", "I$0"})
/* renamed from: X.AdH  reason: case insensitive filesystem */
public final class C21938AdH extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21938AdH(PasskeyServerApiImpl passkeyServerApiImpl, C023509x r2) {
        super(r2);
        this.this$0 = passkeyServerApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PasskeyServerApiImpl.A01(this.this$0, (String) null, this, (C006302t) null, 0, 0);
    }
}
