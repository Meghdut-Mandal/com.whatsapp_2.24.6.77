package X;

import com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler", f = "GetSuggestedGroupsGraphQlHandler.kt", i = {0}, l = {38}, m = "fetch", n = {"parentGroupJid"}, s = {"L$0"})
/* renamed from: X.3z8  reason: invalid class name and case insensitive filesystem */
public final class C82703z8 extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSuggestedGroupsGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82703z8(GetSuggestedGroupsGraphQlHandler getSuggestedGroupsGraphQlHandler, C023509x r2) {
        super(r2);
        this.this$0 = getSuggestedGroupsGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass147) null, (AnonymousClass147) null, this);
    }
}
