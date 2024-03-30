package X;

import com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler", f = "AllowNonAdminSubGroupCreationGraphQlHandler.kt", i = {0}, l = {38}, m = "setAllow", n = {"this"}, s = {"L$0"})
/* renamed from: X.Acz  reason: case insensitive filesystem */
public final class C21925Acz extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AllowNonAdminSubGroupCreationGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21925Acz(AllowNonAdminSubGroupCreationGraphQlHandler allowNonAdminSubGroupCreationGraphQlHandler, C023509x r2) {
        super(r2);
        this.this$0 = allowNonAdminSubGroupCreationGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass147) null, this, false);
    }
}
