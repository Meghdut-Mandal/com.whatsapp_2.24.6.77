package X;

import com.whatsapp.calling.avatar.CallAvatarARClassManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.CallAvatarARClassManager", f = "CallAvatarARClassManager.kt", i = {0}, l = {68}, m = "refreshARClass", n = {"this"}, s = {"L$0"})
/* renamed from: X.7AZ  reason: invalid class name */
public final class AnonymousClass7AZ extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallAvatarARClassManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AZ(CallAvatarARClassManager callAvatarARClassManager, C023509x r2) {
        super(r2);
        this.this$0 = callAvatarARClassManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00(this);
    }
}
