package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager", f = "MemberSuggestedGroupsManager.kt", i = {0, 0, 1, 1}, l = {145, 147, 162}, m = "fetchWithMex", n = {"this", "parentGroupJid", "this", "parentGroupJid"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.3z7  reason: invalid class name and case insensitive filesystem */
public final class C82693z7 extends AnonymousClass0A0 {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82693z7(MemberSuggestedGroupsManager memberSuggestedGroupsManager, C023509x r2) {
        super(r2);
        this.this$0 = memberSuggestedGroupsManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MemberSuggestedGroupsManager.A00(this.this$0, (AnonymousClass147) null, (AnonymousClass147) null, this);
    }
}
