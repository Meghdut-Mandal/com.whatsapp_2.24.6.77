package X;

import com.whatsapp.group.GetSubgroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GetSubgroupsManager", f = "GetSubgroupsManager.kt", i = {0}, l = {97}, m = "getSubgroupsWithoutMex", n = {"callback"}, s = {"L$0"})
/* renamed from: X.3yx  reason: invalid class name and case insensitive filesystem */
public final class C82593yx extends AnonymousClass0A0 {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82593yx(GetSubgroupsManager getSubgroupsManager, C023509x r2) {
        super(r2);
        this.this$0 = getSubgroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GetSubgroupsManager.A00((C595634k) null, this.this$0, (AnonymousClass147) null, (AnonymousClass147) null, this);
    }
}
