package X;

import com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkeys.PasskeyAndroidApiImpl", f = "PasskeyAndroidApiImpl.kt", i = {0}, l = {71}, m = "createPasskey", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ad0  reason: case insensitive filesystem */
public final class C21926Ad0 extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasskeyAndroidApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21926Ad0(PasskeyAndroidApiImpl passkeyAndroidApiImpl, C023509x r2) {
        super(r2);
        this.this$0 = passkeyAndroidApiImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass01L) null, (String) null, this);
    }
}
